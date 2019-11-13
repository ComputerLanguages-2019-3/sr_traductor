// Generated from /home/laura-angelica/Documents/UNAL/2019-2/languages/Traductor simple/grammar/SRgrammar.g4 by ANTLR 4.7.2
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
		INT=1, WS=2, TK_SEPARATOR=3, TK_RESOURCE=4, TK_GLOBAL=5, TK_EXTEND=6, 
		TK_IMPORT=7, TK_COMMA=8, TK_VAR=9, TK_CONST=10, TK_LBRACE=11, TK_RBRACE=12, 
		TK_TYPE=13, TK_EQ=14, TK_ASTER=15, TK_ILIT=16, TK_RLIT=17, TK_BLIT=18, 
		TK_CLIT=19, TK_SLIT=20, TK_NLIT=21, TK_FLIT=22, TK_LPAREN=23, TK_RPAREN=24, 
		TK_LBRACKET=25, TK_RBRACKET=26, TK_EXPON=27, TK_DIV=28, TK_REMDR=29, TK_PLUS=30, 
		TK_MINUS=31, TK_CONCAT=32, TK_NE=33, TK_GE=34, TK_LE=35, TK_GT=36, TK_LT=37, 
		TK_AND=38, TK_OR=39, TK_XOR=40, TK_RSHIFT=41, TK_LSHIFT=42, TK_SWAP=43, 
		TK_ASSIGN=44, TK_AUG_PLUS=45, TK_AUG_MINUS=46, TK_AUG_ASTER=47, TK_AUG_DIV=48, 
		TK_AUG_REMDR=49, TK_AUG_EXPON=50, TK_AUG_OR=51, TK_AUG_AND=52, TK_AUG_CONCAT=53, 
		TK_AUG_RSHIFT=54, TK_AUG_LSHIFT=55, TK_RETURNS=56, TK_NEW=57, TK_LOW=58, 
		TK_HIGH=59, TK_COLON=60, TK_VAL=61, TK_RES=62, TK_REF=63, TK_CAP=64, TK_CALL=65, 
		TK_BOGUS=66, TK_PERIOD=67, TK_PROC=68, TK_SEND=69, TK_VM=70, TK_SEM=71, 
		TK_REC=72, TK_ANY=73, TK_INCR=74, TK_DECR=75, TK_QMARK=76, TK_NOT=77, 
		TK_FILE=78, TK_UNION=79, TK_BOOL=80, TK_INT=81, TK_CHAR=82, TK_REAL=83, 
		TK_ENUM=84, TK_STRING=85, TK_PTR=86, TK_ADDR=87, TK_MOD=88, TK_HAT=89, 
		TK_CREATE=90, TK_ON=91, TK_OPTYPE=92, TK_EXTERNAL=93, TK_OP=94, TK_PROCESS=95, 
		TK_PROCEDURE=96, TK_END=97, TK_INITIAL=98, TK_FINAL=99, TK_ID=100, TK_PARALLEL=101, 
		TK_CO=102, TK_OC=103, TK_P=104, TK_RECEIVE=105, TK_SUCHTHAT=106, TK_BY=107, 
		TK_PAREN=108, TK_ARROW=109, TK_SQUARE=110, TK_IN=111, TK_V=112, TK_TO=113, 
		TK_DOWNTO=114, TK_TK_ASSIGN=115, TK_ELSE=116, TK_FA=117, TK_AF=118, TK_DO=119, 
		TK_OD=120, TK_SWAURE=121, TK_IF=122, TK_FI=123, TK_BEGIN=124, TK_DESTROY=125, 
		TK_FORWARD=126, TK_REPLY=127, TK_RETURN=128, TK_NEXT=129, TK_EXIT=130, 
		TK_STOP=131, TK_SKIP=132;
	public static final int
		RULE_combined_component = 0, RULE_separate_body = 1, RULE_spec_body = 2, 
		RULE_combined_specpart = 3, RULE_body_stmt_ls = 4, RULE_end_id = 5, RULE_concurrent_invocation = 6, 
		RULE_separator_opt = 7, RULE_concurrent_cmd = 8, RULE_concurrent_cmd_lp = 9, 
		RULE_concurrent_stmt = 10, RULE_p_stmt = 11, RULE_receive_stmt = 12, RULE_sync_expr_opt = 13, 
		RULE_sched_expr_opt = 14, RULE_return_name_opt = 15, RULE_id_ls = 16, 
		RULE_param_names = 17, RULE_subscripts = 18, RULE_in_op = 19, RULE_in_spec = 20, 
		RULE_quantifiers_opt = 21, RULE_in_cmd = 22, RULE_in_cmd_lp = 23, RULE_in_cmd_lp_aux = 24, 
		RULE_input_stmt = 25, RULE_v_stmt = 26, RULE_such_that_opt = 27, RULE_step_opt = 28, 
		RULE_direction = 29, RULE_quantifier = 30, RULE_quantifier_lp = 31, RULE_else_cmd_opt = 32, 
		RULE_for_all_stmt = 33, RULE_do_stmt = 34, RULE_guarded_cmd = 35, RULE_guarded_cmd_lp = 36, 
		RULE_if_stmt = 37, RULE_block_item = 38, RULE_block_items = 39, RULE_block_items_aux = 40, 
		RULE_block = 41, RULE_begin_end = 42, RULE_destroy_stmt = 43, RULE_explicit_call = 44, 
		RULE_send_stmt = 45, RULE_forward_stmt = 46, RULE_reply_stmt = 47, RULE_return_stmt = 48, 
		RULE_next_stmt = 49, RULE_exit_stmt = 50, RULE_exit_code_opt = 51, RULE_stop_stmt = 52, 
		RULE_skip_stmt = 53, RULE_stmt = 54, RULE_proc = 55, RULE_process = 56, 
		RULE_procedure = 57, RULE_initial_opt = 58, RULE_initial_block = 59, RULE_final_opt = 60, 
		RULE_final_block = 61, RULE_body_only = 62, RULE_import_name = 63, RULE_import_list = 64, 
		RULE_extend_clause = 65, RULE_import_clause = 66, RULE_colon_opt = 67, 
		RULE_oper_def = 68, RULE_oper_def_lp = 69, RULE_op_or_ext = 70, RULE_op_decl = 71, 
		RULE_sem_init = 72, RULE_sem_def = 73, RULE_sem_def_lp = 74, RULE_sem_decl = 75, 
		RULE_eq_opt = 76, RULE_optype_decl = 77, RULE_var_att = 78, RULE_location_opt = 79, 
		RULE_rsrc_name = 80, RULE_create_call = 81, RULE_create_expr = 82, RULE_suffix_expr = 83, 
		RULE_new_item = 84, RULE_subscriṕts_opt = 85, RULE_return_spec_null = 86, 
		RULE_sem_proto = 87, RULE_op_restriction = 88, RULE_op_restriction_opt = 89, 
		RULE_return_spec_opt = 90, RULE_param_kind_opt = 91, RULE_param_spec = 92, 
		RULE_param_spec_lp = 93, RULE_param_spec_ls = 94, RULE_parameters = 95, 
		RULE_prototype = 96, RULE_op_prototype = 97, RULE_qualified_id = 98, RULE_cap_for = 99, 
		RULE_capability_def = 100, RULE_union_def = 101, RULE_field = 102, RULE_field_lp = 103, 
		RULE_record_def = 104, RULE_pointer_def = 105, RULE_id_lp = 106, RULE_enum_def = 107, 
		RULE_string_lim = 108, RULE_string_def = 109, RULE_basic_type = 110, RULE_unsub_type = 111, 
		RULE_type = 112, RULE_paren_expr = 113, RULE_prefix_expr = 114, RULE_binary_expr = 115, 
		RULE_constr_item = 116, RULE_constr_item_lp = 117, RULE_constructor = 118, 
		RULE_expr_lp = 119, RULE_paren_item_ls = 120, RULE_paren_list = 121, RULE_invocation = 122, 
		RULE_literal = 123, RULE_expr = 124, RULE_bounds = 125, RULE_bound_lp = 126, 
		RULE_bracketed_list = 127, RULE_subscriṕts = 128, RULE_id_subs = 129, 
		RULE_id_subs_lp = 130, RULE_var_def = 131, RULE_var_def_lp = 132, RULE_var_or_const = 133, 
		RULE_obj_decl = 134, RULE_type_restriction = 135, RULE_type_decl = 136, 
		RULE_decl = 137, RULE_common_stmt = 138, RULE_spec_stmt = 139, RULE_spec_stmt_ls = 140, 
		RULE_comp_kwd = 141, RULE_comp_label = 142, RULE_spec_component = 143, 
		RULE_component = 144;
	private static String[] makeRuleNames() {
		return new String[] {
			"combined_component", "separate_body", "spec_body", "combined_specpart", 
			"body_stmt_ls", "end_id", "concurrent_invocation", "separator_opt", "concurrent_cmd", 
			"concurrent_cmd_lp", "concurrent_stmt", "p_stmt", "receive_stmt", "sync_expr_opt", 
			"sched_expr_opt", "return_name_opt", "id_ls", "param_names", "subscripts", 
			"in_op", "in_spec", "quantifiers_opt", "in_cmd", "in_cmd_lp", "in_cmd_lp_aux", 
			"input_stmt", "v_stmt", "such_that_opt", "step_opt", "direction", "quantifier", 
			"quantifier_lp", "else_cmd_opt", "for_all_stmt", "do_stmt", "guarded_cmd", 
			"guarded_cmd_lp", "if_stmt", "block_item", "block_items", "block_items_aux", 
			"block", "begin_end", "destroy_stmt", "explicit_call", "send_stmt", "forward_stmt", 
			"reply_stmt", "return_stmt", "next_stmt", "exit_stmt", "exit_code_opt", 
			"stop_stmt", "skip_stmt", "stmt", "proc", "process", "procedure", "initial_opt", 
			"initial_block", "final_opt", "final_block", "body_only", "import_name", 
			"import_list", "extend_clause", "import_clause", "colon_opt", "oper_def", 
			"oper_def_lp", "op_or_ext", "op_decl", "sem_init", "sem_def", "sem_def_lp", 
			"sem_decl", "eq_opt", "optype_decl", "var_att", "location_opt", "rsrc_name", 
			"create_call", "create_expr", "suffix_expr", "new_item", "subscriṕts_opt", 
			"return_spec_null", "sem_proto", "op_restriction", "op_restriction_opt", 
			"return_spec_opt", "param_kind_opt", "param_spec", "param_spec_lp", "param_spec_ls", 
			"parameters", "prototype", "op_prototype", "qualified_id", "cap_for", 
			"capability_def", "union_def", "field", "field_lp", "record_def", "pointer_def", 
			"id_lp", "enum_def", "string_lim", "string_def", "basic_type", "unsub_type", 
			"type", "paren_expr", "prefix_expr", "binary_expr", "constr_item", "constr_item_lp", 
			"constructor", "expr_lp", "paren_item_ls", "paren_list", "invocation", 
			"literal", "expr", "bounds", "bound_lp", "bracketed_list", "subscriṕts", 
			"id_subs", "id_subs_lp", "var_def", "var_def_lp", "var_or_const", "obj_decl", 
			"type_restriction", "type_decl", "decl", "common_stmt", "spec_stmt", 
			"spec_stmt_ls", "comp_kwd", "comp_label", "spec_component", "component"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "'resource'", "'global'", "'extend'", "'import'", 
			"','", "'var'", "'const'", "'{'", "'}'", "'type'", "'='", "'*'", "'int literal'", 
			"'real literal'", "'bool lteral'", "'char literal'", "'string literal'", 
			"'null literal'", "'float literal'", "'('", "')'", "'['", "']'", "'**'", 
			"'/'", "'%'", "'+'", "'-'", "'||'", "'!='", "'>='", "'<='", "'>'", "'<'", 
			"'&'", "'|'", "'xor'", "'>>'", "'<<'", "':=:'", "':='", "'+:='", "'-:='", 
			"'*:='", "'/:='", "'%:='", "'**:='", "'|:='", "'&:='", "'||:='", "'>>:='", 
			"'<<:='", "'returns'", "'new'", "'low'", "'high'", "':'", "'val'", "'res'", 
			"'ref'", "'cap'", "'call'", "'bogus'", "'.'", "'proc'", "'send'", "'vm'", 
			"'sem'", "'rec'", "'any'", "'++'", "'--'", "'?'", "'~'", "'file'", "'union'", 
			"'bool'", "'int'", "'char'", "'real'", "'enum'", "'string'", "'ptr'", 
			"'@'", "'mod'", "'^'", "'create'", "'on'", "'optype'", "'external'", 
			"'op'", "'process'", "'procedure'", "'end'", "'initial'", "'final'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "WS", "TK_SEPARATOR", "TK_RESOURCE", "TK_GLOBAL", "TK_EXTEND", 
			"TK_IMPORT", "TK_COMMA", "TK_VAR", "TK_CONST", "TK_LBRACE", "TK_RBRACE", 
			"TK_TYPE", "TK_EQ", "TK_ASTER", "TK_ILIT", "TK_RLIT", "TK_BLIT", "TK_CLIT", 
			"TK_SLIT", "TK_NLIT", "TK_FLIT", "TK_LPAREN", "TK_RPAREN", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_EXPON", "TK_DIV", "TK_REMDR", "TK_PLUS", "TK_MINUS", 
			"TK_CONCAT", "TK_NE", "TK_GE", "TK_LE", "TK_GT", "TK_LT", "TK_AND", "TK_OR", 
			"TK_XOR", "TK_RSHIFT", "TK_LSHIFT", "TK_SWAP", "TK_ASSIGN", "TK_AUG_PLUS", 
			"TK_AUG_MINUS", "TK_AUG_ASTER", "TK_AUG_DIV", "TK_AUG_REMDR", "TK_AUG_EXPON", 
			"TK_AUG_OR", "TK_AUG_AND", "TK_AUG_CONCAT", "TK_AUG_RSHIFT", "TK_AUG_LSHIFT", 
			"TK_RETURNS", "TK_NEW", "TK_LOW", "TK_HIGH", "TK_COLON", "TK_VAL", "TK_RES", 
			"TK_REF", "TK_CAP", "TK_CALL", "TK_BOGUS", "TK_PERIOD", "TK_PROC", "TK_SEND", 
			"TK_VM", "TK_SEM", "TK_REC", "TK_ANY", "TK_INCR", "TK_DECR", "TK_QMARK", 
			"TK_NOT", "TK_FILE", "TK_UNION", "TK_BOOL", "TK_INT", "TK_CHAR", "TK_REAL", 
			"TK_ENUM", "TK_STRING", "TK_PTR", "TK_ADDR", "TK_MOD", "TK_HAT", "TK_CREATE", 
			"TK_ON", "TK_OPTYPE", "TK_EXTERNAL", "TK_OP", "TK_PROCESS", "TK_PROCEDURE", 
			"TK_END", "TK_INITIAL", "TK_FINAL", "TK_ID", "TK_PARALLEL", "TK_CO", 
			"TK_OC", "TK_P", "TK_RECEIVE", "TK_SUCHTHAT", "TK_BY", "TK_PAREN", "TK_ARROW", 
			"TK_SQUARE", "TK_IN", "TK_V", "TK_TO", "TK_DOWNTO", "TK_TK_ASSIGN", "TK_ELSE", 
			"TK_FA", "TK_AF", "TK_DO", "TK_OD", "TK_SWAURE", "TK_IF", "TK_FI", "TK_BEGIN", 
			"TK_DESTROY", "TK_FORWARD", "TK_REPLY", "TK_RETURN", "TK_NEXT", "TK_EXIT", 
			"TK_STOP", "TK_SKIP"
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
			setState(290);
			combined_specpart();
			setState(291);
			body_stmt_ls();
			setState(292);
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
		enterRule(_localctx, 4, RULE_spec_body);
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

	public static class Combined_specpartContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_combined_specpart);
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

	public static class Body_stmt_lsContext extends ParserRuleContext {
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
		Body_stmt_lsContext _localctx = new Body_stmt_lsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body_stmt_ls);
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

	public static class End_idContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_end_id);
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
		enterRule(_localctx, 12, RULE_concurrent_invocation);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				send_stmt();
				}
				break;
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
				setState(306);
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
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
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
		return separator_opt(0);
	}

	private Separator_optContext separator_opt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Separator_optContext _localctx = new Separator_optContext(_ctx, _parentState);
		Separator_optContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_separator_opt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Separator_optContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_separator_opt);
					setState(310);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(311);
					match(TK_SEPARATOR);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 16, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			quantifiers_opt();
			setState(318);
			separator_opt(0);
			setState(319);
			concurrent_invocation();
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(322);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Concurrent_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concurrent_cmd_lp);
					setState(324);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(325);
					match(TK_PARALLEL);
					setState(326);
					concurrent_cmd();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 20, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(TK_CO);
			setState(333);
			concurrent_cmd_lp(0);
			setState(334);
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
		enterRule(_localctx, 22, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(TK_P);
			setState(337);
			match(TK_LPAREN);
			setState(338);
			expr(0);
			setState(339);
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
		enterRule(_localctx, 24, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(TK_RECEIVE);
			setState(342);
			expr(0);
			setState(343);
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
		enterRule(_localctx, 26, RULE_sync_expr_opt);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(TK_AND);
				setState(346);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(TK_SUCHTHAT);
				setState(348);
				expr(0);
				}
				break;
			case TK_BY:
			case TK_ARROW:
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
		enterRule(_localctx, 28, RULE_sched_expr_opt);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(TK_BY);
				setState(353);
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
		enterRule(_localctx, 30, RULE_return_name_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(TK_RETURNS);
			setState(358);
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
		enterRule(_localctx, 32, RULE_id_ls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			id_lp(0);
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
		enterRule(_localctx, 34, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(TK_LPAREN);
			setState(363);
			id_ls();
			setState(364);
			match(TK_RPAREN);
			setState(365);
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
		public SubscriṕtsContext subscriṕts() {
			return getRuleContext(SubscriṕtsContext.class,0);
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
		enterRule(_localctx, 36, RULE_subscripts);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				bracketed_list();
				setState(369);
				subscriṕts();
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
		enterRule(_localctx, 38, RULE_in_op);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				qualified_id();
				setState(375);
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
		enterRule(_localctx, 40, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			in_op();
			setState(380);
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
		public TerminalNode TK_PAREN() { return getToken(SRgrammarParser.TK_PAREN, 0); }
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
		enterRule(_localctx, 42, RULE_quantifiers_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(TK_LPAREN);
			setState(383);
			quantifier_lp(0);
			setState(384);
			match(TK_PAREN);
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
		enterRule(_localctx, 44, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			quantifiers_opt();
			setState(387);
			in_spec();
			setState(388);
			sync_expr_opt();
			setState(389);
			sched_expr_opt();
			setState(390);
			match(TK_ARROW);
			setState(391);
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
		enterRule(_localctx, 46, RULE_in_cmd_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 48, RULE_in_cmd_lp_aux);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(TK_SQUARE);
				setState(396);
				in_cmd();
				setState(397);
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
		public List<TerminalNode> TK_IN() { return getTokens(SRgrammarParser.TK_IN); }
		public TerminalNode TK_IN(int i) {
			return getToken(SRgrammarParser.TK_IN, i);
		}
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_IN);
			setState(403);
			in_cmd_lp();
			setState(404);
			else_cmd_opt();
			setState(405);
			match(TK_IN);
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
		enterRule(_localctx, 52, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(TK_V);
			setState(408);
			match(TK_LPAREN);
			setState(409);
			expr(0);
			setState(410);
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
		enterRule(_localctx, 54, RULE_such_that_opt);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(TK_SUCHTHAT);
				setState(413);
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
		enterRule(_localctx, 56, RULE_step_opt);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(TK_BY);
				setState(418);
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
		enterRule(_localctx, 58, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode TK_TK_ASSIGN() { return getToken(SRgrammarParser.TK_TK_ASSIGN, 0); }
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
		enterRule(_localctx, 60, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TK_ID);
			setState(425);
			match(TK_TK_ASSIGN);
			setState(426);
			expr(0);
			setState(427);
			direction();
			setState(428);
			expr(0);
			setState(429);
			step_opt();
			setState(430);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_quantifier_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Quantifier_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_quantifier_lp);
					setState(435);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(436);
					match(TK_COMMA);
					setState(437);
					quantifier();
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 64, RULE_else_cmd_opt);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(TK_SQUARE);
				setState(444);
				match(TK_ELSE);
				setState(445);
				match(TK_ARROW);
				setState(446);
				block();
				}
				break;
			case TK_IN:
			case TK_OD:
			case TK_FI:
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
		enterRule(_localctx, 66, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(TK_FA);
			setState(451);
			quantifier_lp(0);
			setState(452);
			match(TK_ARROW);
			setState(453);
			block();
			setState(454);
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
		enterRule(_localctx, 68, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(TK_DO);
			setState(457);
			guarded_cmd_lp(0);
			setState(458);
			else_cmd_opt();
			setState(459);
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
		enterRule(_localctx, 70, RULE_guarded_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			expr(0);
			setState(462);
			match(TK_ARROW);
			setState(463);
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
		public TerminalNode TK_SWAURE() { return getToken(SRgrammarParser.TK_SWAURE, 0); }
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_cmd_lp);
					setState(468);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(469);
					match(TK_SWAURE);
					setState(470);
					guarded_cmd();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 74, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(TK_IF);
			setState(477);
			guarded_cmd_lp(0);
			setState(478);
			else_cmd_opt();
			setState(479);
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
		enterRule(_localctx, 76, RULE_block_item);
		try {
			setState(485);
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
				setState(481);
				decl();
				}
				break;
			case TK_CALL:
			case TK_SEND:
			case TK_CO:
			case TK_P:
			case TK_RECEIVE:
			case TK_IN:
			case TK_V:
			case TK_FA:
			case TK_DO:
			case TK_IF:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				stmt();
				}
				break;
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
				setState(483);
				expr(0);
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
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
		enterRule(_localctx, 78, RULE_block_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		enterRule(_localctx, 80, RULE_block_items_aux);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(TK_SEPARATOR);
				setState(490);
				block_item();
				setState(491);
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
		enterRule(_localctx, 82, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 84, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(TK_BEGIN);
			setState(499);
			block();
			setState(500);
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
		enterRule(_localctx, 86, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(TK_DESTROY);
			setState(503);
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
		enterRule(_localctx, 88, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(TK_CALL);
			setState(506);
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
		enterRule(_localctx, 90, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(TK_SEND);
			setState(509);
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
		enterRule(_localctx, 92, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(TK_FORWARD);
			setState(512);
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
		enterRule(_localctx, 94, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 96, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 98, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 100, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 102, RULE_exit_code_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(TK_LPAREN);
			setState(523);
			expr(0);
			setState(524);
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
		enterRule(_localctx, 104, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(TK_STOP);
			setState(527);
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
		enterRule(_localctx, 106, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
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
		enterRule(_localctx, 108, RULE_stmt);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				reply_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 8);
				{
				setState(538);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(539);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 10);
				{
				setState(540);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(541);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(542);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 13);
				{
				setState(543);
				do_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 14);
				{
				setState(544);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 15);
				{
				setState(545);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 16);
				{
				setState(546);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 17);
				{
				setState(547);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 18);
				{
				setState(548);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 19);
				{
				setState(549);
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
		enterRule(_localctx, 110, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(TK_PROC);
			setState(553);
			match(TK_ID);
			setState(554);
			param_names();
			setState(555);
			block();
			setState(556);
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
		enterRule(_localctx, 112, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(TK_PROCESS);
			setState(559);
			match(TK_ID);
			setState(560);
			return_spec_null();
			setState(561);
			quantifiers_opt();
			setState(562);
			block();
			setState(563);
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
		enterRule(_localctx, 114, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(TK_PROCEDURE);
			setState(566);
			match(TK_ID);
			setState(567);
			prototype();
			setState(568);
			block();
			setState(569);
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
		enterRule(_localctx, 116, RULE_initial_opt);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
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
		enterRule(_localctx, 118, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(TK_INITIAL);
			setState(576);
			block();
			setState(577);
			match(TK_END);
			setState(578);
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
		enterRule(_localctx, 120, RULE_final_opt);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
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
		enterRule(_localctx, 122, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(TK_FINAL);
			setState(585);
			block();
			setState(586);
			match(TK_END);
			setState(587);
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
		enterRule(_localctx, 124, RULE_body_only);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
			case TK_SEND:
			case TK_CO:
			case TK_P:
			case TK_RECEIVE:
			case TK_IN:
			case TK_V:
			case TK_FA:
			case TK_DO:
			case TK_IF:
			case TK_BEGIN:
			case TK_DESTROY:
			case TK_FORWARD:
			case TK_REPLY:
			case TK_RETURN:
			case TK_NEXT:
			case TK_EXIT:
			case TK_STOP:
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(594);
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
		enterRule(_localctx, 126, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(600);
			import_name();
			}
			_ctx.stop = _input.LT(-1);
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(602);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(603);
					match(TK_COMMA);
					setState(604);
					import_name();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 130, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(TK_EXTEND);
			setState(611);
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
		enterRule(_localctx, 132, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(TK_IMPORT);
			setState(614);
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
		enterRule(_localctx, 134, RULE_colon_opt);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
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
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_oper_def);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				id_subs_lp(0);
				setState(621);
				op_prototype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				id_subs_lp(0);
				setState(624);
				colon_opt();
				setState(625);
				qualified_id();
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

	public static class Oper_def_lpContext extends ParserRuleContext {
		public Oper_defContext oper_def() {
			return getRuleContext(Oper_defContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
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
		return oper_def_lp(0);
	}

	private Oper_def_lpContext oper_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oper_def_lpContext _localctx = new Oper_def_lpContext(_ctx, _parentState);
		Oper_def_lpContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_oper_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(630);
			oper_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oper_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper_def_lp);
					setState(632);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(633);
					match(TK_COMMA);
					setState(634);
					oper_def();
					}
					} 
				}
				setState(639);
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
		enterRule(_localctx, 140, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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
		enterRule(_localctx, 142, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			op_or_ext();
			setState(643);
			oper_def_lp(0);
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
		enterRule(_localctx, 144, RULE_sem_init);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(TK_ASSIGN);
				setState(646);
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
		enterRule(_localctx, 146, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			id_subs();
			setState(651);
			sem_proto();
			setState(652);
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
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(655);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sem_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sem_def_lp);
					setState(657);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(658);
					match(TK_COMMA);
					setState(659);
					sem_def();
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 150, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(TK_SEM);
			setState(666);
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
		enterRule(_localctx, 152, RULE_eq_opt);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
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
		enterRule(_localctx, 154, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(TK_OPTYPE);
			setState(673);
			match(TK_ID);
			setState(674);
			eq_opt();
			setState(675);
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
		enterRule(_localctx, 156, RULE_var_att);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(TK_COLON);
				setState(678);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(TK_COLON);
				setState(680);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				match(TK_COLON);
				setState(682);
				type();
				setState(683);
				match(TK_ASSIGN);
				setState(684);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				match(TK_ASSIGN);
				setState(687);
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
		enterRule(_localctx, 158, RULE_location_opt);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(TK_ON);
				setState(691);
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
		enterRule(_localctx, 160, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 162, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			rsrc_name();
			setState(698);
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
		enterRule(_localctx, 164, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(TK_CREATE);
			setState(701);
			create_call();
			setState(702);
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
		public List<TerminalNode> TK_LBRACKET() { return getTokens(SRgrammarParser.TK_LBRACKET); }
		public TerminalNode TK_LBRACKET(int i) {
			return getToken(SRgrammarParser.TK_LBRACKET, i);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
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
		enterRule(_localctx, 166, RULE_suffix_expr);
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(TK_INCR);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(TK_DECR);
				}
				break;
			case TK_HAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(TK_HAT);
				}
				break;
			case TK_PERIOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				match(TK_PERIOD);
				setState(708);
				match(TK_ID);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				match(TK_LBRACKET);
				setState(710);
				bound_lp(0);
				setState(711);
				match(TK_LBRACKET);
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
		enterRule(_localctx, 168, RULE_new_item);
		try {
			setState(720);
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
				setState(715);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(TK_SEM);
				setState(717);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				match(TK_OP);
				setState(719);
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

	public static class Subscriṕts_optContext extends ParserRuleContext {
		public SubscriṕtsContext subscriṕts() {
			return getRuleContext(SubscriṕtsContext.class,0);
		}
		public Subscriṕts_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriṕts_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSubscriṕts_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSubscriṕts_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSubscriṕts_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscriṕts_optContext subscriṕts_opt() throws RecognitionException {
		Subscriṕts_optContext _localctx = new Subscriṕts_optContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_subscriṕts_opt);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				subscriṕts();
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
		enterRule(_localctx, 172, RULE_return_spec_null);
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
		enterRule(_localctx, 174, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		enterRule(_localctx, 176, RULE_op_restriction);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(TK_CALL);
				setState(733);
				match(TK_COMMA);
				setState(734);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(735);
				match(TK_SEND);
				setState(736);
				match(TK_COMMA);
				setState(737);
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
		enterRule(_localctx, 178, RULE_op_restriction_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(TK_LBRACE);
			setState(741);
			op_restriction();
			setState(742);
			match(TK_RBRACE);
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
		enterRule(_localctx, 180, RULE_return_spec_opt);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(TK_RETURNS);
				setState(745);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(TK_RETURNS);
				setState(747);
				id_subs();
				setState(748);
				match(TK_COLON);
				setState(749);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				match(TK_RETURNS);
				setState(752);
				match(TK_ID);
				setState(753);
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
		enterRule(_localctx, 182, RULE_param_kind_opt);
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
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
		enterRule(_localctx, 184, RULE_param_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			param_kind_opt();
			setState(764);
			type();
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
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
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
		enterRule(_localctx, 186, RULE_param_spec_lp);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				param_spec();
				setState(768);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				param_spec();
				setState(771);
				match(TK_SEPARATOR);
				setState(772);
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
		Param_spec_lsContext _localctx = new Param_spec_lsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_param_spec_ls);
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAR:
			case TK_LBRACKET:
			case TK_VAL:
			case TK_RES:
			case TK_REF:
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
				setState(776);
				param_spec_lp();
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
		enterRule(_localctx, 190, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(TK_LPAREN);
			setState(781);
			param_spec_ls();
			setState(782);
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
		enterRule(_localctx, 192, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			parameters();
			setState(785);
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
		enterRule(_localctx, 194, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			prototype();
			setState(788);
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
		enterRule(_localctx, 196, RULE_qualified_id);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				match(TK_ID);
				setState(792);
				match(TK_PERIOD);
				setState(793);
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
		enterRule(_localctx, 198, RULE_cap_for);
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(TK_SEM);
				setState(799);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(800);
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
		enterRule(_localctx, 200, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(TK_CAP);
			setState(804);
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
		enterRule(_localctx, 202, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(TK_UNION);
			setState(807);
			match(TK_LPAREN);
			setState(808);
			field_lp();
			setState(809);
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
		enterRule(_localctx, 204, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
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
		enterRule(_localctx, 206, RULE_field_lp);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				field();
				setState(815);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				field();
				setState(818);
				match(TK_SEPARATOR);
				setState(819);
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
		enterRule(_localctx, 208, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(TK_REC);
			setState(824);
			match(TK_LPAREN);
			setState(825);
			field_lp();
			setState(826);
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
		enterRule(_localctx, 210, RULE_pointer_def);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(TK_PTR);
				setState(829);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(TK_PTR);
				setState(831);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(835);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(837);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(838);
					match(TK_COMMA);
					setState(839);
					match(TK_ID);
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 214, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(TK_ENUM);
			setState(846);
			match(TK_LPAREN);
			setState(847);
			id_lp(0);
			setState(848);
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
		enterRule(_localctx, 216, RULE_string_lim);
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(850);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
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
		enterRule(_localctx, 218, RULE_string_def);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(TK_STRING);
				setState(855);
				match(TK_LBRACKET);
				setState(856);
				string_lim();
				setState(857);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				match(TK_STRING);
				setState(860);
				match(TK_LPAREN);
				setState(861);
				string_lim();
				setState(862);
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
		enterRule(_localctx, 220, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (TK_FILE - 78)) | (1L << (TK_BOOL - 78)) | (1L << (TK_INT - 78)) | (1L << (TK_CHAR - 78)) | (1L << (TK_REAL - 78)))) != 0)) ) {
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
		enterRule(_localctx, 222, RULE_unsub_type);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FILE:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(875);
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
		public SubscriṕtsContext subscriṕts() {
			return getRuleContext(SubscriṕtsContext.class,0);
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
		enterRule(_localctx, 224, RULE_type);
		try {
			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				subscriṕts();
				setState(879);
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
				setState(881);
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
		enterRule(_localctx, 226, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(TK_LPAREN);
			setState(885);
			expr(0);
			setState(886);
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
		public Subscriṕts_optContext subscriṕts_opt() {
			return getRuleContext(Subscriṕts_optContext.class,0);
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
		enterRule(_localctx, 228, RULE_prefix_expr);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(TK_NOT);
				setState(889);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(TK_PLUS);
				setState(891);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				match(TK_MINUS);
				setState(893);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				match(TK_ADDR);
				setState(895);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(TK_QMARK);
				setState(897);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(898);
				match(TK_INCR);
				setState(899);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(900);
				match(TK_DECR);
				setState(901);
				expr(0);
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(902);
				match(TK_STRING);
				setState(903);
				paren_expr();
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 9);
				{
				setState(904);
				match(TK_LOW);
				setState(905);
				match(TK_LPAREN);
				setState(906);
				type();
				setState(907);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 10);
				{
				setState(909);
				match(TK_HIGH);
				setState(910);
				match(TK_LPAREN);
				setState(911);
				type();
				setState(912);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 11);
				{
				setState(914);
				match(TK_NEW);
				setState(915);
				match(TK_LPAREN);
				setState(916);
				subscriṕts_opt();
				setState(917);
				new_item();
				setState(918);
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
		enterRule(_localctx, 230, RULE_binary_expr);
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EXPON:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				match(TK_EXPON);
				setState(923);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(TK_ASTER);
				setState(925);
				expr(0);
				}
				break;
			case TK_DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(TK_DIV);
				setState(927);
				expr(0);
				}
				break;
			case TK_MOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				match(TK_MOD);
				setState(929);
				expr(0);
				}
				break;
			case TK_REMDR:
				enterOuterAlt(_localctx, 5);
				{
				setState(930);
				match(TK_REMDR);
				setState(931);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(932);
				match(TK_PLUS);
				setState(933);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 7);
				{
				setState(934);
				match(TK_MINUS);
				setState(935);
				expr(0);
				}
				break;
			case TK_CONCAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(936);
				match(TK_CONCAT);
				setState(937);
				expr(0);
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(938);
				match(TK_EQ);
				setState(939);
				expr(0);
				}
				break;
			case TK_NE:
				enterOuterAlt(_localctx, 10);
				{
				setState(940);
				match(TK_NE);
				setState(941);
				expr(0);
				}
				break;
			case TK_GE:
				enterOuterAlt(_localctx, 11);
				{
				setState(942);
				match(TK_GE);
				setState(943);
				expr(0);
				}
				break;
			case TK_LE:
				enterOuterAlt(_localctx, 12);
				{
				setState(944);
				match(TK_LE);
				setState(945);
				expr(0);
				}
				break;
			case TK_GT:
				enterOuterAlt(_localctx, 13);
				{
				setState(946);
				match(TK_GT);
				setState(947);
				expr(0);
				}
				break;
			case TK_LT:
				enterOuterAlt(_localctx, 14);
				{
				setState(948);
				match(TK_LT);
				setState(949);
				expr(0);
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 15);
				{
				setState(950);
				match(TK_AND);
				setState(951);
				expr(0);
				}
				break;
			case TK_OR:
				enterOuterAlt(_localctx, 16);
				{
				setState(952);
				match(TK_OR);
				setState(953);
				expr(0);
				}
				break;
			case TK_XOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(954);
				match(TK_XOR);
				setState(955);
				expr(0);
				}
				break;
			case TK_RSHIFT:
				enterOuterAlt(_localctx, 18);
				{
				setState(956);
				match(TK_RSHIFT);
				setState(957);
				expr(0);
				}
				break;
			case TK_LSHIFT:
				enterOuterAlt(_localctx, 19);
				{
				setState(958);
				match(TK_LSHIFT);
				setState(959);
				expr(0);
				}
				break;
			case TK_SWAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(960);
				match(TK_SWAP);
				setState(961);
				expr(0);
				}
				break;
			case TK_ASSIGN:
				enterOuterAlt(_localctx, 21);
				{
				setState(962);
				match(TK_ASSIGN);
				setState(963);
				expr(0);
				}
				break;
			case TK_AUG_PLUS:
				enterOuterAlt(_localctx, 22);
				{
				setState(964);
				match(TK_AUG_PLUS);
				setState(965);
				expr(0);
				}
				break;
			case TK_AUG_MINUS:
				enterOuterAlt(_localctx, 23);
				{
				setState(966);
				match(TK_AUG_MINUS);
				setState(967);
				expr(0);
				}
				break;
			case TK_AUG_ASTER:
				enterOuterAlt(_localctx, 24);
				{
				setState(968);
				match(TK_AUG_ASTER);
				setState(969);
				expr(0);
				}
				break;
			case TK_AUG_DIV:
				enterOuterAlt(_localctx, 25);
				{
				setState(970);
				match(TK_AUG_DIV);
				setState(971);
				expr(0);
				}
				break;
			case TK_AUG_REMDR:
				enterOuterAlt(_localctx, 26);
				{
				setState(972);
				match(TK_AUG_REMDR);
				setState(973);
				expr(0);
				}
				break;
			case TK_AUG_EXPON:
				enterOuterAlt(_localctx, 27);
				{
				setState(974);
				match(TK_AUG_EXPON);
				setState(975);
				expr(0);
				}
				break;
			case TK_AUG_OR:
				enterOuterAlt(_localctx, 28);
				{
				setState(976);
				match(TK_AUG_OR);
				setState(977);
				expr(0);
				}
				break;
			case TK_AUG_AND:
				enterOuterAlt(_localctx, 29);
				{
				setState(978);
				match(TK_AUG_AND);
				setState(979);
				expr(0);
				}
				break;
			case TK_AUG_CONCAT:
				enterOuterAlt(_localctx, 30);
				{
				setState(980);
				match(TK_AUG_CONCAT);
				setState(981);
				expr(0);
				}
				break;
			case TK_AUG_RSHIFT:
				enterOuterAlt(_localctx, 31);
				{
				setState(982);
				match(TK_AUG_RSHIFT);
				setState(983);
				expr(0);
				}
				break;
			case TK_AUG_LSHIFT:
				enterOuterAlt(_localctx, 32);
				{
				setState(984);
				match(TK_AUG_LSHIFT);
				setState(985);
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
		enterRule(_localctx, 232, RULE_constr_item);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(988);
				expr(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(TK_LBRACKET);
				setState(990);
				expr(0);
				setState(991);
				match(TK_RBRACKET);
				setState(992);
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(997);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constr_item_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constr_item_lp);
					setState(999);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1000);
					match(TK_COMMA);
					setState(1001);
					constr_item();
					}
					} 
				}
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 236, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(TK_LPAREN);
			setState(1008);
			constr_item_lp(0);
			setState(1009);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1012);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lp);
					setState(1014);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1015);
					match(TK_COMMA);
					setState(1016);
					expr(0);
					}
					} 
				}
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 240, RULE_paren_item_ls);
		try {
			setState(1024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(1022);
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
		enterRule(_localctx, 242, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(TK_LPAREN);
			setState(1027);
			paren_item_ls();
			setState(1028);
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
		enterRule(_localctx, 244, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		enterRule(_localctx, 246, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				{
				setState(1035);
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
				setState(1036);
				literal();
				}
				break;
			case TK_LPAREN:
				{
				setState(1037);
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
				setState(1038);
				prefix_expr();
				}
				break;
			case TK_CREATE:
				{
				setState(1039);
				create_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1048);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1042);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1043);
						invocation();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1044);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1045);
						binary_expr();
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1046);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1047);
						suffix_expr();
						}
						break;
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 250, RULE_bounds);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(1053);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
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

	public static class Bound_lpContext extends ParserRuleContext {
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
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
		return bound_lp(0);
	}

	private Bound_lpContext bound_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bound_lpContext _localctx = new Bound_lpContext(_ctx, _parentState);
		Bound_lpContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1058);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(1065);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bound_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bound_lp);
					setState(1060);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1061);
					match(TK_COMMA);
					setState(1062);
					bounds();
					}
					} 
				}
				setState(1067);
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
		enterRule(_localctx, 254, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(TK_LBRACKET);
			setState(1069);
			bound_lp(0);
			setState(1070);
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

	public static class SubscriṕtsContext extends ParserRuleContext {
		public Bracketed_listContext bracketed_list() {
			return getRuleContext(Bracketed_listContext.class,0);
		}
		public SubscriṕtsContext subscriṕts() {
			return getRuleContext(SubscriṕtsContext.class,0);
		}
		public SubscriṕtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriṕts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).enterSubscriṕts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRgrammarListener ) ((SRgrammarListener)listener).exitSubscriṕts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRgrammarVisitor ) return ((SRgrammarVisitor<? extends T>)visitor).visitSubscriṕts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriṕtsContext subscriṕts() throws RecognitionException {
		SubscriṕtsContext _localctx = new SubscriṕtsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_subscriṕts);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				bracketed_list();
				setState(1074);
				subscriṕts();
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

	public static class Id_subsContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRgrammarParser.TK_ID, 0); }
		public SubscriṕtsContext subscriṕts() {
			return getRuleContext(SubscriṕtsContext.class,0);
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
		enterRule(_localctx, 258, RULE_id_subs);
		try {
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				match(TK_ID);
				setState(1080);
				subscriṕts();
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

	public static class Id_subs_lpContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRgrammarParser.TK_COMMA, 0); }
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
		return id_subs_lp(0);
	}

	private Id_subs_lpContext id_subs_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, _parentState);
		Id_subs_lpContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1084);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(1086);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1087);
					match(TK_COMMA);
					setState(1088);
					id_subs();
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 262, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			id_subs_lp(0);
			setState(1095);
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
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1098);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(1100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1101);
					match(TK_COMMA);
					setState(1102);
					var_def();
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 266, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
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
		enterRule(_localctx, 268, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			var_or_const();
			setState(1111);
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
		enterRule(_localctx, 270, RULE_type_restriction);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(TK_LBRACE);
				setState(1114);
				match(TK_ID);
				setState(1115);
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
		enterRule(_localctx, 272, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(TK_TYPE);
			setState(1120);
			match(TK_ID);
			setState(1121);
			match(TK_EQ);
			setState(1122);
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
		enterRule(_localctx, 274, RULE_decl);
		try {
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				obj_decl();
				}
				break;
			case TK_OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				optype_decl();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
				sem_decl();
				}
				break;
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1128);
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
		enterRule(_localctx, 276, RULE_common_stmt);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
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
		enterRule(_localctx, 278, RULE_spec_stmt);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				extend_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				body_only();
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

	public static class Spec_stmt_lsContext extends ParserRuleContext {
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
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
		return spec_stmt_ls(0);
	}

	private Spec_stmt_lsContext spec_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Spec_stmt_lsContext _localctx = new Spec_stmt_lsContext(_ctx, _parentState);
		Spec_stmt_lsContext _prevctx = _localctx;
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_spec_stmt_ls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1142);
			spec_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
					setState(1144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1145);
					match(TK_SEPARATOR);
					setState(1146);
					spec_stmt();
					}
					} 
				}
				setState(1151);
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
		enterRule(_localctx, 282, RULE_comp_kwd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
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
		enterRule(_localctx, 284, RULE_comp_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			comp_kwd();
			setState(1155);
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
		enterRule(_localctx, 286, RULE_spec_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			comp_label();
			setState(1158);
			spec_stmt_ls(0);
			setState(1159);
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
		public TerminalNode TK_SEPARATOR() { return getToken(SRgrammarParser.TK_SEPARATOR, 0); }
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
		enterRule(_localctx, 288, RULE_component);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				spec_component();
				setState(1162);
				match(TK_SEPARATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				combined_component();
				setState(1165);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				separate_body();
				setState(1168);
				match(TK_SEPARATOR);
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
			return separator_opt_sempred((Separator_optContext)_localctx, predIndex);
		case 9:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 31:
			return quantifier_lp_sempred((Quantifier_lpContext)_localctx, predIndex);
		case 36:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 64:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 69:
			return oper_def_lp_sempred((Oper_def_lpContext)_localctx, predIndex);
		case 74:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 106:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 117:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 119:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 124:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 126:
			return bound_lp_sempred((Bound_lpContext)_localctx, predIndex);
		case 130:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 132:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 140:
			return spec_stmt_ls_sempred((Spec_stmt_lsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean separator_opt_sempred(Separator_optContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
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
	private boolean oper_def_lp_sempred(Oper_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sem_def_lp_sempred(Sem_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
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
	private boolean bound_lp_sempred(Bound_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean var_def_lp_sempred(Var_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean spec_stmt_ls_sempred(Spec_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0086\u0497\4\2\t"+
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
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5"+
		"\b\u0136\n\b\3\t\3\t\3\t\7\t\u013b\n\t\f\t\16\t\u013e\13\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u014a\n\13\f\13\16\13\u014d\13"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0161\n\17\3\20\3\20\3\20\5\20\u0166\n\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0176"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u017c\n\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0193\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\5\35\u01a2\n\35\3\36\3\36\3\36\5\36\u01a7\n\36\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01b9\n!\f!\16!\u01bc"+
		"\13!\3\"\3\"\3\"\3\"\3\"\5\"\u01c3\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\7&\u01da\n&\f&\16&\u01dd\13&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\5(\u01e8\n(\3)\3)\3*\3*\3*\3*\3*\5*\u01f1\n*\3"+
		"+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0229"+
		"\n8\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\5<"+
		"\u0240\n<\3=\3=\3=\3=\3=\3>\3>\5>\u0249\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\5@\u0256\n@\3A\3A\3B\3B\3B\3B\3B\3B\7B\u0260\nB\fB\16B\u0263\13"+
		"B\3C\3C\3C\3D\3D\3D\3E\3E\5E\u026d\nE\3F\3F\3F\3F\3F\3F\3F\5F\u0276\n"+
		"F\3G\3G\3G\3G\3G\3G\7G\u027e\nG\fG\16G\u0281\13G\3H\3H\3I\3I\3I\3J\3J"+
		"\3J\5J\u028b\nJ\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\7L\u0297\nL\fL\16L\u029a"+
		"\13L\3M\3M\3M\3N\3N\5N\u02a1\nN\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\5P\u02b3\nP\3Q\3Q\3Q\5Q\u02b8\nQ\3R\3R\3S\3S\3S\3T\3T\3T\3"+
		"T\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u02cc\nU\3V\3V\3V\3V\3V\5V\u02d3\nV\3"+
		"W\3W\5W\u02d7\nW\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u02e5\nZ\3[\3"+
		"[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u02f5\n\\\3]\3]\3"+
		"]\3]\3]\5]\u02fc\n]\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0309\n_\3`\3"+
		"`\5`\u030d\n`\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3d\5d\u031d\nd\3"+
		"e\3e\3e\3e\3e\5e\u0324\ne\3f\3f\3f\3g\3g\3g\3g\3g\3h\3h\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\5i\u0338\ni\3j\3j\3j\3j\3j\3k\3k\3k\3k\5k\u0343\nk\3l\3l\3"+
		"l\3l\3l\3l\7l\u034b\nl\fl\16l\u034e\13l\3m\3m\3m\3m\3m\3n\3n\5n\u0357"+
		"\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0363\no\3p\3p\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\5q\u036f\nq\3r\3r\3r\3r\5r\u0375\nr\3s\3s\3s\3s\3t\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\5t\u039b\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u"+
		"\3u\3u\3u\5u\u03dd\nu\3v\3v\3v\3v\3v\3v\5v\u03e5\nv\3w\3w\3w\3w\3w\3w"+
		"\7w\u03ed\nw\fw\16w\u03f0\13w\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\7y\u03fc\n"+
		"y\fy\16y\u03ff\13y\3z\3z\5z\u0403\nz\3{\3{\3{\3{\3|\3|\3}\3}\3~\3~\3~"+
		"\3~\3~\3~\5~\u0413\n~\3~\3~\3~\3~\3~\3~\7~\u041b\n~\f~\16~\u041e\13~\3"+
		"\177\3\177\5\177\u0422\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\7\u0080\u042a\n\u0080\f\u0080\16\u0080\u042d\13\u0080\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0437\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u043c\n\u0083\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0444\n\u0084\f\u0084\16\u0084"+
		"\u0447\13\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\7\u0086\u0452\n\u0086\f\u0086\16\u0086\u0455\13\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0460\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u046c\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0471\n\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0476\n"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u047e\n"+
		"\u008e\f\u008e\16\u008e\u0481\13\u008e\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0495\n\u0092\3\u0092"+
		"\2\21\20\24@J\u0082\u008c\u0096\u00d6\u00ec\u00f0\u00fa\u00fe\u0106\u010a"+
		"\u011a\u0093\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\2\t\3\2st\3\2_`\4\2HHff\4\2PPRU\3\2\22"+
		"\30\3\2\13\f\3\2\6\7\2\u04a7\2\u0124\3\2\2\2\4\u0128\3\2\2\2\6\u012a\3"+
		"\2\2\2\b\u012c\3\2\2\2\n\u012e\3\2\2\2\f\u0130\3\2\2\2\16\u0135\3\2\2"+
		"\2\20\u0137\3\2\2\2\22\u013f\3\2\2\2\24\u0143\3\2\2\2\26\u014e\3\2\2\2"+
		"\30\u0152\3\2\2\2\32\u0157\3\2\2\2\34\u0160\3\2\2\2\36\u0165\3\2\2\2 "+
		"\u0167\3\2\2\2\"\u016a\3\2\2\2$\u016c\3\2\2\2&\u0175\3\2\2\2(\u017b\3"+
		"\2\2\2*\u017d\3\2\2\2,\u0180\3\2\2\2.\u0184\3\2\2\2\60\u018b\3\2\2\2\62"+
		"\u0192\3\2\2\2\64\u0194\3\2\2\2\66\u0199\3\2\2\28\u01a1\3\2\2\2:\u01a6"+
		"\3\2\2\2<\u01a8\3\2\2\2>\u01aa\3\2\2\2@\u01b2\3\2\2\2B\u01c2\3\2\2\2D"+
		"\u01c4\3\2\2\2F\u01ca\3\2\2\2H\u01cf\3\2\2\2J\u01d3\3\2\2\2L\u01de\3\2"+
		"\2\2N\u01e7\3\2\2\2P\u01e9\3\2\2\2R\u01f0\3\2\2\2T\u01f2\3\2\2\2V\u01f4"+
		"\3\2\2\2X\u01f8\3\2\2\2Z\u01fb\3\2\2\2\\\u01fe\3\2\2\2^\u0201\3\2\2\2"+
		"`\u0204\3\2\2\2b\u0206\3\2\2\2d\u0208\3\2\2\2f\u020a\3\2\2\2h\u020c\3"+
		"\2\2\2j\u0210\3\2\2\2l\u0213\3\2\2\2n\u0228\3\2\2\2p\u022a\3\2\2\2r\u0230"+
		"\3\2\2\2t\u0237\3\2\2\2v\u023f\3\2\2\2x\u0241\3\2\2\2z\u0248\3\2\2\2|"+
		"\u024a\3\2\2\2~\u0255\3\2\2\2\u0080\u0257\3\2\2\2\u0082\u0259\3\2\2\2"+
		"\u0084\u0264\3\2\2\2\u0086\u0267\3\2\2\2\u0088\u026c\3\2\2\2\u008a\u0275"+
		"\3\2\2\2\u008c\u0277\3\2\2\2\u008e\u0282\3\2\2\2\u0090\u0284\3\2\2\2\u0092"+
		"\u028a\3\2\2\2\u0094\u028c\3\2\2\2\u0096\u0290\3\2\2\2\u0098\u029b\3\2"+
		"\2\2\u009a\u02a0\3\2\2\2\u009c\u02a2\3\2\2\2\u009e\u02b2\3\2\2\2\u00a0"+
		"\u02b7\3\2\2\2\u00a2\u02b9\3\2\2\2\u00a4\u02bb\3\2\2\2\u00a6\u02be\3\2"+
		"\2\2\u00a8\u02cb\3\2\2\2\u00aa\u02d2\3\2\2\2\u00ac\u02d6\3\2\2\2\u00ae"+
		"\u02d8\3\2\2\2\u00b0\u02da\3\2\2\2\u00b2\u02e4\3\2\2\2\u00b4\u02e6\3\2"+
		"\2\2\u00b6\u02f4\3\2\2\2\u00b8\u02fb\3\2\2\2\u00ba\u02fd\3\2\2\2\u00bc"+
		"\u0308\3\2\2\2\u00be\u030c\3\2\2\2\u00c0\u030e\3\2\2\2\u00c2\u0312\3\2"+
		"\2\2\u00c4\u0315\3\2\2\2\u00c6\u031c\3\2\2\2\u00c8\u0323\3\2\2\2\u00ca"+
		"\u0325\3\2\2\2\u00cc\u0328\3\2\2\2\u00ce\u032d\3\2\2\2\u00d0\u0337\3\2"+
		"\2\2\u00d2\u0339\3\2\2\2\u00d4\u0342\3\2\2\2\u00d6\u0344\3\2\2\2\u00d8"+
		"\u034f\3\2\2\2\u00da\u0356\3\2\2\2\u00dc\u0362\3\2\2\2\u00de\u0364\3\2"+
		"\2\2\u00e0\u036e\3\2\2\2\u00e2\u0374\3\2\2\2\u00e4\u0376\3\2\2\2\u00e6"+
		"\u039a\3\2\2\2\u00e8\u03dc\3\2\2\2\u00ea\u03e4\3\2\2\2\u00ec\u03e6\3\2"+
		"\2\2\u00ee\u03f1\3\2\2\2\u00f0\u03f5\3\2\2\2\u00f2\u0402\3\2\2\2\u00f4"+
		"\u0404\3\2\2\2\u00f6\u0408\3\2\2\2\u00f8\u040a\3\2\2\2\u00fa\u0412\3\2"+
		"\2\2\u00fc\u0421\3\2\2\2\u00fe\u0423\3\2\2\2\u0100\u042e\3\2\2\2\u0102"+
		"\u0436\3\2\2\2\u0104\u043b\3\2\2\2\u0106\u043d\3\2\2\2\u0108\u0448\3\2"+
		"\2\2\u010a\u044b\3\2\2\2\u010c\u0456\3\2\2\2\u010e\u0458\3\2\2\2\u0110"+
		"\u045f\3\2\2\2\u0112\u0461\3\2\2\2\u0114\u046b\3\2\2\2\u0116\u0470\3\2"+
		"\2\2\u0118\u0475\3\2\2\2\u011a\u0477\3\2\2\2\u011c\u0482\3\2\2\2\u011e"+
		"\u0484\3\2\2\2\u0120\u0487\3\2\2\2\u0122\u0494\3\2\2\2\u0124\u0125\5\b"+
		"\5\2\u0125\u0126\5\n\6\2\u0126\u0127\5\f\7\2\u0127\3\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\5\3\2\2\2\u012a\u012b\3\2\2\2\u012b\7\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\t\3\2\2\2\u012e\u012f\3\2\2\2\u012f\13\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\r\3\2\2\2\u0132\u0136\5Z.\2\u0133\u0136\5\\/\2\u0134\u0136"+
		"\5\u00fa~\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2"+
		"\2\u0136\17\3\2\2\2\u0137\u013c\b\t\1\2\u0138\u0139\f\4\2\2\u0139\u013b"+
		"\7\5\2\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\21\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5,\27"+
		"\2\u0140\u0141\5\20\t\2\u0141\u0142\5\16\b\2\u0142\23\3\2\2\2\u0143\u0144"+
		"\b\13\1\2\u0144\u0145\5\22\n\2\u0145\u014b\3\2\2\2\u0146\u0147\f\3\2\2"+
		"\u0147\u0148\7g\2\2\u0148\u014a\5\22\n\2\u0149\u0146\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\25\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\5\24\13\2\u0150\u0151\7"+
		"i\2\2\u0151\27\3\2\2\2\u0152\u0153\7j\2\2\u0153\u0154\7\31\2\2\u0154\u0155"+
		"\5\u00fa~\2\u0155\u0156\7\32\2\2\u0156\31\3\2\2\2\u0157\u0158\7k\2\2\u0158"+
		"\u0159\5\u00fa~\2\u0159\u015a\5\u00f4{\2\u015a\33\3\2\2\2\u015b\u015c"+
		"\7(\2\2\u015c\u0161\5\u00fa~\2\u015d\u015e\7l\2\2\u015e\u0161\5\u00fa"+
		"~\2\u015f\u0161\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\35\3\2\2\2\u0162\u0163\7m\2\2\u0163\u0166\5\u00fa"+
		"~\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\37\3\2\2\2\u0167\u0168\7:\2\2\u0168\u0169\7f\2\2\u0169!\3\2\2\2\u016a"+
		"\u016b\5\u00d6l\2\u016b#\3\2\2\2\u016c\u016d\7\31\2\2\u016d\u016e\5\""+
		"\22\2\u016e\u016f\7\32\2\2\u016f\u0170\5 \21\2\u0170%\3\2\2\2\u0171\u0176"+
		"\5\u0100\u0081\2\u0172\u0173\5\u0100\u0081\2\u0173\u0174\5\u0102\u0082"+
		"\2\u0174\u0176\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0176\'"+
		"\3\2\2\2\u0177\u017c\5\u00c6d\2\u0178\u0179\5\u00c6d\2\u0179\u017a\5&"+
		"\24\2\u017a\u017c\3\2\2\2\u017b\u0177\3\2\2\2\u017b\u0178\3\2\2\2\u017c"+
		")\3\2\2\2\u017d\u017e\5(\25\2\u017e\u017f\5$\23\2\u017f+\3\2\2\2\u0180"+
		"\u0181\7\31\2\2\u0181\u0182\5@!\2\u0182\u0183\7n\2\2\u0183-\3\2\2\2\u0184"+
		"\u0185\5,\27\2\u0185\u0186\5*\26\2\u0186\u0187\5\34\17\2\u0187\u0188\5"+
		"\36\20\2\u0188\u0189\7o\2\2\u0189\u018a\5T+\2\u018a/\3\2\2\2\u018b\u018c"+
		"\5\62\32\2\u018c\61\3\2\2\2\u018d\u018e\7p\2\2\u018e\u018f\5.\30\2\u018f"+
		"\u0190\5\62\32\2\u0190\u0193\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u018d\3"+
		"\2\2\2\u0192\u0191\3\2\2\2\u0193\63\3\2\2\2\u0194\u0195\7q\2\2\u0195\u0196"+
		"\5\60\31\2\u0196\u0197\5B\"\2\u0197\u0198\7q\2\2\u0198\65\3\2\2\2\u0199"+
		"\u019a\7r\2\2\u019a\u019b\7\31\2\2\u019b\u019c\5\u00fa~\2\u019c\u019d"+
		"\7\32\2\2\u019d\67\3\2\2\2\u019e\u019f\7l\2\2\u019f\u01a2\5\u00fa~\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a29\3\2\2\2"+
		"\u01a3\u01a4\7m\2\2\u01a4\u01a7\5\u00fa~\2\u01a5\u01a7\3\2\2\2\u01a6\u01a3"+
		"\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7;\3\2\2\2\u01a8\u01a9\t\2\2\2\u01a9"+
		"=\3\2\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac\7u\2\2\u01ac\u01ad\5\u00fa~\2"+
		"\u01ad\u01ae\5<\37\2\u01ae\u01af\5\u00fa~\2\u01af\u01b0\5:\36\2\u01b0"+
		"\u01b1\58\35\2\u01b1?\3\2\2\2\u01b2\u01b3\b!\1\2\u01b3\u01b4\5> \2\u01b4"+
		"\u01ba\3\2\2\2\u01b5\u01b6\f\3\2\2\u01b6\u01b7\7\n\2\2\u01b7\u01b9\5>"+
		" \2\u01b8\u01b5\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bbA\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7p\2\2\u01be"+
		"\u01bf\7v\2\2\u01bf\u01c0\7o\2\2\u01c0\u01c3\5T+\2\u01c1\u01c3\3\2\2\2"+
		"\u01c2\u01bd\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3C\3\2\2\2\u01c4\u01c5\7"+
		"w\2\2\u01c5\u01c6\5@!\2\u01c6\u01c7\7o\2\2\u01c7\u01c8\5T+\2\u01c8\u01c9"+
		"\7x\2\2\u01c9E\3\2\2\2\u01ca\u01cb\7y\2\2\u01cb\u01cc\5J&\2\u01cc\u01cd"+
		"\5B\"\2\u01cd\u01ce\7z\2\2\u01ceG\3\2\2\2\u01cf\u01d0\5\u00fa~\2\u01d0"+
		"\u01d1\7o\2\2\u01d1\u01d2\5T+\2\u01d2I\3\2\2\2\u01d3\u01d4\b&\1\2\u01d4"+
		"\u01d5\5H%\2\u01d5\u01db\3\2\2\2\u01d6\u01d7\f\3\2\2\u01d7\u01d8\7{\2"+
		"\2\u01d8\u01da\5H%\2\u01d9\u01d6\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcK\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01df\7|\2\2\u01df\u01e0\5J&\2\u01e0\u01e1\5B\"\2\u01e1\u01e2\7}\2\2"+
		"\u01e2M\3\2\2\2\u01e3\u01e8\5\u0114\u008b\2\u01e4\u01e8\5n8\2\u01e5\u01e8"+
		"\5\u00fa~\2\u01e6\u01e8\5\u0086D\2\u01e7\u01e3\3\2\2\2\u01e7\u01e4\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8O\3\2\2\2\u01e9\u01ea"+
		"\5R*\2\u01eaQ\3\2\2\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed\5N(\2\u01ed\u01ee"+
		"\5R*\2\u01ee\u01f1\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1S\3\2\2\2\u01f2\u01f3\5P)\2\u01f3U\3\2\2\2\u01f4\u01f5"+
		"\7~\2\2\u01f5\u01f6\5T+\2\u01f6\u01f7\7c\2\2\u01f7W\3\2\2\2\u01f8\u01f9"+
		"\7\177\2\2\u01f9\u01fa\5\u00fa~\2\u01faY\3\2\2\2\u01fb\u01fc\7C\2\2\u01fc"+
		"\u01fd\5\u00f6|\2\u01fd[\3\2\2\2\u01fe\u01ff\7G\2\2\u01ff\u0200\5\u00f6"+
		"|\2\u0200]\3\2\2\2\u0201\u0202\7\u0080\2\2\u0202\u0203\5\u00f6|\2\u0203"+
		"_\3\2\2\2\u0204\u0205\7\u0081\2\2\u0205a\3\2\2\2\u0206\u0207\7\u0082\2"+
		"\2\u0207c\3\2\2\2\u0208\u0209\7\u0083\2\2\u0209e\3\2\2\2\u020a\u020b\7"+
		"\u0084\2\2\u020bg\3\2\2\2\u020c\u020d\7\31\2\2\u020d\u020e\5\u00fa~\2"+
		"\u020e\u020f\7\32\2\2\u020fi\3\2\2\2\u0210\u0211\7\u0085\2\2\u0211\u0212"+
		"\5h\65\2\u0212k\3\2\2\2\u0213\u0214\7\u0086\2\2\u0214m\3\2\2\2\u0215\u0229"+
		"\5l\67\2\u0216\u0229\5j\66\2\u0217\u0229\5f\64\2\u0218\u0229\5d\63\2\u0219"+
		"\u0229\5b\62\2\u021a\u0229\5`\61\2\u021b\u0229\5^\60\2\u021c\u0229\5\\"+
		"/\2\u021d\u0229\5Z.\2\u021e\u0229\5X-\2\u021f\u0229\5V,\2\u0220\u0229"+
		"\5L\'\2\u0221\u0229\5F$\2\u0222\u0229\5D#\2\u0223\u0229\5\66\34\2\u0224"+
		"\u0229\5\64\33\2\u0225\u0229\5\32\16\2\u0226\u0229\5\30\r\2\u0227\u0229"+
		"\5\26\f\2\u0228\u0215\3\2\2\2\u0228\u0216\3\2\2\2\u0228\u0217\3\2\2\2"+
		"\u0228\u0218\3\2\2\2\u0228\u0219\3\2\2\2\u0228\u021a\3\2\2\2\u0228\u021b"+
		"\3\2\2\2\u0228\u021c\3\2\2\2\u0228\u021d\3\2\2\2\u0228\u021e\3\2\2\2\u0228"+
		"\u021f\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2"+
		"\2\2\u0228\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229o\3\2\2\2\u022a\u022b\7F\2\2\u022b"+
		"\u022c\7f\2\2\u022c\u022d\5$\23\2\u022d\u022e\5T+\2\u022e\u022f\5\f\7"+
		"\2\u022fq\3\2\2\2\u0230\u0231\7a\2\2\u0231\u0232\7f\2\2\u0232\u0233\5"+
		"\u00aeX\2\u0233\u0234\5,\27\2\u0234\u0235\5T+\2\u0235\u0236\5\f\7\2\u0236"+
		"s\3\2\2\2\u0237\u0238\7b\2\2\u0238\u0239\7f\2\2\u0239\u023a\5\u00c2b\2"+
		"\u023a\u023b\5T+\2\u023b\u023c\5\f\7\2\u023cu\3\2\2\2\u023d\u0240\3\2"+
		"\2\2\u023e\u0240\7d\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240"+
		"w\3\2\2\2\u0241\u0242\7d\2\2\u0242\u0243\5T+\2\u0243\u0244\7c\2\2\u0244"+
		"\u0245\5v<\2\u0245y\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0249\7e\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249{\3\2\2\2\u024a\u024b\7e\2\2\u024b"+
		"\u024c\5T+\2\u024c\u024d\7c\2\2\u024d\u024e\5z>\2\u024e}\3\2\2\2\u024f"+
		"\u0256\5n8\2\u0250\u0256\5p9\2\u0251\u0256\5r:\2\u0252\u0256\5t;\2\u0253"+
		"\u0256\5x=\2\u0254\u0256\5|?\2\u0255\u024f\3\2\2\2\u0255\u0250\3\2\2\2"+
		"\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254"+
		"\3\2\2\2\u0256\177\3\2\2\2\u0257\u0258\7f\2\2\u0258\u0081\3\2\2\2\u0259"+
		"\u025a\bB\1\2\u025a\u025b\5\u0080A\2\u025b\u0261\3\2\2\2\u025c\u025d\f"+
		"\3\2\2\u025d\u025e\7\n\2\2\u025e\u0260\5\u0080A\2\u025f\u025c\3\2\2\2"+
		"\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0083"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\7\b\2\2\u0265\u0266\5\u0082B"+
		"\2\u0266\u0085\3\2\2\2\u0267\u0268\7\t\2\2\u0268\u0269\5\u0082B\2\u0269"+
		"\u0087\3\2\2\2\u026a\u026d\7>\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026b\3\2\2\2\u026d\u0089\3\2\2\2\u026e\u026f\5\u0106\u0084"+
		"\2\u026f\u0270\5\u00c4c\2\u0270\u0276\3\2\2\2\u0271\u0272\5\u0106\u0084"+
		"\2\u0272\u0273\5\u0088E\2\u0273\u0274\5\u00c6d\2\u0274\u0276\3\2\2\2\u0275"+
		"\u026e\3\2\2\2\u0275\u0271\3\2\2\2\u0276\u008b\3\2\2\2\u0277\u0278\bG"+
		"\1\2\u0278\u0279\5\u008aF\2\u0279\u027f\3\2\2\2\u027a\u027b\f\3\2\2\u027b"+
		"\u027c\7\n\2\2\u027c\u027e\5\u008aF\2\u027d\u027a\3\2\2\2\u027e\u0281"+
		"\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u008d\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0283\t\3\2\2\u0283\u008f\3\2\2\2\u0284\u0285\5\u008e"+
		"H\2\u0285\u0286\5\u008cG\2\u0286\u0091\3\2\2\2\u0287\u0288\7.\2\2\u0288"+
		"\u028b\5\u00fa~\2\u0289\u028b\3\2\2\2\u028a\u0287\3\2\2\2\u028a\u0289"+
		"\3\2\2\2\u028b\u0093\3\2\2\2\u028c\u028d\5\u0104\u0083\2\u028d\u028e\5"+
		"\u00b0Y\2\u028e\u028f\5\u0092J\2\u028f\u0095\3\2\2\2\u0290\u0291\bL\1"+
		"\2\u0291\u0292\5\u0094K\2\u0292\u0298\3\2\2\2\u0293\u0294\f\3\2\2\u0294"+
		"\u0295\7\n\2\2\u0295\u0297\5\u0094K\2\u0296\u0293\3\2\2\2\u0297\u029a"+
		"\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0097\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029b\u029c\7I\2\2\u029c\u029d\5\u0096L\2\u029d\u0099\3"+
		"\2\2\2\u029e\u02a1\7\20\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a1\u009b\3\2\2\2\u02a2\u02a3\7^\2\2\u02a3\u02a4\7f\2"+
		"\2\u02a4\u02a5\5\u009aN\2\u02a5\u02a6\5\u00c4c\2\u02a6\u009d\3\2\2\2\u02a7"+
		"\u02a8\7>\2\2\u02a8\u02b3\5\u00e2r\2\u02a9\u02aa\7>\2\2\u02aa\u02b3\5"+
		"\u00e2r\2\u02ab\u02ac\7>\2\2\u02ac\u02ad\5\u00e2r\2\u02ad\u02ae\7.\2\2"+
		"\u02ae\u02af\5\u00fa~\2\u02af\u02b3\3\2\2\2\u02b0\u02b1\7.\2\2\u02b1\u02b3"+
		"\5\u00fa~\2\u02b2\u02a7\3\2\2\2\u02b2\u02a9\3\2\2\2\u02b2\u02ab\3\2\2"+
		"\2\u02b2\u02b0\3\2\2\2\u02b3\u009f\3\2\2\2\u02b4\u02b5\7]\2\2\u02b5\u02b8"+
		"\5\u00fa~\2\u02b6\u02b8\3\2\2\2\u02b7\u02b4\3\2\2\2\u02b7\u02b6\3\2\2"+
		"\2\u02b8\u00a1\3\2\2\2\u02b9\u02ba\t\4\2\2\u02ba\u00a3\3\2\2\2\u02bb\u02bc"+
		"\5\u00a2R\2\u02bc\u02bd\5\u00f4{\2\u02bd\u00a5\3\2\2\2\u02be\u02bf\7\\"+
		"\2\2\u02bf\u02c0\5\u00a4S\2\u02c0\u02c1\5\u00a0Q\2\u02c1\u00a7\3\2\2\2"+
		"\u02c2\u02cc\7L\2\2\u02c3\u02cc\7M\2\2\u02c4\u02cc\7[\2\2\u02c5\u02c6"+
		"\7E\2\2\u02c6\u02cc\7f\2\2\u02c7\u02c8\7\33\2\2\u02c8\u02c9\5\u00fe\u0080"+
		"\2\u02c9\u02ca\7\33\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c2\3\2\2\2\u02cb"+
		"\u02c3\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02c7\3\2"+
		"\2\2\u02cc\u00a9\3\2\2\2\u02cd\u02d3\5\u00e0q\2\u02ce\u02cf\7I\2\2\u02cf"+
		"\u02d3\5\u00b0Y\2\u02d0\u02d1\7`\2\2\u02d1\u02d3\5\u00c4c\2\u02d2\u02cd"+
		"\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u00ab\3\2\2\2\u02d4"+
		"\u02d7\5\u0102\u0082\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5"+
		"\3\2\2\2\u02d7\u00ad\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u00af\3\2\2\2\u02da"+
		"\u02db\5\u00aeX\2\u02db\u00b1\3\2\2\2\u02dc\u02e5\7C\2\2\u02dd\u02e5\7"+
		"G\2\2\u02de\u02df\7C\2\2\u02df\u02e0\7\n\2\2\u02e0\u02e5\7G\2\2\u02e1"+
		"\u02e2\7G\2\2\u02e2\u02e3\7\n\2\2\u02e3\u02e5\7C\2\2\u02e4\u02dc\3\2\2"+
		"\2\u02e4\u02dd\3\2\2\2\u02e4\u02de\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e5\u00b3"+
		"\3\2\2\2\u02e6\u02e7\7\r\2\2\u02e7\u02e8\5\u00b2Z\2\u02e8\u02e9\7\16\2"+
		"\2\u02e9\u00b5\3\2\2\2\u02ea\u02eb\7:\2\2\u02eb\u02f5\5\u00e2r\2\u02ec"+
		"\u02ed\7:\2\2\u02ed\u02ee\5\u0104\u0083\2\u02ee\u02ef\7>\2\2\u02ef\u02f0"+
		"\5\u00e2r\2\u02f0\u02f5\3\2\2\2\u02f1\u02f2\7:\2\2\u02f2\u02f3\7f\2\2"+
		"\u02f3\u02f5\7D\2\2\u02f4\u02ea\3\2\2\2\u02f4\u02ec\3\2\2\2\u02f4\u02f1"+
		"\3\2\2\2\u02f5\u00b7\3\2\2\2\u02f6\u02fc\7?\2\2\u02f7\u02fc\7\13\2\2\u02f8"+
		"\u02fc\7@\2\2\u02f9\u02fc\7A\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f6\3\2\2"+
		"\2\u02fb\u02f7\3\2\2\2\u02fb\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa"+
		"\3\2\2\2\u02fc\u00b9\3\2\2\2\u02fd\u02fe\5\u00b8]\2\u02fe\u02ff\5\u00e2"+
		"r\2\u02ff\u00bb\3\2\2\2\u0300\u0309\5\u00ba^\2\u0301\u0302\5\u00ba^\2"+
		"\u0302\u0303\7\5\2\2\u0303\u0309\3\2\2\2\u0304\u0305\5\u00ba^\2\u0305"+
		"\u0306\7\5\2\2\u0306\u0307\5\u00bc_\2\u0307\u0309\3\2\2\2\u0308\u0300"+
		"\3\2\2\2\u0308\u0301\3\2\2\2\u0308\u0304\3\2\2\2\u0309\u00bd\3\2\2\2\u030a"+
		"\u030d\5\u00bc_\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030b"+
		"\3\2\2\2\u030d\u00bf\3\2\2\2\u030e\u030f\7\31\2\2\u030f\u0310\5\u00be"+
		"`\2\u0310\u0311\7\32\2\2\u0311\u00c1\3\2\2\2\u0312\u0313\5\u00c0a\2\u0313"+
		"\u0314\5\u00b6\\\2\u0314\u00c3\3\2\2\2\u0315\u0316\5\u00c2b\2\u0316\u0317"+
		"\5\u00b4[\2\u0317\u00c5\3\2\2\2\u0318\u031d\7f\2\2\u0319\u031a\7f\2\2"+
		"\u031a\u031b\7E\2\2\u031b\u031d\7f\2\2\u031c\u0318\3\2\2\2\u031c\u0319"+
		"\3\2\2\2\u031d\u00c7\3\2\2\2\u031e\u0324\5\u00c6d\2\u031f\u0324\5\u00c4"+
		"c\2\u0320\u0321\7I\2\2\u0321\u0324\5\u00b0Y\2\u0322\u0324\7H\2\2\u0323"+
		"\u031e\3\2\2\2\u0323\u031f\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0322\3\2"+
		"\2\2\u0324\u00c9\3\2\2\2\u0325\u0326\7B\2\2\u0326\u0327\5\u00c8e\2\u0327"+
		"\u00cb\3\2\2\2\u0328\u0329\7Q\2\2\u0329\u032a\7\31\2\2\u032a\u032b\5\u00d0"+
		"i\2\u032b\u032c\7\32\2\2\u032c\u00cd\3\2\2\2\u032d\u032e\5\u010a\u0086"+
		"\2\u032e\u00cf\3\2\2\2\u032f\u0338\5\u00ceh\2\u0330\u0331\5\u00ceh\2\u0331"+
		"\u0332\7\5\2\2\u0332\u0338\3\2\2\2\u0333\u0334\5\u00ceh\2\u0334\u0335"+
		"\7\5\2\2\u0335\u0336\5\u00ceh\2\u0336\u0338\3\2\2\2\u0337\u032f\3\2\2"+
		"\2\u0337\u0330\3\2\2\2\u0337\u0333\3\2\2\2\u0338\u00d1\3\2\2\2\u0339\u033a"+
		"\7J\2\2\u033a\u033b\7\31\2\2\u033b\u033c\5\u00d0i\2\u033c\u033d\7\32\2"+
		"\2\u033d\u00d3\3\2\2\2\u033e\u033f\7X\2\2\u033f\u0343\5\u00e2r\2\u0340"+
		"\u0341\7X\2\2\u0341\u0343\7K\2\2\u0342\u033e\3\2\2\2\u0342\u0340\3\2\2"+
		"\2\u0343\u00d5\3\2\2\2\u0344\u0345\bl\1\2\u0345\u0346\7f\2\2\u0346\u034c"+
		"\3\2\2\2\u0347\u0348\f\3\2\2\u0348\u0349\7\n\2\2\u0349\u034b\7f\2\2\u034a"+
		"\u0347\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2"+
		"\2\2\u034d\u00d7\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7V\2\2\u0350"+
		"\u0351\7\31\2\2\u0351\u0352\5\u00d6l\2\u0352\u0353\7\32\2\2\u0353\u00d9"+
		"\3\2\2\2\u0354\u0357\5\u00fa~\2\u0355\u0357\7\21\2\2\u0356\u0354\3\2\2"+
		"\2\u0356\u0355\3\2\2\2\u0357\u00db\3\2\2\2\u0358\u0359\7W\2\2\u0359\u035a"+
		"\7\33\2\2\u035a\u035b\5\u00dan\2\u035b\u035c\7\34\2\2\u035c\u0363\3\2"+
		"\2\2\u035d\u035e\7W\2\2\u035e\u035f\7\31\2\2\u035f\u0360\5\u00dan\2\u0360"+
		"\u0361\7\32\2\2\u0361\u0363\3\2\2\2\u0362\u0358\3\2\2\2\u0362\u035d\3"+
		"\2\2\2\u0363\u00dd\3\2\2\2\u0364\u0365\t\5\2\2\u0365\u00df\3\2\2\2\u0366"+
		"\u036f\5\u00dep\2\u0367\u036f\5\u00dco\2\u0368\u036f\5\u00d8m\2\u0369"+
		"\u036f\5\u00d4k\2\u036a\u036f\5\u00d2j\2\u036b\u036f\5\u00ccg\2\u036c"+
		"\u036f\5\u00caf\2\u036d\u036f\5\u00c6d\2\u036e\u0366\3\2\2\2\u036e\u0367"+
		"\3\2\2\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2\2\2\u036e\u036a\3\2\2\2\u036e"+
		"\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f\u00e1\3\2"+
		"\2\2\u0370\u0371\5\u0102\u0082\2\u0371\u0372\5\u00e0q\2\u0372\u0375\3"+
		"\2\2\2\u0373\u0375\5\u00e0q\2\u0374\u0370\3\2\2\2\u0374\u0373\3\2\2\2"+
		"\u0375\u00e3\3\2\2\2\u0376\u0377\7\31\2\2\u0377\u0378\5\u00fa~\2\u0378"+
		"\u0379\7\32\2\2\u0379\u00e5\3\2\2\2\u037a\u037b\7O\2\2\u037b\u039b\5\u00fa"+
		"~\2\u037c\u037d\7 \2\2\u037d\u039b\5\u00fa~\2\u037e\u037f\7!\2\2\u037f"+
		"\u039b\5\u00fa~\2\u0380\u0381\7Y\2\2\u0381\u039b\5\u00fa~\2\u0382\u0383"+
		"\7N\2\2\u0383\u039b\5\u00fa~\2\u0384\u0385\7L\2\2\u0385\u039b\5\u00fa"+
		"~\2\u0386\u0387\7M\2\2\u0387\u039b\5\u00fa~\2\u0388\u0389\7W\2\2\u0389"+
		"\u039b\5\u00e4s\2\u038a\u038b\7<\2\2\u038b\u038c\7\31\2\2\u038c\u038d"+
		"\5\u00e2r\2\u038d\u038e\7\32\2\2\u038e\u039b\3\2\2\2\u038f\u0390\7=\2"+
		"\2\u0390\u0391\7\31\2\2\u0391\u0392\5\u00e2r\2\u0392\u0393\7\32\2\2\u0393"+
		"\u039b\3\2\2\2\u0394\u0395\7;\2\2\u0395\u0396\7\31\2\2\u0396\u0397\5\u00ac"+
		"W\2\u0397\u0398\5\u00aaV\2\u0398\u0399\7\32\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u037a\3\2\2\2\u039a\u037c\3\2\2\2\u039a\u037e\3\2\2\2\u039a\u0380\3\2"+
		"\2\2\u039a\u0382\3\2\2\2\u039a\u0384\3\2\2\2\u039a\u0386\3\2\2\2\u039a"+
		"\u0388\3\2\2\2\u039a\u038a\3\2\2\2\u039a\u038f\3\2\2\2\u039a\u0394\3\2"+
		"\2\2\u039b\u00e7\3\2\2\2\u039c\u039d\7\35\2\2\u039d\u03dd\5\u00fa~\2\u039e"+
		"\u039f\7\21\2\2\u039f\u03dd\5\u00fa~\2\u03a0\u03a1\7\36\2\2\u03a1\u03dd"+
		"\5\u00fa~\2\u03a2\u03a3\7Z\2\2\u03a3\u03dd\5\u00fa~\2\u03a4\u03a5\7\37"+
		"\2\2\u03a5\u03dd\5\u00fa~\2\u03a6\u03a7\7 \2\2\u03a7\u03dd\5\u00fa~\2"+
		"\u03a8\u03a9\7!\2\2\u03a9\u03dd\5\u00fa~\2\u03aa\u03ab\7\"\2\2\u03ab\u03dd"+
		"\5\u00fa~\2\u03ac\u03ad\7\20\2\2\u03ad\u03dd\5\u00fa~\2\u03ae\u03af\7"+
		"#\2\2\u03af\u03dd\5\u00fa~\2\u03b0\u03b1\7$\2\2\u03b1\u03dd\5\u00fa~\2"+
		"\u03b2\u03b3\7%\2\2\u03b3\u03dd\5\u00fa~\2\u03b4\u03b5\7&\2\2\u03b5\u03dd"+
		"\5\u00fa~\2\u03b6\u03b7\7\'\2\2\u03b7\u03dd\5\u00fa~\2\u03b8\u03b9\7("+
		"\2\2\u03b9\u03dd\5\u00fa~\2\u03ba\u03bb\7)\2\2\u03bb\u03dd\5\u00fa~\2"+
		"\u03bc\u03bd\7*\2\2\u03bd\u03dd\5\u00fa~\2\u03be\u03bf\7+\2\2\u03bf\u03dd"+
		"\5\u00fa~\2\u03c0\u03c1\7,\2\2\u03c1\u03dd\5\u00fa~\2\u03c2\u03c3\7-\2"+
		"\2\u03c3\u03dd\5\u00fa~\2\u03c4\u03c5\7.\2\2\u03c5\u03dd\5\u00fa~\2\u03c6"+
		"\u03c7\7/\2\2\u03c7\u03dd\5\u00fa~\2\u03c8\u03c9\7\60\2\2\u03c9\u03dd"+
		"\5\u00fa~\2\u03ca\u03cb\7\61\2\2\u03cb\u03dd\5\u00fa~\2\u03cc\u03cd\7"+
		"\62\2\2\u03cd\u03dd\5\u00fa~\2\u03ce\u03cf\7\63\2\2\u03cf\u03dd\5\u00fa"+
		"~\2\u03d0\u03d1\7\64\2\2\u03d1\u03dd\5\u00fa~\2\u03d2\u03d3\7\65\2\2\u03d3"+
		"\u03dd\5\u00fa~\2\u03d4\u03d5\7\66\2\2\u03d5\u03dd\5\u00fa~\2\u03d6\u03d7"+
		"\7\67\2\2\u03d7\u03dd\5\u00fa~\2\u03d8\u03d9\78\2\2\u03d9\u03dd\5\u00fa"+
		"~\2\u03da\u03db\79\2\2\u03db\u03dd\5\u00fa~\2\u03dc\u039c\3\2\2\2\u03dc"+
		"\u039e\3\2\2\2\u03dc\u03a0\3\2\2\2\u03dc\u03a2\3\2\2\2\u03dc\u03a4\3\2"+
		"\2\2\u03dc\u03a6\3\2\2\2\u03dc\u03a8\3\2\2\2\u03dc\u03aa\3\2\2\2\u03dc"+
		"\u03ac\3\2\2\2\u03dc\u03ae\3\2\2\2\u03dc\u03b0\3\2\2\2\u03dc\u03b2\3\2"+
		"\2\2\u03dc\u03b4\3\2\2\2\u03dc\u03b6\3\2\2\2\u03dc\u03b8\3\2\2\2\u03dc"+
		"\u03ba\3\2\2\2\u03dc\u03bc\3\2\2\2\u03dc\u03be\3\2\2\2\u03dc\u03c0\3\2"+
		"\2\2\u03dc\u03c2\3\2\2\2\u03dc\u03c4\3\2\2\2\u03dc\u03c6\3\2\2\2\u03dc"+
		"\u03c8\3\2\2\2\u03dc\u03ca\3\2\2\2\u03dc\u03cc\3\2\2\2\u03dc\u03ce\3\2"+
		"\2\2\u03dc\u03d0\3\2\2\2\u03dc\u03d2\3\2\2\2\u03dc\u03d4\3\2\2\2\u03dc"+
		"\u03d6\3\2\2\2\u03dc\u03d8\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u00e9\3\2"+
		"\2\2\u03de\u03e5\5\u00fa~\2\u03df\u03e0\7\33\2\2\u03e0\u03e1\5\u00fa~"+
		"\2\u03e1\u03e2\7\34\2\2\u03e2\u03e3\5\u00fa~\2\u03e3\u03e5\3\2\2\2\u03e4"+
		"\u03de\3\2\2\2\u03e4\u03df\3\2\2\2\u03e5\u00eb\3\2\2\2\u03e6\u03e7\bw"+
		"\1\2\u03e7\u03e8\5\u00eav\2\u03e8\u03ee\3\2\2\2\u03e9\u03ea\f\3\2\2\u03ea"+
		"\u03eb\7\n\2\2\u03eb\u03ed\5\u00eav\2\u03ec\u03e9\3\2\2\2\u03ed\u03f0"+
		"\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u00ed\3\2\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f1\u03f2\7\31\2\2\u03f2\u03f3\5\u00ecw\2\u03f3\u03f4"+
		"\7\32\2\2\u03f4\u00ef\3\2\2\2\u03f5\u03f6\by\1\2\u03f6\u03f7\5\u00fa~"+
		"\2\u03f7\u03fd\3\2\2\2\u03f8\u03f9\f\3\2\2\u03f9\u03fa\7\n\2\2\u03fa\u03fc"+
		"\5\u00fa~\2\u03fb\u03f8\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2"+
		"\2\u03fd\u03fe\3\2\2\2\u03fe\u00f1\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0403"+
		"\5\u00f0y\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2\2"+
		"\2\u0403\u00f3\3\2\2\2\u0404\u0405\7\31\2\2\u0405\u0406\5\u00f2z\2\u0406"+
		"\u0407\7\32\2\2\u0407\u00f5\3\2\2\2\u0408\u0409\5\u00f4{\2\u0409\u00f7"+
		"\3\2\2\2\u040a\u040b\t\6\2\2\u040b\u00f9\3\2\2\2\u040c\u040d\b~\1\2\u040d"+
		"\u0413\7f\2\2\u040e\u0413\5\u00f8}\2\u040f\u0413\5\u00eex\2\u0410\u0413"+
		"\5\u00e6t\2\u0411\u0413\5\u00a6T\2\u0412\u040c\3\2\2\2\u0412\u040e\3\2"+
		"\2\2\u0412\u040f\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413"+
		"\u041c\3\2\2\2\u0414\u0415\f\b\2\2\u0415\u041b\5\u00f6|\2\u0416\u0417"+
		"\f\6\2\2\u0417\u041b\5\u00e8u\2\u0418\u0419\f\4\2\2\u0419\u041b\5\u00a8"+
		"U\2\u041a\u0414\3\2\2\2\u041a\u0416\3\2\2\2\u041a\u0418\3\2\2\2\u041b"+
		"\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u00fb\3\2"+
		"\2\2\u041e\u041c\3\2\2\2\u041f\u0422\5\u00fa~\2\u0420\u0422\7\21\2\2\u0421"+
		"\u041f\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u00fd\3\2\2\2\u0423\u0424\b\u0080"+
		"\1\2\u0424\u0425\5\u00fc\177\2\u0425\u042b\3\2\2\2\u0426\u0427\f\3\2\2"+
		"\u0427\u0428\7\n\2\2\u0428\u042a\5\u00fc\177\2\u0429\u0426\3\2\2\2\u042a"+
		"\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u00ff\3\2"+
		"\2\2\u042d\u042b\3\2\2\2\u042e\u042f\7\33\2\2\u042f\u0430\5\u00fe\u0080"+
		"\2\u0430\u0431\7\34\2\2\u0431\u0101\3\2\2\2\u0432\u0437\5\u0100\u0081"+
		"\2\u0433\u0434\5\u0100\u0081\2\u0434\u0435\5\u0102\u0082\2\u0435\u0437"+
		"\3\2\2\2\u0436\u0432\3\2\2\2\u0436\u0433\3\2\2\2\u0437\u0103\3\2\2\2\u0438"+
		"\u043c\7f\2\2\u0439\u043a\7f\2\2\u043a\u043c\5\u0102\u0082\2\u043b\u0438"+
		"\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u0105\3\2\2\2\u043d\u043e\b\u0084\1"+
		"\2\u043e\u043f\5\u0104\u0083\2\u043f\u0445\3\2\2\2\u0440\u0441\f\3\2\2"+
		"\u0441\u0442\7\n\2\2\u0442\u0444\5\u0104\u0083\2\u0443\u0440\3\2\2\2\u0444"+
		"\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0107\3\2"+
		"\2\2\u0447\u0445\3\2\2\2\u0448\u0449\5\u0106\u0084\2\u0449\u044a\5\u009e"+
		"P\2\u044a\u0109\3\2\2\2\u044b\u044c\b\u0086\1\2\u044c\u044d\5\u0108\u0085"+
		"\2\u044d\u0453\3\2\2\2\u044e\u044f\f\3\2\2\u044f\u0450\7\n\2\2\u0450\u0452"+
		"\5\u0108\u0085\2\u0451\u044e\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3"+
		"\2\2\2\u0453\u0454\3\2\2\2\u0454\u010b\3\2\2\2\u0455\u0453\3\2\2\2\u0456"+
		"\u0457\t\7\2\2\u0457\u010d\3\2\2\2\u0458\u0459\5\u010c\u0087\2\u0459\u045a"+
		"\5\u010a\u0086\2\u045a\u010f\3\2\2\2\u045b\u045c\7\r\2\2\u045c\u045d\7"+
		"f\2\2\u045d\u0460\7\16\2\2\u045e\u0460\3\2\2\2\u045f\u045b\3\2\2\2\u045f"+
		"\u045e\3\2\2\2\u0460\u0111\3\2\2\2\u0461\u0462\7\17\2\2\u0462\u0463\7"+
		"f\2\2\u0463\u0464\7\20\2\2\u0464\u0465\5\u0110\u0089\2\u0465\u0113\3\2"+
		"\2\2\u0466\u046c\5\u0112\u008a\2\u0467\u046c\5\u010e\u0088\2\u0468\u046c"+
		"\5\u009cO\2\u0469\u046c\5\u0098M\2\u046a\u046c\5\u0090I\2\u046b\u0466"+
		"\3\2\2\2\u046b\u0467\3\2\2\2\u046b\u0468\3\2\2\2\u046b\u0469\3\2\2\2\u046b"+
		"\u046a\3\2\2\2\u046c\u0115\3\2\2\2\u046d\u0471\5\u0114\u008b\2\u046e\u0471"+
		"\5\u0086D\2\u046f\u0471\3\2\2\2\u0470\u046d\3\2\2\2\u0470\u046e\3\2\2"+
		"\2\u0470\u046f\3\2\2\2\u0471\u0117\3\2\2\2\u0472\u0476\5\u0116\u008c\2"+
		"\u0473\u0476\5\u0084C\2\u0474\u0476\5~@\2\u0475\u0472\3\2\2\2\u0475\u0473"+
		"\3\2\2\2\u0475\u0474\3\2\2\2\u0476\u0119\3\2\2\2\u0477\u0478\b\u008e\1"+
		"\2\u0478\u0479\5\u0118\u008d\2\u0479\u047f\3\2\2\2\u047a\u047b\f\3\2\2"+
		"\u047b\u047c\7\5\2\2\u047c\u047e\5\u0118\u008d\2\u047d\u047a\3\2\2\2\u047e"+
		"\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u011b\3\2"+
		"\2\2\u0481\u047f\3\2\2\2\u0482\u0483\t\b\2\2\u0483\u011d\3\2\2\2\u0484"+
		"\u0485\5\u011c\u008f\2\u0485\u0486\7f\2\2\u0486\u011f\3\2\2\2\u0487\u0488"+
		"\5\u011e\u0090\2\u0488\u0489\5\u011a\u008e\2\u0489\u048a\5\6\4\2\u048a"+
		"\u0121\3\2\2\2\u048b\u048c\5\u0120\u0091\2\u048c\u048d\7\5\2\2\u048d\u0495"+
		"\3\2\2\2\u048e\u048f\5\2\2\2\u048f\u0490\7\5\2\2\u0490\u0495\3\2\2\2\u0491"+
		"\u0492\5\4\3\2\u0492\u0493\7\5\2\2\u0493\u0495\3\2\2\2\u0494\u048b\3\2"+
		"\2\2\u0494\u048e\3\2\2\2\u0494\u0491\3\2\2\2\u0495\u0123\3\2\2\2D\u0135"+
		"\u013c\u014b\u0160\u0165\u0175\u017b\u0192\u01a1\u01a6\u01ba\u01c2\u01db"+
		"\u01e7\u01f0\u0228\u023f\u0248\u0255\u0261\u026c\u0275\u027f\u028a\u0298"+
		"\u02a0\u02b2\u02b7\u02cb\u02d2\u02d6\u02e4\u02f4\u02fb\u0308\u030c\u031c"+
		"\u0323\u0337\u0342\u034c\u0356\u0362\u036e\u0374\u039a\u03dc\u03e4\u03ee"+
		"\u03fd\u0402\u0412\u041a\u041c\u0421\u042b\u0436\u043b\u0445\u0453\u045f"+
		"\u046b\u0470\u0475\u047f\u0494";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}