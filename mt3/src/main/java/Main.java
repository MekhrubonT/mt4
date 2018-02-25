import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 0 && "generate".equals(args[0])) {
            new GenerateParser(new FileInputStream("/home/user/Desktop/mt4/mt3/src/main/mekhlr/grammar"),
                    "/home/user/Desktop/mt4/mt3/generatedParser");
        } else {
            String test = "$longVar_{128932 \\pm i}^5 \\le b^{128932 \\pm i}_5 \\times a$";
//            MyGrammarLexer temp = new MyGrammarLexer(new ByteArrayInputStream(test.getBytes()));
//            while (!temp.getCurrentToken().equals(InputGrammar.DOLLAR)) {
//                System.out.println(temp.getTokenValue() + " " + temp.getCurrentToken());
//                temp.nextToken();
//            }
//            translate(new ByteArrayInputStream(test.getBytes()), new PrintWriter(System.out));
        }
    }

    public static void translate(InputStream stream, PrintWriter pw) throws IOException {
        MyGrammarLexer myGrammarLexer = new MyGrammarLexer(stream);
        MyGrammarParser myGrammarParser = new MyGrammarParser(myGrammarLexer);
        myGrammarParser.pw = pw;
        myGrammarParser.parse();
        myGrammarParser.pw.close();
    }

}
