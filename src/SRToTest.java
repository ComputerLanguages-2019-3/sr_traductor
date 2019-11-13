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
    public void exitComp_label(SRgrammarParser.Comp_labelContext ctx) {
        if (ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText() +" ");
        }
    }

    @Override
    public void enterImport_clause(SRgrammarParser.Import_clauseContext ctx) {
        if (ctx.TK_IMPORT() != null) {
            System.out.print("import ");
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

        if (ctx.TK_RESOURCE() != null) {
            System.out.print("class ");
        }
    }

    @Override
    public void exitParameters(SRgrammarParser.ParametersContext ctx) {
        if (ctx.TK_LPAREN() != null) {
            System.out.print(ctx.TK_LPAREN().getText());
        }

        String[] idParams = ctx.getChild(1).getText().split(":", 2);

        for (int i = 0; i < idParams.length; i++) {
            if (i % 2 == 0) {
                System.out.print(idParams[i] + " ");
            }
        }

        if (ctx.TK_RPAREN() != null) {
            if(ctx.parent.getRuleIndex() == 4) {
                System.out.println(ctx.TK_RPAREN().getText() + ':');
            } else {
                System.out.print(ctx.TK_RPAREN().getText());
            }
        }
    }

    @Override
    public void enterOp_or_ext(SRgrammarParser.Op_or_extContext ctx){
        if(ctx.TK_OP() != null) {
            System.out.print("\t def ");
        }
    }


    @Override
    public void enterSpec_body(SRgrammarParser.Spec_bodyContext ctx){
        System.out.println();
        if(ctx.TK_BODY() != null) {
            System.out.print("class ");
        }

        if(ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText() + " ");
        }
        System.out.println("def __init__(self, *params):");
    }

    @Override
    public void exitSpec_body(SRgrammarParser.Spec_bodyContext ctx){
    }

    @Override
    public void exitId_subs(SRgrammarParser.Id_subsContext ctx){
        if(ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText());
        }
    }

    @Override
    public void enterBinary_expr(SRgrammarParser.Binary_exprContext ctx){
        if(ctx.TK_ASSIGN() != null) {
            System.out.print(" = ");
        }
    }
}