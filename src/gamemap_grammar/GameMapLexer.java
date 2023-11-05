// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GameMapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ROOMID=3, MONSTER=4, VALUABLES=5, WIELDABLE=6, OPENABLE=7, 
		FOOD=8, WHITESPACE=9, NEWLINE=10, ID=11, INT=12, BOOL=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ROOMID", "MONSTER", "VALUABLES", "WIELDABLE", "OPENABLE", 
			"FOOD", "WHITESPACE", "NEWLINE", "ID", "INT", "BOOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Connections'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ROOMID", "MONSTER", "VALUABLES", "WIELDABLE", "OPENABLE", 
			"FOOD", "WHITESPACE", "NEWLINE", "ID", "INT", "BOOL"
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


	public GameMapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

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
		"\u0004\u0000\r\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bY\b\b\u000b\b\f\bZ\u0001"+
		"\b\u0001\b\u0001\t\u0003\t`\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\nf\b\n\n\n\f\ni\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bn"+
		"\b\u000b\n\u000b\f\u000bq\t\u000b\u0003\u000bs\b\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f"+
		"\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\u0005\u0002\u0000\t\t  \u0003\u0000AZ__az\u0004\u00000"+
		"9AZ__az\u0001\u000019\u0001\u000009\u0084\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001"+
		"\u001b\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)"+
		"\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000"+
		"\u000fP\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013_"+
		"\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017r\u0001\u0000"+
		"\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b\u001c\u0005C\u0000\u0000"+
		"\u001c\u001d\u0005o\u0000\u0000\u001d\u001e\u0005n\u0000\u0000\u001e\u001f"+
		"\u0005n\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005c\u0000\u0000!\""+
		"\u0005t\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005o\u0000\u0000$%\u0005"+
		"n\u0000\u0000%&\u0005s\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005"+
		"-\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005R\u0000\u0000*+\u0005"+
		":\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003\u0017\u000b\u0000-.\u0005"+
		",\u0000\u0000./\u0003\u0019\f\u0000/\u0006\u0001\u0000\u0000\u000001\u0005"+
		"M\u0000\u000012\u0005:\u0000\u000023\u0001\u0000\u0000\u000034\u0003\u0015"+
		"\n\u000045\u0005,\u0000\u000056\u0003\u0015\n\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0005V\u0000\u000089\u0005:\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0003\u0015\n\u0000;<\u0005,\u0000\u0000<=\u0003\u0015\n\u0000=\n\u0001"+
		"\u0000\u0000\u0000>?\u0005W\u0000\u0000?@\u0005:\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AB\u0003\u0015\n\u0000BC\u0005,\u0000\u0000CD\u0003\u0015"+
		"\n\u0000D\f\u0001\u0000\u0000\u0000EF\u0005O\u0000\u0000FG\u0005:\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HI\u0003\u0015\n\u0000IJ\u0005,\u0000"+
		"\u0000JK\u0003\u0015\n\u0000KL\u0005,\u0000\u0000LM\u0003\u0019\f\u0000"+
		"MN\u0005,\u0000\u0000NO\u0003\t\u0004\u0000O\u000e\u0001\u0000\u0000\u0000"+
		"PQ\u0005F\u0000\u0000QR\u0005:\u0000\u0000RS\u0001\u0000\u0000\u0000S"+
		"T\u0003\u0015\n\u0000TU\u0005,\u0000\u0000UV\u0003\u0015\n\u0000V\u0010"+
		"\u0001\u0000\u0000\u0000WY\u0007\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0006\b\u0000\u0000]\u0012"+
		"\u0001\u0000\u0000\u0000^`\u0005\r\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\n\u0000\u0000"+
		"b\u0014\u0001\u0000\u0000\u0000cg\u0007\u0001\u0000\u0000df\u0007\u0002"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0016\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000js\u00050\u0000\u0000ko\u0007\u0003\u0000"+
		"\u0000ln\u0007\u0004\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000"+
		"rk\u0001\u0000\u0000\u0000s\u0018\u0001\u0000\u0000\u0000tu\u0005t\u0000"+
		"\u0000uv\u0005r\u0000\u0000vw\u0005u\u0000\u0000w~\u0005e\u0000\u0000"+
		"xy\u0005f\u0000\u0000yz\u0005a\u0000\u0000z{\u0005l\u0000\u0000{|\u0005"+
		"s\u0000\u0000|~\u0005e\u0000\u0000}t\u0001\u0000\u0000\u0000}x\u0001\u0000"+
		"\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u0007\u0000Z_gor}\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}