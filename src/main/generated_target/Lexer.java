import kotlin.text.*;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Lexer {
    public static final Logger LOG = Logger.getLogger(Lexer.class.getName());
    public static final int EOF = -1;
    private final Iterator<MatchResult> textMatches;
    private final String[] tokenName;
    int groupToInteger[];
    public int tokenInd;
    public Integer tokenStart;
    public String tokenValue;


    public String currentToken() {
        return tokenInd == -1 ? "" : tokenName[tokenInd];
    }

    public Lexer(InputStream stream, InputGrammar parser) throws IOException {
        final String text = readAll(stream);
        Map<String, SerializableParseTree> lexerRules = parser.getLexerRules();
        Map<String, Integer> lexerRulesInd = parser.getLexerRulesInd();
        groupToInteger= new int[lexerRules.size() + 1];
        tokenName = new String[lexerRules.size() + 1];
        int pos[] = new int[1];

        String regexpChecker = lexerRules.entrySet().stream().map(entry -> {
            Integer ind = lexerRulesInd.get(entry.getKey());
            groupToInteger[pos[0]++] = ind;
            tokenName[ind] = entry.getKey();
            return "(" + entry.getValue().getText() + ")";
        }).collect(Collectors.joining("|")) + "|(.+)";

        groupToInteger[lexerRules.size()] = lexerRules.size();
        tokenName[lexerRules.size()] = "EOF";

        textMatches = new Regex(regexpChecker).findAll(text, 0).iterator();
        iterateToNext();
    }

    private String readAll(InputStream stream) throws IOException {
        byte buff[] = new byte[2048];
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int len;
        while ((len = stream.read(buff)) != -1) {
            result.write(buff, 0, len);
        }
        return result.toString(String.valueOf(Charsets.UTF_8));
    }


    public void nextToken() throws Exception {
        iterateToNext();
    }

    private void iterateToNext() {
        if (textMatches.hasNext()) {
            MatchResult next = textMatches.next();
            MatchGroupCollection groups = next.getGroups();
            for (int i = 0; i < groups.size(); i++) {
                MatchGroup group = groups.get(i);
                if (group != null) {
                    if (i == groups.size() - 1) {
                        throw new RuntimeException("Bad group");
                    }
                    tokenInd = groupToInteger[i];
                    tokenStart = group.getRange().getStart();
                    tokenValue = group.getValue();

                    return;
                }
            }
        }
        tokenInd = EOF;
        tokenValue = null;
    }
}
