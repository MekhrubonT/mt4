import java.io.IOException;

public class MyGrammarParser extends Parser {
    public static final String GRAMMAR_PATH = "/home/user/Desktop/mt4/src/generatedParser/grammar";

    public MyGrammarParser(MyGrammarLexer lexer) throws IOException, ClassNotFoundException {
        super(lexer, (InputGrammar) GenerateParser.restoreObject(GRAMMAR_PATH));
    }
}
