import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromPath;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        /*InputStream inputStream = null;
        ArithmeticLexer lexer = null;
        try{
            File g4 = new File("D:\\\\git-repos\\\\AUT\\\\src\\\\main\\\\java\\Arithmetic.g4");
            inputStream = new FileInputStream(g4);
            lexer = new ArithmeticLexer(CharStreams.fromStream(inputStream));
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            }*/


//        CharStream g4 = fromFileName("D:\\git-repos\\AUT\\src\\main\\java\\Arithmetic.g4");
        ArithmeticLexer lexer = new ArithmeticLexer(CharStreams.fromString("38*3\r\n"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticParser parser = new ArithmeticParser(tokens);  //parse token

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrArithmeticListener listener = new AntlrArithmeticListener();
        MyListener extractor = new MyListener();

        ParseTreeWalker.DEFAULT.walk(listener, tree);  //initiate walk of tree with listener in use of default walker
//        walker.walk(listener, tree);
    }
}
