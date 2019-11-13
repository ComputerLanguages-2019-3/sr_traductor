// Generated from /home/laura-angelica/Documents/UNAL/2019-2/languages/SR_traductor/grammar/SRgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, REAL=2, WS=3, LINE_COMMENT=4, TK_SEPARATOR=5, TK_RESOURCE=6, TK_GLOBAL=7, 
		TK_BODY=8, TK_SEPARATE=9, TK_EXTEND=10, TK_IMPORT=11, TK_COMMA=12, TK_VAR=13, 
		TK_CONST=14, TK_LBRACE=15, TK_RBRACE=16, TK_TYPE=17, TK_EQ=18, TK_ASTER=19, 
		TK_ILIT=20, TK_RLIT=21, TK_BLIT=22, TK_CLIT=23, TK_SLIT=24, TK_NLIT=25, 
		TK_FLIT=26, TK_LPAREN=27, TK_RPAREN=28, TK_LBRACKET=29, TK_RBRACKET=30, 
		TK_QUOTE=31, TK_EXPON=32, TK_DIV=33, TK_REMDR=34, TK_PLUS=35, TK_MINUS=36, 
		TK_CONCAT=37, TK_NE=38, TK_GE=39, TK_LE=40, TK_GT=41, TK_LT=42, TK_AND=43, 
		TK_OR=44, TK_ARROW=45, TK_SQUARE=46, TK_PARALLEL=47, TK_XOR=48, TK_RSHIFT=49, 
		TK_LSHIFT=50, TK_SWAP=51, TK_ASSIGN=52, TK_AUG_PLUS=53, TK_AUG_MINUS=54, 
		TK_AUG_ASTER=55, TK_AUG_DIV=56, TK_AUG_REMDR=57, TK_AUG_EXPON=58, TK_AUG_OR=59, 
		TK_AUG_AND=60, TK_AUG_CONCAT=61, TK_AUG_RSHIFT=62, TK_AUG_LSHIFT=63, TK_RETURNS=64, 
		TK_NEW=65, TK_LOW=66, TK_HIGH=67, TK_COLON=68, TK_VAL=69, TK_RES=70, TK_REF=71, 
		TK_CAP=72, TK_CALL=73, TK_BOGUS=74, TK_PERIOD=75, TK_PROC=76, TK_IF=77, 
		TK_FI=78, TK_ELSE=79, TK_DO=80, TK_OD=81, TK_FA=82, TK_AF=83, TK_CO=84, 
		TK_OC=85, TK_IN=86, TK_NI=87, TK_BEGIN=88, TK_DESTROY=89, TK_FORWARD=90, 
		TK_REPLY=91, TK_RETURN=92, TK_NEXT=93, TK_EXIT=94, TK_STOP=95, TK_SKIP=96, 
		TK_RECEIVE=97, TK_SUCHTHAT=98, TK_BY=99, TK_V=100, TK_P=101, TK_TO=102, 
		TK_DOWNTO=103, TK_WRITE=104, TK_SEND=105, TK_VM=106, TK_SEM=107, TK_REC=108, 
		TK_ANY=109, TK_INCR=110, TK_DECR=111, TK_QMARK=112, TK_NOT=113, TK_FILE=114, 
		TK_UNION=115, TK_BOOL=116, TK_INT=117, TK_CHAR=118, TK_REAL=119, TK_ENUM=120, 
		TK_STRING=121, TK_PTR=122, TK_ADDR=123, TK_MOD=124, TK_HAT=125, TK_CREATE=126, 
		TK_ON=127, TK_OPTYPE=128, TK_EXTERNAL=129, TK_OP=130, TK_PROCESS=131, 
		TK_PROCEDURE=132, TK_END=133, TK_INITIAL=134, TK_FINAL=135, TK_ID=136;
	public static final int
		RULE_combined_component = 0, RULE_separate_body = 1, RULE_maybe_params = 2, 
		RULE_spec_body = 3, RULE_comp_params = 4, RULE_combined_specpart = 5, 
		RULE_body_stmt = 6, RULE_body_stmt_ls = 7, RULE_id_opt = 8, RULE_end_id = 9, 
		RULE_concurrent_invocation = 10, RULE_separator_opt = 11, RULE_concurrent_cmd = 12, 
		RULE_concurrent_cmd_lp = 13, RULE_concurrent_stmt = 14, RULE_p_stmt = 15, 
		RULE_receive_stmt = 16, RULE_sync_expr_opt = 17, RULE_sched_expr_opt = 18, 
		RULE_return_name_opt = 19, RULE_id_ls = 20, RULE_param_names = 21, RULE_subscripts = 22, 
		RULE_in_op = 23, RULE_in_spec = 24, RULE_quantifiers_opt = 25, RULE_in_cmd = 26, 
		RULE_in_cmd_lp = 27, RULE_in_cmd_lp_aux = 28, RULE_input_stmt = 29, RULE_v_stmt = 30, 
		RULE_such_that_opt = 31, RULE_step_opt = 32, RULE_direction = 33, RULE_quantifier = 34, 
		RULE_quantifier_lp = 35, RULE_else_cmd_opt = 36, RULE_for_all_stmt = 37, 
		RULE_do_stmt = 38, RULE_write_stmt = 39, RULE_write_ls = 40, RULE_id_list = 41, 
		RULE_guarded_cmd = 42, RULE_guarded_cmd_lp = 43, RULE_if_stmt = 44, RULE_block_item = 45, 
		RULE_block_items = 46, RULE_block_items_aux = 47, RULE_block = 48, RULE_begin_end = 49, 
		RULE_destroy_stmt = 50, RULE_explicit_call = 51, RULE_send_stmt = 52, 
		RULE_forward_stmt = 53, RULE_reply_stmt = 54, RULE_return_stmt = 55, RULE_next_stmt = 56, 
		RULE_exit_stmt = 57, RULE_exit_code_opt = 58, RULE_stop_stmt = 59, RULE_skip_stmt = 60, 
		RULE_stmt = 61, RULE_post_processing_opt = 62, RULE_proc = 63, RULE_process = 64, 
		RULE_procedure = 65, RULE_initial_opt = 66, RULE_initial_block = 67, RULE_final_opt = 68, 
		RULE_final_block = 69, RULE_body_only = 70, RULE_import_name = 71, RULE_import_list = 72, 
		RULE_extend_clause = 73, RULE_import_clause = 74, RULE_colon_opt = 75, 
		RULE_oper_def = 76, RULE_oper_def_lp = 77, RULE_oper_def_lp_aux = 78, 
		RULE_op_or_ext = 79, RULE_op_decl = 80, RULE_sem_init = 81, RULE_sem_def = 82, 
		RULE_sem_def_lp = 83, RULE_sem_decl = 84, RULE_eq_opt = 85, RULE_optype_decl = 86, 
		RULE_var_att = 87, RULE_location_opt = 88, RULE_rsrc_name = 89, RULE_create_call = 90, 
		RULE_create_expr = 91, RULE_suffix_expr = 92, RULE_new_item = 93, RULE_subscripts_opt = 94, 
		RULE_return_spec_null = 95, RULE_sem_proto = 96, RULE_op_restriction = 97, 
		RULE_op_restriction_opt = 98, RULE_return_spec_opt = 99, RULE_param_kind_opt = 100, 
		RULE_param_spec = 101, RULE_param_spec_lp = 102, RULE_param_spec_ls = 103, 
		RULE_parameters = 104, RULE_prototype = 105, RULE_op_prototype = 106, 
		RULE_qualified_id = 107, RULE_cap_for = 108, RULE_capability_def = 109, 
		RULE_union_def = 110, RULE_field = 111, RULE_field_lp = 112, RULE_record_def = 113, 
		RULE_pointer_def = 114, RULE_id_lp = 115, RULE_enum_def = 116, RULE_string_lim = 117, 
		RULE_string_def = 118, RULE_basic_type = 119, RULE_unsub_type = 120, RULE_type = 121, 
		RULE_paren_expr = 122, RULE_prefix_expr = 123, RULE_binary_expr = 124, 
		RULE_constr_item = 125, RULE_constr_item_lp = 126, RULE_constructor = 127, 
		RULE_expr_lp = 128, RULE_paren_item_ls = 129, RULE_paren_list = 130, RULE_invocation = 131, 
		RULE_literal = 132, RULE_expr = 133, RULE_bounds = 134, RULE_bound_lpaux = 135, 
		RULE_bound_lp = 136, RULE_bracketed_list = 137, RULE_id_subs = 138, RULE_id_subs_lpaux = 139, 
		RULE_id_subs_lp = 140, RULE_var_def = 141, RULE_var_def_lp = 142, RULE_var_or_const = 143, 
		RULE_obj_decl = 144, RULE_type_restriction = 145, RULE_type_decl = 146, 
		RULE_decl = 147, RULE_common_stmt = 148, RULE_spec_stmt = 149, RULE_optional_sep = 150, 
		RULE_spec_stmt_lsaux = 151, RULE_spec_stmt_ls = 152, RULE_comp_kwd = 153, 
		RULE_comp_label = 154, RULE_spec_component = 155, RULE_component = 156;
	private static String[] makeRuleNames() {
		return new String[] {
			"combined_component", "separate_body", "maybe_params", "spec_body", "comp_params", 
			"combined_specpart", "body_stmt", "body_stmt_ls", "id_opt", "end_id", 
			"concurrent_invocation", "separator_opt", "concurrent_cmd", "concurrent_cmd_lp", 
			"concurrent_stmt", "p_stmt", "receive_stmt", "sync_expr_opt", "sched_expr_opt", 
			"return_name_opt", "id_ls", "param_names", "subscripts", "in_op", "in_spec", 
			"quantifiers_opt", "in_cmd", "in_cmd_lp", "in_cmd_lp_aux", "input_stmt", 
			"v_stmt", "such_that_opt", "step_opt", "direction", "quantifier", "quantifier_lp", 
			"else_cmd_opt", "for_all_stmt", "do_stmt", "write_stmt", "write_ls", 
			"id_list", "guarded_cmd", "guarded_cmd_lp", "if_stmt", "block_item", 
			"block_items", "block_items_aux", "block", "begin_end", "destroy_stmt", 
			"explicit_call", "send_stmt", "forward_stmt", "reply_stmt", "return_stmt", 
			"next_stmt", "exit_stmt", "exit_code_opt", "stop_stmt", "skip_stmt", 
			"stmt", "post_processing_opt", "proc", "process", "procedure", "initial_opt", 
			"initial_block", "final_opt", "final_block", "body_only", "import_name", 
			"import_list", "extend_clause", "import_clause", "colon_opt", "oper_def", 
			"oper_def_lp", "oper_def_lp_aux", "op_or_ext", "op_decl", "sem_init", 
			"sem_def", "sem_def_lp", "sem_decl", "eq_opt", "optype_decl", "var_att", 
			"location_opt", "rsrc_name", "create_call", "create_expr", "suffix_expr", 
			"new_item", "subscripts_opt", "return_spec_null", "sem_proto", "op_restriction", 
			"op_restriction_opt", "return_spec_opt", "param_kind_opt", "param_spec", 
			"param_spec_lp", "param_spec_ls", "parameters", "prototype", "op_prototype", 
			"qualified_id", "cap_for", "capability_def", "union_def", "field", "field_lp", 
			"record_def", "pointer_def", "id_lp", "enum_def", "string_lim", "string_def", 
			"basic_type", "unsub_type", "type", "paren_expr", "prefix_expr", "binary_expr", 
			"constr_item", "constr_item_lp", "constructor", "expr_lp", "paren_item_ls", 
			"paren_list", "invocation", "literal", "expr", "bounds", "bound_lpaux", 
			"bound_lp", "bracketed_list", "id_subs", "id_subs_lpaux", "id_subs_lp", 
			"var_def", "var_def_lp", "var_or_const", "obj_decl", "type_restriction", 
			"type_decl", "decl", "common_stmt", "spec_stmt", "optional_sep", "spec_stmt_lsaux", 
			"spec_stmt_ls", "comp_kwd", "comp_label", "spec_component", "component"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "'resource'", "'global'", "'body'", 
			"'separate'", "'extend'", "'import'", "','", "'var'", "'const'", "'{'", 
			"'}'", "'type'", "'='", "'*'", "'int literal'", "'real literal'", "'bool lteral'", 
			"'char literal'", "'string literal'", "'null literal'", "'float literal'", 
			"'('", "')'", "'['", "']'", "'\"'", "'**'", "'/'", "'%'", "'+'", "'-'", 
			"'||'", "'!='", "'>='", "'<='", "'>'", "'<'", "'&'", "'|'", "'->'", "'[]'", 
			"'//'", "'xor'", "'>>'", "'<<'", "':=:'", "':='", "'+:='", "'-:='", "'*:='", 
			"'/:='", "'%:='", "'**:='", "'|:='", "'&:='", "'||:='", "'>>:='", "'<<:='", 
			"'returns'", "'new'", "'low'", "'high'", "':'", "'val'", "'res'", "'ref'", 
			"'cap'", "'call'", "'bogus'", "'.'", "'proc'", "'if'", "'fi'", "'else'", 
			"'do'", "'od'", "'fa'", "'af'", "'co'", "'oc'", "'in'", "'ni'", "'begin'", 
			"'destroy'", "'forward'", "'reply'", "'return'", "'next'", "'exit'", 
			"'stop'", "'skip'", "'receive'", "'st'", "'by'", "'V'", "'P'", "'to'", 
			"'downto'", "'write'", "'send'", "'vm'", "'sem'", "'rec'", "'any'", "'++'", 
			"'--'", "'?'", "'~'", "'file'", "'union'", "'bool'", "'int'", "'char'", 
			"'real'", "'enum'", "'string'", "'ptr'", "'@'", "'mod'", "'^'", "'create'", 
			"'on'", "'optype'", "'external'", "'op'", "'process'", "'procedure'", 
			"'end'", "'initial'", "'final'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "REAL", "WS", "LINE_COMMENT", "TK_SEPARATOR", "TK_RESOURCE", 
			"TK_GLOBAL", "TK_BODY", "TK_SEPARATE", "TK_EXTEND", "TK_IMPORT", "TK_COMMA", 
			"TK_VAR", "TK_CONST", "TK_LBRACE", "TK_RBRACE", "TK_TYPE", "TK_EQ", "TK_ASTER", 
			"TK_ILIT", "TK_RLIT", "TK_BLIT", "TK_CLIT", "TK_SLIT", "TK_NLIT", "TK_FLIT", 
			"TK_LPAREN", "TK_RPAREN", "TK_LBRACKET", "TK_RBRACKET", "TK_QUOTE", "TK_EXPON", 
			"TK_DIV", "TK_REMDR", "TK_PLUS", "TK_MINUS", "TK_CONCAT", "TK_NE", "TK_GE", 
			"TK_LE", "TK_GT", "TK_LT", "TK_AND", "TK_OR", "TK_ARROW", "TK_SQUARE", 
			"TK_PARALLEL", "TK_XOR", "TK_RSHIFT", "TK_LSHIFT", "TK_SWAP", "TK_ASSIGN", 
			"TK_AUG_PLUS", "TK_AUG_MINUS", "TK_AUG_ASTER", "TK_AUG_DIV", "TK_AUG_REMDR", 
			"TK_AUG_EXPON", "TK_AUG_OR", "TK_AUG_AND", "TK_AUG_CONCAT", "TK_AUG_RSHIFT", 
			"TK_AUG_LSHIFT", "TK_RETURNS", "TK_NEW", "TK_LOW", "TK_HIGH", "TK_COLON", 
			"TK_VAL", "TK_RES", "TK_REF", "TK_CAP", "TK_CALL", "TK_BOGUS", "TK_PERIOD", 
			"TK_PROC", "TK_IF", "TK_FI", "TK_ELSE", "TK_DO", "TK_OD", "TK_FA", "TK_AF", 
			"TK_CO", "TK_OC", "TK_IN", "TK_NI", "TK_BEGIN", "TK_DESTROY", "TK_FORWARD", 
			"TK_REPLY", "TK_RETURN", "TK_NEXT", "TK_EXIT", "TK_STOP", "TK_SKIP", 
			"TK_RECEIVE", "TK_SUCHTHAT", "TK_BY", "TK_V", "TK_P", "TK_TO", "TK_DOWNTO", 
			"TK_WRITE", "TK_SEND", "TK_VM", "TK_SEM", "TK_REC", "TK_ANY", "TK_INCR", 
			"TK_DECR", "TK_QMARK", "TK_NOT", "TK_FILE", "TK_UNION", "TK_BOOL", "TK_INT", 
			"TK_CHAR", "TK_REAL", "TK_ENUM", "TK_STRING", "TK_PTR", "TK_ADDR", "TK_MOD", 
			"TK_HAT", "TK_CREATE", "TK_ON", "TK_OPTYPE", "TK_EXTERNAL", "TK_OP", 
			"TK_PROCESS", "TK_PROCEDURE", "TK_END", "TK_INITIAL", "TK_FINAL", "TK_ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SRgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Combined_componentContext extends ParserRuleContext {
		public Combined_specpartContext combined_specpart() {
			return getRuleContext(Combined_specpartContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public Combined_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCombined_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCombined_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCombined_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_componentContext combined_component() throws RecognitionException {
		Combined_componentContext _localctx = new Combined_componentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_combined_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			combined_specpart();
			setState(315);
			body_stmt_ls(0);
			setState(316);
			end_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Separate_bodyContext extends ParserRuleContext {
		public TerminalNode TK_BODY() { return getToken(SRgrammarParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public Separate_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separate_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSeparate_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSeparate_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSeparate_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separate_bodyContext separate_body() throws RecognitionException {
		Separate_bodyContext _localctx = new Separate_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_separate_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(TK_BODY);
			setState(319);
			match(TK_ID);
			setState(320);
			body_stmt_ls(0);
			setState(321);
			end_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Maybe_paramsContext extends ParserRuleContext {
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public Maybe_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterMaybe_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitMaybe_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitMaybe_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_paramsContext maybe_params() throws RecognitionException {
		Maybe_paramsContext _localctx = new Maybe_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maybe_params);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				comp_params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_bodyContext extends ParserRuleContext {
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public TerminalNode TK_BODY() { return getToken(SRgrammarParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Maybe_paramsContext maybe_params() {
			return getRuleContext(Maybe_paramsContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATE() { return getToken(SRgrammarParser.TK_SEPARATE, 0); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSpec_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSpec_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSpec_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_bodyContext spec_body() throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_spec_body);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				end_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(TK_BODY);
				setState(329);
				match(TK_ID);
				setState(330);
				maybe_params();
				setState(331);
				body_stmt_ls(0);
				setState(332);
				end_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(TK_BODY);
				setState(335);
				match(TK_ID);
				setState(336);
				maybe_params();
				setState(337);
				match(TK_SEPARATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_paramsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Comp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterComp_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitComp_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitComp_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_paramsContext comp_params() throws RecognitionException {
		Comp_paramsContext _localctx = new Comp_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_specpartContext extends ParserRuleContext {
		public Comp_labelContext comp_label() {
			return getRuleContext(Comp_labelContext.class,0);
		}
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public Combined_specpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_specpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCombined_specpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCombined_specpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCombined_specpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_specpartContext combined_specpart() throws RecognitionException {
		Combined_specpartContext _localctx = new Combined_specpartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_combined_specpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			comp_label();
			setState(344);
			comp_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_onlyContext body_only() {
			return getRuleContext(Body_onlyContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBody_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBody_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBody_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmtContext body_stmt() throws RecognitionException {
		Body_stmtContext _localctx = new Body_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body_stmt);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				body_only();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				extend_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_stmt_lsContext extends ParserRuleContext {
		public Body_stmtContext body_stmt() {
			return getRuleContext(Body_stmtContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Body_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBody_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBody_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBody_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmt_lsContext body_stmt_ls() throws RecognitionException {
		return body_stmt_ls(0);
	}

	private Body_stmt_lsContext body_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Body_stmt_lsContext _localctx = new Body_stmt_lsContext(_ctx, _parentState);
		Body_stmt_lsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_body_stmt_ls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(353);
			body_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Body_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_body_stmt_ls);
					setState(355);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(356);
					match(TK_SEPARATOR);
					setState(357);
					body_stmt();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Id_optContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Id_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_optContext id_opt() throws RecognitionException {
		Id_optContext _localctx = new Id_optContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id_opt);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(TK_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_idContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(SRgrammarParser.TK_END, 0); }
		public Id_optContext id_opt() {
			return getRuleContext(Id_optContext.class,0);
		}
		public End_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterEnd_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitEnd_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitEnd_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_idContext end_id() throws RecognitionException {
		End_idContext _localctx = new End_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(TK_END);
			setState(368);
			id_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_invocationContext extends ParserRuleContext {
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Concurrent_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConcurrent_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConcurrent_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConcurrent_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_invocationContext concurrent_invocation() throws RecognitionException {
		Concurrent_invocationContext _localctx = new Concurrent_invocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_concurrent_invocation);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				send_stmt();
				}
				break;
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Separator_optContext extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public Separator_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSeparator_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSeparator_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSeparator_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separator_optContext separator_opt() throws RecognitionException {
		Separator_optContext _localctx = new Separator_optContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_separator_opt);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(TK_SEPARATOR);
				setState(376);
				separator_opt();
				}
				break;
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_CALL:
			case TK_SEND:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public Concurrent_invocationContext concurrent_invocation() {
			return getRuleContext(Concurrent_invocationContext.class,0);
		}
		public Post_processing_optContext post_processing_opt() {
			return getRuleContext(Post_processing_optContext.class,0);
		}
		public Concurrent_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConcurrent_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConcurrent_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConcurrent_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmdContext concurrent_cmd() throws RecognitionException {
		Concurrent_cmdContext _localctx = new Concurrent_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			quantifiers_opt();
			setState(381);
			separator_opt();
			setState(382);
			concurrent_invocation();
			setState(383);
			post_processing_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_cmd_lpContext extends ParserRuleContext {
		public Concurrent_cmdContext concurrent_cmd() {
			return getRuleContext(Concurrent_cmdContext.class,0);
		}
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_PARALLEL() { return getToken(SRgrammarParser.TK_PARALLEL, 0); }
		public Concurrent_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConcurrent_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConcurrent_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConcurrent_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmd_lpContext concurrent_cmd_lp() throws RecognitionException {
		return concurrent_cmd_lp(0);
	}

	private Concurrent_cmd_lpContext concurrent_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Concurrent_cmd_lpContext _localctx = new Concurrent_cmd_lpContext(_ctx, _parentState);
		Concurrent_cmd_lpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Concurrent_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concurrent_cmd_lp);
					setState(388);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(389);
					match(TK_PARALLEL);
					setState(390);
					concurrent_cmd();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Concurrent_stmtContext extends ParserRuleContext {
		public TerminalNode TK_CO() { return getToken(SRgrammarParser.TK_CO, 0); }
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_OC() { return getToken(SRgrammarParser.TK_OC, 0); }
		public Concurrent_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConcurrent_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConcurrent_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConcurrent_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_stmtContext concurrent_stmt() throws RecognitionException {
		Concurrent_stmtContext _localctx = new Concurrent_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(TK_CO);
			setState(397);
			concurrent_cmd_lp(0);
			setState(398);
			match(TK_OC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_stmtContext extends ParserRuleContext {
		public TerminalNode TK_P() { return getToken(SRgrammarParser.TK_P, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public P_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterP_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitP_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitP_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_stmtContext p_stmt() throws RecognitionException {
		P_stmtContext _localctx = new P_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(TK_P);
			setState(401);
			match(TK_LPAREN);
			setState(402);
			expr(0);
			setState(403);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Receive_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RECEIVE() { return getToken(SRgrammarParser.TK_RECEIVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Receive_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReceive_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReceive_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReceive_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Receive_stmtContext receive_stmt() throws RecognitionException {
		Receive_stmtContext _localctx = new Receive_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(TK_RECEIVE);
			setState(406);
			expr(0);
			setState(407);
			paren_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sync_expr_optContext extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(SRgrammarParser.TK_AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SUCHTHAT() { return getToken(SRgrammarParser.TK_SUCHTHAT, 0); }
		public Sync_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSync_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSync_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSync_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sync_expr_optContext sync_expr_opt() throws RecognitionException {
		Sync_expr_optContext _localctx = new Sync_expr_optContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sync_expr_opt);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(TK_AND);
				setState(410);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(TK_SUCHTHAT);
				setState(412);
				expr(0);
				}
				break;
			case TK_ARROW:
			case TK_BY:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sched_expr_optContext extends ParserRuleContext {
		public TerminalNode TK_BY() { return getToken(SRgrammarParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sched_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sched_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSched_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSched_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSched_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sched_expr_optContext sched_expr_opt() throws RecognitionException {
		Sched_expr_optContext _localctx = new Sched_expr_optContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sched_expr_opt);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(TK_BY);
				setState(417);
				expr(0);
				}
				break;
			case TK_ARROW:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_name_optContext extends ParserRuleContext {
		public TerminalNode TK_RETURNS() { return getToken(SRgrammarParser.TK_RETURNS, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Return_name_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_name_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReturn_name_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReturn_name_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReturn_name_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_name_optContext return_name_opt() throws RecognitionException {
		Return_name_optContext _localctx = new Return_name_optContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_name_opt);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case TK_IMPORT:
			case TK_VAR:
			case TK_CONST:
			case TK_TYPE:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_AND:
			case TK_ARROW:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_CALL:
			case TK_IF:
			case TK_DO:
			case TK_FA:
			case TK_CO:
			case TK_IN:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
			case TK_RECEIVE:
			case TK_SUCHTHAT:
			case TK_BY:
			case TK_V:
			case TK_P:
			case TK_WRITE:
			case TK_SEND:
			case TK_SEM:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_OPTYPE:
			case TK_EXTERNAL:
			case TK_OP:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_RETURNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(TK_RETURNS);
				setState(423);
				match(TK_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_lsContext extends ParserRuleContext {
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public Id_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lsContext id_ls() throws RecognitionException {
		Id_lsContext _localctx = new Id_lsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id_ls);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				id_lp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_namesContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Id_lsContext id_ls() {
			return getRuleContext(Id_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Return_name_optContext return_name_opt() {
			return getRuleContext(Return_name_optContext.class,0);
		}
		public Param_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParam_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParam_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParam_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_namesContext param_names() throws RecognitionException {
		Param_namesContext _localctx = new Param_namesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(TK_LPAREN);
			setState(431);
			id_ls();
			setState(432);
			match(TK_RPAREN);
			setState(433);
			return_name_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptsContext extends ParserRuleContext {
		public Bracketed_listContext bracketed_list() {
			return getRuleContext(Bracketed_listContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subscripts);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				bracketed_list();
				setState(437);
				subscripts();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_opContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public In_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIn_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_opContext in_op() throws RecognitionException {
		In_opContext _localctx = new In_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_in_op);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				qualified_id();
				setState(443);
				subscripts();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_specContext extends ParserRuleContext {
		public In_opContext in_op() {
			return getRuleContext(In_opContext.class,0);
		}
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public In_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIn_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_specContext in_spec() throws RecognitionException {
		In_specContext _localctx = new In_specContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			in_op();
			setState(448);
			param_names();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifiers_optContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Quantifiers_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiers_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterQuantifiers_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitQuantifiers_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitQuantifiers_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifiers_optContext quantifiers_opt() throws RecognitionException {
		Quantifiers_optContext _localctx = new Quantifiers_optContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_quantifiers_opt);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(TK_LPAREN);
				setState(452);
				quantifier_lp(0);
				setState(453);
				match(TK_RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public In_specContext in_spec() {
			return getRuleContext(In_specContext.class,0);
		}
		public Sync_expr_optContext sync_expr_opt() {
			return getRuleContext(Sync_expr_optContext.class,0);
		}
		public Sched_expr_optContext sched_expr_opt() {
			return getRuleContext(Sched_expr_optContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRgrammarParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public In_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIn_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIn_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIn_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmdContext in_cmd() throws RecognitionException {
		In_cmdContext _localctx = new In_cmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			quantifiers_opt();
			setState(458);
			in_spec();
			setState(459);
			sync_expr_opt();
			setState(460);
			sched_expr_opt();
			setState(461);
			match(TK_ARROW);
			setState(462);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_cmd_lpContext extends ParserRuleContext {
		public In_cmdContext in_cmd() {
			return getRuleContext(In_cmdContext.class,0);
		}
		public In_cmd_lp_auxContext in_cmd_lp_aux() {
			return getRuleContext(In_cmd_lp_auxContext.class,0);
		}
		public In_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIn_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIn_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIn_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmd_lpContext in_cmd_lp() throws RecognitionException {
		In_cmd_lpContext _localctx = new In_cmd_lpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_in_cmd_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			in_cmd();
			setState(465);
			in_cmd_lp_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_cmd_lp_auxContext extends ParserRuleContext {
		public TerminalNode TK_SQUARE() { return getToken(SRgrammarParser.TK_SQUARE, 0); }
		public In_cmdContext in_cmd() {
			return getRuleContext(In_cmdContext.class,0);
		}
		public In_cmd_lp_auxContext in_cmd_lp_aux() {
			return getRuleContext(In_cmd_lp_auxContext.class,0);
		}
		public In_cmd_lp_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd_lp_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIn_cmd_lp_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIn_cmd_lp_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIn_cmd_lp_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmd_lp_auxContext in_cmd_lp_aux() throws RecognitionException {
		In_cmd_lp_auxContext _localctx = new In_cmd_lp_auxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_in_cmd_lp_aux);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(TK_SQUARE);
				setState(468);
				in_cmd();
				setState(469);
				in_cmd_lp_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IN() { return getToken(SRgrammarParser.TK_IN, 0); }
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_NI() { return getToken(SRgrammarParser.TK_NI, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(TK_IN);
			setState(475);
			in_cmd_lp();
			setState(476);
			else_cmd_opt();
			setState(477);
			match(TK_NI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class V_stmtContext extends ParserRuleContext {
		public TerminalNode TK_V() { return getToken(SRgrammarParser.TK_V, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public V_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterV_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitV_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitV_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_stmtContext v_stmt() throws RecognitionException {
		V_stmtContext _localctx = new V_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(TK_V);
			setState(480);
			match(TK_LPAREN);
			setState(481);
			expr(0);
			setState(482);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Such_that_optContext extends ParserRuleContext {
		public TerminalNode TK_SUCHTHAT() { return getToken(SRgrammarParser.TK_SUCHTHAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Such_that_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_such_that_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSuch_that_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSuch_that_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSuch_that_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Such_that_optContext such_that_opt() throws RecognitionException {
		Such_that_optContext _localctx = new Such_that_optContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_such_that_opt);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(TK_SUCHTHAT);
				setState(485);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Step_optContext extends ParserRuleContext {
		public TerminalNode TK_BY() { return getToken(SRgrammarParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Step_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterStep_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitStep_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitStep_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_optContext step_opt() throws RecognitionException {
		Step_optContext _localctx = new Step_optContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_step_opt);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(TK_BY);
				setState(490);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TK_TO() { return getToken(SRgrammarParser.TK_TO, 0); }
		public TerminalNode TK_DOWNTO() { return getToken(SRgrammarParser.TK_DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==TK_TO || _la==TK_DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(SRgrammarParser.TK_ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Step_optContext step_opt() {
			return getRuleContext(Step_optContext.class,0);
		}
		public Such_that_optContext such_that_opt() {
			return getRuleContext(Such_that_optContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(TK_ID);
			setState(497);
			match(TK_ASSIGN);
			setState(498);
			expr(0);
			setState(499);
			direction();
			setState(500);
			expr(0);
			setState(501);
			step_opt();
			setState(502);
			such_that_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_lpContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Quantifier_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterQuantifier_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitQuantifier_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitQuantifier_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_lpContext quantifier_lp() throws RecognitionException {
		return quantifier_lp(0);
	}

	private Quantifier_lpContext quantifier_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Quantifier_lpContext _localctx = new Quantifier_lpContext(_ctx, _parentState);
		Quantifier_lpContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_quantifier_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(505);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Quantifier_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_quantifier_lp);
					setState(507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(508);
					match(TK_COMMA);
					setState(509);
					quantifier();
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Else_cmd_optContext extends ParserRuleContext {
		public TerminalNode TK_SQUARE() { return getToken(SRgrammarParser.TK_SQUARE, 0); }
		public TerminalNode TK_ELSE() { return getToken(SRgrammarParser.TK_ELSE, 0); }
		public TerminalNode TK_ARROW() { return getToken(SRgrammarParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_cmd_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cmd_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterElse_cmd_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitElse_cmd_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitElse_cmd_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_cmd_optContext else_cmd_opt() throws RecognitionException {
		Else_cmd_optContext _localctx = new Else_cmd_optContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_else_cmd_opt);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(TK_SQUARE);
				setState(516);
				match(TK_ELSE);
				setState(517);
				match(TK_ARROW);
				setState(518);
				block();
				}
				break;
			case TK_FI:
			case TK_OD:
			case TK_NI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_all_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FA() { return getToken(SRgrammarParser.TK_FA, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRgrammarParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_AF() { return getToken(SRgrammarParser.TK_AF, 0); }
		public For_all_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterFor_all_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitFor_all_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitFor_all_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmtContext for_all_stmt() throws RecognitionException {
		For_all_stmtContext _localctx = new For_all_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(TK_FA);
			setState(523);
			quantifier_lp(0);
			setState(524);
			match(TK_ARROW);
			setState(525);
			block();
			setState(526);
			match(TK_AF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(SRgrammarParser.TK_DO, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_OD() { return getToken(SRgrammarParser.TK_OD, 0); }
		public Do_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterDo_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitDo_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitDo_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_stmtContext do_stmt() throws RecognitionException {
		Do_stmtContext _localctx = new Do_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(TK_DO);
			setState(529);
			guarded_cmd_lp(0);
			setState(530);
			else_cmd_opt();
			setState(531);
			match(TK_OD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public TerminalNode TK_WRITE() { return getToken(SRgrammarParser.TK_WRITE, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Write_lsContext write_ls() {
			return getRuleContext(Write_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitWrite_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(TK_WRITE);
			setState(534);
			match(TK_LPAREN);
			setState(535);
			write_ls();
			setState(536);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_lsContext extends ParserRuleContext {
		public List<TerminalNode> TK_QUOTE() { return getTokens(SRgrammarParser.TK_QUOTE); }
		public TerminalNode TK_QUOTE(int i) {
			return getToken(SRgrammarParser.TK_QUOTE, i);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(SRgrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(SRgrammarParser.TK_COMMA, i);
		}
		public Write_lsContext write_ls() {
			return getRuleContext(Write_lsContext.class,0);
		}
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Write_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterWrite_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitWrite_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitWrite_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_lsContext write_ls() throws RecognitionException {
		Write_lsContext _localctx = new Write_lsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_write_ls);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(TK_QUOTE);
				setState(539);
				id_list();
				setState(540);
				match(TK_QUOTE);
				setState(541);
				match(TK_COMMA);
				setState(542);
				write_ls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(TK_QUOTE);
				setState(545);
				id_list();
				setState(546);
				match(TK_QUOTE);
				setState(547);
				match(TK_COMMA);
				setState(548);
				match(TK_ID);
				setState(549);
				match(TK_COMMA);
				setState(550);
				write_ls();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				match(TK_QUOTE);
				setState(553);
				id_list();
				setState(554);
				match(TK_QUOTE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_id_list);
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(TK_ID);
				setState(559);
				id_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				match(TK_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guarded_cmdContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRgrammarParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Guarded_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterGuarded_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitGuarded_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitGuarded_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmdContext guarded_cmd() throws RecognitionException {
		Guarded_cmdContext _localctx = new Guarded_cmdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_guarded_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			expr(0);
			setState(564);
			match(TK_ARROW);
			setState(565);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guarded_cmd_lpContext extends ParserRuleContext {
		public Guarded_cmdContext guarded_cmd() {
			return getRuleContext(Guarded_cmdContext.class,0);
		}
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(SRgrammarParser.TK_SQUARE, 0); }
		public Guarded_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterGuarded_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitGuarded_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitGuarded_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmd_lpContext guarded_cmd_lp() throws RecognitionException {
		return guarded_cmd_lp(0);
	}

	private Guarded_cmd_lpContext guarded_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Guarded_cmd_lpContext _localctx = new Guarded_cmd_lpContext(_ctx, _parentState);
		Guarded_cmd_lpContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_cmd_lp);
					setState(570);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(571);
					match(TK_SQUARE);
					setState(572);
					guarded_cmd();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(SRgrammarParser.TK_IF, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_FI() { return getToken(SRgrammarParser.TK_FI, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(TK_IF);
			setState(579);
			guarded_cmd_lp(0);
			setState(580);
			else_cmd_opt();
			setState(581);
			match(TK_FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_itemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_block_item);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAR:
			case TK_CONST:
			case TK_TYPE:
			case TK_SEM:
			case TK_OPTYPE:
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				decl();
				}
				break;
			case TK_CALL:
			case TK_IF:
			case TK_DO:
			case TK_FA:
			case TK_CO:
			case TK_IN:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
			case TK_RECEIVE:
			case TK_V:
			case TK_P:
			case TK_WRITE:
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				stmt();
				}
				break;
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				expr(0);
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				import_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_itemsContext extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_items_auxContext block_items_aux() {
			return getRuleContext(Block_items_auxContext.class,0);
		}
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBlock_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBlock_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBlock_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			block_item();
			setState(590);
			block_items_aux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_items_auxContext extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_items_auxContext block_items_aux() {
			return getRuleContext(Block_items_auxContext.class,0);
		}
		public Block_items_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBlock_items_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBlock_items_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBlock_items_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_items_auxContext block_items_aux() throws RecognitionException {
		Block_items_auxContext _localctx = new Block_items_auxContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block_items_aux);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(TK_SEPARATOR);
				setState(593);
				block_item();
				setState(594);
				block_items_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			block_items();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_endContext extends ParserRuleContext {
		public TerminalNode TK_BEGIN() { return getToken(SRgrammarParser.TK_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRgrammarParser.TK_END, 0); }
		public Begin_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBegin_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBegin_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBegin_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_endContext begin_end() throws RecognitionException {
		Begin_endContext _localctx = new Begin_endContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(TK_BEGIN);
			setState(602);
			block();
			setState(603);
			match(TK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destroy_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DESTROY() { return getToken(SRgrammarParser.TK_DESTROY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Destroy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterDestroy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitDestroy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitDestroy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destroy_stmtContext destroy_stmt() throws RecognitionException {
		Destroy_stmtContext _localctx = new Destroy_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(TK_DESTROY);
			setState(606);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_callContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(SRgrammarParser.TK_CALL, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Explicit_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExplicit_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExplicit_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExplicit_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_callContext explicit_call() throws RecognitionException {
		Explicit_callContext _localctx = new Explicit_callContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(TK_CALL);
			setState(609);
			invocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SEND() { return getToken(SRgrammarParser.TK_SEND, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Send_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSend_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSend_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSend_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_stmtContext send_stmt() throws RecognitionException {
		Send_stmtContext _localctx = new Send_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(TK_SEND);
			setState(612);
			invocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forward_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FORWARD() { return getToken(SRgrammarParser.TK_FORWARD, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Forward_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterForward_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitForward_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitForward_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forward_stmtContext forward_stmt() throws RecognitionException {
		Forward_stmtContext _localctx = new Forward_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(TK_FORWARD);
			setState(615);
			invocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reply_stmtContext extends ParserRuleContext {
		public TerminalNode TK_REPLY() { return getToken(SRgrammarParser.TK_REPLY, 0); }
		public Reply_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reply_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReply_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReply_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReply_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reply_stmtContext reply_stmt() throws RecognitionException {
		Reply_stmtContext _localctx = new Reply_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(TK_REPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(SRgrammarParser.TK_RETURN, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(TK_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Next_stmtContext extends ParserRuleContext {
		public TerminalNode TK_NEXT() { return getToken(SRgrammarParser.TK_NEXT, 0); }
		public Next_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterNext_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitNext_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitNext_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_stmtContext next_stmt() throws RecognitionException {
		Next_stmtContext _localctx = new Next_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(TK_NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode TK_EXIT() { return getToken(SRgrammarParser.TK_EXIT, 0); }
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(TK_EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_code_optContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Exit_code_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_code_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExit_code_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExit_code_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExit_code_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_code_optContext exit_code_opt() throws RecognitionException {
		Exit_code_optContext _localctx = new Exit_code_optContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_exit_code_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(TK_LPAREN);
			setState(626);
			expr(0);
			setState(627);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stop_stmtContext extends ParserRuleContext {
		public TerminalNode TK_STOP() { return getToken(SRgrammarParser.TK_STOP, 0); }
		public Exit_code_optContext exit_code_opt() {
			return getRuleContext(Exit_code_optContext.class,0);
		}
		public Stop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterStop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitStop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitStop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stop_stmtContext stop_stmt() throws RecognitionException {
		Stop_stmtContext _localctx = new Stop_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(TK_STOP);
			setState(630);
			exit_code_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SKIP() { return getToken(SRgrammarParser.TK_SKIP, 0); }
		public Skip_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSkip_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSkip_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSkip_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_stmtContext skip_stmt() throws RecognitionException {
		Skip_stmtContext _localctx = new Skip_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(TK_SKIP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Skip_stmtContext skip_stmt() {
			return getRuleContext(Skip_stmtContext.class,0);
		}
		public Stop_stmtContext stop_stmt() {
			return getRuleContext(Stop_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Next_stmtContext next_stmt() {
			return getRuleContext(Next_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Reply_stmtContext reply_stmt() {
			return getRuleContext(Reply_stmtContext.class,0);
		}
		public Forward_stmtContext forward_stmt() {
			return getRuleContext(Forward_stmtContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Destroy_stmtContext destroy_stmt() {
			return getRuleContext(Destroy_stmtContext.class,0);
		}
		public Begin_endContext begin_end() {
			return getRuleContext(Begin_endContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Do_stmtContext do_stmt() {
			return getRuleContext(Do_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public For_all_stmtContext for_all_stmt() {
			return getRuleContext(For_all_stmtContext.class,0);
		}
		public V_stmtContext v_stmt() {
			return getRuleContext(V_stmtContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Receive_stmtContext receive_stmt() {
			return getRuleContext(Receive_stmtContext.class,0);
		}
		public P_stmtContext p_stmt() {
			return getRuleContext(P_stmtContext.class,0);
		}
		public Concurrent_stmtContext concurrent_stmt() {
			return getRuleContext(Concurrent_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_stmt);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				reply_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 7);
				{
				setState(640);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 8);
				{
				setState(641);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(642);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 10);
				{
				setState(643);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(644);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(645);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 13);
				{
				setState(646);
				do_stmt();
				}
				break;
			case TK_WRITE:
				enterOuterAlt(_localctx, 14);
				{
				setState(647);
				write_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 15);
				{
				setState(648);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 16);
				{
				setState(649);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 17);
				{
				setState(650);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 18);
				{
				setState(651);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 19);
				{
				setState(652);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 20);
				{
				setState(653);
				concurrent_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Post_processing_optContext extends ParserRuleContext {
		public TerminalNode TK_ARROW() { return getToken(SRgrammarParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Post_processing_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_processing_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterPost_processing_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitPost_processing_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitPost_processing_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_processing_optContext post_processing_opt() throws RecognitionException {
		Post_processing_optContext _localctx = new Post_processing_optContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_post_processing_opt);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(TK_ARROW);
				setState(657);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode TK_PROC() { return getToken(SRgrammarParser.TK_PROC, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(TK_PROC);
			setState(662);
			match(TK_ID);
			setState(663);
			param_names();
			setState(664);
			block();
			setState(665);
			end_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode TK_PROCESS() { return getToken(SRgrammarParser.TK_PROCESS, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(TK_PROCESS);
			setState(668);
			match(TK_ID);
			setState(669);
			return_spec_null();
			setState(670);
			quantifiers_opt();
			setState(671);
			block();
			setState(672);
			end_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode TK_PROCEDURE() { return getToken(SRgrammarParser.TK_PROCEDURE, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(TK_PROCEDURE);
			setState(675);
			match(TK_ID);
			setState(676);
			prototype();
			setState(677);
			block();
			setState(678);
			end_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initial_optContext extends ParserRuleContext {
		public TerminalNode TK_INITIAL() { return getToken(SRgrammarParser.TK_INITIAL, 0); }
		public Initial_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterInitial_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitInitial_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitInitial_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_optContext initial_opt() throws RecognitionException {
		Initial_optContext _localctx = new Initial_optContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_initial_opt);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(TK_INITIAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initial_blockContext extends ParserRuleContext {
		public TerminalNode TK_INITIAL() { return getToken(SRgrammarParser.TK_INITIAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRgrammarParser.TK_END, 0); }
		public Initial_optContext initial_opt() {
			return getRuleContext(Initial_optContext.class,0);
		}
		public Initial_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterInitial_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitInitial_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitInitial_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_blockContext initial_block() throws RecognitionException {
		Initial_blockContext _localctx = new Initial_blockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(TK_INITIAL);
			setState(685);
			block();
			setState(686);
			match(TK_END);
			setState(687);
			initial_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Final_optContext extends ParserRuleContext {
		public TerminalNode TK_FINAL() { return getToken(SRgrammarParser.TK_FINAL, 0); }
		public Final_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterFinal_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitFinal_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitFinal_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_optContext final_opt() throws RecognitionException {
		Final_optContext _localctx = new Final_optContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_final_opt);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(TK_FINAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Final_blockContext extends ParserRuleContext {
		public TerminalNode TK_FINAL() { return getToken(SRgrammarParser.TK_FINAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRgrammarParser.TK_END, 0); }
		public Final_optContext final_opt() {
			return getRuleContext(Final_optContext.class,0);
		}
		public Final_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterFinal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitFinal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitFinal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_blockContext final_block() throws RecognitionException {
		Final_blockContext _localctx = new Final_blockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(TK_FINAL);
			setState(694);
			block();
			setState(695);
			match(TK_END);
			setState(696);
			final_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_onlyContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public Initial_blockContext initial_block() {
			return getRuleContext(Initial_blockContext.class,0);
		}
		public Final_blockContext final_block() {
			return getRuleContext(Final_blockContext.class,0);
		}
		public Body_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBody_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBody_only(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBody_only(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_onlyContext body_only() throws RecognitionException {
		Body_onlyContext _localctx = new Body_onlyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_body_only);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
			case TK_IF:
			case TK_DO:
			case TK_FA:
			case TK_CO:
			case TK_IN:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
			case TK_RECEIVE:
			case TK_V:
			case TK_P:
			case TK_WRITE:
			case TK_SEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(703);
				final_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(TK_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_listContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterImport_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitImport_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitImport_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_listContext import_list() throws RecognitionException {
		return import_list(0);
	}

	private Import_listContext import_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Import_listContext _localctx = new Import_listContext(_ctx, _parentState);
		Import_listContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709);
			import_name();
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712);
					match(TK_COMMA);
					setState(713);
					import_name();
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Extend_clauseContext extends ParserRuleContext {
		public TerminalNode TK_EXTEND() { return getToken(SRgrammarParser.TK_EXTEND, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Extend_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExtend_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExtend_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExtend_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extend_clauseContext extend_clause() throws RecognitionException {
		Extend_clauseContext _localctx = new Extend_clauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(TK_EXTEND);
			setState(720);
			import_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_clauseContext extends ParserRuleContext {
		public TerminalNode TK_IMPORT() { return getToken(SRgrammarParser.TK_IMPORT, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Import_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterImport_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitImport_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitImport_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_clauseContext import_clause() throws RecognitionException {
		Import_clauseContext _localctx = new Import_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(TK_IMPORT);
			setState(723);
			import_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colon_optContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public Colon_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterColon_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitColon_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitColon_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colon_optContext colon_opt() throws RecognitionException {
		Colon_optContext _localctx = new Colon_optContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_colon_opt);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(TK_COLON);
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oper_defContext extends ParserRuleContext {
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Colon_optContext colon_opt() {
			return getRuleContext(Colon_optContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Oper_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOper_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOper_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOper_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_defContext oper_def() throws RecognitionException {
		Oper_defContext _localctx = new Oper_defContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_oper_def);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				op_prototype();
				}
				break;
			case TK_COLON:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				colon_opt();
				setState(731);
				qualified_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oper_def_lpContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Oper_defContext oper_def() {
			return getRuleContext(Oper_defContext.class,0);
		}
		public Oper_def_lp_auxContext oper_def_lp_aux() {
			return getRuleContext(Oper_def_lp_auxContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Oper_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOper_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOper_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOper_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_def_lpContext oper_def_lp() throws RecognitionException {
		Oper_def_lpContext _localctx = new Oper_def_lpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_oper_def_lp);
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				id_subs_lp();
				setState(736);
				oper_def();
				setState(737);
				oper_def_lp_aux();
				}
				break;
			case TK_COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(TK_COMMA);
				setState(740);
				oper_def();
				setState(741);
				oper_def_lp_aux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oper_def_lp_auxContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Oper_defContext oper_def() {
			return getRuleContext(Oper_defContext.class,0);
		}
		public Oper_def_lp_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def_lp_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOper_def_lp_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOper_def_lp_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOper_def_lp_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_def_lp_auxContext oper_def_lp_aux() throws RecognitionException {
		Oper_def_lp_auxContext _localctx = new Oper_def_lp_auxContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_oper_def_lp_aux);
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(TK_COMMA);
				setState(746);
				oper_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_or_extContext extends ParserRuleContext {
		public TerminalNode TK_OP() { return getToken(SRgrammarParser.TK_OP, 0); }
		public TerminalNode TK_EXTERNAL() { return getToken(SRgrammarParser.TK_EXTERNAL, 0); }
		public Op_or_extContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or_ext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOp_or_ext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOp_or_ext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOp_or_ext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_or_extContext op_or_ext() throws RecognitionException {
		Op_or_extContext _localctx = new Op_or_extContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if ( !(_la==TK_EXTERNAL || _la==TK_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_declContext extends ParserRuleContext {
		public Op_or_extContext op_or_ext() {
			return getRuleContext(Op_or_extContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOp_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOp_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			op_or_ext();
			setState(753);
			oper_def_lp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sem_initContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(SRgrammarParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sem_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSem_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSem_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSem_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_initContext sem_init() throws RecognitionException {
		Sem_initContext _localctx = new Sem_initContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sem_init);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(TK_ASSIGN);
				setState(756);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sem_defContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public Sem_initContext sem_init() {
			return getRuleContext(Sem_initContext.class,0);
		}
		public Sem_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSem_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSem_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSem_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_defContext sem_def() throws RecognitionException {
		Sem_defContext _localctx = new Sem_defContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			id_subs();
			setState(761);
			sem_proto();
			setState(762);
			sem_init();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sem_def_lpContext extends ParserRuleContext {
		public Sem_defContext sem_def() {
			return getRuleContext(Sem_defContext.class,0);
		}
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Sem_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSem_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSem_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSem_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_def_lpContext sem_def_lp() throws RecognitionException {
		return sem_def_lp(0);
	}

	private Sem_def_lpContext sem_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sem_def_lpContext _localctx = new Sem_def_lpContext(_ctx, _parentState);
		Sem_def_lpContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(765);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sem_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sem_def_lp);
					setState(767);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(768);
					match(TK_COMMA);
					setState(769);
					sem_def();
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sem_declContext extends ParserRuleContext {
		public TerminalNode TK_SEM() { return getToken(SRgrammarParser.TK_SEM, 0); }
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public Sem_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSem_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSem_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSem_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_declContext sem_decl() throws RecognitionException {
		Sem_declContext _localctx = new Sem_declContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(TK_SEM);
			setState(776);
			sem_def_lp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_optContext extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(SRgrammarParser.TK_EQ, 0); }
		public Eq_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterEq_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitEq_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitEq_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_optContext eq_opt() throws RecognitionException {
		Eq_optContext _localctx = new Eq_optContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_eq_opt);
		try {
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(TK_EQ);
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optype_declContext extends ParserRuleContext {
		public TerminalNode TK_OPTYPE() { return getToken(SRgrammarParser.TK_OPTYPE, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Eq_optContext eq_opt() {
			return getRuleContext(Eq_optContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Optype_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optype_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOptype_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOptype_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOptype_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optype_declContext optype_decl() throws RecognitionException {
		Optype_declContext _localctx = new Optype_declContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(TK_OPTYPE);
			setState(783);
			match(TK_ID);
			setState(784);
			eq_opt();
			setState(785);
			op_prototype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_attContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASSIGN() { return getToken(SRgrammarParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterVar_att(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitVar_att(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitVar_att(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_attContext var_att() throws RecognitionException {
		Var_attContext _localctx = new Var_attContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_var_att);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(TK_COLON);
				setState(788);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(TK_COLON);
				setState(790);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(TK_COLON);
				setState(792);
				type();
				setState(793);
				match(TK_ASSIGN);
				setState(794);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				match(TK_ASSIGN);
				setState(797);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Location_optContext extends ParserRuleContext {
		public TerminalNode TK_ON() { return getToken(SRgrammarParser.TK_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Location_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterLocation_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitLocation_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitLocation_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_optContext location_opt() throws RecognitionException {
		Location_optContext _localctx = new Location_optContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_location_opt);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(TK_ON);
				setState(801);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rsrc_nameContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_VM() { return getToken(SRgrammarParser.TK_VM, 0); }
		public Rsrc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsrc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterRsrc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitRsrc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitRsrc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rsrc_nameContext rsrc_name() throws RecognitionException {
		Rsrc_nameContext _localctx = new Rsrc_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !(_la==TK_VM || _la==TK_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_callContext extends ParserRuleContext {
		public Rsrc_nameContext rsrc_name() {
			return getRuleContext(Rsrc_nameContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Create_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCreate_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCreate_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCreate_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_callContext create_call() throws RecognitionException {
		Create_callContext _localctx = new Create_callContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			rsrc_name();
			setState(808);
			paren_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_exprContext extends ParserRuleContext {
		public TerminalNode TK_CREATE() { return getToken(SRgrammarParser.TK_CREATE, 0); }
		public Create_callContext create_call() {
			return getRuleContext(Create_callContext.class,0);
		}
		public Location_optContext location_opt() {
			return getRuleContext(Location_optContext.class,0);
		}
		public Create_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCreate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCreate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCreate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_exprContext create_expr() throws RecognitionException {
		Create_exprContext _localctx = new Create_exprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(TK_CREATE);
			setState(811);
			create_call();
			setState(812);
			location_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Suffix_exprContext extends ParserRuleContext {
		public TerminalNode TK_INCR() { return getToken(SRgrammarParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(SRgrammarParser.TK_DECR, 0); }
		public TerminalNode TK_HAT() { return getToken(SRgrammarParser.TK_HAT, 0); }
		public TerminalNode TK_PERIOD() { return getToken(SRgrammarParser.TK_PERIOD, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(SRgrammarParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRgrammarParser.TK_RBRACKET, 0); }
		public Suffix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSuffix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSuffix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSuffix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suffix_exprContext suffix_expr() throws RecognitionException {
		Suffix_exprContext _localctx = new Suffix_exprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_suffix_expr);
		try {
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(TK_INCR);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(TK_DECR);
				}
				break;
			case TK_HAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				match(TK_HAT);
				}
				break;
			case TK_PERIOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				match(TK_PERIOD);
				setState(818);
				match(TK_ID);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(819);
				match(TK_LBRACKET);
				setState(820);
				bound_lp();
				setState(821);
				match(TK_RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_itemContext extends ParserRuleContext {
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(SRgrammarParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_OP() { return getToken(SRgrammarParser.TK_OP, 0); }
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public New_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterNew_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitNew_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitNew_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_itemContext new_item() throws RecognitionException {
		New_itemContext _localctx = new New_itemContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_new_item);
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CAP:
			case TK_REC:
			case TK_FILE:
			case TK_UNION:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_ENUM:
			case TK_STRING:
			case TK_PTR:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				match(TK_SEM);
				setState(827);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(TK_OP);
				setState(829);
				op_prototype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscripts_optContext extends ParserRuleContext {
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Subscripts_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSubscripts_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSubscripts_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSubscripts_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscripts_optContext subscripts_opt() throws RecognitionException {
		Subscripts_optContext _localctx = new Subscripts_optContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_subscripts_opt);
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				subscripts();
				}
				break;
			case TK_CAP:
			case TK_SEM:
			case TK_REC:
			case TK_FILE:
			case TK_UNION:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_ENUM:
			case TK_STRING:
			case TK_PTR:
			case TK_OP:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_spec_nullContext extends ParserRuleContext {
		public Return_spec_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReturn_spec_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReturn_spec_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReturn_spec_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_nullContext return_spec_null() throws RecognitionException {
		Return_spec_nullContext _localctx = new Return_spec_nullContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_return_spec_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sem_protoContext extends ParserRuleContext {
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public Sem_protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSem_proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSem_proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSem_proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_protoContext sem_proto() throws RecognitionException {
		Sem_protoContext _localctx = new Sem_protoContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			return_spec_null();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_restrictionContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(SRgrammarParser.TK_CALL, 0); }
		public TerminalNode TK_SEND() { return getToken(SRgrammarParser.TK_SEND, 0); }
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Op_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOp_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOp_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOp_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restrictionContext op_restriction() throws RecognitionException {
		Op_restrictionContext _localctx = new Op_restrictionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_op_restriction);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(TK_CALL);
				setState(843);
				match(TK_COMMA);
				setState(844);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				match(TK_SEND);
				setState(846);
				match(TK_COMMA);
				setState(847);
				match(TK_CALL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_restriction_optContext extends ParserRuleContext {
		public TerminalNode TK_LBRACE() { return getToken(SRgrammarParser.TK_LBRACE, 0); }
		public Op_restrictionContext op_restriction() {
			return getRuleContext(Op_restrictionContext.class,0);
		}
		public TerminalNode TK_RBRACE() { return getToken(SRgrammarParser.TK_RBRACE, 0); }
		public Op_restriction_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOp_restriction_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOp_restriction_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOp_restriction_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restriction_optContext op_restriction_opt() throws RecognitionException {
		Op_restriction_optContext _localctx = new Op_restriction_optContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_op_restriction_opt);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(TK_LBRACE);
				setState(852);
				op_restriction();
				setState(853);
				match(TK_RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_spec_optContext extends ParserRuleContext {
		public TerminalNode TK_RETURNS() { return getToken(SRgrammarParser.TK_RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_BOGUS() { return getToken(SRgrammarParser.TK_BOGUS, 0); }
		public Return_spec_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterReturn_spec_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitReturn_spec_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitReturn_spec_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_optContext return_spec_opt() throws RecognitionException {
		Return_spec_optContext _localctx = new Return_spec_optContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_return_spec_opt);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(TK_RETURNS);
				setState(859);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				match(TK_RETURNS);
				setState(861);
				id_subs();
				setState(862);
				match(TK_COLON);
				setState(863);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				match(TK_RETURNS);
				setState(866);
				match(TK_ID);
				setState(867);
				match(TK_BOGUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_kind_optContext extends ParserRuleContext {
		public TerminalNode TK_VAL() { return getToken(SRgrammarParser.TK_VAL, 0); }
		public TerminalNode TK_VAR() { return getToken(SRgrammarParser.TK_VAR, 0); }
		public TerminalNode TK_RES() { return getToken(SRgrammarParser.TK_RES, 0); }
		public TerminalNode TK_REF() { return getToken(SRgrammarParser.TK_REF, 0); }
		public Param_kind_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_kind_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParam_kind_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParam_kind_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParam_kind_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_kind_optContext param_kind_opt() throws RecognitionException {
		Param_kind_optContext _localctx = new Param_kind_optContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_param_kind_opt);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				match(TK_REF);
				}
				break;
			case TK_LBRACKET:
			case TK_CAP:
			case TK_REC:
			case TK_FILE:
			case TK_UNION:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_ENUM:
			case TK_STRING:
			case TK_PTR:
			case TK_ID:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_specContext extends ParserRuleContext {
		public Param_kind_optContext param_kind_opt() {
			return getRuleContext(Param_kind_optContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Param_spec_lsContext param_spec_ls() {
			return getRuleContext(Param_spec_lsContext.class,0);
		}
		public Param_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParam_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParam_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParam_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_specContext param_spec() throws RecognitionException {
		Param_specContext _localctx = new Param_specContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_param_spec);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				param_kind_opt();
				setState(878);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				param_kind_opt();
				setState(881);
				id_subs_lp();
				setState(882);
				match(TK_COLON);
				setState(883);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				param_kind_opt();
				setState(886);
				capability_def();
				setState(887);
				match(TK_SEPARATOR);
				setState(888);
				param_spec_ls(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_spec_lpContext extends ParserRuleContext {
		public Param_specContext param_spec() {
			return getRuleContext(Param_specContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
		public Param_spec_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParam_spec_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParam_spec_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParam_spec_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lpContext param_spec_lp() throws RecognitionException {
		Param_spec_lpContext _localctx = new Param_spec_lpContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_param_spec_lp);
		try {
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				param_spec();
				setState(894);
				match(TK_COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				param_spec();
				setState(897);
				match(TK_COLON);
				setState(898);
				param_spec_lp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_spec_lsContext extends ParserRuleContext {
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
		public List<Param_spec_lsContext> param_spec_ls() {
			return getRuleContexts(Param_spec_lsContext.class);
		}
		public Param_spec_lsContext param_spec_ls(int i) {
			return getRuleContext(Param_spec_lsContext.class,i);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Param_spec_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParam_spec_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParam_spec_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParam_spec_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lsContext param_spec_ls() throws RecognitionException {
		return param_spec_ls(0);
	}

	private Param_spec_lsContext param_spec_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_spec_lsContext _localctx = new Param_spec_lsContext(_ctx, _parentState);
		Param_spec_lsContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_param_spec_ls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(903);
				param_spec_lp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_spec_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_spec_ls);
					setState(906);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(907);
					match(TK_COMMA);
					setState(908);
					param_spec_ls(3);
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Param_spec_lsContext param_spec_ls() {
			return getRuleContext(Param_spec_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(TK_LPAREN);
			setState(915);
			param_spec_ls(0);
			setState(916);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrototypeContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Return_spec_optContext return_spec_opt() {
			return getRuleContext(Return_spec_optContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			parameters();
			setState(919);
			return_spec_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_prototypeContext extends ParserRuleContext {
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public Op_restriction_optContext op_restriction_opt() {
			return getRuleContext(Op_restriction_optContext.class,0);
		}
		public Op_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOp_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOp_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOp_prototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_prototypeContext op_prototype() throws RecognitionException {
		Op_prototypeContext _localctx = new Op_prototypeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			prototype();
			setState(922);
			op_restriction_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_idContext extends ParserRuleContext {
		public List<TerminalNode> TK_ID() { return getTokens(SRgrammarParser.TK_ID); }
		public TerminalNode TK_ID(int i) {
			return getToken(SRgrammarParser.TK_ID, i);
		}
		public TerminalNode TK_PERIOD() { return getToken(SRgrammarParser.TK_PERIOD, 0); }
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterQualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitQualified_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitQualified_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_qualified_id);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(TK_ID);
				setState(926);
				match(TK_PERIOD);
				setState(927);
				match(TK_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cap_forContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(SRgrammarParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_VM() { return getToken(SRgrammarParser.TK_VM, 0); }
		public Cap_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCap_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCap_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCap_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cap_forContext cap_for() throws RecognitionException {
		Cap_forContext _localctx = new Cap_forContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cap_for);
		try {
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				match(TK_SEM);
				setState(933);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				match(TK_VM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capability_defContext extends ParserRuleContext {
		public TerminalNode TK_CAP() { return getToken(SRgrammarParser.TK_CAP, 0); }
		public Cap_forContext cap_for() {
			return getRuleContext(Cap_forContext.class,0);
		}
		public Capability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCapability_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCapability_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCapability_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capability_defContext capability_def() throws RecognitionException {
		Capability_defContext _localctx = new Capability_defContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(TK_CAP);
			setState(938);
			cap_for();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_defContext extends ParserRuleContext {
		public TerminalNode TK_UNION() { return getToken(SRgrammarParser.TK_UNION, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterUnion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitUnion_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitUnion_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(TK_UNION);
			setState(941);
			match(TK_LPAREN);
			setState(942);
			field_lp();
			setState(943);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			var_def_lp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_lpContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Field_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterField_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitField_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitField_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_lpContext field_lp() throws RecognitionException {
		Field_lpContext _localctx = new Field_lpContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_field_lp);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				field();
				setState(949);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				field();
				setState(952);
				match(TK_SEPARATOR);
				setState(953);
				field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode TK_REC() { return getToken(SRgrammarParser.TK_REC, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterRecord_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitRecord_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(TK_REC);
			setState(958);
			match(TK_LPAREN);
			setState(959);
			field_lp();
			setState(960);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_defContext extends ParserRuleContext {
		public TerminalNode TK_PTR() { return getToken(SRgrammarParser.TK_PTR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ANY() { return getToken(SRgrammarParser.TK_ANY, 0); }
		public Pointer_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterPointer_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitPointer_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitPointer_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_defContext pointer_def() throws RecognitionException {
		Pointer_defContext _localctx = new Pointer_defContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_pointer_def);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(TK_PTR);
				setState(963);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(TK_PTR);
				setState(965);
				match(TK_ANY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_lpContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Id_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lpContext id_lp() throws RecognitionException {
		return id_lp(0);
	}

	private Id_lpContext id_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_lpContext _localctx = new Id_lpContext(_ctx, _parentState);
		Id_lpContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(969);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(971);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(972);
					match(TK_COMMA);
					setState(973);
					match(TK_ID);
					}
					} 
				}
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode TK_ENUM() { return getToken(SRgrammarParser.TK_ENUM, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(TK_ENUM);
			setState(980);
			match(TK_LPAREN);
			setState(981);
			id_lp(0);
			setState(982);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_limContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(SRgrammarParser.TK_ASTER, 0); }
		public String_limContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterString_lim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitString_lim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitString_lim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_limContext string_lim() throws RecognitionException {
		String_limContext _localctx = new String_limContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_string_lim);
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(TK_ASTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_defContext extends ParserRuleContext {
		public TerminalNode TK_STRING() { return getToken(SRgrammarParser.TK_STRING, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(SRgrammarParser.TK_LBRACKET, 0); }
		public String_limContext string_lim() {
			return getRuleContext(String_limContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRgrammarParser.TK_RBRACKET, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public String_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterString_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitString_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitString_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_defContext string_def() throws RecognitionException {
		String_defContext _localctx = new String_defContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_string_def);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				match(TK_STRING);
				setState(989);
				match(TK_LBRACKET);
				setState(990);
				string_lim();
				setState(991);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(TK_STRING);
				setState(994);
				match(TK_LPAREN);
				setState(995);
				string_lim();
				setState(996);
				match(TK_RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(SRgrammarParser.TK_BOOL, 0); }
		public TerminalNode TK_CHAR() { return getToken(SRgrammarParser.TK_CHAR, 0); }
		public TerminalNode TK_INT() { return getToken(SRgrammarParser.TK_INT, 0); }
		public TerminalNode TK_FILE() { return getToken(SRgrammarParser.TK_FILE, 0); }
		public TerminalNode TK_REAL() { return getToken(SRgrammarParser.TK_REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (TK_FILE - 114)) | (1L << (TK_BOOL - 114)) | (1L << (TK_INT - 114)) | (1L << (TK_CHAR - 114)) | (1L << (TK_REAL - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsub_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public String_defContext string_def() {
			return getRuleContext(String_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Pointer_defContext pointer_def() {
			return getRuleContext(Pointer_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Union_defContext union_def() {
			return getRuleContext(Union_defContext.class,0);
		}
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Unsub_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsub_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterUnsub_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitUnsub_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitUnsub_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsub_typeContext unsub_type() throws RecognitionException {
		Unsub_typeContext _localctx = new Unsub_typeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unsub_type);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FILE:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1005);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1006);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1007);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1008);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1009);
				qualified_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_type);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				subscripts();
				setState(1013);
				unsub_type();
				}
				break;
			case TK_CAP:
			case TK_REC:
			case TK_FILE:
			case TK_UNION:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_ENUM:
			case TK_STRING:
			case TK_PTR:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				unsub_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Paren_exprContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Paren_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParen_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(TK_LPAREN);
			setState(1019);
			expr(0);
			setState(1020);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_exprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(SRgrammarParser.TK_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PLUS() { return getToken(SRgrammarParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(SRgrammarParser.TK_MINUS, 0); }
		public TerminalNode TK_ADDR() { return getToken(SRgrammarParser.TK_ADDR, 0); }
		public TerminalNode TK_QMARK() { return getToken(SRgrammarParser.TK_QMARK, 0); }
		public TerminalNode TK_INCR() { return getToken(SRgrammarParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(SRgrammarParser.TK_DECR, 0); }
		public TerminalNode TK_STRING() { return getToken(SRgrammarParser.TK_STRING, 0); }
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public TerminalNode TK_LOW() { return getToken(SRgrammarParser.TK_LOW, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public TerminalNode TK_HIGH() { return getToken(SRgrammarParser.TK_HIGH, 0); }
		public TerminalNode TK_NEW() { return getToken(SRgrammarParser.TK_NEW, 0); }
		public Subscripts_optContext subscripts_opt() {
			return getRuleContext(Subscripts_optContext.class,0);
		}
		public New_itemContext new_item() {
			return getRuleContext(New_itemContext.class,0);
		}
		public Prefix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterPrefix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitPrefix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitPrefix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_exprContext prefix_expr() throws RecognitionException {
		Prefix_exprContext _localctx = new Prefix_exprContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_prefix_expr);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				match(TK_NOT);
				setState(1023);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				match(TK_PLUS);
				setState(1025);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(TK_MINUS);
				setState(1027);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1028);
				match(TK_ADDR);
				setState(1029);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1030);
				match(TK_QMARK);
				setState(1031);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				match(TK_INCR);
				setState(1033);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1034);
				match(TK_DECR);
				setState(1035);
				expr(0);
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(1036);
				match(TK_STRING);
				setState(1037);
				paren_expr();
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 9);
				{
				setState(1038);
				match(TK_LOW);
				setState(1039);
				match(TK_LPAREN);
				setState(1040);
				type();
				setState(1041);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 10);
				{
				setState(1043);
				match(TK_HIGH);
				setState(1044);
				match(TK_LPAREN);
				setState(1045);
				type();
				setState(1046);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1048);
				match(TK_NEW);
				setState(1049);
				match(TK_LPAREN);
				setState(1050);
				subscripts_opt();
				setState(1051);
				new_item();
				setState(1052);
				match(TK_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exprContext extends ParserRuleContext {
		public TerminalNode TK_EXPON() { return getToken(SRgrammarParser.TK_EXPON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(SRgrammarParser.TK_ASTER, 0); }
		public TerminalNode TK_DIV() { return getToken(SRgrammarParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(SRgrammarParser.TK_MOD, 0); }
		public TerminalNode TK_REMDR() { return getToken(SRgrammarParser.TK_REMDR, 0); }
		public TerminalNode TK_PLUS() { return getToken(SRgrammarParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(SRgrammarParser.TK_MINUS, 0); }
		public TerminalNode TK_CONCAT() { return getToken(SRgrammarParser.TK_CONCAT, 0); }
		public TerminalNode TK_EQ() { return getToken(SRgrammarParser.TK_EQ, 0); }
		public TerminalNode TK_NE() { return getToken(SRgrammarParser.TK_NE, 0); }
		public TerminalNode TK_GE() { return getToken(SRgrammarParser.TK_GE, 0); }
		public TerminalNode TK_LE() { return getToken(SRgrammarParser.TK_LE, 0); }
		public TerminalNode TK_GT() { return getToken(SRgrammarParser.TK_GT, 0); }
		public TerminalNode TK_LT() { return getToken(SRgrammarParser.TK_LT, 0); }
		public TerminalNode TK_AND() { return getToken(SRgrammarParser.TK_AND, 0); }
		public TerminalNode TK_OR() { return getToken(SRgrammarParser.TK_OR, 0); }
		public TerminalNode TK_XOR() { return getToken(SRgrammarParser.TK_XOR, 0); }
		public TerminalNode TK_RSHIFT() { return getToken(SRgrammarParser.TK_RSHIFT, 0); }
		public TerminalNode TK_LSHIFT() { return getToken(SRgrammarParser.TK_LSHIFT, 0); }
		public TerminalNode TK_SWAP() { return getToken(SRgrammarParser.TK_SWAP, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(SRgrammarParser.TK_ASSIGN, 0); }
		public TerminalNode TK_AUG_PLUS() { return getToken(SRgrammarParser.TK_AUG_PLUS, 0); }
		public TerminalNode TK_AUG_MINUS() { return getToken(SRgrammarParser.TK_AUG_MINUS, 0); }
		public TerminalNode TK_AUG_ASTER() { return getToken(SRgrammarParser.TK_AUG_ASTER, 0); }
		public TerminalNode TK_AUG_DIV() { return getToken(SRgrammarParser.TK_AUG_DIV, 0); }
		public TerminalNode TK_AUG_REMDR() { return getToken(SRgrammarParser.TK_AUG_REMDR, 0); }
		public TerminalNode TK_AUG_EXPON() { return getToken(SRgrammarParser.TK_AUG_EXPON, 0); }
		public TerminalNode TK_AUG_OR() { return getToken(SRgrammarParser.TK_AUG_OR, 0); }
		public TerminalNode TK_AUG_AND() { return getToken(SRgrammarParser.TK_AUG_AND, 0); }
		public TerminalNode TK_AUG_CONCAT() { return getToken(SRgrammarParser.TK_AUG_CONCAT, 0); }
		public TerminalNode TK_AUG_RSHIFT() { return getToken(SRgrammarParser.TK_AUG_RSHIFT, 0); }
		public TerminalNode TK_AUG_LSHIFT() { return getToken(SRgrammarParser.TK_AUG_LSHIFT, 0); }
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public Binary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBinary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBinary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBinary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_exprContext binary_expr() throws RecognitionException {
		Binary_exprContext _localctx = new Binary_exprContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_binary_expr);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EXPON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				match(TK_EXPON);
				setState(1057);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(TK_ASTER);
				setState(1059);
				expr(0);
				}
				break;
			case TK_DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(TK_DIV);
				setState(1061);
				expr(0);
				}
				break;
			case TK_MOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(1062);
				match(TK_MOD);
				setState(1063);
				expr(0);
				}
				break;
			case TK_REMDR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1064);
				match(TK_REMDR);
				setState(1065);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1066);
				match(TK_PLUS);
				setState(1067);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1068);
				match(TK_MINUS);
				setState(1069);
				expr(0);
				}
				break;
			case TK_CONCAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1070);
				match(TK_CONCAT);
				setState(1071);
				expr(0);
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(1072);
				match(TK_EQ);
				setState(1073);
				expr(0);
				}
				break;
			case TK_NE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1074);
				match(TK_NE);
				setState(1075);
				expr(0);
				}
				break;
			case TK_GE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1076);
				match(TK_GE);
				setState(1077);
				expr(0);
				}
				break;
			case TK_LE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1078);
				match(TK_LE);
				setState(1079);
				expr(0);
				}
				break;
			case TK_GT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1080);
				match(TK_GT);
				setState(1081);
				expr(0);
				}
				break;
			case TK_LT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1082);
				match(TK_LT);
				setState(1083);
				expr(0);
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 15);
				{
				setState(1084);
				match(TK_AND);
				setState(1085);
				expr(0);
				}
				break;
			case TK_OR:
				enterOuterAlt(_localctx, 16);
				{
				setState(1086);
				match(TK_OR);
				setState(1087);
				expr(0);
				}
				break;
			case TK_XOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(1088);
				match(TK_XOR);
				setState(1089);
				expr(0);
				}
				break;
			case TK_RSHIFT:
				enterOuterAlt(_localctx, 18);
				{
				setState(1090);
				match(TK_RSHIFT);
				setState(1091);
				expr(0);
				}
				break;
			case TK_LSHIFT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1092);
				match(TK_LSHIFT);
				setState(1093);
				expr(0);
				}
				break;
			case TK_SWAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(1094);
				match(TK_SWAP);
				setState(1095);
				expr(0);
				}
				break;
			case TK_ASSIGN:
				enterOuterAlt(_localctx, 21);
				{
				setState(1096);
				match(TK_ASSIGN);
				setState(1097);
				expr(0);
				}
				break;
			case TK_AUG_PLUS:
				enterOuterAlt(_localctx, 22);
				{
				setState(1098);
				match(TK_AUG_PLUS);
				setState(1099);
				expr(0);
				}
				break;
			case TK_AUG_MINUS:
				enterOuterAlt(_localctx, 23);
				{
				setState(1100);
				match(TK_AUG_MINUS);
				setState(1101);
				expr(0);
				}
				break;
			case TK_AUG_ASTER:
				enterOuterAlt(_localctx, 24);
				{
				setState(1102);
				match(TK_AUG_ASTER);
				setState(1103);
				expr(0);
				}
				break;
			case TK_AUG_DIV:
				enterOuterAlt(_localctx, 25);
				{
				setState(1104);
				match(TK_AUG_DIV);
				setState(1105);
				expr(0);
				}
				break;
			case TK_AUG_REMDR:
				enterOuterAlt(_localctx, 26);
				{
				setState(1106);
				match(TK_AUG_REMDR);
				setState(1107);
				expr(0);
				}
				break;
			case TK_AUG_EXPON:
				enterOuterAlt(_localctx, 27);
				{
				setState(1108);
				match(TK_AUG_EXPON);
				setState(1109);
				expr(0);
				}
				break;
			case TK_AUG_OR:
				enterOuterAlt(_localctx, 28);
				{
				setState(1110);
				match(TK_AUG_OR);
				setState(1111);
				expr(0);
				}
				break;
			case TK_AUG_AND:
				enterOuterAlt(_localctx, 29);
				{
				setState(1112);
				match(TK_AUG_AND);
				setState(1113);
				expr(0);
				}
				break;
			case TK_AUG_CONCAT:
				enterOuterAlt(_localctx, 30);
				{
				setState(1114);
				match(TK_AUG_CONCAT);
				setState(1115);
				expr(0);
				}
				break;
			case TK_AUG_RSHIFT:
				enterOuterAlt(_localctx, 31);
				{
				setState(1116);
				match(TK_AUG_RSHIFT);
				setState(1117);
				expr(0);
				}
				break;
			case TK_AUG_LSHIFT:
				enterOuterAlt(_localctx, 32);
				{
				setState(1118);
				match(TK_AUG_LSHIFT);
				setState(1119);
				expr(0);
				}
				break;
			case TK_COLON:
				enterOuterAlt(_localctx, 33);
				{
				setState(1120);
				match(TK_COLON);
				setState(1121);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constr_itemContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_LBRACKET() { return getToken(SRgrammarParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(SRgrammarParser.TK_RBRACKET, 0); }
		public TerminalNode TK_COLON() { return getToken(SRgrammarParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Constr_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConstr_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConstr_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConstr_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_itemContext constr_item() throws RecognitionException {
		Constr_itemContext _localctx = new Constr_itemContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_constr_item);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				match(TK_LBRACKET);
				setState(1126);
				expr(0);
				setState(1127);
				match(TK_RBRACKET);
				setState(1128);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1130);
				expr(0);
				setState(1131);
				match(TK_COLON);
				setState(1132);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constr_item_lpContext extends ParserRuleContext {
		public Constr_itemContext constr_item() {
			return getRuleContext(Constr_itemContext.class,0);
		}
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Constr_item_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConstr_item_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConstr_item_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConstr_item_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_item_lpContext constr_item_lp() throws RecognitionException {
		return constr_item_lp(0);
	}

	private Constr_item_lpContext constr_item_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Constr_item_lpContext _localctx = new Constr_item_lpContext(_ctx, _parentState);
		Constr_item_lpContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1137);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constr_item_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constr_item_lp);
					setState(1139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1140);
					match(TK_COMMA);
					setState(1141);
					constr_item();
					}
					} 
				}
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(TK_LPAREN);
			setState(1148);
			constr_item_lp(0);
			setState(1149);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_lpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Expr_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExpr_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExpr_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExpr_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_lpContext expr_lp() throws RecognitionException {
		return expr_lp(0);
	}

	private Expr_lpContext expr_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_lpContext _localctx = new Expr_lpContext(_ctx, _parentState);
		Expr_lpContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1152);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lp);
					setState(1154);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1155);
					match(TK_COMMA);
					setState(1156);
					expr(0);
					}
					} 
				}
				setState(1161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Paren_item_lsContext extends ParserRuleContext {
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public Paren_item_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_item_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParen_item_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParen_item_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParen_item_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_item_lsContext paren_item_ls() throws RecognitionException {
		Paren_item_lsContext _localctx = new Paren_item_lsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_paren_item_ls);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				expr_lp(0);
				}
				break;
			case TK_RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Paren_listContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRgrammarParser.TK_LPAREN, 0); }
		public Paren_item_lsContext paren_item_ls() {
			return getRuleContext(Paren_item_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRgrammarParser.TK_RPAREN, 0); }
		public Paren_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterParen_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitParen_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitParen_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_listContext paren_list() throws RecognitionException {
		Paren_listContext _localctx = new Paren_listContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(TK_LPAREN);
			setState(1167);
			paren_item_ls();
			setState(1168);
			match(TK_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			expr(0);
			setState(1171);
			paren_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TK_ILIT() { return getToken(SRgrammarParser.TK_ILIT, 0); }
		public TerminalNode TK_RLIT() { return getToken(SRgrammarParser.TK_RLIT, 0); }
		public TerminalNode TK_BLIT() { return getToken(SRgrammarParser.TK_BLIT, 0); }
		public TerminalNode TK_CLIT() { return getToken(SRgrammarParser.TK_CLIT, 0); }
		public TerminalNode TK_SLIT() { return getToken(SRgrammarParser.TK_SLIT, 0); }
		public TerminalNode TK_NLIT() { return getToken(SRgrammarParser.TK_NLIT, 0); }
		public TerminalNode TK_FLIT() { return getToken(SRgrammarParser.TK_FLIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_ILIT) | (1L << TK_RLIT) | (1L << TK_BLIT) | (1L << TK_CLIT) | (1L << TK_SLIT) | (1L << TK_NLIT) | (1L << TK_FLIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SRgrammarParser.INT, 0); }
		public TerminalNode REAL() { return getToken(SRgrammarParser.REAL, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Create_exprContext create_expr() {
			return getRuleContext(Create_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Binary_exprContext binary_expr() {
			return getRuleContext(Binary_exprContext.class,0);
		}
		public Suffix_exprContext suffix_expr() {
			return getRuleContext(Suffix_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(1176);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(1177);
				match(REAL);
				}
				break;
			case TK_ID:
				{
				setState(1178);
				match(TK_ID);
				}
				break;
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
				{
				setState(1179);
				literal();
				}
				break;
			case TK_LPAREN:
				{
				setState(1180);
				constructor();
				}
				break;
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
				{
				setState(1181);
				prefix_expr();
				}
				break;
			case TK_CREATE:
				{
				setState(1182);
				create_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1186);
						invocation();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1188);
						binary_expr();
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1190);
						suffix_expr();
						}
						break;
					}
					} 
				}
				setState(1195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoundsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(SRgrammarParser.TK_ASTER, 0); }
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_bounds);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
			case TK_ILIT:
			case TK_RLIT:
			case TK_BLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_FLIT:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NEW:
			case TK_LOW:
			case TK_HIGH:
			case TK_INCR:
			case TK_DECR:
			case TK_QMARK:
			case TK_NOT:
			case TK_STRING:
			case TK_ADDR:
			case TK_CREATE:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				match(TK_ASTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bound_lpauxContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public Bound_lpauxContext bound_lpaux() {
			return getRuleContext(Bound_lpauxContext.class,0);
		}
		public Bound_lpauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_lpaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBound_lpaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBound_lpaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBound_lpaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_lpauxContext bound_lpaux() throws RecognitionException {
		Bound_lpauxContext _localctx = new Bound_lpauxContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_bound_lpaux);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(TK_COMMA);
				setState(1202);
				bounds();
				setState(1203);
				bound_lpaux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bound_lpContext extends ParserRuleContext {
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public Bound_lpauxContext bound_lpaux() {
			return getRuleContext(Bound_lpauxContext.class,0);
		}
		public Bound_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBound_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBound_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBound_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_lpContext bound_lp() throws RecognitionException {
		Bound_lpContext _localctx = new Bound_lpContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_bound_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			bounds();
			setState(1208);
			bound_lpaux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracketed_listContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(SRgrammarParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRgrammarParser.TK_RBRACKET, 0); }
		public Bracketed_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterBracketed_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitBracketed_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitBracketed_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracketed_listContext bracketed_list() throws RecognitionException {
		Bracketed_listContext _localctx = new Bracketed_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(TK_LBRACKET);
			setState(1211);
			bound_lp();
			setState(1212);
			match(TK_RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_subsContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_subsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_subs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_subs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_subs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subsContext id_subs() throws RecognitionException {
		Id_subsContext _localctx = new Id_subsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_id_subs);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				match(TK_ID);
				setState(1215);
				subscripts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				match(TK_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_subs_lpauxContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpauxContext id_subs_lpaux() {
			return getRuleContext(Id_subs_lpauxContext.class,0);
		}
		public Id_subs_lpauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lpaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_subs_lpaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_subs_lpaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_subs_lpaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subs_lpauxContext id_subs_lpaux() throws RecognitionException {
		Id_subs_lpauxContext _localctx = new Id_subs_lpauxContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_id_subs_lpaux);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
			case TK_ASSIGN:
			case TK_COLON:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				match(TK_COMMA);
				setState(1221);
				id_subs();
				setState(1222);
				id_subs_lpaux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_subs_lpContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpauxContext id_subs_lpaux() {
			return getRuleContext(Id_subs_lpauxContext.class,0);
		}
		public Id_subs_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterId_subs_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitId_subs_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitId_subs_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subs_lpContext id_subs_lp() throws RecognitionException {
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_id_subs_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			id_subs();
			setState(1227);
			id_subs_lpaux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_defContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Var_attContext var_att() {
			return getRuleContext(Var_attContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			id_subs_lp();
			setState(1230);
			var_att();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_def_lpContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
		public Var_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterVar_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitVar_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitVar_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_def_lpContext var_def_lp() throws RecognitionException {
		return var_def_lp(0);
	}

	private Var_def_lpContext var_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_def_lpContext _localctx = new Var_def_lpContext(_ctx, _parentState);
		Var_def_lpContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1233);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(1235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1236);
					match(TK_COMMA);
					setState(1237);
					var_def();
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Var_or_constContext extends ParserRuleContext {
		public TerminalNode TK_VAR() { return getToken(SRgrammarParser.TK_VAR, 0); }
		public TerminalNode TK_CONST() { return getToken(SRgrammarParser.TK_CONST, 0); }
		public Var_or_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterVar_or_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitVar_or_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitVar_or_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_constContext var_or_const() throws RecognitionException {
		Var_or_constContext _localctx = new Var_or_constContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_la = _input.LA(1);
			if ( !(_la==TK_VAR || _la==TK_CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Obj_declContext extends ParserRuleContext {
		public Var_or_constContext var_or_const() {
			return getRuleContext(Var_or_constContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public Obj_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterObj_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitObj_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitObj_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_declContext obj_decl() throws RecognitionException {
		Obj_declContext _localctx = new Obj_declContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			var_or_const();
			setState(1246);
			var_def_lp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_restrictionContext extends ParserRuleContext {
		public TerminalNode TK_LBRACE() { return getToken(SRgrammarParser.TK_LBRACE, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_RBRACE() { return getToken(SRgrammarParser.TK_RBRACE, 0); }
		public Type_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterType_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitType_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitType_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_restrictionContext type_restriction() throws RecognitionException {
		Type_restrictionContext _localctx = new Type_restrictionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_type_restriction);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				match(TK_LBRACE);
				setState(1249);
				match(TK_ID);
				setState(1250);
				match(TK_RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode TK_TYPE() { return getToken(SRgrammarParser.TK_TYPE, 0); }
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public TerminalNode TK_EQ() { return getToken(SRgrammarParser.TK_EQ, 0); }
		public Type_restrictionContext type_restriction() {
			return getRuleContext(Type_restrictionContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(TK_TYPE);
			setState(1255);
			match(TK_ID);
			setState(1256);
			match(TK_EQ);
			setState(1257);
			type_restriction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Obj_declContext obj_decl() {
			return getRuleContext(Obj_declContext.class,0);
		}
		public Optype_declContext optype_decl() {
			return getRuleContext(Optype_declContext.class,0);
		}
		public Sem_declContext sem_decl() {
			return getRuleContext(Sem_declContext.class,0);
		}
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_decl);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				obj_decl();
				}
				break;
			case TK_OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				optype_decl();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1262);
				sem_decl();
				}
				break;
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1263);
				op_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Common_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterCommon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitCommon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitCommon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_stmtContext common_stmt() throws RecognitionException {
		Common_stmtContext _localctx = new Common_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_common_stmt);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				import_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_onlyContext body_only() {
			return getRuleContext(Body_onlyContext.class,0);
		}
		public Spec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSpec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSpec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSpec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmtContext spec_stmt() throws RecognitionException {
		Spec_stmtContext _localctx = new Spec_stmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_spec_stmt);
		try {
			setState(1274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
			case TK_BODY:
			case TK_IMPORT:
			case TK_VAR:
			case TK_CONST:
			case TK_TYPE:
			case TK_SEM:
			case TK_OPTYPE:
			case TK_EXTERNAL:
			case TK_OP:
			case TK_END:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				common_stmt();
				}
				break;
			case TK_EXTEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				extend_clause();
				}
				break;
			case TK_CALL:
			case TK_PROC:
			case TK_IF:
			case TK_DO:
			case TK_FA:
			case TK_CO:
			case TK_IN:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
			case TK_RECEIVE:
			case TK_V:
			case TK_P:
			case TK_WRITE:
			case TK_SEND:
			case TK_PROCESS:
			case TK_PROCEDURE:
			case TK_INITIAL:
			case TK_FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1273);
				body_only();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_sepContext extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Optional_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterOptional_sep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitOptional_sep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitOptional_sep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_sepContext optional_sep() throws RecognitionException {
		Optional_sepContext _localctx = new Optional_sepContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_optional_sep);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				match(TK_SEPARATOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_stmt_lsauxContext extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_lsauxContext spec_stmt_lsaux() {
			return getRuleContext(Spec_stmt_lsauxContext.class,0);
		}
		public Spec_stmt_lsauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt_lsaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSpec_stmt_lsaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSpec_stmt_lsaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSpec_stmt_lsaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmt_lsauxContext spec_stmt_lsaux() throws RecognitionException {
		Spec_stmt_lsauxContext _localctx = new Spec_stmt_lsauxContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_spec_stmt_lsaux);
		try {
			setState(1285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BODY:
			case TK_END:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				match(TK_SEPARATOR);
				setState(1282);
				spec_stmt();
				setState(1283);
				spec_stmt_lsaux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_stmt_lsContext extends ParserRuleContext {
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_lsauxContext spec_stmt_lsaux() {
			return getRuleContext(Spec_stmt_lsauxContext.class,0);
		}
		public Spec_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSpec_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSpec_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSpec_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmt_lsContext spec_stmt_ls() throws RecognitionException {
		Spec_stmt_lsContext _localctx = new Spec_stmt_lsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_spec_stmt_ls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			spec_stmt();
			setState(1288);
			spec_stmt_lsaux();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_kwdContext extends ParserRuleContext {
		public TerminalNode TK_GLOBAL() { return getToken(SRgrammarParser.TK_GLOBAL, 0); }
		public TerminalNode TK_RESOURCE() { return getToken(SRgrammarParser.TK_RESOURCE, 0); }
		public Comp_kwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_kwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterComp_kwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitComp_kwd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitComp_kwd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_kwdContext comp_kwd() throws RecognitionException {
		Comp_kwdContext _localctx = new Comp_kwdContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_comp_kwd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(_la==TK_RESOURCE || _la==TK_GLOBAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_labelContext extends ParserRuleContext {
		public Comp_kwdContext comp_kwd() {
			return getRuleContext(Comp_kwdContext.class,0);
		}
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public Comp_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterComp_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitComp_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitComp_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_labelContext comp_label() throws RecognitionException {
		Comp_labelContext _localctx = new Comp_labelContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_comp_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			comp_kwd();
			setState(1293);
			match(TK_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spec_componentContext extends ParserRuleContext {
		public Comp_labelContext comp_label() {
			return getRuleContext(Comp_labelContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public Spec_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSpec_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSpec_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSpec_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_componentContext spec_component() throws RecognitionException {
		Spec_componentContext _localctx = new Spec_componentContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_spec_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			comp_label();
			setState(1296);
			spec_stmt_ls();
			setState(1297);
			spec_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public Spec_componentContext spec_component() {
			return getRuleContext(Spec_componentContext.class,0);
		}
		public Optional_sepContext optional_sep() {
			return getRuleContext(Optional_sepContext.class,0);
		}
		public Combined_componentContext combined_component() {
			return getRuleContext(Combined_componentContext.class,0);
		}
		public Separate_bodyContext separate_body() {
			return getRuleContext(Separate_bodyContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_component);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				spec_component();
				setState(1301);
				optional_sep();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				combined_component();
				setState(1304);
				optional_sep();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1306);
				separate_body();
				setState(1307);
				optional_sep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return body_stmt_ls_sempred((Body_stmt_lsContext)_localctx, predIndex);
		case 13:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 35:
			return quantifier_lp_sempred((Quantifier_lpContext)_localctx, predIndex);
		case 43:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 72:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 83:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 103:
			return param_spec_ls_sempred((Param_spec_lsContext)_localctx, predIndex);
		case 115:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 126:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 128:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 133:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 142:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_stmt_ls_sempred(Body_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean concurrent_cmd_lp_sempred(Concurrent_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean quantifier_lp_sempred(Quantifier_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean guarded_cmd_lp_sempred(Guarded_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean import_list_sempred(Import_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sem_def_lp_sempred(Sem_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean param_spec_ls_sempred(Param_spec_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean id_lp_sempred(Id_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constr_item_lp_sempred(Constr_item_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_lp_sempred(Expr_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_def_lp_sempred(Var_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u0522\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\5\4\u0148\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0156\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0161"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0169\n\t\f\t\16\t\u016c\13\t\3\n\3\n"+
		"\5\n\u0170\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0178\n\f\3\r\3\r\3\r\5"+
		"\r\u017d\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u018a\n\17\f\17\16\17\u018d\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u01a1"+
		"\n\23\3\24\3\24\3\24\5\24\u01a6\n\24\3\25\3\25\3\25\5\25\u01ab\n\25\3"+
		"\26\3\26\5\26\u01af\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u01ba\n\30\3\31\3\31\3\31\3\31\5\31\u01c0\n\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01ca\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u01db\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\5!\u01ea\n!\3\"\3\"\3\"\5\"\u01ef"+
		"\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u0201\n%\f%\16"+
		"%\u0204\13%\3&\3&\3&\3&\3&\5&\u020b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u022f\n*\3+\3+\3+\5+\u0234\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\7-\u0240\n-\f-\16-\u0243\13-\3.\3.\3.\3.\3.\3/\3/\3/\3/\5/\u024e\n/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u0258\n\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0291\n?\3@\3@\3@\5"+
		"@\u0296\n@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"D\3D\5D\u02ad\nD\3E\3E\3E\3E\3E\3F\3F\5F\u02b6\nF\3G\3G\3G\3G\3G\3H\3"+
		"H\3H\3H\3H\3H\5H\u02c3\nH\3I\3I\3J\3J\3J\3J\3J\3J\7J\u02cd\nJ\fJ\16J\u02d0"+
		"\13J\3K\3K\3K\3L\3L\3L\3M\3M\5M\u02da\nM\3N\3N\3N\3N\5N\u02e0\nN\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\5O\u02ea\nO\3P\3P\3P\5P\u02ef\nP\3Q\3Q\3R\3R\3R\3"+
		"S\3S\3S\5S\u02f9\nS\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\7U\u0305\nU\fU\16U\u0308"+
		"\13U\3V\3V\3V\3W\3W\5W\u030f\nW\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\5Y\u0321\nY\3Z\3Z\3Z\5Z\u0326\nZ\3[\3[\3\\\3\\\3\\\3]\3]\3"+
		"]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u033a\n^\3_\3_\3_\3_\3_\5_\u0341\n"+
		"_\3`\3`\5`\u0345\n`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0353\nc\3"+
		"d\3d\3d\3d\3d\5d\u035a\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0367\n"+
		"e\3f\3f\3f\3f\3f\5f\u036e\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5"+
		"g\u037d\ng\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0387\nh\3i\3i\5i\u038b\ni\3i\3"+
		"i\3i\7i\u0390\ni\fi\16i\u0393\13i\3j\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m"+
		"\3m\3m\5m\u03a3\nm\3n\3n\3n\3n\3n\5n\u03aa\nn\3o\3o\3o\3p\3p\3p\3p\3p"+
		"\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\5r\u03be\nr\3s\3s\3s\3s\3s\3t\3t\3t\3t"+
		"\5t\u03c9\nt\3u\3u\3u\3u\3u\3u\7u\u03d1\nu\fu\16u\u03d4\13u\3v\3v\3v\3"+
		"v\3v\3w\3w\5w\u03dd\nw\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u03e9\nx\3y\3"+
		"y\3z\3z\3z\3z\3z\3z\3z\3z\5z\u03f5\nz\3{\3{\3{\3{\5{\u03fb\n{\3|\3|\3"+
		"|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0421\n}\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0465\n~\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0471\n\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0479\n\u0080\f\u0080\16\u0080"+
		"\u047c\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u0488\n\u0082\f\u0082\16\u0082\u048b"+
		"\13\u0082\3\u0083\3\u0083\5\u0083\u048f\n\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u04a2\n\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u04aa\n\u0087\f\u0087"+
		"\16\u0087\u04ad\13\u0087\3\u0088\3\u0088\5\u0088\u04b1\n\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u04b8\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u04c4\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u04cb\n"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u04d9\n\u0090\f\u0090\16\u0090"+
		"\u04dc\13\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\5\u0093\u04e7\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u04f3\n\u0095"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u04f8\n\u0096\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u04fd\n\u0097\3\u0098\3\u0098\5\u0098\u0501\n\u0098\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0508\n\u0099\3\u009a\3\u009a\3"+
		"\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u0520\n\u009e\3\u009e\2\16\20\34HX\u0092\u00a8"+
		"\u00d0\u00e8\u00fe\u0102\u010c\u011e\u009f\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\2\t\3\2h"+
		"i\3\2\u0083\u0084\4\2ll\u008a\u008a\4\2ttvy\3\2\26\34\3\2\17\20\3\2\b"+
		"\t\2\u0541\2\u013c\3\2\2\2\4\u0140\3\2\2\2\6\u0147\3\2\2\2\b\u0155\3\2"+
		"\2\2\n\u0157\3\2\2\2\f\u0159\3\2\2\2\16\u0160\3\2\2\2\20\u0162\3\2\2\2"+
		"\22\u016f\3\2\2\2\24\u0171\3\2\2\2\26\u0177\3\2\2\2\30\u017c\3\2\2\2\32"+
		"\u017e\3\2\2\2\34\u0183\3\2\2\2\36\u018e\3\2\2\2 \u0192\3\2\2\2\"\u0197"+
		"\3\2\2\2$\u01a0\3\2\2\2&\u01a5\3\2\2\2(\u01aa\3\2\2\2*\u01ae\3\2\2\2,"+
		"\u01b0\3\2\2\2.\u01b9\3\2\2\2\60\u01bf\3\2\2\2\62\u01c1\3\2\2\2\64\u01c9"+
		"\3\2\2\2\66\u01cb\3\2\2\28\u01d2\3\2\2\2:\u01da\3\2\2\2<\u01dc\3\2\2\2"+
		">\u01e1\3\2\2\2@\u01e9\3\2\2\2B\u01ee\3\2\2\2D\u01f0\3\2\2\2F\u01f2\3"+
		"\2\2\2H\u01fa\3\2\2\2J\u020a\3\2\2\2L\u020c\3\2\2\2N\u0212\3\2\2\2P\u0217"+
		"\3\2\2\2R\u022e\3\2\2\2T\u0233\3\2\2\2V\u0235\3\2\2\2X\u0239\3\2\2\2Z"+
		"\u0244\3\2\2\2\\\u024d\3\2\2\2^\u024f\3\2\2\2`\u0257\3\2\2\2b\u0259\3"+
		"\2\2\2d\u025b\3\2\2\2f\u025f\3\2\2\2h\u0262\3\2\2\2j\u0265\3\2\2\2l\u0268"+
		"\3\2\2\2n\u026b\3\2\2\2p\u026d\3\2\2\2r\u026f\3\2\2\2t\u0271\3\2\2\2v"+
		"\u0273\3\2\2\2x\u0277\3\2\2\2z\u027a\3\2\2\2|\u0290\3\2\2\2~\u0295\3\2"+
		"\2\2\u0080\u0297\3\2\2\2\u0082\u029d\3\2\2\2\u0084\u02a4\3\2\2\2\u0086"+
		"\u02ac\3\2\2\2\u0088\u02ae\3\2\2\2\u008a\u02b5\3\2\2\2\u008c\u02b7\3\2"+
		"\2\2\u008e\u02c2\3\2\2\2\u0090\u02c4\3\2\2\2\u0092\u02c6\3\2\2\2\u0094"+
		"\u02d1\3\2\2\2\u0096\u02d4\3\2\2\2\u0098\u02d9\3\2\2\2\u009a\u02df\3\2"+
		"\2\2\u009c\u02e9\3\2\2\2\u009e\u02ee\3\2\2\2\u00a0\u02f0\3\2\2\2\u00a2"+
		"\u02f2\3\2\2\2\u00a4\u02f8\3\2\2\2\u00a6\u02fa\3\2\2\2\u00a8\u02fe\3\2"+
		"\2\2\u00aa\u0309\3\2\2\2\u00ac\u030e\3\2\2\2\u00ae\u0310\3\2\2\2\u00b0"+
		"\u0320\3\2\2\2\u00b2\u0325\3\2\2\2\u00b4\u0327\3\2\2\2\u00b6\u0329\3\2"+
		"\2\2\u00b8\u032c\3\2\2\2\u00ba\u0339\3\2\2\2\u00bc\u0340\3\2\2\2\u00be"+
		"\u0344\3\2\2\2\u00c0\u0346\3\2\2\2\u00c2\u0348\3\2\2\2\u00c4\u0352\3\2"+
		"\2\2\u00c6\u0359\3\2\2\2\u00c8\u0366\3\2\2\2\u00ca\u036d\3\2\2\2\u00cc"+
		"\u037c\3\2\2\2\u00ce\u0386\3\2\2\2\u00d0\u038a\3\2\2\2\u00d2\u0394\3\2"+
		"\2\2\u00d4\u0398\3\2\2\2\u00d6\u039b\3\2\2\2\u00d8\u03a2\3\2\2\2\u00da"+
		"\u03a9\3\2\2\2\u00dc\u03ab\3\2\2\2\u00de\u03ae\3\2\2\2\u00e0\u03b3\3\2"+
		"\2\2\u00e2\u03bd\3\2\2\2\u00e4\u03bf\3\2\2\2\u00e6\u03c8\3\2\2\2\u00e8"+
		"\u03ca\3\2\2\2\u00ea\u03d5\3\2\2\2\u00ec\u03dc\3\2\2\2\u00ee\u03e8\3\2"+
		"\2\2\u00f0\u03ea\3\2\2\2\u00f2\u03f4\3\2\2\2\u00f4\u03fa\3\2\2\2\u00f6"+
		"\u03fc\3\2\2\2\u00f8\u0420\3\2\2\2\u00fa\u0464\3\2\2\2\u00fc\u0470\3\2"+
		"\2\2\u00fe\u0472\3\2\2\2\u0100\u047d\3\2\2\2\u0102\u0481\3\2\2\2\u0104"+
		"\u048e\3\2\2\2\u0106\u0490\3\2\2\2\u0108\u0494\3\2\2\2\u010a\u0497\3\2"+
		"\2\2\u010c\u04a1\3\2\2\2\u010e\u04b0\3\2\2\2\u0110\u04b7\3\2\2\2\u0112"+
		"\u04b9\3\2\2\2\u0114\u04bc\3\2\2\2\u0116\u04c3\3\2\2\2\u0118\u04ca\3\2"+
		"\2\2\u011a\u04cc\3\2\2\2\u011c\u04cf\3\2\2\2\u011e\u04d2\3\2\2\2\u0120"+
		"\u04dd\3\2\2\2\u0122\u04df\3\2\2\2\u0124\u04e6\3\2\2\2\u0126\u04e8\3\2"+
		"\2\2\u0128\u04f2\3\2\2\2\u012a\u04f7\3\2\2\2\u012c\u04fc\3\2\2\2\u012e"+
		"\u0500\3\2\2\2\u0130\u0507\3\2\2\2\u0132\u0509\3\2\2\2\u0134\u050c\3\2"+
		"\2\2\u0136\u050e\3\2\2\2\u0138\u0511\3\2\2\2\u013a\u051f\3\2\2\2\u013c"+
		"\u013d\5\f\7\2\u013d\u013e\5\20\t\2\u013e\u013f\5\24\13\2\u013f\3\3\2"+
		"\2\2\u0140\u0141\7\n\2\2\u0141\u0142\7\u008a\2\2\u0142\u0143\5\20\t\2"+
		"\u0143\u0144\5\24\13\2\u0144\5\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0148"+
		"\5\n\6\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\7\3\2\2\2\u0149"+
		"\u0156\5\24\13\2\u014a\u014b\7\n\2\2\u014b\u014c\7\u008a\2\2\u014c\u014d"+
		"\5\6\4\2\u014d\u014e\5\20\t\2\u014e\u014f\5\24\13\2\u014f\u0156\3\2\2"+
		"\2\u0150\u0151\7\n\2\2\u0151\u0152\7\u008a\2\2\u0152\u0153\5\6\4\2\u0153"+
		"\u0154\7\13\2\2\u0154\u0156\3\2\2\2\u0155\u0149\3\2\2\2\u0155\u014a\3"+
		"\2\2\2\u0155\u0150\3\2\2\2\u0156\t\3\2\2\2\u0157\u0158\5\u00d2j\2\u0158"+
		"\13\3\2\2\2\u0159\u015a\5\u0136\u009c\2\u015a\u015b\5\n\6\2\u015b\r\3"+
		"\2\2\2\u015c\u0161\5\u012a\u0096\2\u015d\u0161\5\u010c\u0087\2\u015e\u0161"+
		"\5\u008eH\2\u015f\u0161\5\u0094K\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\17\3\2\2\2\u0162\u0163"+
		"\b\t\1\2\u0163\u0164\5\16\b\2\u0164\u016a\3\2\2\2\u0165\u0166\f\3\2\2"+
		"\u0166\u0167\7\7\2\2\u0167\u0169\5\16\b\2\u0168\u0165\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\21\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u0170\7\u008a\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u016e\3\2\2\2\u0170\23\3\2\2\2\u0171\u0172\7\u0087\2\2"+
		"\u0172\u0173\5\22\n\2\u0173\25\3\2\2\2\u0174\u0178\5h\65\2\u0175\u0178"+
		"\5j\66\2\u0176\u0178\5\u010c\u0087\2\u0177\u0174\3\2\2\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178\27\3\2\2\2\u0179\u017a\7\7\2\2\u017a"+
		"\u017d\5\30\r\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017b\3"+
		"\2\2\2\u017d\31\3\2\2\2\u017e\u017f\5\64\33\2\u017f\u0180\5\30\r\2\u0180"+
		"\u0181\5\26\f\2\u0181\u0182\5~@\2\u0182\33\3\2\2\2\u0183\u0184\b\17\1"+
		"\2\u0184\u0185\5\32\16\2\u0185\u018b\3\2\2\2\u0186\u0187\f\3\2\2\u0187"+
		"\u0188\7\61\2\2\u0188\u018a\5\32\16\2\u0189\u0186\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\35\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\7V\2\2\u018f\u0190\5\34\17\2\u0190\u0191\7"+
		"W\2\2\u0191\37\3\2\2\2\u0192\u0193\7g\2\2\u0193\u0194\7\35\2\2\u0194\u0195"+
		"\5\u010c\u0087\2\u0195\u0196\7\36\2\2\u0196!\3\2\2\2\u0197\u0198\7c\2"+
		"\2\u0198\u0199\5\u010c\u0087\2\u0199\u019a\5\u0106\u0084\2\u019a#\3\2"+
		"\2\2\u019b\u019c\7-\2\2\u019c\u01a1\5\u010c\u0087\2\u019d\u019e\7d\2\2"+
		"\u019e\u01a1\5\u010c\u0087\2\u019f\u01a1\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0"+
		"\u019d\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1%\3\2\2\2\u01a2\u01a3\7e\2\2\u01a3"+
		"\u01a6\5\u010c\u0087\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\'\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01a9\7B\2\2\u01a9"+
		"\u01ab\7\u008a\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab)\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01af\5\u00e8u\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af+\3\2\2\2\u01b0\u01b1\7\35\2\2\u01b1\u01b2\5*\26\2"+
		"\u01b2\u01b3\7\36\2\2\u01b3\u01b4\5(\25\2\u01b4-\3\2\2\2\u01b5\u01ba\5"+
		"\u0114\u008b\2\u01b6\u01b7\5\u0114\u008b\2\u01b7\u01b8\5.\30\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba/\3\2\2\2\u01bb"+
		"\u01c0\5\u00d8m\2\u01bc\u01bd\5\u00d8m\2\u01bd\u01be\5.\30\2\u01be\u01c0"+
		"\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0\61\3\2\2\2\u01c1"+
		"\u01c2\5\60\31\2\u01c2\u01c3\5,\27\2\u01c3\63\3\2\2\2\u01c4\u01ca\3\2"+
		"\2\2\u01c5\u01c6\7\35\2\2\u01c6\u01c7\5H%\2\u01c7\u01c8\7\36\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca\65\3\2\2"+
		"\2\u01cb\u01cc\5\64\33\2\u01cc\u01cd\5\62\32\2\u01cd\u01ce\5$\23\2\u01ce"+
		"\u01cf\5&\24\2\u01cf\u01d0\7/\2\2\u01d0\u01d1\5b\62\2\u01d1\67\3\2\2\2"+
		"\u01d2\u01d3\5\66\34\2\u01d3\u01d4\5:\36\2\u01d49\3\2\2\2\u01d5\u01d6"+
		"\7\60\2\2\u01d6\u01d7\5\66\34\2\u01d7\u01d8\5:\36\2\u01d8\u01db\3\2\2"+
		"\2\u01d9\u01db\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d9\3\2\2\2\u01db;"+
		"\3\2\2\2\u01dc\u01dd\7X\2\2\u01dd\u01de\58\35\2\u01de\u01df\5J&\2\u01df"+
		"\u01e0\7Y\2\2\u01e0=\3\2\2\2\u01e1\u01e2\7f\2\2\u01e2\u01e3\7\35\2\2\u01e3"+
		"\u01e4\5\u010c\u0087\2\u01e4\u01e5\7\36\2\2\u01e5?\3\2\2\2\u01e6\u01e7"+
		"\7d\2\2\u01e7\u01ea\5\u010c\u0087\2\u01e8\u01ea\3\2\2\2\u01e9\u01e6\3"+
		"\2\2\2\u01e9\u01e8\3\2\2\2\u01eaA\3\2\2\2\u01eb\u01ec\7e\2\2\u01ec\u01ef"+
		"\5\u010c\u0087\2\u01ed\u01ef\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ed\3"+
		"\2\2\2\u01efC\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1E\3\2\2\2\u01f2\u01f3\7"+
		"\u008a\2\2\u01f3\u01f4\7\66\2\2\u01f4\u01f5\5\u010c\u0087\2\u01f5\u01f6"+
		"\5D#\2\u01f6\u01f7\5\u010c\u0087\2\u01f7\u01f8\5B\"\2\u01f8\u01f9\5@!"+
		"\2\u01f9G\3\2\2\2\u01fa\u01fb\b%\1\2\u01fb\u01fc\5F$\2\u01fc\u0202\3\2"+
		"\2\2\u01fd\u01fe\f\3\2\2\u01fe\u01ff\7\16\2\2\u01ff\u0201\5F$\2\u0200"+
		"\u01fd\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203I\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\60\2\2\u0206\u0207"+
		"\7Q\2\2\u0207\u0208\7/\2\2\u0208\u020b\5b\62\2\u0209\u020b\3\2\2\2\u020a"+
		"\u0205\3\2\2\2\u020a\u0209\3\2\2\2\u020bK\3\2\2\2\u020c\u020d\7T\2\2\u020d"+
		"\u020e\5H%\2\u020e\u020f\7/\2\2\u020f\u0210\5b\62\2\u0210\u0211\7U\2\2"+
		"\u0211M\3\2\2\2\u0212\u0213\7R\2\2\u0213\u0214\5X-\2\u0214\u0215\5J&\2"+
		"\u0215\u0216\7S\2\2\u0216O\3\2\2\2\u0217\u0218\7j\2\2\u0218\u0219\7\35"+
		"\2\2\u0219\u021a\5R*\2\u021a\u021b\7\36\2\2\u021bQ\3\2\2\2\u021c\u021d"+
		"\7!\2\2\u021d\u021e\5T+\2\u021e\u021f\7!\2\2\u021f\u0220\7\16\2\2\u0220"+
		"\u0221\5R*\2\u0221\u022f\3\2\2\2\u0222\u0223\7!\2\2\u0223\u0224\5T+\2"+
		"\u0224\u0225\7!\2\2\u0225\u0226\7\16\2\2\u0226\u0227\7\u008a\2\2\u0227"+
		"\u0228\7\16\2\2\u0228\u0229\5R*\2\u0229\u022f\3\2\2\2\u022a\u022b\7!\2"+
		"\2\u022b\u022c\5T+\2\u022c\u022d\7!\2\2\u022d\u022f\3\2\2\2\u022e\u021c"+
		"\3\2\2\2\u022e\u0222\3\2\2\2\u022e\u022a\3\2\2\2\u022fS\3\2\2\2\u0230"+
		"\u0231\7\u008a\2\2\u0231\u0234\5T+\2\u0232\u0234\7\u008a\2\2\u0233\u0230"+
		"\3\2\2\2\u0233\u0232\3\2\2\2\u0234U\3\2\2\2\u0235\u0236\5\u010c\u0087"+
		"\2\u0236\u0237\7/\2\2\u0237\u0238\5b\62\2\u0238W\3\2\2\2\u0239\u023a\b"+
		"-\1\2\u023a\u023b\5V,\2\u023b\u0241\3\2\2\2\u023c\u023d\f\3\2\2\u023d"+
		"\u023e\7\60\2\2\u023e\u0240\5V,\2\u023f\u023c\3\2\2\2\u0240\u0243\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242Y\3\2\2\2\u0243\u0241"+
		"\3\2\2\2\u0244\u0245\7O\2\2\u0245\u0246\5X-\2\u0246\u0247\5J&\2\u0247"+
		"\u0248\7P\2\2\u0248[\3\2\2\2\u0249\u024e\5\u0128\u0095\2\u024a\u024e\5"+
		"|?\2\u024b\u024e\5\u010c\u0087\2\u024c\u024e\5\u0096L\2\u024d\u0249\3"+
		"\2\2\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e"+
		"]\3\2\2\2\u024f\u0250\5\\/\2\u0250\u0251\5`\61\2\u0251_\3\2\2\2\u0252"+
		"\u0253\7\7\2\2\u0253\u0254\5\\/\2\u0254\u0255\5`\61\2\u0255\u0258\3\2"+
		"\2\2\u0256\u0258\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0256\3\2\2\2\u0258"+
		"a\3\2\2\2\u0259\u025a\5^\60\2\u025ac\3\2\2\2\u025b\u025c\7Z\2\2\u025c"+
		"\u025d\5b\62\2\u025d\u025e\7\u0087\2\2\u025ee\3\2\2\2\u025f\u0260\7[\2"+
		"\2\u0260\u0261\5\u010c\u0087\2\u0261g\3\2\2\2\u0262\u0263\7K\2\2\u0263"+
		"\u0264\5\u0108\u0085\2\u0264i\3\2\2\2\u0265\u0266\7k\2\2\u0266\u0267\5"+
		"\u0108\u0085\2\u0267k\3\2\2\2\u0268\u0269\7\\\2\2\u0269\u026a\5\u0108"+
		"\u0085\2\u026am\3\2\2\2\u026b\u026c\7]\2\2\u026co\3\2\2\2\u026d\u026e"+
		"\7^\2\2\u026eq\3\2\2\2\u026f\u0270\7_\2\2\u0270s\3\2\2\2\u0271\u0272\7"+
		"`\2\2\u0272u\3\2\2\2\u0273\u0274\7\35\2\2\u0274\u0275\5\u010c\u0087\2"+
		"\u0275\u0276\7\36\2\2\u0276w\3\2\2\2\u0277\u0278\7a\2\2\u0278\u0279\5"+
		"v<\2\u0279y\3\2\2\2\u027a\u027b\7b\2\2\u027b{\3\2\2\2\u027c\u0291\5z>"+
		"\2\u027d\u0291\5x=\2\u027e\u0291\5t;\2\u027f\u0291\5r:\2\u0280\u0291\5"+
		"p9\2\u0281\u0291\5n8\2\u0282\u0291\5l\67\2\u0283\u0291\5j\66\2\u0284\u0291"+
		"\5h\65\2\u0285\u0291\5f\64\2\u0286\u0291\5d\63\2\u0287\u0291\5Z.\2\u0288"+
		"\u0291\5N(\2\u0289\u0291\5P)\2\u028a\u0291\5L\'\2\u028b\u0291\5> \2\u028c"+
		"\u0291\5<\37\2\u028d\u0291\5\"\22\2\u028e\u0291\5 \21\2\u028f\u0291\5"+
		"\36\20\2\u0290\u027c\3\2\2\2\u0290\u027d\3\2\2\2\u0290\u027e\3\2\2\2\u0290"+
		"\u027f\3\2\2\2\u0290\u0280\3\2\2\2\u0290\u0281\3\2\2\2\u0290\u0282\3\2"+
		"\2\2\u0290\u0283\3\2\2\2\u0290\u0284\3\2\2\2\u0290\u0285\3\2\2\2\u0290"+
		"\u0286\3\2\2\2\u0290\u0287\3\2\2\2\u0290\u0288\3\2\2\2\u0290\u0289\3\2"+
		"\2\2\u0290\u028a\3\2\2\2\u0290\u028b\3\2\2\2\u0290\u028c\3\2\2\2\u0290"+
		"\u028d\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291}\3\2\2\2"+
		"\u0292\u0293\7/\2\2\u0293\u0296\5b\62\2\u0294\u0296\3\2\2\2\u0295\u0292"+
		"\3\2\2\2\u0295\u0294\3\2\2\2\u0296\177\3\2\2\2\u0297\u0298\7N\2\2\u0298"+
		"\u0299\7\u008a\2\2\u0299\u029a\5,\27\2\u029a\u029b\5b\62\2\u029b\u029c"+
		"\5\24\13\2\u029c\u0081\3\2\2\2\u029d\u029e\7\u0085\2\2\u029e\u029f\7\u008a"+
		"\2\2\u029f\u02a0\5\u00c0a\2\u02a0\u02a1\5\64\33\2\u02a1\u02a2\5b\62\2"+
		"\u02a2\u02a3\5\24\13\2\u02a3\u0083\3\2\2\2\u02a4\u02a5\7\u0086\2\2\u02a5"+
		"\u02a6\7\u008a\2\2\u02a6\u02a7\5\u00d4k\2\u02a7\u02a8\5b\62\2\u02a8\u02a9"+
		"\5\24\13\2\u02a9\u0085\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02ad\7\u0088"+
		"\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad\u0087\3\2\2\2\u02ae"+
		"\u02af\7\u0088\2\2\u02af\u02b0\5b\62\2\u02b0\u02b1\7\u0087\2\2\u02b1\u02b2"+
		"\5\u0086D\2\u02b2\u0089\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b6\7\u0089"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u008b\3\2\2\2\u02b7"+
		"\u02b8\7\u0089\2\2\u02b8\u02b9\5b\62\2\u02b9\u02ba\7\u0087\2\2\u02ba\u02bb"+
		"\5\u008aF\2\u02bb\u008d\3\2\2\2\u02bc\u02c3\5|?\2\u02bd\u02c3\5\u0080"+
		"A\2\u02be\u02c3\5\u0082B\2\u02bf\u02c3\5\u0084C\2\u02c0\u02c3\5\u0088"+
		"E\2\u02c1\u02c3\5\u008cG\2\u02c2\u02bc\3\2\2\2\u02c2\u02bd\3\2\2\2\u02c2"+
		"\u02be\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2"+
		"\2\2\u02c3\u008f\3\2\2\2\u02c4\u02c5\7\u008a\2\2\u02c5\u0091\3\2\2\2\u02c6"+
		"\u02c7\bJ\1\2\u02c7\u02c8\5\u0090I\2\u02c8\u02ce\3\2\2\2\u02c9\u02ca\f"+
		"\3\2\2\u02ca\u02cb\7\16\2\2\u02cb\u02cd\5\u0090I\2\u02cc\u02c9\3\2\2\2"+
		"\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u0093"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7\f\2\2\u02d2\u02d3\5\u0092J"+
		"\2\u02d3\u0095\3\2\2\2\u02d4\u02d5\7\r\2\2\u02d5\u02d6\5\u0092J\2\u02d6"+
		"\u0097\3\2\2\2\u02d7\u02da\7F\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02d9\u02d8\3\2\2\2\u02da\u0099\3\2\2\2\u02db\u02e0\5\u00d6l\2\u02dc"+
		"\u02dd\5\u0098M\2\u02dd\u02de\5\u00d8m\2\u02de\u02e0\3\2\2\2\u02df\u02db"+
		"\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0\u009b\3\2\2\2\u02e1\u02e2\5\u011a\u008e"+
		"\2\u02e2\u02e3\5\u009aN\2\u02e3\u02e4\5\u009eP\2\u02e4\u02ea\3\2\2\2\u02e5"+
		"\u02e6\7\16\2\2\u02e6\u02e7\5\u009aN\2\u02e7\u02e8\5\u009eP\2\u02e8\u02ea"+
		"\3\2\2\2\u02e9\u02e1\3\2\2\2\u02e9\u02e5\3\2\2\2\u02ea\u009d\3\2\2\2\u02eb"+
		"\u02ec\7\16\2\2\u02ec\u02ef\5\u009aN\2\u02ed\u02ef\3\2\2\2\u02ee\u02eb"+
		"\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u009f\3\2\2\2\u02f0\u02f1\t\3\2\2\u02f1"+
		"\u00a1\3\2\2\2\u02f2\u02f3\5\u00a0Q\2\u02f3\u02f4\5\u009cO\2\u02f4\u00a3"+
		"\3\2\2\2\u02f5\u02f6\7\66\2\2\u02f6\u02f9\5\u010c\u0087\2\u02f7\u02f9"+
		"\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u00a5\3\2\2\2\u02fa"+
		"\u02fb\5\u0116\u008c\2\u02fb\u02fc\5\u00c2b\2\u02fc\u02fd\5\u00a4S\2\u02fd"+
		"\u00a7\3\2\2\2\u02fe\u02ff\bU\1\2\u02ff\u0300\5\u00a6T\2\u0300\u0306\3"+
		"\2\2\2\u0301\u0302\f\3\2\2\u0302\u0303\7\16\2\2\u0303\u0305\5\u00a6T\2"+
		"\u0304\u0301\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u00a9\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7m\2\2\u030a"+
		"\u030b\5\u00a8U\2\u030b\u00ab\3\2\2\2\u030c\u030f\7\24\2\2\u030d\u030f"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f\u00ad\3\2\2\2\u0310"+
		"\u0311\7\u0082\2\2\u0311\u0312\7\u008a\2\2\u0312\u0313\5\u00acW\2\u0313"+
		"\u0314\5\u00d6l\2\u0314\u00af\3\2\2\2\u0315\u0316\7F\2\2\u0316\u0321\5"+
		"\u00f4{\2\u0317\u0318\7F\2\2\u0318\u0321\5\u00f4{\2\u0319\u031a\7F\2\2"+
		"\u031a\u031b\5\u00f4{\2\u031b\u031c\7\66\2\2\u031c\u031d\5\u010c\u0087"+
		"\2\u031d\u0321\3\2\2\2\u031e\u031f\7\66\2\2\u031f\u0321\5\u010c\u0087"+
		"\2\u0320\u0315\3\2\2\2\u0320\u0317\3\2\2\2\u0320\u0319\3\2\2\2\u0320\u031e"+
		"\3\2\2\2\u0321\u00b1\3\2\2\2\u0322\u0323\7\u0081\2\2\u0323\u0326\5\u010c"+
		"\u0087\2\u0324\u0326\3\2\2\2\u0325\u0322\3\2\2\2\u0325\u0324\3\2\2\2\u0326"+
		"\u00b3\3\2\2\2\u0327\u0328\t\4\2\2\u0328\u00b5\3\2\2\2\u0329\u032a\5\u00b4"+
		"[\2\u032a\u032b\5\u0106\u0084\2\u032b\u00b7\3\2\2\2\u032c\u032d\7\u0080"+
		"\2\2\u032d\u032e\5\u00b6\\\2\u032e\u032f\5\u00b2Z\2\u032f\u00b9\3\2\2"+
		"\2\u0330\u033a\7p\2\2\u0331\u033a\7q\2\2\u0332\u033a\7\177\2\2\u0333\u0334"+
		"\7M\2\2\u0334\u033a\7\u008a\2\2\u0335\u0336\7\37\2\2\u0336\u0337\5\u0112"+
		"\u008a\2\u0337\u0338\7 \2\2\u0338\u033a\3\2\2\2\u0339\u0330\3\2\2\2\u0339"+
		"\u0331\3\2\2\2\u0339\u0332\3\2\2\2\u0339\u0333\3\2\2\2\u0339\u0335\3\2"+
		"\2\2\u033a\u00bb\3\2\2\2\u033b\u0341\5\u00f2z\2\u033c\u033d\7m\2\2\u033d"+
		"\u0341\5\u00c2b\2\u033e\u033f\7\u0084\2\2\u033f\u0341\5\u00d6l\2\u0340"+
		"\u033b\3\2\2\2\u0340\u033c\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u00bd\3\2"+
		"\2\2\u0342\u0345\5.\30\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0344"+
		"\u0343\3\2\2\2\u0345\u00bf\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u00c1\3\2"+
		"\2\2\u0348\u0349\5\u00c0a\2\u0349\u00c3\3\2\2\2\u034a\u0353\7K\2\2\u034b"+
		"\u0353\7k\2\2\u034c\u034d\7K\2\2\u034d\u034e\7\16\2\2\u034e\u0353\7k\2"+
		"\2\u034f\u0350\7k\2\2\u0350\u0351\7\16\2\2\u0351\u0353\7K\2\2\u0352\u034a"+
		"\3\2\2\2\u0352\u034b\3\2\2\2\u0352\u034c\3\2\2\2\u0352\u034f\3\2\2\2\u0353"+
		"\u00c5\3\2\2\2\u0354\u035a\3\2\2\2\u0355\u0356\7\21\2\2\u0356\u0357\5"+
		"\u00c4c\2\u0357\u0358\7\22\2\2\u0358\u035a\3\2\2\2\u0359\u0354\3\2\2\2"+
		"\u0359\u0355\3\2\2\2\u035a\u00c7\3\2\2\2\u035b\u0367\3\2\2\2\u035c\u035d"+
		"\7B\2\2\u035d\u0367\5\u00f4{\2\u035e\u035f\7B\2\2\u035f\u0360\5\u0116"+
		"\u008c\2\u0360\u0361\7F\2\2\u0361\u0362\5\u00f4{\2\u0362\u0367\3\2\2\2"+
		"\u0363\u0364\7B\2\2\u0364\u0365\7\u008a\2\2\u0365\u0367\7L\2\2\u0366\u035b"+
		"\3\2\2\2\u0366\u035c\3\2\2\2\u0366\u035e\3\2\2\2\u0366\u0363\3\2\2\2\u0367"+
		"\u00c9\3\2\2\2\u0368\u036e\7G\2\2\u0369\u036e\7\17\2\2\u036a\u036e\7H"+
		"\2\2\u036b\u036e\7I\2\2\u036c\u036e\3\2\2\2\u036d\u0368\3\2\2\2\u036d"+
		"\u0369\3\2\2\2\u036d\u036a\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2"+
		"\2\2\u036e\u00cb\3\2\2\2\u036f\u0370\5\u00caf\2\u0370\u0371\5\u00f4{\2"+
		"\u0371\u037d\3\2\2\2\u0372\u0373\5\u00caf\2\u0373\u0374\5\u011a\u008e"+
		"\2\u0374\u0375\7F\2\2\u0375\u0376\5\u00f4{\2\u0376\u037d\3\2\2\2\u0377"+
		"\u0378\5\u00caf\2\u0378\u0379\5\u00dco\2\u0379\u037a\7\7\2\2\u037a\u037b"+
		"\5\u00d0i\2\u037b\u037d\3\2\2\2\u037c\u036f\3\2\2\2\u037c\u0372\3\2\2"+
		"\2\u037c\u0377\3\2\2\2\u037d\u00cd\3\2\2\2\u037e\u0387\5\u00ccg\2\u037f"+
		"\u0380\5\u00ccg\2\u0380\u0381\7F\2\2\u0381\u0387\3\2\2\2\u0382\u0383\5"+
		"\u00ccg\2\u0383\u0384\7F\2\2\u0384\u0385\5\u00ceh\2\u0385\u0387\3\2\2"+
		"\2\u0386\u037e\3\2\2\2\u0386\u037f\3\2\2\2\u0386\u0382\3\2\2\2\u0387\u00cf"+
		"\3\2\2\2\u0388\u038b\bi\1\2\u0389\u038b\5\u00ceh\2\u038a\u0388\3\2\2\2"+
		"\u038a\u0389\3\2\2\2\u038b\u0391\3\2\2\2\u038c\u038d\f\4\2\2\u038d\u038e"+
		"\7\16\2\2\u038e\u0390\5\u00d0i\5\u038f\u038c\3\2\2\2\u0390\u0393\3\2\2"+
		"\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u00d1\3\2\2\2\u0393\u0391"+
		"\3\2\2\2\u0394\u0395\7\35\2\2\u0395\u0396\5\u00d0i\2\u0396\u0397\7\36"+
		"\2\2\u0397\u00d3\3\2\2\2\u0398\u0399\5\u00d2j\2\u0399\u039a\5\u00c8e\2"+
		"\u039a\u00d5\3\2\2\2\u039b\u039c\5\u00d4k\2\u039c\u039d\5\u00c6d\2\u039d"+
		"\u00d7\3\2\2\2\u039e\u03a3\7\u008a\2\2\u039f\u03a0\7\u008a\2\2\u03a0\u03a1"+
		"\7M\2\2\u03a1\u03a3\7\u008a\2\2\u03a2\u039e\3\2\2\2\u03a2\u039f\3\2\2"+
		"\2\u03a3\u00d9\3\2\2\2\u03a4\u03aa\5\u00d8m\2\u03a5\u03aa\5\u00d6l\2\u03a6"+
		"\u03a7\7m\2\2\u03a7\u03aa\5\u00c2b\2\u03a8\u03aa\7l\2\2\u03a9\u03a4\3"+
		"\2\2\2\u03a9\u03a5\3\2\2\2\u03a9\u03a6\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa"+
		"\u00db\3\2\2\2\u03ab\u03ac\7J\2\2\u03ac\u03ad\5\u00dan\2\u03ad\u00dd\3"+
		"\2\2\2\u03ae\u03af\7u\2\2\u03af\u03b0\7\35\2\2\u03b0\u03b1\5\u00e2r\2"+
		"\u03b1\u03b2\7\36\2\2\u03b2\u00df\3\2\2\2\u03b3\u03b4\5\u011e\u0090\2"+
		"\u03b4\u00e1\3\2\2\2\u03b5\u03be\5\u00e0q\2\u03b6\u03b7\5\u00e0q\2\u03b7"+
		"\u03b8\7\7\2\2\u03b8\u03be\3\2\2\2\u03b9\u03ba\5\u00e0q\2\u03ba\u03bb"+
		"\7\7\2\2\u03bb\u03bc\5\u00e0q\2\u03bc\u03be\3\2\2\2\u03bd\u03b5\3\2\2"+
		"\2\u03bd\u03b6\3\2\2\2\u03bd\u03b9\3\2\2\2\u03be\u00e3\3\2\2\2\u03bf\u03c0"+
		"\7n\2\2\u03c0\u03c1\7\35\2\2\u03c1\u03c2\5\u00e2r\2\u03c2\u03c3\7\36\2"+
		"\2\u03c3\u00e5\3\2\2\2\u03c4\u03c5\7|\2\2\u03c5\u03c9\5\u00f4{\2\u03c6"+
		"\u03c7\7|\2\2\u03c7\u03c9\7o\2\2\u03c8\u03c4\3\2\2\2\u03c8\u03c6\3\2\2"+
		"\2\u03c9\u00e7\3\2\2\2\u03ca\u03cb\bu\1\2\u03cb\u03cc\7\u008a\2\2\u03cc"+
		"\u03d2\3\2\2\2\u03cd\u03ce\f\3\2\2\u03ce\u03cf\7\16\2\2\u03cf\u03d1\7"+
		"\u008a\2\2\u03d0\u03cd\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2"+
		"\u03d2\u03d3\3\2\2\2\u03d3\u00e9\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6"+
		"\7z\2\2\u03d6\u03d7\7\35\2\2\u03d7\u03d8\5\u00e8u\2\u03d8\u03d9\7\36\2"+
		"\2\u03d9\u00eb\3\2\2\2\u03da\u03dd\5\u010c\u0087\2\u03db\u03dd\7\25\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u00ed\3\2\2\2\u03de\u03df"+
		"\7{\2\2\u03df\u03e0\7\37\2\2\u03e0\u03e1\5\u00ecw\2\u03e1\u03e2\7 \2\2"+
		"\u03e2\u03e9\3\2\2\2\u03e3\u03e4\7{\2\2\u03e4\u03e5\7\35\2\2\u03e5\u03e6"+
		"\5\u00ecw\2\u03e6\u03e7\7\36\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03de\3\2\2"+
		"\2\u03e8\u03e3\3\2\2\2\u03e9\u00ef\3\2\2\2\u03ea\u03eb\t\5\2\2\u03eb\u00f1"+
		"\3\2\2\2\u03ec\u03f5\5\u00f0y\2\u03ed\u03f5\5\u00eex\2\u03ee\u03f5\5\u00ea"+
		"v\2\u03ef\u03f5\5\u00e6t\2\u03f0\u03f5\5\u00e4s\2\u03f1\u03f5\5\u00de"+
		"p\2\u03f2\u03f5\5\u00dco\2\u03f3\u03f5\5\u00d8m\2\u03f4\u03ec\3\2\2\2"+
		"\u03f4\u03ed\3\2\2\2\u03f4\u03ee\3\2\2\2\u03f4\u03ef\3\2\2\2\u03f4\u03f0"+
		"\3\2\2\2\u03f4\u03f1\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5"+
		"\u00f3\3\2\2\2\u03f6\u03f7\5.\30\2\u03f7\u03f8\5\u00f2z\2\u03f8\u03fb"+
		"\3\2\2\2\u03f9\u03fb\5\u00f2z\2\u03fa\u03f6\3\2\2\2\u03fa\u03f9\3\2\2"+
		"\2\u03fb\u00f5\3\2\2\2\u03fc\u03fd\7\35\2\2\u03fd\u03fe\5\u010c\u0087"+
		"\2\u03fe\u03ff\7\36\2\2\u03ff\u00f7\3\2\2\2\u0400\u0401\7s\2\2\u0401\u0421"+
		"\5\u010c\u0087\2\u0402\u0403\7%\2\2\u0403\u0421\5\u010c\u0087\2\u0404"+
		"\u0405\7&\2\2\u0405\u0421\5\u010c\u0087\2\u0406\u0407\7}\2\2\u0407\u0421"+
		"\5\u010c\u0087\2\u0408\u0409\7r\2\2\u0409\u0421\5\u010c\u0087\2\u040a"+
		"\u040b\7p\2\2\u040b\u0421\5\u010c\u0087\2\u040c\u040d\7q\2\2\u040d\u0421"+
		"\5\u010c\u0087\2\u040e\u040f\7{\2\2\u040f\u0421\5\u00f6|\2\u0410\u0411"+
		"\7D\2\2\u0411\u0412\7\35\2\2\u0412\u0413\5\u00f4{\2\u0413\u0414\7\36\2"+
		"\2\u0414\u0421\3\2\2\2\u0415\u0416\7E\2\2\u0416\u0417\7\35\2\2\u0417\u0418"+
		"\5\u00f4{\2\u0418\u0419\7\36\2\2\u0419\u0421\3\2\2\2\u041a\u041b\7C\2"+
		"\2\u041b\u041c\7\35\2\2\u041c\u041d\5\u00be`\2\u041d\u041e\5\u00bc_\2"+
		"\u041e\u041f\7\36\2\2\u041f\u0421\3\2\2\2\u0420\u0400\3\2\2\2\u0420\u0402"+
		"\3\2\2\2\u0420\u0404\3\2\2\2\u0420\u0406\3\2\2\2\u0420\u0408\3\2\2\2\u0420"+
		"\u040a\3\2\2\2\u0420\u040c\3\2\2\2\u0420\u040e\3\2\2\2\u0420\u0410\3\2"+
		"\2\2\u0420\u0415\3\2\2\2\u0420\u041a\3\2\2\2\u0421\u00f9\3\2\2\2\u0422"+
		"\u0423\7\"\2\2\u0423\u0465\5\u010c\u0087\2\u0424\u0425\7\25\2\2\u0425"+
		"\u0465\5\u010c\u0087\2\u0426\u0427\7#\2\2\u0427\u0465\5\u010c\u0087\2"+
		"\u0428\u0429\7~\2\2\u0429\u0465\5\u010c\u0087\2\u042a\u042b\7$\2\2\u042b"+
		"\u0465\5\u010c\u0087\2\u042c\u042d\7%\2\2\u042d\u0465\5\u010c\u0087\2"+
		"\u042e\u042f\7&\2\2\u042f\u0465\5\u010c\u0087\2\u0430\u0431\7\'\2\2\u0431"+
		"\u0465\5\u010c\u0087\2\u0432\u0433\7\24\2\2\u0433\u0465\5\u010c\u0087"+
		"\2\u0434\u0435\7(\2\2\u0435\u0465\5\u010c\u0087\2\u0436\u0437\7)\2\2\u0437"+
		"\u0465\5\u010c\u0087\2\u0438\u0439\7*\2\2\u0439\u0465\5\u010c\u0087\2"+
		"\u043a\u043b\7+\2\2\u043b\u0465\5\u010c\u0087\2\u043c\u043d\7,\2\2\u043d"+
		"\u0465\5\u010c\u0087\2\u043e\u043f\7-\2\2\u043f\u0465\5\u010c\u0087\2"+
		"\u0440\u0441\7.\2\2\u0441\u0465\5\u010c\u0087\2\u0442\u0443\7\62\2\2\u0443"+
		"\u0465\5\u010c\u0087\2\u0444\u0445\7\63\2\2\u0445\u0465\5\u010c\u0087"+
		"\2\u0446\u0447\7\64\2\2\u0447\u0465\5\u010c\u0087\2\u0448\u0449\7\65\2"+
		"\2\u0449\u0465\5\u010c\u0087\2\u044a\u044b\7\66\2\2\u044b\u0465\5\u010c"+
		"\u0087\2\u044c\u044d\7\67\2\2\u044d\u0465\5\u010c\u0087\2\u044e\u044f"+
		"\78\2\2\u044f\u0465\5\u010c\u0087\2\u0450\u0451\79\2\2\u0451\u0465\5\u010c"+
		"\u0087\2\u0452\u0453\7:\2\2\u0453\u0465\5\u010c\u0087\2\u0454\u0455\7"+
		";\2\2\u0455\u0465\5\u010c\u0087\2\u0456\u0457\7<\2\2\u0457\u0465\5\u010c"+
		"\u0087\2\u0458\u0459\7=\2\2\u0459\u0465\5\u010c\u0087\2\u045a\u045b\7"+
		">\2\2\u045b\u0465\5\u010c\u0087\2\u045c\u045d\7?\2\2\u045d\u0465\5\u010c"+
		"\u0087\2\u045e\u045f\7@\2\2\u045f\u0465\5\u010c\u0087\2\u0460\u0461\7"+
		"A\2\2\u0461\u0465\5\u010c\u0087\2\u0462\u0463\7F\2\2\u0463\u0465\5\u010c"+
		"\u0087\2\u0464\u0422\3\2\2\2\u0464\u0424\3\2\2\2\u0464\u0426\3\2\2\2\u0464"+
		"\u0428\3\2\2\2\u0464\u042a\3\2\2\2\u0464\u042c\3\2\2\2\u0464\u042e\3\2"+
		"\2\2\u0464\u0430\3\2\2\2\u0464\u0432\3\2\2\2\u0464\u0434\3\2\2\2\u0464"+
		"\u0436\3\2\2\2\u0464\u0438\3\2\2\2\u0464\u043a\3\2\2\2\u0464\u043c\3\2"+
		"\2\2\u0464\u043e\3\2\2\2\u0464\u0440\3\2\2\2\u0464\u0442\3\2\2\2\u0464"+
		"\u0444\3\2\2\2\u0464\u0446\3\2\2\2\u0464\u0448\3\2\2\2\u0464\u044a\3\2"+
		"\2\2\u0464\u044c\3\2\2\2\u0464\u044e\3\2\2\2\u0464\u0450\3\2\2\2\u0464"+
		"\u0452\3\2\2\2\u0464\u0454\3\2\2\2\u0464\u0456\3\2\2\2\u0464\u0458\3\2"+
		"\2\2\u0464\u045a\3\2\2\2\u0464\u045c\3\2\2\2\u0464\u045e\3\2\2\2\u0464"+
		"\u0460\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u00fb\3\2\2\2\u0466\u0471\5\u010c"+
		"\u0087\2\u0467\u0468\7\37\2\2\u0468\u0469\5\u010c\u0087\2\u0469\u046a"+
		"\7 \2\2\u046a\u046b\5\u010c\u0087\2\u046b\u0471\3\2\2\2\u046c\u046d\5"+
		"\u010c\u0087\2\u046d\u046e\7F\2\2\u046e\u046f\5\u00f4{\2\u046f\u0471\3"+
		"\2\2\2\u0470\u0466\3\2\2\2\u0470\u0467\3\2\2\2\u0470\u046c\3\2\2\2\u0471"+
		"\u00fd\3\2\2\2\u0472\u0473\b\u0080\1\2\u0473\u0474\5\u00fc\177\2\u0474"+
		"\u047a\3\2\2\2\u0475\u0476\f\3\2\2\u0476\u0477\7\16\2\2\u0477\u0479\5"+
		"\u00fc\177\2\u0478\u0475\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2"+
		"\2\u047a\u047b\3\2\2\2\u047b\u00ff\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e"+
		"\7\35\2\2\u047e\u047f\5\u00fe\u0080\2\u047f\u0480\7\36\2\2\u0480\u0101"+
		"\3\2\2\2\u0481\u0482\b\u0082\1\2\u0482\u0483\5\u010c\u0087\2\u0483\u0489"+
		"\3\2\2\2\u0484\u0485\f\3\2\2\u0485\u0486\7\16\2\2\u0486\u0488\5\u010c"+
		"\u0087\2\u0487\u0484\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u0103\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048f\5\u0102"+
		"\u0082\2\u048d\u048f\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048d\3\2\2\2\u048f"+
		"\u0105\3\2\2\2\u0490\u0491\7\35\2\2\u0491\u0492\5\u0104\u0083\2\u0492"+
		"\u0493\7\36\2\2\u0493\u0107\3\2\2\2\u0494\u0495\5\u010c\u0087\2\u0495"+
		"\u0496\5\u0106\u0084\2\u0496\u0109\3\2\2\2\u0497\u0498\t\6\2\2\u0498\u010b"+
		"\3\2\2\2\u0499\u049a\b\u0087\1\2\u049a\u04a2\7\3\2\2\u049b\u04a2\7\4\2"+
		"\2\u049c\u04a2\7\u008a\2\2\u049d\u04a2\5\u010a\u0086\2\u049e\u04a2\5\u0100"+
		"\u0081\2\u049f\u04a2\5\u00f8}\2\u04a0\u04a2\5\u00b8]\2\u04a1\u0499\3\2"+
		"\2\2\u04a1\u049b\3\2\2\2\u04a1\u049c\3\2\2\2\u04a1\u049d\3\2\2\2\u04a1"+
		"\u049e\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04ab\3\2"+
		"\2\2\u04a3\u04a4\f\b\2\2\u04a4\u04aa\5\u0108\u0085\2\u04a5\u04a6\f\6\2"+
		"\2\u04a6\u04aa\5\u00fa~\2\u04a7\u04a8\f\4\2\2\u04a8\u04aa\5\u00ba^\2\u04a9"+
		"\u04a3\3\2\2\2\u04a9\u04a5\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ad\3\2"+
		"\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u010d\3\2\2\2\u04ad"+
		"\u04ab\3\2\2\2\u04ae\u04b1\5\u010c\u0087\2\u04af\u04b1\7\25\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1\u010f\3\2\2\2\u04b2\u04b8\3\2"+
		"\2\2\u04b3\u04b4\7\16\2\2\u04b4\u04b5\5\u010e\u0088\2\u04b5\u04b6\5\u0110"+
		"\u0089\2\u04b6\u04b8\3\2\2\2\u04b7\u04b2\3\2\2\2\u04b7\u04b3\3\2\2\2\u04b8"+
		"\u0111\3\2\2\2\u04b9\u04ba\5\u010e\u0088\2\u04ba\u04bb\5\u0110\u0089\2"+
		"\u04bb\u0113\3\2\2\2\u04bc\u04bd\7\37\2\2\u04bd\u04be\5\u0112\u008a\2"+
		"\u04be\u04bf\7 \2\2\u04bf\u0115\3\2\2\2\u04c0\u04c1\7\u008a\2\2\u04c1"+
		"\u04c4\5.\30\2\u04c2\u04c4\7\u008a\2\2\u04c3\u04c0\3\2\2\2\u04c3\u04c2"+
		"\3\2\2\2\u04c4\u0117\3\2\2\2\u04c5\u04cb\3\2\2\2\u04c6\u04c7\7\16\2\2"+
		"\u04c7\u04c8\5\u0116\u008c\2\u04c8\u04c9\5\u0118\u008d\2\u04c9\u04cb\3"+
		"\2\2\2\u04ca\u04c5\3\2\2\2\u04ca\u04c6\3\2\2\2\u04cb\u0119\3\2\2\2\u04cc"+
		"\u04cd\5\u0116\u008c\2\u04cd\u04ce\5\u0118\u008d\2\u04ce\u011b\3\2\2\2"+
		"\u04cf\u04d0\5\u011a\u008e\2\u04d0\u04d1\5\u00b0Y\2\u04d1\u011d\3\2\2"+
		"\2\u04d2\u04d3\b\u0090\1\2\u04d3\u04d4\5\u011c\u008f\2\u04d4\u04da\3\2"+
		"\2\2\u04d5\u04d6\f\3\2\2\u04d6\u04d7\7\16\2\2\u04d7\u04d9\5\u011c\u008f"+
		"\2\u04d8\u04d5\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04db\u011f\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04de\t\7\2\2\u04de"+
		"\u0121\3\2\2\2\u04df\u04e0\5\u0120\u0091\2\u04e0\u04e1\5\u011e\u0090\2"+
		"\u04e1\u0123\3\2\2\2\u04e2\u04e3\7\21\2\2\u04e3\u04e4\7\u008a\2\2\u04e4"+
		"\u04e7\7\22\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e2\3\2\2\2\u04e6\u04e5\3"+
		"\2\2\2\u04e7\u0125\3\2\2\2\u04e8\u04e9\7\23\2\2\u04e9\u04ea\7\u008a\2"+
		"\2\u04ea\u04eb\7\24\2\2\u04eb\u04ec\5\u0124\u0093\2\u04ec\u0127\3\2\2"+
		"\2\u04ed\u04f3\5\u0126\u0094\2\u04ee\u04f3\5\u0122\u0092\2\u04ef\u04f3"+
		"\5\u00aeX\2\u04f0\u04f3\5\u00aaV\2\u04f1\u04f3\5\u00a2R\2\u04f2\u04ed"+
		"\3\2\2\2\u04f2\u04ee\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2"+
		"\u04f1\3\2\2\2\u04f3\u0129\3\2\2\2\u04f4\u04f8\5\u0128\u0095\2\u04f5\u04f8"+
		"\5\u0096L\2\u04f6\u04f8\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2\2"+
		"\2\u04f7\u04f6\3\2\2\2\u04f8\u012b\3\2\2\2\u04f9\u04fd\5\u012a\u0096\2"+
		"\u04fa\u04fd\5\u0094K\2\u04fb\u04fd\5\u008eH\2\u04fc\u04f9\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u012d\3\2\2\2\u04fe\u0501\3\2"+
		"\2\2\u04ff\u0501\7\7\2\2\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2\2\2\u0501"+
		"\u012f\3\2\2\2\u0502\u0508\3\2\2\2\u0503\u0504\7\7\2\2\u0504\u0505\5\u012c"+
		"\u0097\2\u0505\u0506\5\u0130\u0099\2\u0506\u0508\3\2\2\2\u0507\u0502\3"+
		"\2\2\2\u0507\u0503\3\2\2\2\u0508\u0131\3\2\2\2\u0509\u050a\5\u012c\u0097"+
		"\2\u050a\u050b\5\u0130\u0099\2\u050b\u0133\3\2\2\2\u050c\u050d\t\b\2\2"+
		"\u050d\u0135\3\2\2\2\u050e\u050f\5\u0134\u009b\2\u050f\u0510\7\u008a\2"+
		"\2\u0510\u0137\3\2\2\2\u0511\u0512\5\u0136\u009c\2\u0512\u0513\5\u0132"+
		"\u009a\2\u0513\u0514\5\b\5\2\u0514\u0139\3\2\2\2\u0515\u0520\3\2\2\2\u0516"+
		"\u0517\5\u0138\u009d\2\u0517\u0518\5\u012e\u0098\2\u0518\u0520\3\2\2\2"+
		"\u0519\u051a\5\2\2\2\u051a\u051b\5\u012e\u0098\2\u051b\u0520\3\2\2\2\u051c"+
		"\u051d\5\4\3\2\u051d\u051e\5\u012e\u0098\2\u051e\u0520\3\2\2\2\u051f\u0515"+
		"\3\2\2\2\u051f\u0516\3\2\2\2\u051f\u0519\3\2\2\2\u051f\u051c\3\2\2\2\u0520"+
		"\u013b\3\2\2\2S\u0147\u0155\u0160\u016a\u016f\u0177\u017c\u018b\u01a0"+
		"\u01a5\u01aa\u01ae\u01b9\u01bf\u01c9\u01da\u01e9\u01ee\u0202\u020a\u022e"+
		"\u0233\u0241\u024d\u0257\u0290\u0295\u02ac\u02b5\u02c2\u02ce\u02d9\u02df"+
		"\u02e9\u02ee\u02f8\u0306\u030e\u0320\u0325\u0339\u0340\u0344\u0352\u0359"+
		"\u0366\u036d\u037c\u0386\u038a\u0391\u03a2\u03a9\u03bd\u03c8\u03d2\u03dc"+
		"\u03e8\u03f4\u03fa\u0420\u0464\u0470\u047a\u0489\u048e\u04a1\u04a9\u04ab"+
		"\u04b0\u04b7\u04c3\u04ca\u04da\u04e6\u04f2\u04f7\u04fc\u0500\u0507\u051f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}