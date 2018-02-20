import java.io.IOException;
import java.io.InputStream;

public class MyGrammarLexer extends Lexer {
    public static final String GRAMMAR_PATH = "/home/user/Desktop/mt4/src/generatedParser/grammar";

    public MyGrammarLexer(InputStream stream) throws IOException, ClassNotFoundException {
        super(stream, (InputGrammar) GenerateParser.restoreObject(GRAMMAR_PATH));
    }
}
