import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarLexerTester {

    @Test
    public void test1() throws Exception {
        GenerateParser.main(new String[]{"/home/user/Desktop/mt4/src/test/resources/test.txt", "/home/user/Desktop/mt4/src/generatedParser"});
        String test = "123p93123f12893p12312";
        Matcher matcher = Pattern.compile("(\\d+)|(f)|(p)|(.+)").matcher(test);
        boolean b = matcher.find();

        System.out.println(b);
        Sequence<MatchResult> all = new Regex("(\\d+)|(f)|(p)|(.+)").findAll(test, 0);

        MyGrammarLexer grammarLexer = new MyGrammarLexer(new ByteArrayInputStream(test.getBytes()));
        while (grammarLexer.tokenInd != -1) {
            System.out.println(grammarLexer.tokenValue);
            grammarLexer.nextToken();
        }
    }
}
