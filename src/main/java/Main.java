import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
//        File file = new File("test.txt");
//        String result = Files.readString(file);

        String filename = "src\\main\\java\\Input\\test.txt";
        Path pathToFile = Paths.get(filename);
        String content = Files.readString(pathToFile, StandardCharsets.US_ASCII);
//        String[] arrOfStr = content.split("\r\n");
//        for (String a : arrOfStr) {
//            System.out.print(a + " = ");
        ArithmeticLexer lexer = new ArithmeticLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticParser parser = new ArithmeticParser(tokens);  //parse token

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrArithmeticListener listener = new AntlrArithmeticListener();
        MyListener extractor = new MyListener();

        ParseTreeWalker.DEFAULT.walk(listener, tree);  //initiate walk of tree with listener in use of default walker
//        walker.walk(listener, tree);


//    }
    }
}
