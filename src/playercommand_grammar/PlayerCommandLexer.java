// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PlayerCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ID", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pickup '", "'door n'", "'pickup item'", "'describe'", "'admire valuable'", 
			"'eat food'", "'stats'", "'wield weapon'", "'wield fistsoffury'", "'open chest'", 
			"'help'", "'attack'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NEWLINE"
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


	public PlayerCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

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
		"\u0004\u0000\u000e\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\f\u0099\b\f\n\f\f\f\u009c\t\f\u0001\r\u0003\r\u009f"+
		"\b\r\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0002\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u00a3\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003%\u0001\u0000"+
		"\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000"+
		"\tA\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rZ\u0001\u0000"+
		"\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011m\u0001\u0000\u0000\u0000"+
		"\u0013\u007f\u0001\u0000\u0000\u0000\u0015\u008a\u0001\u0000\u0000\u0000"+
		"\u0017\u008f\u0001\u0000\u0000\u0000\u0019\u0096\u0001\u0000\u0000\u0000"+
		"\u001b\u009e\u0001\u0000\u0000\u0000\u001d\u001e\u0005p\u0000\u0000\u001e"+
		"\u001f\u0005i\u0000\u0000\u001f \u0005c\u0000\u0000 !\u0005k\u0000\u0000"+
		"!\"\u0005u\u0000\u0000\"#\u0005p\u0000\u0000#$\u0005 \u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005d\u0000\u0000&\'\u0005o\u0000\u0000\'"+
		"(\u0005o\u0000\u0000()\u0005r\u0000\u0000)*\u0005 \u0000\u0000*+\u0005"+
		"n\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005p\u0000\u0000-.\u0005"+
		"i\u0000\u0000./\u0005c\u0000\u0000/0\u0005k\u0000\u000001\u0005u\u0000"+
		"\u000012\u0005p\u0000\u000023\u0005 \u0000\u000034\u0005i\u0000\u0000"+
		"45\u0005t\u0000\u000056\u0005e\u0000\u000067\u0005m\u0000\u00007\u0006"+
		"\u0001\u0000\u0000\u000089\u0005d\u0000\u00009:\u0005e\u0000\u0000:;\u0005"+
		"s\u0000\u0000;<\u0005c\u0000\u0000<=\u0005r\u0000\u0000=>\u0005i\u0000"+
		"\u0000>?\u0005b\u0000\u0000?@\u0005e\u0000\u0000@\b\u0001\u0000\u0000"+
		"\u0000AB\u0005a\u0000\u0000BC\u0005d\u0000\u0000CD\u0005m\u0000\u0000"+
		"DE\u0005i\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005"+
		" \u0000\u0000HI\u0005v\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005l\u0000"+
		"\u0000KL\u0005u\u0000\u0000LM\u0005a\u0000\u0000MN\u0005b\u0000\u0000"+
		"NO\u0005l\u0000\u0000OP\u0005e\u0000\u0000P\n\u0001\u0000\u0000\u0000"+
		"QR\u0005e\u0000\u0000RS\u0005a\u0000\u0000ST\u0005t\u0000\u0000TU\u0005"+
		" \u0000\u0000UV\u0005f\u0000\u0000VW\u0005o\u0000\u0000WX\u0005o\u0000"+
		"\u0000XY\u0005d\u0000\u0000Y\f\u0001\u0000\u0000\u0000Z[\u0005s\u0000"+
		"\u0000[\\\u0005t\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005t\u0000\u0000"+
		"^_\u0005s\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005w\u0000\u0000"+
		"ab\u0005i\u0000\u0000bc\u0005e\u0000\u0000cd\u0005l\u0000\u0000de\u0005"+
		"d\u0000\u0000ef\u0005 \u0000\u0000fg\u0005w\u0000\u0000gh\u0005e\u0000"+
		"\u0000hi\u0005a\u0000\u0000ij\u0005p\u0000\u0000jk\u0005o\u0000\u0000"+
		"kl\u0005n\u0000\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0005w\u0000\u0000"+
		"no\u0005i\u0000\u0000op\u0005e\u0000\u0000pq\u0005l\u0000\u0000qr\u0005"+
		"d\u0000\u0000rs\u0005 \u0000\u0000st\u0005f\u0000\u0000tu\u0005i\u0000"+
		"\u0000uv\u0005s\u0000\u0000vw\u0005t\u0000\u0000wx\u0005s\u0000\u0000"+
		"xy\u0005o\u0000\u0000yz\u0005f\u0000\u0000z{\u0005f\u0000\u0000{|\u0005"+
		"u\u0000\u0000|}\u0005r\u0000\u0000}~\u0005y\u0000\u0000~\u0012\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005o\u0000\u0000\u0080\u0081\u0005p\u0000\u0000"+
		"\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084"+
		"\u0005 \u0000\u0000\u0084\u0085\u0005c\u0000\u0000\u0085\u0086\u0005h"+
		"\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005s\u0000\u0000"+
		"\u0088\u0089\u0005t\u0000\u0000\u0089\u0014\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005h\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c\u008d\u0005"+
		"l\u0000\u0000\u008d\u008e\u0005p\u0000\u0000\u008e\u0016\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091"+
		"\u0092\u0005t\u0000\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094\u0005"+
		"c\u0000\u0000\u0094\u0095\u0005k\u0000\u0000\u0095\u0018\u0001\u0000\u0000"+
		"\u0000\u0096\u009a\u0007\u0000\u0000\u0000\u0097\u0099\u0007\u0001\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u001a\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0005\r\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\u001c\u0001\u0000\u0000\u0000\u0003"+
		"\u0000\u009a\u009e\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}