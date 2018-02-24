import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Lexer {
    private int curPos;
    private final String text;
    private final List<Pair<String, Matcher>> lexerRules;
    private String currentToken;
    private String tokenValue;

    class Pair<T, R> {
        final private T first;
        final private R second;

        public Pair(T first, R second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public R getSecond() {
            return second;
        }
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public Lexer(InputStream stream, InputGrammar parser) throws IOException {
        text = readAll(stream);
        lexerRules = parser.getLexerRules().entrySet().stream()
                .map(entry -> new Pair<>(entry.getKey(), Pattern.compile(entry.getValue().getText()).matcher(text)))
                .collect(Collectors.toList());
        curPos = 0;
        nextToken();
    }

    private String readAll(InputStream stream) throws IOException {
        byte buff[] = new byte[2048];
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int len;
        while ((len = stream.read(buff)) != -1) {
            result.write(buff, 0, len);
        }
        return result.toString(String.valueOf(StandardCharsets.UTF_8));
    }


    public String nextToken() {
        if (curPos == text.length()) {
            return currentToken = tokenValue = InputGrammar.DOLLAR;
        }

        currentToken = "";
        int nextPos = curPos;

        for (Pair<String, Matcher> lexem : lexerRules) {
            Matcher matcher = lexem.getSecond();
            if (matcher.find(curPos) && matcher.start() == curPos && matcher.end() > nextPos) {
                nextPos = matcher.end();
                currentToken = lexem.getFirst();
                tokenValue = text.substring(curPos, nextPos);
            }
        }
        if (nextPos == curPos) {
            throw new RuntimeException("Can't parse, no lexer rule is suitable");
        }
        curPos = nextPos;
        return currentToken;
    }
}
