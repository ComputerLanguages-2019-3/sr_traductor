// Generated from /home/laura-angelica/Documents/UNAL/2019-2/languages/Traductor simple/grammar/SRgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRgrammarLexer extends Lexer {
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
		TK_PROCEDURE=96, TK_END=97, TK_INITIAL=98, TK_FINAL=99, TK_ID=100;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "WS", "TK_SEPARATOR", "TK_RESOURCE", "TK_GLOBAL", "TK_EXTEND", 
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
			"TK_END", "TK_INITIAL", "TK_FINAL", "TK_ID"
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
			"TK_END", "TK_INITIAL", "TK_FINAL", "TK_ID"
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


	public SRgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SRgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2f\u02a7\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\6\2\u00cd\n\2\r\2\16\2\u00ce\3"+
		"\3\6\3\u00d2\n\3\r\3\16\3\u00d3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3E"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J"+
		"\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U"+
		"\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3["+
		"\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b"+
		"\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\6e\u02a4\ne\re\16"+
		"e\u02a5\2\2f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"d\u00c7e\u00c9f\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\3\2C|\2\u02a9\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00cc\3\2\2\2\5\u00d1"+
		"\3\2\2\2\7\u00d7\3\2\2\2\t\u00d9\3\2\2\2\13\u00e2\3\2\2\2\r\u00e9\3\2"+
		"\2\2\17\u00f0\3\2\2\2\21\u00f7\3\2\2\2\23\u00f9\3\2\2\2\25\u00fd\3\2\2"+
		"\2\27\u0103\3\2\2\2\31\u0105\3\2\2\2\33\u0107\3\2\2\2\35\u010c\3\2\2\2"+
		"\37\u010e\3\2\2\2!\u0110\3\2\2\2#\u011c\3\2\2\2%\u0129\3\2\2\2\'\u0135"+
		"\3\2\2\2)\u0142\3\2\2\2+\u0151\3\2\2\2-\u015e\3\2\2\2/\u016c\3\2\2\2\61"+
		"\u016e\3\2\2\2\63\u0170\3\2\2\2\65\u0172\3\2\2\2\67\u0174\3\2\2\29\u0177"+
		"\3\2\2\2;\u0179\3\2\2\2=\u017b\3\2\2\2?\u017d\3\2\2\2A\u017f\3\2\2\2C"+
		"\u0182\3\2\2\2E\u0185\3\2\2\2G\u0188\3\2\2\2I\u018b\3\2\2\2K\u018d\3\2"+
		"\2\2M\u018f\3\2\2\2O\u0191\3\2\2\2Q\u0193\3\2\2\2S\u0197\3\2\2\2U\u019a"+
		"\3\2\2\2W\u019d\3\2\2\2Y\u01a1\3\2\2\2[\u01a4\3\2\2\2]\u01a8\3\2\2\2_"+
		"\u01ac\3\2\2\2a\u01b0\3\2\2\2c\u01b4\3\2\2\2e\u01b8\3\2\2\2g\u01bd\3\2"+
		"\2\2i\u01c1\3\2\2\2k\u01c5\3\2\2\2m\u01ca\3\2\2\2o\u01cf\3\2\2\2q\u01d4"+
		"\3\2\2\2s\u01dc\3\2\2\2u\u01e0\3\2\2\2w\u01e4\3\2\2\2y\u01e9\3\2\2\2{"+
		"\u01eb\3\2\2\2}\u01ef\3\2\2\2\177\u01f3\3\2\2\2\u0081\u01f7\3\2\2\2\u0083"+
		"\u01fb\3\2\2\2\u0085\u0200\3\2\2\2\u0087\u0206\3\2\2\2\u0089\u0208\3\2"+
		"\2\2\u008b\u020d\3\2\2\2\u008d\u0212\3\2\2\2\u008f\u0215\3\2\2\2\u0091"+
		"\u0219\3\2\2\2\u0093\u021d\3\2\2\2\u0095\u0221\3\2\2\2\u0097\u0224\3\2"+
		"\2\2\u0099\u0227\3\2\2\2\u009b\u0229\3\2\2\2\u009d\u022b\3\2\2\2\u009f"+
		"\u0230\3\2\2\2\u00a1\u0236\3\2\2\2\u00a3\u023b\3\2\2\2\u00a5\u023f\3\2"+
		"\2\2\u00a7\u0244\3\2\2\2\u00a9\u0249\3\2\2\2\u00ab\u024e\3\2\2\2\u00ad"+
		"\u0255\3\2\2\2\u00af\u0259\3\2\2\2\u00b1\u025b\3\2\2\2\u00b3\u025f\3\2"+
		"\2\2\u00b5\u0261\3\2\2\2\u00b7\u0268\3\2\2\2\u00b9\u026b\3\2\2\2\u00bb"+
		"\u0272\3\2\2\2\u00bd\u027b\3\2\2\2\u00bf\u027e\3\2\2\2\u00c1\u0286\3\2"+
		"\2\2\u00c3\u0290\3\2\2\2\u00c5\u0294\3\2\2\2\u00c7\u029c\3\2\2\2\u00c9"+
		"\u02a3\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\4\3\2\2\2\u00d0\u00d2"+
		"\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\3\2\2\u00d6\6\3\2\2\2"+
		"\u00d7\u00d8\7=\2\2\u00d8\b\3\2\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g"+
		"\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7w\2\2\u00de\u00df"+
		"\7t\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7g\2\2\u00e1\n\3\2\2\2\u00e2\u00e3"+
		"\7i\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7d\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\f\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7z\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee\u00ef\7f\2\2\u00ef\16\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7"+
		"o\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\20\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8\22\3\2\2\2\u00f9\u00fa"+
		"\7x\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7t\2\2\u00fc\24\3\2\2\2\u00fd\u00fe"+
		"\7e\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7v\2\2\u0102\26\3\2\2\2\u0103\u0104\7}\2\2\u0104\30\3\2\2\2\u0105"+
		"\u0106\7\177\2\2\u0106\32\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7{\2"+
		"\2\u0109\u010a\7r\2\2\u010a\u010b\7g\2\2\u010b\34\3\2\2\2\u010c\u010d"+
		"\7?\2\2\u010d\36\3\2\2\2\u010e\u010f\7,\2\2\u010f \3\2\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7\"\2\2\u0114"+
		"\u0115\7n\2\2\u0115\u0116\7k\2\2\u0116\u0117\7v\2\2\u0117\u0118\7g\2\2"+
		"\u0118\u0119\7t\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\"\3\2"+
		"\2\2\u011c\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7c\2\2\u011f\u0120"+
		"\7n\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7n\2\2\u0122\u0123\7k\2\2\u0123"+
		"\u0124\7v\2\2\u0124\u0125\7g\2\2\u0125\u0126\7t\2\2\u0126\u0127\7c\2\2"+
		"\u0127\u0128\7n\2\2\u0128$\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b\7q\2"+
		"\2\u012b\u012c\7q\2\2\u012c\u012d\7n\2\2\u012d\u012e\7\"\2\2\u012e\u012f"+
		"\7n\2\2\u012f\u0130\7v\2\2\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134&\3\2\2\2\u0135\u0136\7e\2\2\u0136"+
		"\u0137\7j\2\2\u0137\u0138\7c\2\2\u0138\u0139\7t\2\2\u0139\u013a\7\"\2"+
		"\2\u013a\u013b\7n\2\2\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7t\2\2\u013f\u0140\7c\2\2\u0140\u0141\7n\2\2\u0141"+
		"(\3\2\2\2\u0142\u0143\7u\2\2\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148\7i\2\2\u0148\u0149\7\"\2"+
		"\2\u0149\u014a\7n\2\2\u014a\u014b\7k\2\2\u014b\u014c\7v\2\2\u014c\u014d"+
		"\7g\2\2\u014d\u014e\7t\2\2\u014e\u014f\7c\2\2\u014f\u0150\7n\2\2\u0150"+
		"*\3\2\2\2\u0151\u0152\7p\2\2\u0152\u0153\7w\2\2\u0153\u0154\7n\2\2\u0154"+
		"\u0155\7n\2\2\u0155\u0156\7\"\2\2\u0156\u0157\7n\2\2\u0157\u0158\7k\2"+
		"\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7c\2\2\u015c\u015d\7n\2\2\u015d,\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160"+
		"\7n\2\2\u0160\u0161\7q\2\2\u0161\u0162\7c\2\2\u0162\u0163\7v\2\2\u0163"+
		"\u0164\7\"\2\2\u0164\u0165\7n\2\2\u0165\u0166\7k\2\2\u0166\u0167\7v\2"+
		"\2\u0167\u0168\7g\2\2\u0168\u0169\7t\2\2\u0169\u016a\7c\2\2\u016a\u016b"+
		"\7n\2\2\u016b.\3\2\2\2\u016c\u016d\7*\2\2\u016d\60\3\2\2\2\u016e\u016f"+
		"\7+\2\2\u016f\62\3\2\2\2\u0170\u0171\7]\2\2\u0171\64\3\2\2\2\u0172\u0173"+
		"\7_\2\2\u0173\66\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0176\7,\2\2\u01768"+
		"\3\2\2\2\u0177\u0178\7\61\2\2\u0178:\3\2\2\2\u0179\u017a\7\'\2\2\u017a"+
		"<\3\2\2\2\u017b\u017c\7-\2\2\u017c>\3\2\2\2\u017d\u017e\7/\2\2\u017e@"+
		"\3\2\2\2\u017f\u0180\7~\2\2\u0180\u0181\7~\2\2\u0181B\3\2\2\2\u0182\u0183"+
		"\7#\2\2\u0183\u0184\7?\2\2\u0184D\3\2\2\2\u0185\u0186\7@\2\2\u0186\u0187"+
		"\7?\2\2\u0187F\3\2\2\2\u0188\u0189\7>\2\2\u0189\u018a\7?\2\2\u018aH\3"+
		"\2\2\2\u018b\u018c\7@\2\2\u018cJ\3\2\2\2\u018d\u018e\7>\2\2\u018eL\3\2"+
		"\2\2\u018f\u0190\7(\2\2\u0190N\3\2\2\2\u0191\u0192\7~\2\2\u0192P\3\2\2"+
		"\2\u0193\u0194\7z\2\2\u0194\u0195\7q\2\2\u0195\u0196\7t\2\2\u0196R\3\2"+
		"\2\2\u0197\u0198\7@\2\2\u0198\u0199\7@\2\2\u0199T\3\2\2\2\u019a\u019b"+
		"\7>\2\2\u019b\u019c\7>\2\2\u019cV\3\2\2\2\u019d\u019e\7<\2\2\u019e\u019f"+
		"\7?\2\2\u019f\u01a0\7<\2\2\u01a0X\3\2\2\2\u01a1\u01a2\7<\2\2\u01a2\u01a3"+
		"\7?\2\2\u01a3Z\3\2\2\2\u01a4\u01a5\7-\2\2\u01a5\u01a6\7<\2\2\u01a6\u01a7"+
		"\7?\2\2\u01a7\\\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9\u01aa\7<\2\2\u01aa\u01ab"+
		"\7?\2\2\u01ab^\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af"+
		"\7?\2\2\u01af`\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\7<\2\2\u01b2\u01b3"+
		"\7?\2\2\u01b3b\3\2\2\2\u01b4\u01b5\7\'\2\2\u01b5\u01b6\7<\2\2\u01b6\u01b7"+
		"\7?\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bb"+
		"\7<\2\2\u01bb\u01bc\7?\2\2\u01bcf\3\2\2\2\u01bd\u01be\7~\2\2\u01be\u01bf"+
		"\7<\2\2\u01bf\u01c0\7?\2\2\u01c0h\3\2\2\2\u01c1\u01c2\7(\2\2\u01c2\u01c3"+
		"\7<\2\2\u01c3\u01c4\7?\2\2\u01c4j\3\2\2\2\u01c5\u01c6\7~\2\2\u01c6\u01c7"+
		"\7~\2\2\u01c7\u01c8\7<\2\2\u01c8\u01c9\7?\2\2\u01c9l\3\2\2\2\u01ca\u01cb"+
		"\7@\2\2\u01cb\u01cc\7@\2\2\u01cc\u01cd\7<\2\2\u01cd\u01ce\7?\2\2\u01ce"+
		"n\3\2\2\2\u01cf\u01d0\7>\2\2\u01d0\u01d1\7>\2\2\u01d1\u01d2\7<\2\2\u01d2"+
		"\u01d3\7?\2\2\u01d3p\3\2\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7g\2\2\u01d6"+
		"\u01d7\7v\2\2\u01d7\u01d8\7w\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7p\2\2"+
		"\u01da\u01db\7u\2\2\u01dbr\3\2\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7g\2"+
		"\2\u01de\u01df\7y\2\2\u01dft\3\2\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2\7"+
		"q\2\2\u01e2\u01e3\7y\2\2\u01e3v\3\2\2\2\u01e4\u01e5\7j\2\2\u01e5\u01e6"+
		"\7k\2\2\u01e6\u01e7\7i\2\2\u01e7\u01e8\7j\2\2\u01e8x\3\2\2\2\u01e9\u01ea"+
		"\7<\2\2\u01eaz\3\2\2\2\u01eb\u01ec\7x\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee"+
		"\7n\2\2\u01ee|\3\2\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2"+
		"\7u\2\2\u01f2~\3\2\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6"+
		"\7h\2\2\u01f6\u0080\3\2\2\2\u01f7\u01f8\7e\2\2\u01f8\u01f9\7c\2\2\u01f9"+
		"\u01fa\7r\2\2\u01fa\u0082\3\2\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7c\2"+
		"\2\u01fd\u01fe\7n\2\2\u01fe\u01ff\7n\2\2\u01ff\u0084\3\2\2\2\u0200\u0201"+
		"\7d\2\2\u0201\u0202\7q\2\2\u0202\u0203\7i\2\2\u0203\u0204\7w\2\2\u0204"+
		"\u0205\7u\2\2\u0205\u0086\3\2\2\2\u0206\u0207\7\60\2\2\u0207\u0088\3\2"+
		"\2\2\u0208\u0209\7r\2\2\u0209\u020a\7t\2\2\u020a\u020b\7q\2\2\u020b\u020c"+
		"\7e\2\2\u020c\u008a\3\2\2\2\u020d\u020e\7u\2\2\u020e\u020f\7g\2\2\u020f"+
		"\u0210\7p\2\2\u0210\u0211\7f\2\2\u0211\u008c\3\2\2\2\u0212\u0213\7x\2"+
		"\2\u0213\u0214\7o\2\2\u0214\u008e\3\2\2\2\u0215\u0216\7u\2\2\u0216\u0217"+
		"\7g\2\2\u0217\u0218\7o\2\2\u0218\u0090\3\2\2\2\u0219\u021a\7t\2\2\u021a"+
		"\u021b\7g\2\2\u021b\u021c\7e\2\2\u021c\u0092\3\2\2\2\u021d\u021e\7c\2"+
		"\2\u021e\u021f\7p\2\2\u021f\u0220\7{\2\2\u0220\u0094\3\2\2\2\u0221\u0222"+
		"\7-\2\2\u0222\u0223\7-\2\2\u0223\u0096\3\2\2\2\u0224\u0225\7/\2\2\u0225"+
		"\u0226\7/\2\2\u0226\u0098\3\2\2\2\u0227\u0228\7A\2\2\u0228\u009a\3\2\2"+
		"\2\u0229\u022a\7\u0080\2\2\u022a\u009c\3\2\2\2\u022b\u022c\7h\2\2\u022c"+
		"\u022d\7k\2\2\u022d\u022e\7n\2\2\u022e\u022f\7g\2\2\u022f\u009e\3\2\2"+
		"\2\u0230\u0231\7w\2\2\u0231\u0232\7p\2\2\u0232\u0233\7k\2\2\u0233\u0234"+
		"\7q\2\2\u0234\u0235\7p\2\2\u0235\u00a0\3\2\2\2\u0236\u0237\7d\2\2\u0237"+
		"\u0238\7q\2\2\u0238\u0239\7q\2\2\u0239\u023a\7n\2\2\u023a\u00a2\3\2\2"+
		"\2\u023b\u023c\7k\2\2\u023c\u023d\7p\2\2\u023d\u023e\7v\2\2\u023e\u00a4"+
		"\3\2\2\2\u023f\u0240\7e\2\2\u0240\u0241\7j\2\2\u0241\u0242\7c\2\2\u0242"+
		"\u0243\7t\2\2\u0243\u00a6\3\2\2\2\u0244\u0245\7t\2\2\u0245\u0246\7g\2"+
		"\2\u0246\u0247\7c\2\2\u0247\u0248\7n\2\2\u0248\u00a8\3\2\2\2\u0249\u024a"+
		"\7g\2\2\u024a\u024b\7p\2\2\u024b\u024c\7w\2\2\u024c\u024d\7o\2\2\u024d"+
		"\u00aa\3\2\2\2\u024e\u024f\7u\2\2\u024f\u0250\7v\2\2\u0250\u0251\7t\2"+
		"\2\u0251\u0252\7k\2\2\u0252\u0253\7p\2\2\u0253\u0254\7i\2\2\u0254\u00ac"+
		"\3\2\2\2\u0255\u0256\7r\2\2\u0256\u0257\7v\2\2\u0257\u0258\7t\2\2\u0258"+
		"\u00ae\3\2\2\2\u0259\u025a\7B\2\2\u025a\u00b0\3\2\2\2\u025b\u025c\7o\2"+
		"\2\u025c\u025d\7q\2\2\u025d\u025e\7f\2\2\u025e\u00b2\3\2\2\2\u025f\u0260"+
		"\7`\2\2\u0260\u00b4\3\2\2\2\u0261\u0262\7e\2\2\u0262\u0263\7t\2\2\u0263"+
		"\u0264\7g\2\2\u0264\u0265\7c\2\2\u0265\u0266\7v\2\2\u0266\u0267\7g\2\2"+
		"\u0267\u00b6\3\2\2\2\u0268\u0269\7q\2\2\u0269\u026a\7p\2\2\u026a\u00b8"+
		"\3\2\2\2\u026b\u026c\7q\2\2\u026c\u026d\7r\2\2\u026d\u026e\7v\2\2\u026e"+
		"\u026f\7{\2\2\u026f\u0270\7r\2\2\u0270\u0271\7g\2\2\u0271\u00ba\3\2\2"+
		"\2\u0272\u0273\7g\2\2\u0273\u0274\7z\2\2\u0274\u0275\7v\2\2\u0275\u0276"+
		"\7g\2\2\u0276\u0277\7t\2\2\u0277\u0278\7p\2\2\u0278\u0279\7c\2\2\u0279"+
		"\u027a\7n\2\2\u027a\u00bc\3\2\2\2\u027b\u027c\7q\2\2\u027c\u027d\7r\2"+
		"\2\u027d\u00be\3\2\2\2\u027e\u027f\7r\2\2\u027f\u0280\7t\2\2\u0280\u0281"+
		"\7q\2\2\u0281\u0282\7e\2\2\u0282\u0283\7g\2\2\u0283\u0284\7u\2\2\u0284"+
		"\u0285\7u\2\2\u0285\u00c0\3\2\2\2\u0286\u0287\7r\2\2\u0287\u0288\7t\2"+
		"\2\u0288\u0289\7q\2\2\u0289\u028a\7e\2\2\u028a\u028b\7g\2\2\u028b\u028c"+
		"\7f\2\2\u028c\u028d\7w\2\2\u028d\u028e\7t\2\2\u028e\u028f\7g\2\2\u028f"+
		"\u00c2\3\2\2\2\u0290\u0291\7g\2\2\u0291\u0292\7p\2\2\u0292\u0293\7f\2"+
		"\2\u0293\u00c4\3\2\2\2\u0294\u0295\7k\2\2\u0295\u0296\7p\2\2\u0296\u0297"+
		"\7k\2\2\u0297\u0298\7v\2\2\u0298\u0299\7k\2\2\u0299\u029a\7c\2\2\u029a"+
		"\u029b\7n\2\2\u029b\u00c6\3\2\2\2\u029c\u029d\7h\2\2\u029d\u029e\7k\2"+
		"\2\u029e\u029f\7p\2\2\u029f\u02a0\7c\2\2\u02a0\u02a1\7n\2\2\u02a1\u00c8"+
		"\3\2\2\2\u02a2\u02a4\t\4\2\2\u02a3\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u00ca\3\2\2\2\6\2\u00ce\u00d3"+
		"\u02a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}