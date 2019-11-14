// import de librerias de runtime de ANTLR
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SRTest {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador lexico que se alimenta a partir de la entrada (archivo  o consola)
            SRgrammarLexer lexer;
            if (args.length>0)
                lexer = new SRgrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SRgrammarLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador lexico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el analizador sintactico que se alimenta a partir del buffer de tokens
            SRgrammarParser parser = new SRgrammarParser(tokens);
            ParseTree tree = parser.component(); // comienza el analisis en la regla inicial
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new SRToPython(), tree);
            //System.out.println(tree.toStringTree(parser)); // imprime el arbol en forma textual
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
