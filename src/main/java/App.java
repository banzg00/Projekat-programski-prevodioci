import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;



public class App
{
    private static final String TEST_PATH =
            "C:\\Users\\Korisnik\\Desktop\\programski prevodioci\\projekat\\MiniC#_Parser\\Projekat-programski-prevodioci\\src\\main\\java\\tests\\test1.txt";

    public static void main( String[] args ) {

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromReader(new BufferedReader(new InputStreamReader(new FileInputStream(TEST_PATH))));
        } catch (IOException e) {
            System.out.println("Problem with file!");
        }

        miniCSharpLexer lexer = new miniCSharpLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        miniCSharpParser parser = new miniCSharpParser(commonTokenStream);
        miniCSharpParser.ProgramContext programContext = parser.program();

        Listener listener = new Listener();
        ParseTreeWalker.DEFAULT.walk(listener, programContext);

    }
}
