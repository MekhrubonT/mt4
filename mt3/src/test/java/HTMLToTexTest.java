import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class HTMLToTexTest {
    String commands[] = {"times",
            "pm",
            "mp",
            "sum",
            "prod",
            "asymp",
            "sdot",
            "sqrt"};

    String input[] = {
            "var $var$ var $var$ var",
            "123 $132$ 124  $1239012$ 1",
            "$123 \\le 123$",
            "$a_2^5$",
            "$a_2^5$ $a_2^5$",
            "$a_2^5 \\le b^2_5 \\times a$",
            "$a_{128932 \\pm i}^5 \\le b^{128932 \\pm i}_5 \\times a$",
            "$longVar_{128932 \\pm i}^5 \\le b^{128932 \\pm i}_5 \\times a$",
            "$\\frac{abc}{qwer^{123}} main$"
    };

    @Test
    public void simpleTest() throws IOException {
        for (int i = 0; i < input.length; ++i) {
            runTest(input[i], new PrintWriter("test" + i + ".html"));
        }
    }

    private void runTest(String test, PrintWriter writer) throws IOException {
        InputStream stream = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        System.out.println("test is " + test);
        Main.translate(stream, writer);
    }

    private Random random;

    @Test
    public void complexTest() throws IOException {
        random = new Random();
        for (int i = 0; i < 100; ++i) {
            complexTestImpl();
        }

    }

    private void complexTestImpl() throws IOException {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 50; ++i) {
            int index = random.nextInt(input.length + commands.length);
            if (index < input.length) {
                builder.append(input[index]);
            } else {
                builder.append("$\\").append(commands[index - input.length]).append(random.nextInt()).append("$");
            }
        }


        int fileIndex = random.nextInt();
        System.out.println(fileIndex);
        runTest(builder.toString(), new PrintWriter("complexTest" + fileIndex + ".html"));
    }
}
