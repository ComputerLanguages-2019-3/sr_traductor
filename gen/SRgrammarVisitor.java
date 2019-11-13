// Generated from /home/laura-angelica/Documents/UNAL/2019-2/languages/SR_traductor/grammar/SRgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#combined_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_component(SRgrammarParser.Combined_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#separate_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparate_body(SRgrammarParser.Separate_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#maybe_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_params(SRgrammarParser.Maybe_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(SRgrammarParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#comp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_params(SRgrammarParser.Comp_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#combined_specpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_specpart(SRgrammarParser.Combined_specpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt(SRgrammarParser.Body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt_ls(SRgrammarParser.Body_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_opt(SRgrammarParser.Id_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#end_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_id(SRgrammarParser.End_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_invocation(SRgrammarParser.Concurrent_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#separator_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator_opt(SRgrammarParser.Separator_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd(SRgrammarParser.Concurrent_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd_lp(SRgrammarParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_stmt(SRgrammarParser.Concurrent_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#p_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_stmt(SRgrammarParser.P_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#receive_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_stmt(SRgrammarParser.Receive_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync_expr_opt(SRgrammarParser.Sync_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSched_expr_opt(SRgrammarParser.Sched_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#return_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_name_opt(SRgrammarParser.Return_name_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_ls(SRgrammarParser.Id_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#param_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_names(SRgrammarParser.Param_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(SRgrammarParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#in_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_op(SRgrammarParser.In_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#in_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_spec(SRgrammarParser.In_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiers_opt(SRgrammarParser.Quantifiers_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#in_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd(SRgrammarParser.In_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd_lp(SRgrammarParser.In_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#in_cmd_lp_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd_lp_aux(SRgrammarParser.In_cmd_lp_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(SRgrammarParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#v_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_stmt(SRgrammarParser.V_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#such_that_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuch_that_opt(SRgrammarParser.Such_that_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#step_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_opt(SRgrammarParser.Step_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(SRgrammarParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SRgrammarParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#quantifier_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_lp(SRgrammarParser.Quantifier_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cmd_opt(SRgrammarParser.Else_cmd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#for_all_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt(SRgrammarParser.For_all_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#do_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_stmt(SRgrammarParser.Do_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(SRgrammarParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#write_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_ls(SRgrammarParser.Write_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(SRgrammarParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#guarded_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd(SRgrammarParser.Guarded_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd_lp(SRgrammarParser.Guarded_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SRgrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(SRgrammarParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#block_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items(SRgrammarParser.Block_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#block_items_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items_aux(SRgrammarParser.Block_items_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRgrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#begin_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end(SRgrammarParser.Begin_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#destroy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_stmt(SRgrammarParser.Destroy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#explicit_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_call(SRgrammarParser.Explicit_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#send_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_stmt(SRgrammarParser.Send_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#forward_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_stmt(SRgrammarParser.Forward_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#reply_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReply_stmt(SRgrammarParser.Reply_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SRgrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#next_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_stmt(SRgrammarParser.Next_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(SRgrammarParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#exit_code_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_code_opt(SRgrammarParser.Exit_code_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#stop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_stmt(SRgrammarParser.Stop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#skip_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_stmt(SRgrammarParser.Skip_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SRgrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#post_processing_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_processing_opt(SRgrammarParser.Post_processing_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(SRgrammarParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(SRgrammarParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(SRgrammarParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#initial_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_opt(SRgrammarParser.Initial_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#initial_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_block(SRgrammarParser.Initial_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#final_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_opt(SRgrammarParser.Final_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#final_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_block(SRgrammarParser.Final_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#body_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_only(SRgrammarParser.Body_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(SRgrammarParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_list(SRgrammarParser.Import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#extend_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend_clause(SRgrammarParser.Extend_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#import_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_clause(SRgrammarParser.Import_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#colon_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_opt(SRgrammarParser.Colon_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#oper_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def(SRgrammarParser.Oper_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#oper_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def_lp(SRgrammarParser.Oper_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#oper_def_lp_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def_lp_aux(SRgrammarParser.Oper_def_lp_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#op_or_ext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_or_ext(SRgrammarParser.Op_or_extContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_decl(SRgrammarParser.Op_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sem_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_init(SRgrammarParser.Sem_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sem_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def(SRgrammarParser.Sem_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sem_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def_lp(SRgrammarParser.Sem_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sem_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_decl(SRgrammarParser.Sem_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#eq_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_opt(SRgrammarParser.Eq_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#optype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptype_decl(SRgrammarParser.Optype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#var_att}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_att(SRgrammarParser.Var_attContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#location_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_opt(SRgrammarParser.Location_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#rsrc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsrc_name(SRgrammarParser.Rsrc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#create_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call(SRgrammarParser.Create_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#create_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_expr(SRgrammarParser.Create_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#suffix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix_expr(SRgrammarParser.Suffix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#new_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_item(SRgrammarParser.New_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#subscripts_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts_opt(SRgrammarParser.Subscripts_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#return_spec_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_null(SRgrammarParser.Return_spec_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#sem_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_proto(SRgrammarParser.Sem_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#op_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction(SRgrammarParser.Op_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction_opt(SRgrammarParser.Op_restriction_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#return_spec_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_opt(SRgrammarParser.Return_spec_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#param_kind_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_kind_opt(SRgrammarParser.Param_kind_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#param_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec(SRgrammarParser.Param_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#param_spec_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_lp(SRgrammarParser.Param_spec_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#param_spec_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_ls(SRgrammarParser.Param_spec_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SRgrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype(SRgrammarParser.PrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#op_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_prototype(SRgrammarParser.Op_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#qualified_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_id(SRgrammarParser.Qualified_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#cap_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCap_for(SRgrammarParser.Cap_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#capability_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability_def(SRgrammarParser.Capability_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_def(SRgrammarParser.Union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SRgrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#field_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_lp(SRgrammarParser.Field_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(SRgrammarParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#pointer_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_def(SRgrammarParser.Pointer_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lp(SRgrammarParser.Id_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(SRgrammarParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#string_lim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lim(SRgrammarParser.String_limContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#string_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_def(SRgrammarParser.String_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(SRgrammarParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#unsub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsub_type(SRgrammarParser.Unsub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SRgrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(SRgrammarParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#prefix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expr(SRgrammarParser.Prefix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#binary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expr(SRgrammarParser.Binary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#constr_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item(SRgrammarParser.Constr_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#constr_item_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item_lp(SRgrammarParser.Constr_item_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SRgrammarParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#expr_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_lp(SRgrammarParser.Expr_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#paren_item_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_item_ls(SRgrammarParser.Paren_item_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#paren_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_list(SRgrammarParser.Paren_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(SRgrammarParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SRgrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SRgrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds(SRgrammarParser.BoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#bound_lpaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_lpaux(SRgrammarParser.Bound_lpauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#bound_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_lp(SRgrammarParser.Bound_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#bracketed_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed_list(SRgrammarParser.Bracketed_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs(SRgrammarParser.Id_subsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_subs_lpaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lpaux(SRgrammarParser.Id_subs_lpauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#id_subs_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lp(SRgrammarParser.Id_subs_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(SRgrammarParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#var_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def_lp(SRgrammarParser.Var_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#var_or_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_const(SRgrammarParser.Var_or_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#obj_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_decl(SRgrammarParser.Obj_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#type_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_restriction(SRgrammarParser.Type_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(SRgrammarParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SRgrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#common_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_stmt(SRgrammarParser.Common_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#spec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt(SRgrammarParser.Spec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#optional_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_sep(SRgrammarParser.Optional_sepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#spec_stmt_lsaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt_lsaux(SRgrammarParser.Spec_stmt_lsauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt_ls(SRgrammarParser.Spec_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#comp_kwd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_kwd(SRgrammarParser.Comp_kwdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#comp_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_label(SRgrammarParser.Comp_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#spec_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_component(SRgrammarParser.Spec_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRgrammarParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(SRgrammarParser.ComponentContext ctx);
}