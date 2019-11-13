/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class SRToTest extends SRgrammarBaseListener {
    /** Translate { to " */
    @Override
    public void exitComponent(SRgrammarParser.ComponentContext ctx) {
        if (ctx.TK_SEPARATOR() != null) {
            System.out.println("This is a tk separator");
        }
    }

    @Override
    public void exitComp_label(SRgrammarParser.Comp_labelContext ctx) {
        if (ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText() +" ");
        }
    }


    @Override
    public void enterImport_clause(SRgrammarParser.Import_clauseContext ctx) {
        if (ctx.TK_IMPORT() != null) {
            System.out.print("Importar ");
        }
    }

    @Override
    public void exitImport_name(SRgrammarParser.Import_nameContext ctx) {
        if (ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText() + " ");
        }
    }

    @Override
    public void exitComp_kwd(SRgrammarParser.Comp_kwdContext ctx) {
        if (ctx.TK_GLOBAL() != null) {
            System.out.print("class ");
        }
    }
}