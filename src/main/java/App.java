import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.Color;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class App {

    private static final String TEST_OK1 = "src\\main\\java\\tests\\test-ok1.txt";
    private static final String TEST_OK2 = "src\\main\\java\\tests\\test-ok2.txt";
    private static final String TEST_OK3 = "src\\main\\java\\tests\\test-ok3.txt";
    private static final String TEST_OK4 = "src\\main\\java\\tests\\test-ok4.txt";
    private static final String TEST_SEM_ERR1 = "src\\main\\java\\tests\\test-semerr1.txt";
    private static final String TEST_SEM_ERR2 = "src\\main\\java\\tests\\test-semerr2.txt";
    private static final String TEST_SEM_ERR3 = "src\\main\\java\\tests\\test-semerr3.txt";
    private static final String TEST_SYN_ERR1 = "src\\main\\java\\tests\\test-synerr1.txt";
    private static final String TEST_SYN_ERR2 = "src\\main\\java\\tests\\test-synerr2.txt";

    public static void main(String[] args) {

        System.out.print(Color.GREEN);
        System.out.println("------------- TEST - OK 1 -------------");
        testOK1();
        System.out.println("Test showed no errors!\n");

        System.out.println("------------- TEST - OK 2 -------------");
        testOK2();
        System.out.println("Test showed no errors!\n");

        System.out.println("------------- TEST - OK 3 -------------");
        testOK3();
        System.out.println("Test showed no errors!\n");

        System.out.println("------------- TEST - OK 4 -------------");
        testOK4();
        System.out.println("Test showed no errors!\n");
        System.out.println(Color.RESET);

        System.out.print(Color.RED);
        System.out.println("------------- TEST - SEMANTIC ERROR 1 -------------");
        testSEMERR1();
        System.out.println();

        System.out.println("------------- TEST - SEMANTIC ERROR 2 -------------");
        testSEMERR2();
        System.out.println();

        System.out.println("------------- TEST - SEMANTIC ERROR 3 -------------");
        testSEMERR3();
        System.out.println(Color.RESET);


        System.out.println(Color.YELLOW);
        System.out.println("! Warnings for semantic errors caused by syntax errors !\n");
        System.out.println("------------- TEST - SYNTAX ERROR 1 -------------");
        System.err.println();
        System.err.println("------------- TEST - SYNTAX ERROR 1 -------------");
        testSYNERR1();
        System.out.println();
        System.err.println();

        System.out.println("------------- TEST - SYNTAX ERROR 2 -------------");
        System.err.println("------------- TEST - SYNTAX ERROR 2 -------------");
        testSYNERR2();
        System.out.println(Color.RESET);

    }

    static void testOK1() {
        test(TEST_OK1);

    }

    static void testOK2() {
        test(TEST_OK2);
    }

    static void testOK3() {
        test(TEST_OK3);
    }

    static void testOK4() {
        test(TEST_OK4);
    }

    static void testSEMERR1() {
        test(TEST_SEM_ERR1);

    }

    static void testSEMERR2() {
        test(TEST_SEM_ERR2);
    }

    static void testSEMERR3() {
        test(TEST_SEM_ERR3);
    }

    static void testSYNERR1() {
        test(TEST_SYN_ERR1);
    }

    static void testSYNERR2() {
        test(TEST_SYN_ERR2);
    }

    private static void test(String filePath) {
        CharStream inputStream;
        try {
            inputStream = CharStreams.fromReader(new BufferedReader(new InputStreamReader(new FileInputStream(filePath))));
        } catch (IOException e) {
            System.out.println("Problem with file!");
            return;
        }

        miniCSharpLexer lexer = new miniCSharpLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        miniCSharpParser parser = new miniCSharpParser(commonTokenStream);
        miniCSharpParser.ProgramContext programContext = parser.program();

        Listener listener = new Listener();
        try {
            ParseTreeWalker.DEFAULT.walk(listener, programContext);
        } catch (Exception e) {
            System.out.println("Problem with input file!");
        }
    }

}
