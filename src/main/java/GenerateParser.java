import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GenerateParser {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            Scanner scanner = new Scanner(System.in);
            args = new String[]{scanner.next(), scanner.next()};
        }
        GenerateParser generateParser = new GenerateParser(new FileInputStream(args[0]),
                args[1]);
    }

    private final InputGrammar grammar;

    public GenerateParser(FileInputStream fileInputStream, String generatedFilesDir) throws IOException {
        Path generated = Paths.get(generatedFilesDir);
        Files.createDirectories(generated);
        grammar = InputGrammar.parseGrammar(fileInputStream);

        saveObject(grammar, generated.resolve("grammar"));
        generateLexerInit(generated);
        generateParserInit(generated);
    }

    private static final String myLexer = "import java.io.IOException;\n" +
            "import java.io.InputStream;\n" +
            "\n" +
            "public class MyGrammarLexer extends Lexer {\n" +
            "    public static final String GRAMMAR_PATH = \"%s\";\n" +
            "\n" +
            "    public MyGrammarLexer(InputStream stream) throws IOException {\n" +
            "        super(stream, InputGrammar.getParser(GRAMMAR_PATH));\n" +
            "    }\n" +
            "}\n";
    private static final String myParser = "import java.io.IOException;\n" +
            "\n" +
            "public class MyGrammarParser extends Parser {\n" +
            "    public static final String GRAMMAR_PATH = \"%s\";\n" +
            "\n" +
            "    public MyGrammarParser(MyGrammarLexer lexer) throws IOException {\n" +
            "        super(lexer, InputGrammar.getParser(GRAMMAR_PATH));\n" +
            "    }\n" +
            "}\n";

    private void generateLexerInit(Path grammarLexer) throws FileNotFoundException {
        generate(grammarLexer, myLexer, "MyGrammarLexer.java");
    }

    private void generateParserInit(Path grammarParser) throws FileNotFoundException {
        generate(grammarParser, myParser, "MyGrammarParser.java");
    }

    private void generate(Path grammarParser, String pattern, String outputName) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(grammarParser.resolve(outputName).toFile())){
            writer.print(String.format(pattern, grammarParser.resolve("grammar")));
        }

    }

    private static void saveObject(Object obj, Path path) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path.toString()))) {
            out.writeObject(obj);
        }
    }

    public static Object restoreObject(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
        return in.readObject();
    }
}
