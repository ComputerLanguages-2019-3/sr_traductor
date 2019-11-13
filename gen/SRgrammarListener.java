// Generated from /home/laura-angelica/Documents/UNAL/2019-2/languages/SR_traductor/grammar/SRgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRgrammarParser}.
 */
public interface SRgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#combined_component}.
	 * @param ctx the parse tree
	 */
	void enterCombined_component(SRgrammarParser.Combined_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#combined_component}.
	 * @param ctx the parse tree
	 */
	void exitCombined_component(SRgrammarParser.Combined_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#separate_body}.
	 * @param ctx the parse tree
	 */
	void enterSeparate_body(SRgrammarParser.Separate_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#separate_body}.
	 * @param ctx the parse tree
	 */
	void exitSeparate_body(SRgrammarParser.Separate_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_params(SRgrammarParser.Maybe_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_params(SRgrammarParser.Maybe_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(SRgrammarParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(SRgrammarParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void enterComp_params(SRgrammarParser.Comp_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void exitComp_params(SRgrammarParser.Comp_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#combined_specpart}.
	 * @param ctx the parse tree
	 */
	void enterCombined_specpart(SRgrammarParser.Combined_specpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#combined_specpart}.
	 * @param ctx the parse tree
	 */
	void exitCombined_specpart(SRgrammarParser.Combined_specpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt(SRgrammarParser.Body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt(SRgrammarParser.Body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt_ls(SRgrammarParser.Body_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt_ls(SRgrammarParser.Body_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void enterId_opt(SRgrammarParser.Id_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void exitId_opt(SRgrammarParser.Id_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#end_id}.
	 * @param ctx the parse tree
	 */
	void enterEnd_id(SRgrammarParser.End_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#end_id}.
	 * @param ctx the parse tree
	 */
	void exitEnd_id(SRgrammarParser.End_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_invocation(SRgrammarParser.Concurrent_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_invocation(SRgrammarParser.Concurrent_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void enterSeparator_opt(SRgrammarParser.Separator_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void exitSeparator_opt(SRgrammarParser.Separator_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd(SRgrammarParser.Concurrent_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd(SRgrammarParser.Concurrent_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd_lp(SRgrammarParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd_lp(SRgrammarParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_stmt(SRgrammarParser.Concurrent_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_stmt(SRgrammarParser.Concurrent_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void enterP_stmt(SRgrammarParser.P_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void exitP_stmt(SRgrammarParser.P_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReceive_stmt(SRgrammarParser.Receive_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReceive_stmt(SRgrammarParser.Receive_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSync_expr_opt(SRgrammarParser.Sync_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSync_expr_opt(SRgrammarParser.Sync_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSched_expr_opt(SRgrammarParser.Sched_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSched_expr_opt(SRgrammarParser.Sched_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_name_opt(SRgrammarParser.Return_name_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_name_opt(SRgrammarParser.Return_name_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void enterId_ls(SRgrammarParser.Id_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void exitId_ls(SRgrammarParser.Id_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#param_names}.
	 * @param ctx the parse tree
	 */
	void enterParam_names(SRgrammarParser.Param_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#param_names}.
	 * @param ctx the parse tree
	 */
	void exitParam_names(SRgrammarParser.Param_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(SRgrammarParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(SRgrammarParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#in_op}.
	 * @param ctx the parse tree
	 */
	void enterIn_op(SRgrammarParser.In_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#in_op}.
	 * @param ctx the parse tree
	 */
	void exitIn_op(SRgrammarParser.In_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void enterIn_spec(SRgrammarParser.In_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void exitIn_spec(SRgrammarParser.In_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiers_opt(SRgrammarParser.Quantifiers_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiers_opt(SRgrammarParser.Quantifiers_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd(SRgrammarParser.In_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd(SRgrammarParser.In_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd_lp(SRgrammarParser.In_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd_lp(SRgrammarParser.In_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#in_cmd_lp_aux}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd_lp_aux(SRgrammarParser.In_cmd_lp_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#in_cmd_lp_aux}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd_lp_aux(SRgrammarParser.In_cmd_lp_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(SRgrammarParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(SRgrammarParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void enterV_stmt(SRgrammarParser.V_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void exitV_stmt(SRgrammarParser.V_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void enterSuch_that_opt(SRgrammarParser.Such_that_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void exitSuch_that_opt(SRgrammarParser.Such_that_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void enterStep_opt(SRgrammarParser.Step_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void exitStep_opt(SRgrammarParser.Step_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(SRgrammarParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(SRgrammarParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SRgrammarParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SRgrammarParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_lp(SRgrammarParser.Quantifier_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_lp(SRgrammarParser.Quantifier_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void enterElse_cmd_opt(SRgrammarParser.Else_cmd_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void exitElse_cmd_opt(SRgrammarParser.Else_cmd_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt(SRgrammarParser.For_all_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt(SRgrammarParser.For_all_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_stmt(SRgrammarParser.Do_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_stmt(SRgrammarParser.Do_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(SRgrammarParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(SRgrammarParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#write_ls}.
	 * @param ctx the parse tree
	 */
	void enterWrite_ls(SRgrammarParser.Write_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#write_ls}.
	 * @param ctx the parse tree
	 */
	void exitWrite_ls(SRgrammarParser.Write_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(SRgrammarParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(SRgrammarParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd(SRgrammarParser.Guarded_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd(SRgrammarParser.Guarded_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd_lp(SRgrammarParser.Guarded_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd_lp(SRgrammarParser.Guarded_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SRgrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SRgrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(SRgrammarParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(SRgrammarParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#block_items}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items(SRgrammarParser.Block_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#block_items}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items(SRgrammarParser.Block_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#block_items_aux}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items_aux(SRgrammarParser.Block_items_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#block_items_aux}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items_aux(SRgrammarParser.Block_items_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRgrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRgrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end(SRgrammarParser.Begin_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end(SRgrammarParser.Begin_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_stmt(SRgrammarParser.Destroy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_stmt(SRgrammarParser.Destroy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_call(SRgrammarParser.Explicit_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_call(SRgrammarParser.Explicit_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSend_stmt(SRgrammarParser.Send_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSend_stmt(SRgrammarParser.Send_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForward_stmt(SRgrammarParser.Forward_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForward_stmt(SRgrammarParser.Forward_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReply_stmt(SRgrammarParser.Reply_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReply_stmt(SRgrammarParser.Reply_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SRgrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SRgrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNext_stmt(SRgrammarParser.Next_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNext_stmt(SRgrammarParser.Next_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(SRgrammarParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(SRgrammarParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void enterExit_code_opt(SRgrammarParser.Exit_code_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void exitExit_code_opt(SRgrammarParser.Exit_code_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStop_stmt(SRgrammarParser.Stop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStop_stmt(SRgrammarParser.Stop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip_stmt(SRgrammarParser.Skip_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip_stmt(SRgrammarParser.Skip_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SRgrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SRgrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void enterPost_processing_opt(SRgrammarParser.Post_processing_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void exitPost_processing_opt(SRgrammarParser.Post_processing_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(SRgrammarParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(SRgrammarParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(SRgrammarParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(SRgrammarParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(SRgrammarParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(SRgrammarParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void enterInitial_opt(SRgrammarParser.Initial_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void exitInitial_opt(SRgrammarParser.Initial_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void enterInitial_block(SRgrammarParser.Initial_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void exitInitial_block(SRgrammarParser.Initial_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void enterFinal_opt(SRgrammarParser.Final_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void exitFinal_opt(SRgrammarParser.Final_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#final_block}.
	 * @param ctx the parse tree
	 */
	void enterFinal_block(SRgrammarParser.Final_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#final_block}.
	 * @param ctx the parse tree
	 */
	void exitFinal_block(SRgrammarParser.Final_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#body_only}.
	 * @param ctx the parse tree
	 */
	void enterBody_only(SRgrammarParser.Body_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#body_only}.
	 * @param ctx the parse tree
	 */
	void exitBody_only(SRgrammarParser.Body_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(SRgrammarParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(SRgrammarParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#import_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_list(SRgrammarParser.Import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#import_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_list(SRgrammarParser.Import_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtend_clause(SRgrammarParser.Extend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtend_clause(SRgrammarParser.Extend_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void enterImport_clause(SRgrammarParser.Import_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void exitImport_clause(SRgrammarParser.Import_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void enterColon_opt(SRgrammarParser.Colon_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void exitColon_opt(SRgrammarParser.Colon_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void enterOper_def(SRgrammarParser.Oper_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void exitOper_def(SRgrammarParser.Oper_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterOper_def_lp(SRgrammarParser.Oper_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitOper_def_lp(SRgrammarParser.Oper_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#oper_def_lp_aux}.
	 * @param ctx the parse tree
	 */
	void enterOper_def_lp_aux(SRgrammarParser.Oper_def_lp_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#oper_def_lp_aux}.
	 * @param ctx the parse tree
	 */
	void exitOper_def_lp_aux(SRgrammarParser.Oper_def_lp_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void enterOp_or_ext(SRgrammarParser.Op_or_extContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void exitOp_or_ext(SRgrammarParser.Op_or_extContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void enterOp_decl(SRgrammarParser.Op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void exitOp_decl(SRgrammarParser.Op_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void enterSem_init(SRgrammarParser.Sem_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void exitSem_init(SRgrammarParser.Sem_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void enterSem_def(SRgrammarParser.Sem_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void exitSem_def(SRgrammarParser.Sem_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterSem_def_lp(SRgrammarParser.Sem_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitSem_def_lp(SRgrammarParser.Sem_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void enterSem_decl(SRgrammarParser.Sem_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void exitSem_decl(SRgrammarParser.Sem_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void enterEq_opt(SRgrammarParser.Eq_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void exitEq_opt(SRgrammarParser.Eq_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void enterOptype_decl(SRgrammarParser.Optype_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void exitOptype_decl(SRgrammarParser.Optype_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#var_att}.
	 * @param ctx the parse tree
	 */
	void enterVar_att(SRgrammarParser.Var_attContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#var_att}.
	 * @param ctx the parse tree
	 */
	void exitVar_att(SRgrammarParser.Var_attContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void enterLocation_opt(SRgrammarParser.Location_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void exitLocation_opt(SRgrammarParser.Location_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void enterRsrc_name(SRgrammarParser.Rsrc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void exitRsrc_name(SRgrammarParser.Rsrc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#create_call}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call(SRgrammarParser.Create_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#create_call}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call(SRgrammarParser.Create_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void enterCreate_expr(SRgrammarParser.Create_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void exitCreate_expr(SRgrammarParser.Create_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#suffix_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuffix_expr(SRgrammarParser.Suffix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#suffix_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuffix_expr(SRgrammarParser.Suffix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#new_item}.
	 * @param ctx the parse tree
	 */
	void enterNew_item(SRgrammarParser.New_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#new_item}.
	 * @param ctx the parse tree
	 */
	void exitNew_item(SRgrammarParser.New_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts_opt(SRgrammarParser.Subscripts_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts_opt(SRgrammarParser.Subscripts_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_null(SRgrammarParser.Return_spec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_null(SRgrammarParser.Return_spec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void enterSem_proto(SRgrammarParser.Sem_protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void exitSem_proto(SRgrammarParser.Sem_protoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction(SRgrammarParser.Op_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction(SRgrammarParser.Op_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction_opt(SRgrammarParser.Op_restriction_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction_opt(SRgrammarParser.Op_restriction_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_opt(SRgrammarParser.Return_spec_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_opt(SRgrammarParser.Return_spec_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void enterParam_kind_opt(SRgrammarParser.Param_kind_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void exitParam_kind_opt(SRgrammarParser.Param_kind_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec(SRgrammarParser.Param_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec(SRgrammarParser.Param_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_lp(SRgrammarParser.Param_spec_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_lp(SRgrammarParser.Param_spec_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_ls(SRgrammarParser.Param_spec_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_ls(SRgrammarParser.Param_spec_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SRgrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SRgrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(SRgrammarParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(SRgrammarParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void enterOp_prototype(SRgrammarParser.Op_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void exitOp_prototype(SRgrammarParser.Op_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(SRgrammarParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(SRgrammarParser.Qualified_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void enterCap_for(SRgrammarParser.Cap_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void exitCap_for(SRgrammarParser.Cap_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void enterCapability_def(SRgrammarParser.Capability_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void exitCapability_def(SRgrammarParser.Capability_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(SRgrammarParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(SRgrammarParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SRgrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SRgrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void enterField_lp(SRgrammarParser.Field_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void exitField_lp(SRgrammarParser.Field_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(SRgrammarParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(SRgrammarParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void enterPointer_def(SRgrammarParser.Pointer_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void exitPointer_def(SRgrammarParser.Pointer_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_lp(SRgrammarParser.Id_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_lp(SRgrammarParser.Id_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(SRgrammarParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(SRgrammarParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void enterString_lim(SRgrammarParser.String_limContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void exitString_lim(SRgrammarParser.String_limContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#string_def}.
	 * @param ctx the parse tree
	 */
	void enterString_def(SRgrammarParser.String_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#string_def}.
	 * @param ctx the parse tree
	 */
	void exitString_def(SRgrammarParser.String_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(SRgrammarParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(SRgrammarParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void enterUnsub_type(SRgrammarParser.Unsub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void exitUnsub_type(SRgrammarParser.Unsub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SRgrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SRgrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(SRgrammarParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(SRgrammarParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expr(SRgrammarParser.Prefix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expr(SRgrammarParser.Prefix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#binary_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expr(SRgrammarParser.Binary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#binary_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expr(SRgrammarParser.Binary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item(SRgrammarParser.Constr_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item(SRgrammarParser.Constr_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item_lp(SRgrammarParser.Constr_item_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item_lp(SRgrammarParser.Constr_item_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(SRgrammarParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(SRgrammarParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lp(SRgrammarParser.Expr_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lp(SRgrammarParser.Expr_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void enterParen_item_ls(SRgrammarParser.Paren_item_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void exitParen_item_ls(SRgrammarParser.Paren_item_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void enterParen_list(SRgrammarParser.Paren_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void exitParen_list(SRgrammarParser.Paren_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(SRgrammarParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(SRgrammarParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SRgrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SRgrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SRgrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SRgrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#bounds}.
	 * @param ctx the parse tree
	 */
	void enterBounds(SRgrammarParser.BoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#bounds}.
	 * @param ctx the parse tree
	 */
	void exitBounds(SRgrammarParser.BoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#bound_lpaux}.
	 * @param ctx the parse tree
	 */
	void enterBound_lpaux(SRgrammarParser.Bound_lpauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#bound_lpaux}.
	 * @param ctx the parse tree
	 */
	void exitBound_lpaux(SRgrammarParser.Bound_lpauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void enterBound_lp(SRgrammarParser.Bound_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void exitBound_lp(SRgrammarParser.Bound_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_list(SRgrammarParser.Bracketed_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_list(SRgrammarParser.Bracketed_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void enterId_subs(SRgrammarParser.Id_subsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void exitId_subs(SRgrammarParser.Id_subsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_subs_lpaux}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lpaux(SRgrammarParser.Id_subs_lpauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_subs_lpaux}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lpaux(SRgrammarParser.Id_subs_lpauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lp(SRgrammarParser.Id_subs_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lp(SRgrammarParser.Id_subs_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(SRgrammarParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(SRgrammarParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterVar_def_lp(SRgrammarParser.Var_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitVar_def_lp(SRgrammarParser.Var_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_const(SRgrammarParser.Var_or_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_const(SRgrammarParser.Var_or_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void enterObj_decl(SRgrammarParser.Obj_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void exitObj_decl(SRgrammarParser.Obj_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void enterType_restriction(SRgrammarParser.Type_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void exitType_restriction(SRgrammarParser.Type_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(SRgrammarParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(SRgrammarParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SRgrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SRgrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommon_stmt(SRgrammarParser.Common_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommon_stmt(SRgrammarParser.Common_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt(SRgrammarParser.Spec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt(SRgrammarParser.Spec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#optional_sep}.
	 * @param ctx the parse tree
	 */
	void enterOptional_sep(SRgrammarParser.Optional_sepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#optional_sep}.
	 * @param ctx the parse tree
	 */
	void exitOptional_sep(SRgrammarParser.Optional_sepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#spec_stmt_lsaux}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt_lsaux(SRgrammarParser.Spec_stmt_lsauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#spec_stmt_lsaux}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt_lsaux(SRgrammarParser.Spec_stmt_lsauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt_ls(SRgrammarParser.Spec_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt_ls(SRgrammarParser.Spec_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#comp_kwd}.
	 * @param ctx the parse tree
	 */
	void enterComp_kwd(SRgrammarParser.Comp_kwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#comp_kwd}.
	 * @param ctx the parse tree
	 */
	void exitComp_kwd(SRgrammarParser.Comp_kwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void enterComp_label(SRgrammarParser.Comp_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void exitComp_label(SRgrammarParser.Comp_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#spec_component}.
	 * @param ctx the parse tree
	 */
	void enterSpec_component(SRgrammarParser.Spec_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#spec_component}.
	 * @param ctx the parse tree
	 */
	void exitSpec_component(SRgrammarParser.Spec_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRgrammarParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(SRgrammarParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRgrammarParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(SRgrammarParser.ComponentContext ctx);
}