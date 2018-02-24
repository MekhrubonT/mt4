import result_tree.ResultTree;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        String expression = "var a, b, c: int; d, e, f: double;";
        String expression = "var     aaa, b, c, d:int; name: double;";
        if (args.length != 0 && "generate".equals(args[0])) {
            new GenerateParser(new FileInputStream("/home/user/Desktop/mt4/mt2/src/main/resources/mekhlr"),
                    "/home/user/Desktop/mt4/mt2/generatedParser");
        }
    }

    public static ResultTree parse(String expression) throws IOException {
        MyGrammarLexer myGrammarLexer = new MyGrammarLexer(new ByteArrayInputStream(expression.getBytes()));
        return new MyGrammarParser(myGrammarLexer).parse();
    }
}
