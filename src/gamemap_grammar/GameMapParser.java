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
		T__0=1, T__1=2, ROOMID=3, MONSTER=4, VALUABLES=5, WIELDABLE=6, OPENABLE=7, 
		FOOD=8, WHITESPACE=9, NEWLINE=10, ID=11, INT=12, BOOL=13;
	public static final int
		RULE_gamemap = 0, RULE_room = 1, RULE_attr = 2, RULE_connections = 3, 
		RULE_connection = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "room", "attr", "connections", "connection"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				room();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ROOMID );
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(15);
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
		public TerminalNode ROOMID() { return getToken(GameMapParser.ROOMID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GameMapParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GameMapParser.NEWLINE, i);
		}
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
			setState(18);
			match(ROOMID);
			setState(19);
			match(NEWLINE);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				attr();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0) );
			setState(25);
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
	public static class AttrContext extends ParserRuleContext {
		public TerminalNode MONSTER() { return getToken(GameMapParser.MONSTER, 0); }
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public TerminalNode VALUABLES() { return getToken(GameMapParser.VALUABLES, 0); }
		public TerminalNode FOOD() { return getToken(GameMapParser.FOOD, 0); }
		public TerminalNode WIELDABLE() { return getToken(GameMapParser.WIELDABLE, 0); }
		public TerminalNode OPENABLE() { return getToken(GameMapParser.OPENABLE, 0); }
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MONSTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(MONSTER);
				setState(28);
				match(NEWLINE);
				}
				break;
			case VALUABLES:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(VALUABLES);
				setState(30);
				match(NEWLINE);
				}
				break;
			case FOOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(FOOD);
				setState(32);
				match(NEWLINE);
				}
				break;
			case WIELDABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(WIELDABLE);
				setState(34);
				match(NEWLINE);
				}
				break;
			case OPENABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				match(OPENABLE);
				setState(36);
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
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(NEWLINE);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				connection();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			}
		}
		catch (RecognitionException re) {
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
	public static class ConnectionContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GameMapParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GameMapParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INT);
			setState(47);
			match(T__1);
			setState(48);
			match(INT);
			setState(49);
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

	public static final String _serializedATN =
		"\u0004\u0001\r4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0003\u0000"+
		"\u0011\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0016\b"+
		"\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003+\b\u0003\u000b\u0003\f\u0003,\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u00006\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n\f"+
		"\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000"+
		"\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0006\u0003"+
		"\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0003\u0000"+
		"\u0000\u0013\u0015\u0005\n\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\n\u0000\u0000\u001a"+
		"\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c"+
		"&\u0005\n\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e&\u0005"+
		"\n\u0000\u0000\u001f \u0005\b\u0000\u0000 &\u0005\n\u0000\u0000!\"\u0005"+
		"\u0006\u0000\u0000\"&\u0005\n\u0000\u0000#$\u0005\u0007\u0000\u0000$&"+
		"\u0005\n\u0000\u0000%\u001b\u0001\u0000\u0000\u0000%\u001d\u0001\u0000"+
		"\u0000\u0000%\u001f\u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000(*\u0005\n\u0000\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\f\u0000\u0000"+
		"/0\u0005\u0002\u0000\u000001\u0005\f\u0000\u000012\u0005\n\u0000\u0000"+
		"2\t\u0001\u0000\u0000\u0000\u0005\r\u0010\u0017%,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}