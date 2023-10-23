// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, NEWLINE=14;
	public static final int
		RULE_command = 0, RULE_action = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "action"
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

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			action();
			setState(5);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(T__0);
				setState(9);
				match(ID);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(10);
				match(T__1);
				setState(11);
				match(ID);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(12);
				match(T__2);
				setState(13);
				match(ID);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				match(T__3);
				setState(15);
				match(ID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(16);
				match(T__4);
				setState(17);
				match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(18);
				match(T__5);
				setState(19);
				match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(20);
				match(T__6);
				setState(21);
				match(ID);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 9);
				{
				setState(22);
				match(T__7);
				setState(23);
				match(ID);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 10);
				{
				setState(24);
				match(T__8);
				setState(25);
				match(ID);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 11);
				{
				setState(26);
				match(T__9);
				setState(27);
				match(ID);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 12);
				{
				setState(28);
				match(T__10);
				setState(29);
				match(ID);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 13);
				{
				setState(30);
				match(T__11);
				setState(31);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e#\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000,\u0000\u0004\u0001\u0000"+
		"\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0006\u0005\u000e\u0000\u0000\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0007!\u0001\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t!\u0005"+
		"\r\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000\u000b!\u0005\r\u0000\u0000"+
		"\f\r\u0005\u0003\u0000\u0000\r!\u0005\r\u0000\u0000\u000e\u000f\u0005"+
		"\u0004\u0000\u0000\u000f!\u0005\r\u0000\u0000\u0010\u0011\u0005\u0005"+
		"\u0000\u0000\u0011!\u0005\r\u0000\u0000\u0012\u0013\u0005\u0006\u0000"+
		"\u0000\u0013!\u0005\r\u0000\u0000\u0014\u0015\u0005\u0007\u0000\u0000"+
		"\u0015!\u0005\r\u0000\u0000\u0016\u0017\u0005\b\u0000\u0000\u0017!\u0005"+
		"\r\u0000\u0000\u0018\u0019\u0005\t\u0000\u0000\u0019!\u0005\r\u0000\u0000"+
		"\u001a\u001b\u0005\n\u0000\u0000\u001b!\u0005\r\u0000\u0000\u001c\u001d"+
		"\u0005\u000b\u0000\u0000\u001d!\u0005\r\u0000\u0000\u001e\u001f\u0005"+
		"\f\u0000\u0000\u001f!\u0005\r\u0000\u0000 \u0007\u0001\u0000\u0000\u0000"+
		" \b\u0001\u0000\u0000\u0000 \n\u0001\u0000\u0000\u0000 \f\u0001\u0000"+
		"\u0000\u0000 \u000e\u0001\u0000\u0000\u0000 \u0010\u0001\u0000\u0000\u0000"+
		" \u0012\u0001\u0000\u0000\u0000 \u0014\u0001\u0000\u0000\u0000 \u0016"+
		"\u0001\u0000\u0000\u0000 \u0018\u0001\u0000\u0000\u0000 \u001a\u0001\u0000"+
		"\u0000\u0000 \u001c\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\u0001 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}