/* The following code was generated by JFlex 1.6.1 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass {
    
}
  

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./example_java.lex</tt>
 */
class Yylex {
	public static void main(String[] args) {
        FileReader fr = null;
        String input = "code.txt";
        try {
            fr = new FileReader(input);		
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lexeme\tToken\tAttribute");
        Yylex yylex = new Yylex(fr);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\33\1\33\1\33\1\33\31\0\1\32\2\0\1\41\1\42"+
    "\1\36\1\43\1\0\1\30\1\26\11\25\1\0\1\34\5\0\33\40"+
    "\1\27\21\40\1\31\14\40\12\0\1\33\u057a\0\14\24\1\37\16\24"+
    "\1\35\6\24\1\17\4\24\1\4\1\1\1\24\1\11\1\12\2\24"+
    "\1\10\1\21\1\24\1\2\1\24\1\7\1\24\1\13\1\24\1\45"+
    "\2\24\1\44\6\24\1\22\1\23\1\24\1\14\1\5\1\3\1\6"+
    "\1\20\146\24\1\16\34\24\1\15\63\24\u1928\0\1\33\1\33\udb26\0"+
    "\u02b0\24\160\0\220\24\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u0110\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\10\2\1\3\1\2\1\4\3\1\2\5"+
    "\2\6\1\7\1\10\7\2\1\11\4\2\1\12\1\13"+
    "\5\0\4\2\1\14\7\2\3\0\2\15\1\16\2\2"+
    "\1\17\1\2\1\20\1\21\2\2\1\22\2\23\2\15"+
    "\1\2\1\24\1\2\1\25\1\26\1\27\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a"+
    "\0\46\0\162\0\46\0\162\0\46\0\46\0\u0260\0\u0286"+
    "\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\162\0\u036a\0\u0390"+
    "\0\u03b6\0\u03dc\0\46\0\46\0\u023a\0\u0402\0\u0428\0\u044e"+
    "\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\162\0\u0532\0\u0558"+
    "\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688"+
    "\0\u06ae\0\u06d4\0\162\0\u06fa\0\u0720\0\162\0\u0746\0\162"+
    "\0\162\0\u076c\0\u0792\0\162\0\u0402\0\u0428\0\46\0\u0688"+
    "\0\u07b8\0\162\0\u07de\0\162\0\162\0\162\0\162";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\2\4\1\6\1\7\1\4"+
    "\1\10\2\4\1\11\1\4\1\12\1\13\1\14\3\4"+
    "\2\15\1\16\1\17\1\2\1\20\1\0\1\21\1\22"+
    "\1\23\1\24\2\2\1\25\1\26\1\27\1\4\47\0"+
    "\1\4\1\30\24\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\26\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\12\4\1\31\2\4\1\32\10\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\3\4\1\33"+
    "\22\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\13\4\1\34\12\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\3\4\1\35\22\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\3\4\1\36\22\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\2\4\1\37"+
    "\23\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\15\4\1\40\4\4\1\41\3\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\1\4\1\42\24\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\25\0\2\15\45\0"+
    "\1\43\2\0\1\44\1\45\43\0\1\46\10\0\1\47"+
    "\4\0\27\50\1\51\3\50\1\0\12\50\1\0\13\4"+
    "\1\52\12\4\6\0\1\4\1\0\1\4\4\0\2\4"+
    "\1\0\2\4\1\53\12\4\1\54\10\4\6\0\1\4"+
    "\1\0\1\4\4\0\2\4\1\0\13\4\1\55\12\4"+
    "\6\0\1\4\1\0\1\4\4\0\2\4\1\0\1\4"+
    "\1\56\24\4\6\0\1\4\1\0\1\4\4\0\2\4"+
    "\1\0\7\4\1\57\16\4\6\0\1\4\1\0\1\4"+
    "\4\0\2\4\1\0\3\4\1\60\22\4\6\0\1\4"+
    "\1\0\1\4\4\0\2\4\1\0\1\61\25\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\15\4\1\62"+
    "\10\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\1\4\1\63\24\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\10\4\1\64\15\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\6\4\1\65\17\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\26\46\1\66"+
    "\1\0\1\46\3\0\1\46\1\0\2\46\3\0\2\46"+
    "\33\47\1\0\5\47\1\67\4\47\27\0\1\70\2\0"+
    "\1\71\13\0\32\50\1\72\1\0\12\50\1\0\26\4"+
    "\6\0\1\4\1\0\1\4\4\0\1\4\1\73\1\0"+
    "\3\4\1\74\22\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\1\4\1\75\24\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\14\4\1\76\11\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\10\4\1\77"+
    "\15\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\21\4\1\100\4\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\10\4\1\101\15\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\3\4\1\102\22\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\2\4\1\103"+
    "\23\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\14\4\1\104\11\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\10\4\1\73\15\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\26\46\1\66\1\0\1\105"+
    "\3\0\1\46\1\0\2\46\3\0\2\46\30\47\1\106"+
    "\2\47\1\0\5\47\1\67\4\47\32\0\1\71\42\0"+
    "\1\107\45\0\1\110\2\0\1\71\14\0\4\4\1\111"+
    "\21\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\20\4\1\112\5\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\3\4\1\113\22\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4\1\0\5\4\1\114\20\4\6\0"+
    "\1\4\1\0\1\4\4\0\2\4\1\0\5\4\1\115"+
    "\20\4\6\0\1\4\1\0\1\4\4\0\2\4\1\0"+
    "\5\4\1\116\20\4\6\0\1\4\1\0\1\4\4\0"+
    "\2\4\1\0\1\4\1\117\24\4\6\0\1\4\1\0"+
    "\1\4\4\0\2\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2052];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\16\1\1\11\1\1\1\11\1\1\2\11"+
    "\14\1\2\11\5\0\14\1\3\0\16\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 25: break;
          case 2: 
            { System.out.println(yytext() + "\t" + "shenase\t" + '-');
            }
          case 26: break;
          case 3: 
            { System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
            }
          case 27: break;
          case 4: 
            { System.out.println(yytext() + "\t" + "adad\t" + '-');
            }
          case 28: break;
          case 5: 
            { System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
            }
          case 29: break;
          case 6: 
            { System.out.println(yytext() + "\t" + "comma\t" + '-');
            }
          case 30: break;
          case 7: 
            { System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
            }
          case 31: break;
          case 8: 
            { System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
            }
          case 32: break;
          case 9: 
            { System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
            }
          case 33: break;
          case 10: 
            { System.out.println(yytext() + "\t" + "null_char\t" + '-');
            }
          case 34: break;
          case 11: 
            { System.out.println(yytext() + "\t" + "new_line\t" + '-');
            }
          case 35: break;
          case 12: 
            { System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
            }
          case 36: break;
          case 13: 
            { System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
            }
          case 37: break;
          case 14: 
            { System.out.println(yytext() + "\t" + "BOOLEAN_CONSTANT\t" + '-');
            }
          case 38: break;
          case 15: 
            { System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
            }
          case 39: break;
          case 16: 
            { System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
            }
          case 40: break;
          case 17: 
            { System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
            }
          case 41: break;
          case 18: 
            { System.out.println(yytext() + "\t" + "when_kw\t" + '-');
            }
          case 42: break;
          case 19: 
            { System.out.println(yytext() + "\t" + "comments\t" + '-');
            }
          case 43: break;
          case 20: 
            { System.out.println(yytext() + "\t" + "return_kw\t" + '-');
            }
          case 44: break;
          case 21: 
            { System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
            }
          case 45: break;
          case 22: 
            { System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
            }
          case 46: break;
          case 23: 
            { System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
            }
          case 47: break;
          case 24: 
            { System.out.println(yytext() + "\t" + "type_kw\t" + '-');
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
