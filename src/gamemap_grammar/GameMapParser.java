// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Connections=13, ROOM=14, MONSTER=15, VALUABLES=16, 
		FOOD=17, ID=18, WS=19, NEWLINE=20, INT=21, FLOAT=22;
	public static final int
		RULE_gamemap = 0, RULE_room = 1, RULE_attr = 2, RULE_connections = 3, 
		RULE_command = 4, RULE_action = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "room", "attr", "connections", "command", "action"
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
			null, "Connections", "ROOM", "MONSTER", "VALUABLES", "FOOD", "ID", "WS", 
			"NEWLINE", "INT", "FLOAT"
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
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GamemapContext extends ParserRuleContext {
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public GamemapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamemap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGamemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGamemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGamemap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamemapContext gamemap() throws RecognitionException {
		GamemapContext _localctx = new GamemapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamemap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ROOM) {
				{
				{
				setState(12);
				room();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Connections) {
				{
				setState(18);
				connections();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoomContext extends ParserRuleContext {
		public TerminalNode ROOM() { return getToken(GameMapParser.ROOM, 0); }
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_room);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(ROOM);
			setState(22);
			match(ID);
			setState(23);
			match(NEWLINE);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				attr();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
	public static class AttrContext extends ParserRuleContext {
		public TerminalNode MONSTER() { return getToken(GameMapParser.MONSTER, 0); }
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public TerminalNode VALUABLES() { return getToken(GameMapParser.VALUABLES, 0); }
		public TerminalNode FOOD() { return getToken(GameMapParser.FOOD, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attr);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MONSTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(MONSTER);
				setState(30);
				match(NEWLINE);
				}
				break;
			case VALUABLES:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(VALUABLES);
				setState(32);
				match(NEWLINE);
				}
				break;
			case FOOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(FOOD);
				setState(34);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionsContext extends ParserRuleContext {
		public TerminalNode Connections() { return getToken(GameMapParser.Connections, 0); }
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitConnections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitConnections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(Connections);
			setState(38);
			match(NEWLINE);
			setState(39);
			connections();
			}
		}
		catch (RecognitionException re) {
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
	public static class CommandContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			action();
			setState(42);
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
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action);
		try {
			setState(69);
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
				setState(45);
				match(T__0);
				setState(46);
				match(ID);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(T__1);
				setState(48);
				match(ID);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(T__2);
				setState(50);
				match(ID);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(T__3);
				setState(52);
				match(ID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__4);
				setState(54);
				match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				match(T__5);
				setState(56);
				match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(T__6);
				setState(58);
				match(ID);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				match(T__7);
				setState(60);
				match(ID);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				match(T__8);
				setState(62);
				match(ID);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(T__9);
				setState(64);
				match(ID);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 12);
				{
				setState(65);
				match(T__10);
				setState(66);
				match(ID);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 13);
				{
				setState(67);
				match(T__11);
				setState(68);
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
		"\u0004\u0001\u0016H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001\f"+
		"\u0001\u001b\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"F\b\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0000R\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b"+
		")\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0003\u0006\u0003\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005\u000e\u0000\u0000\u0016\u0017\u0005\u0012\u0000\u0000"+
		"\u0017\u0019\u0005\u0014\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u000f\u0000\u0000"+
		"\u001e$\u0005\u0014\u0000\u0000\u001f \u0005\u0010\u0000\u0000 $\u0005"+
		"\u0014\u0000\u0000!\"\u0005\u0011\u0000\u0000\"$\u0005\u0014\u0000\u0000"+
		"#\u001d\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005\r\u0000\u0000"+
		"&\'\u0005\u0014\u0000\u0000\'(\u0003\u0006\u0003\u0000(\u0007\u0001\u0000"+
		"\u0000\u0000)*\u0003\n\u0005\u0000*+\u0005\u0014\u0000\u0000+\t\u0001"+
		"\u0000\u0000\u0000,F\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000"+
		".F\u0005\u0012\u0000\u0000/0\u0005\u0002\u0000\u00000F\u0005\u0012\u0000"+
		"\u000012\u0005\u0003\u0000\u00002F\u0005\u0012\u0000\u000034\u0005\u0004"+
		"\u0000\u00004F\u0005\u0012\u0000\u000056\u0005\u0005\u0000\u00006F\u0005"+
		"\u0012\u0000\u000078\u0005\u0006\u0000\u00008F\u0005\u0012\u0000\u0000"+
		"9:\u0005\u0007\u0000\u0000:F\u0005\u0012\u0000\u0000;<\u0005\b\u0000\u0000"+
		"<F\u0005\u0012\u0000\u0000=>\u0005\t\u0000\u0000>F\u0005\u0012\u0000\u0000"+
		"?@\u0005\n\u0000\u0000@F\u0005\u0012\u0000\u0000AB\u0005\u000b\u0000\u0000"+
		"BF\u0005\u0012\u0000\u0000CD\u0005\f\u0000\u0000DF\u0005\u0012\u0000\u0000"+
		"E,\u0001\u0000\u0000\u0000E-\u0001\u0000\u0000\u0000E/\u0001\u0000\u0000"+
		"\u0000E1\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000E5\u0001\u0000"+
		"\u0000\u0000E7\u0001\u0000\u0000\u0000E9\u0001\u0000\u0000\u0000E;\u0001"+
		"\u0000\u0000\u0000E=\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000"+
		"EA\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000F\u000b\u0001\u0000"+
		"\u0000\u0000\u0005\u000f\u0013\u001b#E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}