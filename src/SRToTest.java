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
            System.out.println(ctx.TK_ID().getText() +" " + "():");
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
    public void enterParameters(SRgrammarParser.ParametersContext ctx) {
        if (ctx.TK_LPAREN() != null) {
            System.out.print(ctx.TK_LPAREN().getText());
        }

    /*    String[] idParams = ctx.getChild(1).getText().split(":", 2);

        for (int i = 0; i < idParams.length; i++) {
            if (i % 2 == 0) {
                System.out.print(idParams[i] + " ");
            }
        }*/

    }

    @Override
    public void exitParameters(SRgrammarParser.ParametersContext ctx) {
        if (ctx.TK_RPAREN() != null) {
            System.out.println(ctx.TK_RPAREN().getText() + ':');
        }
    }

    @Override
    public void enterOp_or_ext(SRgrammarParser.Op_or_extContext ctx){
        if(ctx.TK_OP() != null) {
            System.out.print("\t def ");
        }
    }


    @Override
    public void enterReturn_spec_opt(SRgrammarParser.Return_spec_optContext ctx){
        if(ctx.TK_RETURNS() != null) {
            System.out.print("\t \treturn ");
        }
    }

    @Override
    public void enterId_subs(SRgrammarParser.Id_subsContext ctx){
        if(ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText());
        }
    }



    @Override
    public void enterSpec_body(SRgrammarParser.Spec_bodyContext ctx){
        System.out.println("");
        if(ctx.TK_BODY() != null) {
            System.out.print("\t class ");
        }

        if(ctx.TK_ID() != null) {
            System.out.print(ctx.TK_ID().getText() + "");
        }
    }

    @Override
    public void exitSpec_body(SRgrammarParser.Spec_bodyContext ctx){
    }

    @Override
    public void enterBinary_expr(SRgrammarParser.Binary_exprContext ctx){
        if(ctx.TK_LT() != null) {
            System.out.print(ctx.TK_LT().getText());
        }
    }

    @Override
    public void exitBracketed_list(SRgrammarParser.Bracketed_listContext ctx){
        if(ctx.TK_RBRACKET() != null) {
            System.out.print(ctx.TK_RBRACKET().getText());

        }
    }

    @Override
    public void enterBracketed_list(SRgrammarParser.Bracketed_listContext ctx){
        if(ctx.TK_LBRACKET() != null) {
            System.out.print(ctx.TK_LBRACKET().getText());

        }
    }

    @Override
    public void enterSubscripts(SRgrammarParser.SubscriptsContext ctx){
        System.out.print('=');
    }

    @Override
    public void exitVar_def(SRgrammarParser.Var_defContext ctx){
            System.out.println();
    }

    @Override
    public void enterVar_def(SRgrammarParser.Var_defContext ctx){
        System.out.print("\t\t");
    }

    @Override
    public void enterVar_att(SRgrammarParser.Var_attContext ctx){
        if(ctx.TK_ASSIGN()!=null){
            System.out.print("=");
        }
    }

    @Override
    public void enterExpr(SRgrammarParser.ExprContext ctx){
        if(ctx.INT()!=null){
            System.out.print(ctx.INT().getText());
        }
        if(ctx.REAL()!=null){
            System.out.print(ctx.REAL().getText());
        }
        if(ctx.TK_ID()!=null){
            System.out.print(ctx.TK_ID().getText());
        }
    }

    @Override
    public void enterProc(SRgrammarParser.ProcContext ctx){
        System.out.print("\t\t");
        if(ctx.TK_PROC()!=null){
            System.out.print("def ");
        }

        if(ctx.TK_ID()!=null){
            System.out.print(ctx.TK_ID().getText());
        }
    }
    @Override
    public void exitParam_names(SRgrammarParser.Param_namesContext ctx){
        if(ctx.TK_RPAREN()!=null) {
            System.out.print(ctx.TK_RPAREN().getText());
        }
        System.out.println(":");
    }

    @Override
    public void enterParam_names(SRgrammarParser.Param_namesContext ctx){
        if(ctx.TK_LPAREN()!=null) {
            System.out.print(ctx.TK_LPAREN().getText()+ "");
        }
    }

    @Override
    public void enterId_lp(SRgrammarParser.Id_lpContext ctx){
        if(ctx.TK_ID()!=null) {
            System.out.print(ctx.TK_ID().getText()+ "");
        }
    }

    @Override
    public void enterIf_stmt(SRgrammarParser.If_stmtContext ctx){
        System.out.print("\t\t\t");
        if(ctx.TK_IF()!=null) {
            System.out.print("if (");
        }
    }

    @Override
    public void exitIf_stmt(SRgrammarParser.If_stmtContext ctx){
        System.out.println("");
    }

    @Override
    public void exitGuarded_cmd(SRgrammarParser.Guarded_cmdContext ctx){
        if(ctx.TK_ARROW()!=null) {
            System.out.print("):");
        }
    }

}