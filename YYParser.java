
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "YYParser.y"  */

import java.io.*;
import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>YYParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENT = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int FLOAT_KW = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int INT_KW = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BAZ_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BASTE_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int CONSTANT_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_VIRGUL = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SHENASE = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int HARFE_SABET = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int KEY_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_THAN_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BASTE_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BAZ_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BASTE_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BAZ_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_EQUAL_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_EQUAL_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int FALSE_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int DONOGHTE_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_EQUAL_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_THAN_KW = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_EQUAL_KW = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_EQUAL_KW = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_PLUS_KW = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_MINUS_KW = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_EQUAL_KW = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_EQUAL_KW = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD_ASHARI = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int LOWER_THAN_ELSE_KW = 315;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 212 of "YYParser.y"  */
    {
		System.out.println("Rule 1.1 ");
		exportIntermediateCode();
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 218 of "YYParser.y"  */
    {
		System.out.println("Rule 2.1: ");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 221 of "YYParser.y"  */
    {
		System.out.println("Rule 2.2");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 226 of "YYParser.y"  */
    {
		System.out.println("Rule 3.1: ");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 229 of "YYParser.y"  */
    {
		System.out.println("Rule 3.2: " );
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 232 of "YYParser.y"  */
    {
		System.out.println("Rule 3.3: " );
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 237 of "YYParser.y"  */
    {
		System.out.println("Rule 4.1 ");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 241 of "YYParser.y"  */
    {
		System.out.println("Rule 4.2 ");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 246 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 250 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 255 of "YYParser.y"  */
    {
		System.out.println("Rule 6 eha");
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).type+" "+((EVal)(yystack.valueAt (3-(2)))).type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_BOOLEAN:
									emit("bprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						System.err.println("Error! Initializer number mismatch. (Expected: 1" + ", Number: " + ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() + ")");
						return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			/*System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + $2.type + ")");
			return YYABORT;*/
		}
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 336 of "YYParser.y"  */
    {
	System.out.println("Rule 8.1");
	
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 342 of "YYParser.y"  */
    {
	System.out.println("Rule 8.2");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 347 of "YYParser.y"  */
    {
		System.out.println("Rule 8.3");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 352 of "YYParser.y"  */
    {
		System.out.println("Rule 8.4");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 359 of "YYParser.y"  */
    {
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).type+" "+((EVal)(yystack.valueAt (3-(2)))).type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						//System.err.println("Error! Initializer number mismatch. (Expected: //1" + ", Number: " + $2.initializersList.get(i).size() + ")");
						//return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			//System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + //$2.type + ")");
			//return YYABORT;
		}
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 436 of "YYParser.y"  */
    {
		System.out.println("Rule 10.1 ");
		
		System.out.println("Rule 5.2: " +
			"delarator_list: declarator_end 00");
		yyval = new EVal();
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (1-(1)))));
		((EVal)yyval).initializersList = EVal.makeInitializersList(((EVal)(yystack.valueAt (1-(1)))).initializers);
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 448 of "YYParser.y"  */
    {
		System.out.println("Rule 5.1: " +
			"declarator_list: declarator_list declarator");
		if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_UNKNOWN
			|| ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(3)))).type) {
			yyval = new EVal();
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
			((EVal)yyval).declareds = ((EVal)(yystack.valueAt (3-(1)))).declareds;
			((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (3-(3)))));
			((EVal)yyval).initializersList = ((EVal)(yystack.valueAt (3-(1)))).initializersList;
			((EVal)yyval).initializersList.add(((EVal)(yystack.valueAt (3-(3)))).initializers);
		} else {
			//System.err.println("Error! Declarator type mismatch.");
			//return YYABORT;
		}
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 466 of "YYParser.y"  */
    {
	System.out.println("Rule 11.1 ");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 472 of "YYParser.y"  */
    {
		System.out.println("Rule 11.2 ");
		/*if($1.array != $3.array) {
			System.err.println("Error! Array mismatch: " + $1.place + " and " + $3.place + " are not the same.");
			return YYABORT;
		}*/
		
		if(((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN){
		backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() );
		backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad() + 2);
		
		emit(":=", "1", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		emit("goto", null, null, String.valueOf(nextQuad() + 2));
		emit(":=", "0", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		
		}
		else{
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		}
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 506 of "YYParser.y"  */
    {
		System.out.println("Rule 8.1: " +
			"dec: saved_identifier");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 513 of "YYParser.y"  */
    {
		
		System.out.println("Rule 8.3: " +
			"dec: saved_identifier LB_KW saved_integer RB_KW");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (4-(1)))).place;
		((EVal)yyval).array = true;

		symbolTable.addToSymbolTable(startStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", "0", null , startStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(sizeStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", ((EVal)(yystack.valueAt (4-(3)))).place, null , sizeStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(indexStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		symbolTable.addToSymbolTable(condStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 532 of "YYParser.y"  */
    {
		System.out.println("Rule 13.1");
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 536 of "YYParser.y"  */
    {
		System.out.println("Rule 13.2");
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 540 of "YYParser.y"  */
    {System.out.println("Rule 13.3");};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 542 of "YYParser.y"  */
    {System.out.println("Rule 13.4");};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 545 of "YYParser.y"  */
    {System.out.println("Rule 15.1");};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 547 of "YYParser.y"  */
    {System.out.println("Rule 15.2");};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 550 of "YYParser.y"  */
    {System.out.println("Rule 16");};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 553 of "YYParser.y"  */
    {System.out.println("Rule 17.1");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 555 of "YYParser.y"  */
    {System.out.println("Rule 17.2");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 558 of "YYParser.y"  */
    {System.out.println("Rule 18.1");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 559 of "YYParser.y"  */
    {System.out.println("Rule 18.2");};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 562 of "YYParser.y"  */
    {System.out.println("Rule 19.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 566 of "YYParser.y"  */
    {System.out.println("Rule 19.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 570 of "YYParser.y"  */
    {System.out.println("Rule 19.3");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 574 of "YYParser.y"  */
    {System.out.println("Rule 19.4");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 578 of "YYParser.y"  */
    {System.out.println("Rule 19.5");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 582 of "YYParser.y"  */
    {System.out.println("Rule 19.6");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 587 of "YYParser.y"  */
    {
		System.out.println("Rule 20.1");
	};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 591 of "YYParser.y"  */
    {
		System.out.println("Rule 20.2");
	};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 595 of "YYParser.y"  */
    {
		System.out.println("Rule 20.3");
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 599 of "YYParser.y"  */
    {
		System.out.println("Rule 20.4");
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 604 of "YYParser.y"  */
    {
	System.out.println("Rule 21.1 jomleha : jomleha M jomle");
	yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
		backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, ((EVal)(yystack.valueAt (3-(2)))).quad);
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 611 of "YYParser.y"  */
    {
	System.out.println("Rule 21.2 jomleha : jomle");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 619 of "YYParser.y"  */
    {
		System.out.println("Rule 22.1 jomleyeEbarat : ebarat NOGHTE_VIRGUL M");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(1)))).nextList;
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 625 of "YYParser.y"  */
    {
	System.out.println("Rule 22.2 jomleyeEbarat : NOGHTE_VIRGUL M");
	yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(((EVal)(yystack.valueAt (2-(2)))).quad);};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 631 of "YYParser.y"  */
    {
		System.out.println("Rule 23.1 jomleyeEntekhab : IF_KW ebarateSade THEN_KW jomle M %prec LOWER_THAN_ELSE_KW ");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (5-(2)))).trueList, ((EVal)(yystack.valueAt (5-(4)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (5-(2)))).falseList, ((EVal)(yystack.valueAt (5-(5)))).nextList);};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 637 of "YYParser.y"  */
    {
		System.out.println("Rule 23.2 jomleyeEntekhab : IF_KW ebarateSade THEN_KW M jomle N ELSE_KW M jomle ");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (9-(2)))).trueList, ((EVal)(yystack.valueAt (9-(4)))).quad);
		backpatch(((EVal)(yystack.valueAt (9-(2)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(5)))).nextList, ((EVal)(yystack.valueAt (9-(6)))).nextList);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);

	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 647 of "YYParser.y"  */
    {System.out.println("Rule 23.3 jomleyeEntekhab : KEY_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE onsoreHalat onsorePishfarz END_KW ");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (8-(6)))).nextList, ((EVal)(yystack.valueAt (8-(7)))).nextList);

		int last = ((EVal)(yystack.valueAt (8-(6)))).falseList.size() - 1;
		backpatch(((EVal)(yystack.valueAt (8-(5)))).nextList, ((EVal)(yystack.valueAt (8-(6)))).initList.get(0));
		backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(last), nextQuad());
		for(int i = 0; i < ((EVal)(yystack.valueAt (8-(6)))).declareds.size() - 1; i++) {
			backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(i), ((EVal)(yystack.valueAt (8-(6)))).initList.get(i + 1));

			emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(i).place, ((EVal)yyval).place);
			emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(i))); // result will not be backpatched.
		}
		emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(last).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(last))); // result will not be backpatched.

		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (8-(7)))).quad)); // result will not be backpatched.


	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 669 of "YYParser.y"  */
    {System.out.println("Rule 23.4");};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 673 of "YYParser.y"  */
    { System.out.println("Rule 24.1 onsoreHalat : SWITCH_KW M saved_integer N  DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = EVal.makeList(((EVal)(yystack.valueAt (8-(2)))).quad); // Starting point of saving saved_integer is stored in initList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (8-(3))))); // saved_integer value is stored in declareds.
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (8-(4)))).nextList; // If there is another init point this will be backpatched to next init point, else to test point.
		((EVal)yyval).trueList = EVal.makeList(((EVal)(yystack.valueAt (8-(6)))).quad); // Starting point of block is stored in trueList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (8-(7)))).nextList;

	 };
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 683 of "YYParser.y"  */
    {System.out.println("Rule 24.2 onsoreHalat : onsoreHalat SWITCH_KW M saved_integer N DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = ((EVal)(yystack.valueAt (9-(1)))).initList;
		((EVal)yyval).initList.add(((EVal)(yystack.valueAt (9-(3)))).quad);
		((EVal)yyval).declareds = ((EVal)(yystack.valueAt (9-(1)))).declareds;
		((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (9-(4)))));
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (9-(1)))).falseList, ((EVal)(yystack.valueAt (9-(5)))).nextList);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (9-(1)))).trueList;
		((EVal)yyval).trueList.add(((EVal)(yystack.valueAt (9-(7)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(1)))).nextList, ((EVal)(yystack.valueAt (9-(8)))).nextList);
};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 696 of "YYParser.y"  */
    {System.out.println("Rule 25 onsorePishfarz: DEFAULT_KW DONOGHTE_KW M jomle N NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).quad = ((EVal)(yystack.valueAt (6-(3)))).quad;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (6-(5)))).nextList;
		};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 703 of "YYParser.y"  */
    {System.out.println("Rule 26 jomleyeTekrar: WHILE_KW PARANTHESIS_BAZ_KW M ebarateSade PARANTHESIS_BASTE_KW M jomle ");
	yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(4)))).falseList;

		backpatch(((EVal)(yystack.valueAt (7-(7)))).nextList, ((EVal)(yystack.valueAt (7-(3)))).quad);
		backpatch(((EVal)(yystack.valueAt (7-(4)))).trueList, ((EVal)(yystack.valueAt (7-(6)))).quad);
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 713 of "YYParser.y"  */
    {System.out.println("Rule 27.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 717 of "YYParser.y"  */
    {System.out.println("Rule 27.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 722 of "YYParser.y"  */
    {System.out.println("Rule 28");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 727 of "YYParser.y"  */
    {
	System.out.println("Rule 29.1");
	if(((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN){
		if(((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN){
		backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() );
		backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad() + 2);
		
		emit(":=", "1", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		emit("goto", null, null, String.valueOf(nextQuad() + 2));
		emit(":=", "0", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		
		}
	}
	else{
	emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null, ((EVal)(yystack.valueAt (3-(1)))).place);
	}
	
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 753 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 788 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("-", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 823 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 858 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("/", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 893 of "YYParser.y"  */
    {System.out.println("Rule 29.6");};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 895 of "YYParser.y"  */
    {System.out.println("Rule 29.7");};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 897 of "YYParser.y"  */
    {System.out.println(" Rule 29.8 ebarateSade to ebarat");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 905 of "YYParser.y"  */
    {
		System.out.println("Rule 30.1: " +
			"bool_expressions: expressions OR_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(4)))).trueList);
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (4-(4)))).falseList;
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 916 of "YYParser.y"  */
    {
		System.out.println("Rule 30.2: " +
			"bool_expressions: expressions AND_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (4-(4)))).trueList;
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(4)))).falseList);
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 927 of "YYParser.y"  */
    {
		System.out.println("Rule 30.3: " +
			"bool_expressions: expressions OR_ELSE_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 949 of "YYParser.y"  */
    {
		System.out.println("Rule 30.4: " +
			"bool_expressions: expressions AND_THEN_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 971 of "YYParser.y"  */
    {
		System.out.println("Rule 30.5: " +
			"bool_expressions: NOT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (2-(2)))).falseList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (2-(2)))).trueList;
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 981 of "YYParser.y"  */
    {
		System.out.println("Rule 30.6 ebarateRabetei to ebarateSade");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 991 of "YYParser.y"  */
    {
		System.out.println("Rule 31.1 ebarateRiaziManteghi to ebarateRabetei");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 1000 of "YYParser.y"  */
    {
		System.out.println("Rule 31.2: " +
			"bool_expressions: expressions LT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 1014 of "YYParser.y"  */
    {
		System.out.println("Rule 31.3: " +
			"bool_expressions: expressions LE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 1028 of "YYParser.y"  */
    {
		System.out.println("Rule 31.4: " +
			"bool_expressions: expressions GT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 1042 of "YYParser.y"  */
    {
		System.out.println("Rule 31.5: " +
			"bool_expressions: expressions GE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 1056 of "YYParser.y"  */
    {
		System.out.println("Rule 31.6: " +
			"bool_expressions: expressions EQ_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("==", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 1071 of "YYParser.y"  */
    {
		if(((EVal)(yystack.valueAt (1-(1)))).type == EVal.TYPE_CODE_BOOLEAN){
			System.out.println("Rule 27.4: " +
			"constant_expressions: saved_boolean");
			yyval = new EVal();
			((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
			((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
			((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		}
		else{
		System.out.println("Rule 26.4: " +
			"expressions: saved_identifier");
		int index = symbolTable.lookUp(((EVal)(yystack.valueAt (1-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not declared.");
			return YYABORT;
		}
		if (symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = symbolTable.names.get(index);
		((EVal)yyval).type = symbolTable.types.get(index);

		
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
		}
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 1108 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 1148 of "YYParser.y"  */
    {
		System.out.println("Rule 29.2: " +
			"arithmatic_expressions: expressions SUB_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"-\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 1187 of "YYParser.y"  */
    {
		System.out.println("Rule 29.3: " +
			"arithmatic_expressions: expressions MUL_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"*\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 1226 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.4: " +
			"arithmatic_expressions: expressions DIV_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"/\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 1266 of "YYParser.y"  */
    {
		System.out.println("Rule 29.5: " +
			"arithmatic_expressions: expressions MOD_KW expressions");
		if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"%\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 1314 of "YYParser.y"  */
    {System.out.println("Rule 35.1");};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 1316 of "YYParser.y"  */
    {System.out.println("Rule 35.2 amel to ebarateYegani");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 1324 of "YYParser.y"  */
    {System.out.println("Rule 36.1");};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 1326 of "YYParser.y"  */
    {System.out.println("Rule 36.2");};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 1328 of "YYParser.y"  */
    {System.out.println("Rule 36.3");};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 1331 of "YYParser.y"  */
    {
		System.out.println("Rule 37.1 taghirpazir to amel");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 1340 of "YYParser.y"  */
    {System.out.println("Rule 37.2 taghirnapazir to amel");
					yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 1348 of "YYParser.y"  */
    {
		System.out.println("Rule 38.1 saved_identifier to taghirpazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 1357 of "YYParser.y"  */
    {System.out.println("Rule 38.2");};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 1359 of "YYParser.y"  */
    {System.out.println("Rule 38.3");};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 1362 of "YYParser.y"  */
    {System.out.println("Rule 39.1");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(2)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(2)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(2)))).falseList;};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 1369 of "YYParser.y"  */
    {System.out.println("Rule 39.2");};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 1371 of "YYParser.y"  */
    {
		System.out.println("Rule 39.3: meghdareSabet to taghirnapazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 1381 of "YYParser.y"  */
    {System.out.println("Rule 40.1");};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 1383 of "YYParser.y"  */
    {System.out.println("Rule 40.2");};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1386 of "YYParser.y"  */
    {System.out.println("Rule 42.1");};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1388 of "YYParser.y"  */
    {System.out.println("Rule 42.2");};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1391 of "YYParser.y"  */
    {
		System.out.println("Rule 43.1: " +
			"constant_expressions: saved_integer");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1402 of "YYParser.y"  */
    {
		System.out.println("Rule 43.2: " +
			"constant_expressions: saved_real");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1413 of "YYParser.y"  */
    {
		System.out.println("Rule 43.3: " +
			"constant_expressions: saved_char");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1424 of "YYParser.y"  */
    {
		System.out.println("Rule 43.4: " +
			"constant_expressions: saved_boolean");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1436 of "YYParser.y"  */
    {
		System.out.println("Rule 30: " +
			"saved_identifier: IDENTIFIER");
		yyval = new EVal();
		((EVal)yyval).place = lexIdentifier;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1448 of "YYParser.y"  */
    {
		System.out.println("Rule 31: " +
			"saved_integer: INTEGER_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1465 of "YYParser.y"  */
    {
		System.out.println("Rule 32: " +
			"saved_real: REAL_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1481 of "YYParser.y"  */
    {
		System.out.println("saved_char: HARFE_SABET");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1496 of "YYParser.y"  */
    {
		System.out.println("Rule 34.1: " +
			"saved_boolean: TRUE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "1", null, ((EVal)yyval).place);
		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.
	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1511 of "YYParser.y"  */
    {
		System.out.println("Rule 34.2: " +
			"saved_boolean: FALSE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "0", null, ((EVal)yyval).place);

		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.

	};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1530 of "YYParser.y"  */
    {
		System.out.println("Rule 35: " +
			"M: ");
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1538 of "YYParser.y"  */
    {
		System.out.println("Rule 36: " +
			"N: ");
		yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2485 of "YYParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -101;
  private static final short yypact_[] =
  {
         4,    38,    75,   221,  -101,  -101,  -101,  -101,  -101,    47,
      43,   221,  -101,  -101,    53,  -101,  -101,    98,    28,  -101,
      45,    12,  -101,    71,    81,   368,   256,    91,   -15,  -101,
      56,    95,  -101,   302,   102,  -101,   374,  -101,    95,   183,
    -101,   302,   302,   302,    96,  -101,  -101,  -101,  -101,    97,
    -101,   302,  -101,  -101,  -101,  -101,  -101,  -101,  -101,  -101,
    -101,  -101,  -101,  -101,   113,    33,  -101,    -3,  -101,   114,
    -101,   301,  -101,  -101,  -101,   103,  -101,  -101,  -101,  -101,
     110,   131,  -101,   241,   256,   256,    92,  -101,    33,     8,
     115,  -101,  -101,    89,  -101,   229,  -101,   140,   128,   129,
     134,    86,  -101,  -101,  -101,   302,   126,  -101,  -101,  -101,
    -101,  -101,   114,   114,   114,   114,   114,   114,   114,   114,
     114,   114,  -101,    95,   302,   302,   302,   302,  -101,  -101,
     302,   302,   280,   130,    91,  -101,  -101,  -101,   256,  -101,
    -101,  -101,   155,  -101,   256,  -101,  -101,  -101,   256,   302,
     159,  -101,  -101,   302,   302,   302,   302,   -24,     3,  -101,
       3,  -101,   -24,     3,  -101,     3,     3,  -101,   132,  -101,
    -101,  -101,  -101,  -101,  -101,  -101,    27,  -101,  -101,  -101,
    -101,  -101,  -101,   256,   276,   157,  -101,    -5,    -5,  -101,
    -101,   302,  -101,  -101,  -101,  -101,  -101,    57,   157,  -101,
     149,   256,   102,  -101,  -101,    42,  -101,  -101,  -101,   102,
     123,   162,   256,   127,  -101,  -101,  -101,  -101,  -101,   135,
     256,   256,  -101,  -101,   152,   256,   153,  -101,   166,  -101,
    -101
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,    14,    13,    16,    15,     0,
       0,     2,     4,     5,     0,     6,     7,     0,     0,     3,
     107,     0,    18,    20,    22,     0,     0,     0,     0,    29,
       0,     0,    17,     0,     0,     9,     0,    11,     0,     0,
     113,   113,     0,     0,     0,   113,   108,   107,   110,     0,
      89,     0,   111,    90,   112,    88,   109,    27,    35,    36,
      37,    38,    39,    40,     0,    67,    73,    74,    80,     0,
      87,    91,    92,    97,    98,    93,   103,   104,   105,   106,
      33,    30,    32,     0,     0,     0,     0,    19,    21,    91,
       0,     8,    10,     0,    44,     0,    46,   113,     0,     0,
       0,     0,    72,   113,    48,     0,     0,   113,   113,   113,
     113,   113,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    86,     0,     0,     0,     0,     0,    65,    66,
       0,     0,     0,     0,     0,    28,    26,    25,     0,    23,
      12,    42,   113,    43,     0,    59,    58,    57,     0,     0,
       0,    96,    47,     0,     0,     0,     0,    81,    77,    83,
      79,    84,    82,    76,    85,    75,    78,    95,     0,    60,
      64,    61,    62,    63,   100,   102,     0,    34,    31,    24,
      41,    45,   113,     0,     0,     0,    69,    68,    70,    71,
      94,     0,    99,    49,   114,   113,   113,     0,     0,   101,
       0,     0,     0,   113,    52,     0,   113,    56,   114,     0,
       0,     0,     0,     0,   114,   113,    51,    50,   113,     0,
       0,     0,   113,   114,     0,     0,     0,    53,     0,    55,
      54
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -101,  -101,  -101,   189,  -101,   163,   -16,     6,  -101,   167,
     170,  -101,  -101,   177,   133,  -101,    84,   -26,  -101,   120,
    -101,  -101,    21,  -101,  -101,  -101,  -101,   -40,   -28,  -101,
     250,   151,  -101,  -101,   -17,  -101,  -101,  -101,  -101,    -8,
     -32,  -101,  -101,  -101,   -37,  -100
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    13,    36,    37,    38,    15,    21,
      22,    23,    16,    28,    29,    81,    82,    96,    58,    97,
      59,    60,   197,   211,    61,    62,    63,    64,    65,    66,
      67,    68,    69,    70,    71,    72,    73,   176,    74,    75,
      76,    77,    78,    79,   144,   198
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        57,    99,    90,    98,   100,    88,    24,   112,   104,    14,
     114,   106,    83,   112,   101,   102,    89,    14,   108,   116,
      92,     1,    84,    24,    27,    89,    89,   119,    31,   113,
      24,   114,     5,     6,     7,     8,    27,   114,   115,    32,
     116,   123,   111,   191,   124,   117,   116,   118,   119,   120,
     121,   117,    89,   203,   119,   210,   108,   109,   136,   137,
       5,     6,     7,     8,   192,    26,   149,     3,   203,   204,
     152,   153,   154,   155,   156,     4,    17,   150,   110,    92,
     111,    18,    20,    30,   168,   169,   170,   171,    89,    27,
     172,   173,   175,    85,   200,    89,    89,    89,    89,    89,
      89,    89,    89,    89,    89,    31,    25,   148,   213,   108,
     109,   183,   179,    33,   219,   167,   140,    34,   181,    83,
      80,   184,   182,   226,    47,   186,   187,   188,   189,   138,
      46,   110,    89,   111,   103,   105,    89,    89,    89,    89,
     107,   132,    46,    47,    48,   193,   133,   134,    50,   143,
     139,   199,    51,    52,    53,   145,   146,   194,   201,   202,
      54,   147,    55,   151,   180,   177,   209,   190,   196,   212,
     208,   206,   215,    56,   216,   207,   218,   214,   220,   227,
     229,   221,   108,   109,   222,   225,   217,     5,     6,     7,
       8,    39,    94,   230,   223,   224,   185,    40,    41,   228,
      19,    87,    95,    42,   110,    93,   111,    86,    43,    44,
      45,    46,    47,    48,    49,   142,   135,    50,   178,   205,
     122,    51,    52,    53,     0,     5,     6,     7,     8,    54,
       0,    55,     0,     5,     6,     7,     8,    39,   141,     9,
       0,     0,    56,    40,    41,     5,     6,     7,     8,    42,
      10,     0,     0,     0,    43,    44,    45,    46,    47,    48,
      49,     0,     0,    50,    39,     0,     0,    51,    52,    53,
      40,    41,     0,     0,     0,    54,    42,    55,     0,     0,
       0,    43,    44,    45,    46,    47,    48,    49,    56,     0,
      50,     0,     0,     0,    51,    52,    53,     0,     0,   108,
     109,     0,    54,     0,    55,    43,     0,     0,    46,    47,
      48,     0,     0,   195,    50,    56,     0,   174,    51,    52,
      53,   110,     0,   111,     0,     0,    54,    43,    55,     0,
      46,    47,    48,     0,   123,     0,    50,   124,     0,    56,
      51,    52,    53,   125,     0,   126,     0,     0,    54,     0,
      55,     0,     0,     0,     0,   127,   128,   129,   130,   131,
       0,    56,   157,   158,   159,   160,   161,   162,   163,   164,
     165,   166,     5,     6,     7,     8,     0,    35,     5,     6,
       7,     8,     0,    91
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        26,    41,    34,    40,    41,    33,    14,    10,    45,     3,
      34,    51,    27,    10,    42,    43,    33,    11,    23,    43,
      36,    17,    37,    31,    18,    42,    43,    51,    16,    32,
      38,    34,     4,     5,     6,     7,    30,    34,    41,    27,
      43,    33,    47,    16,    36,    48,    43,    50,    51,    52,
      53,    48,    69,    11,    51,    13,    23,    24,    84,    85,
       4,     5,     6,     7,    37,    37,   103,    29,    11,    12,
     107,   108,   109,   110,   111,     0,    29,   105,    45,    95,
      47,    38,    29,    38,   124,   125,   126,   127,   105,    83,
     130,   131,   132,    37,   194,   112,   113,   114,   115,   116,
     117,   118,   119,   120,   121,    16,     8,    21,   208,    23,
      24,   148,   138,    42,   214,   123,    27,    36,   144,    27,
      29,   149,   148,   223,    29,   153,   154,   155,   156,    37,
      28,    45,   149,    47,    38,    38,   153,   154,   155,   156,
      27,    38,    28,    29,    30,   182,    36,    16,    34,     9,
      35,   191,    38,    39,    40,    27,    27,   183,   195,   196,
      46,    27,    48,    37,     9,    35,   203,    35,    11,   206,
     202,    22,    49,    59,    12,   201,    49,   209,   215,    27,
      27,   218,    23,    24,    49,   222,   212,     4,     5,     6,
       7,     8,     9,    27,   220,   221,    37,    14,    15,   225,
      11,    31,    39,    20,    45,    38,    47,    30,    25,    26,
      27,    28,    29,    30,    31,    95,    83,    34,   134,   198,
      69,    38,    39,    40,    -1,     4,     5,     6,     7,    46,
      -1,    48,    -1,     4,     5,     6,     7,     8,     9,    18,
      -1,    -1,    59,    14,    15,     4,     5,     6,     7,    20,
      29,    -1,    -1,    -1,    25,    26,    27,    28,    29,    30,
      31,    -1,    -1,    34,     8,    -1,    -1,    38,    39,    40,
      14,    15,    -1,    -1,    -1,    46,    20,    48,    -1,    -1,
      -1,    25,    26,    27,    28,    29,    30,    31,    59,    -1,
      34,    -1,    -1,    -1,    38,    39,    40,    -1,    -1,    23,
      24,    -1,    46,    -1,    48,    25,    -1,    -1,    28,    29,
      30,    -1,    -1,    37,    34,    59,    -1,    37,    38,    39,
      40,    45,    -1,    47,    -1,    -1,    46,    25,    48,    -1,
      28,    29,    30,    -1,    33,    -1,    34,    36,    -1,    59,
      38,    39,    40,    42,    -1,    44,    -1,    -1,    46,    -1,
      48,    -1,    -1,    -1,    -1,    54,    55,    56,    57,    58,
      -1,    59,   112,   113,   114,   115,   116,   117,   118,   119,
     120,   121,     4,     5,     6,     7,    -1,     9,     4,     5,
       6,     7,    -1,     9
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    17,    62,    29,     0,     4,     5,     6,     7,    18,
      29,    63,    64,    65,    68,    69,    73,    29,    38,    64,
      29,    70,    71,    72,   100,     8,    37,    68,    74,    75,
      38,    16,    27,    42,    36,     9,    66,    67,    68,     8,
      14,    15,    20,    25,    26,    27,    28,    29,    30,    31,
      34,    38,    39,    40,    46,    48,    59,    78,    79,    81,
      82,    85,    86,    87,    88,    89,    90,    91,    92,    93,
      94,    95,    96,    97,    99,   100,   101,   102,   103,   104,
      29,    76,    77,    27,    37,    37,    74,    71,    89,    95,
     101,     9,    67,    70,     9,    66,    78,    80,   105,    88,
     105,    89,    89,    38,   105,    38,    88,    27,    23,    24,
      45,    47,    10,    32,    34,    41,    43,    48,    50,    51,
      52,    53,    92,    33,    36,    42,    44,    54,    55,    56,
      57,    58,    38,    36,    16,    75,    78,    78,    37,    35,
      27,     9,    80,     9,   105,    27,    27,    27,    21,   105,
      89,    37,   105,   105,   105,   105,   105,    91,    91,    91,
      91,    91,    91,    91,    91,    91,    91,   100,    88,    88,
      88,    88,    88,    88,    37,    88,    98,    35,    77,    78,
       9,    78,    78,   105,    89,    37,    89,    89,    89,    89,
      35,    16,    37,   105,    78,    37,    11,    83,   106,    88,
     106,   105,   105,    11,    12,    83,    22,    78,   101,   105,
      13,    84,   105,   106,   101,    49,    12,    78,    49,   106,
     105,   105,    49,    78,    78,   105,   106,    27,    78,    27,
      27
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    61,    62,    63,    63,    64,    64,    64,    65,    65,
      66,    66,    67,    68,    68,    68,    68,    69,    70,    70,
      71,    71,    72,    72,    73,    73,    73,    73,    74,    74,
      75,    76,    76,    77,    77,    78,    78,    78,    78,    78,
      78,    79,    79,    79,    79,    80,    80,    81,    81,    82,
      82,    82,    82,    83,    83,    84,    85,    86,    86,    87,
      88,    88,    88,    88,    88,    88,    88,    88,    89,    89,
      89,    89,    89,    89,    90,    90,    90,    90,    90,    90,
      91,    91,    91,    91,    91,    91,    92,    92,    93,    93,
      93,    94,    94,    95,    95,    95,    96,    96,    96,    97,
      97,    98,    98,    99,    99,    99,    99,   100,   101,   102,
     103,   104,   104,   105,   106
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     3,     2,     1,     1,     1,     1,     5,     4,
       2,     1,     3,     1,     1,     1,     1,     3,     1,     3,
       1,     3,     1,     4,     6,     5,     5,     4,     3,     1,
       2,     3,     1,     1,     3,     1,     1,     1,     1,     1,
       1,     4,     3,     3,     2,     3,     1,     3,     2,     5,
       9,     8,     6,     8,     9,     6,     7,     3,     3,     3,
       3,     3,     3,     3,     3,     2,     2,     1,     4,     4,
       4,     4,     2,     1,     1,     3,     3,     3,     3,     3,
       1,     3,     3,     3,     3,     3,     2,     1,     1,     1,
       1,     1,     1,     1,     4,     3,     3,     1,     1,     4,
       3,     3,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "COMMENT", "FLOAT_KW", "INT_KW",
  "BOOLEAN_KW", "CHAR_KW", "AKULAD_BAZ_KW", "AKULAD_BASTE_KW", "ADD_KW",
  "SWITCH_KW", "END_KW", "DEFAULT_KW", "BREAK_KW", "RETURN_KW", "COMMA",
  "PROGRAM_KW", "STRUCT_KW", "CONSTANT_KW", "IF_KW", "THEN_KW", "ELSE_KW",
  "AND_KW", "OR_KW", "NOT_KW", "WHILE_KW", "NOGHTE_VIRGUL", "ADAD",
  "SHENASE", "HARFE_SABET", "KEY_KW", "MORE_THAN_KW", "NOGHTE_KW",
  "MULTIPLY_KW", "BRACKET_BASTE_KW", "BRACKET_BAZ_KW",
  "PARANTHESIS_BASTE_KW", "PARANTHESIS_BAZ_KW", "TRUE_KW", "QUESTION_KW",
  "EQUAL_EQUAL_KW", "EQUAL_KW", "DEVIDE_KW", "DEVIDE_EQUAL_KW",
  "OR_ELSE_KW", "FALSE_KW", "AND_THEN_KW", "MINUS_KW", "DONOGHTE_KW",
  "LESS_EQUAL_KW", "MOD_KW", "LESS_THAN_KW", "MORE_EQUAL_KW",
  "PLUS_EQUAL_KW", "PLUS_PLUS_KW", "MINUS_MINUS_KW", "MINUS_EQUAL_KW",
  "MULTIPLY_EQUAL_KW", "ADAD_ASHARI", "LOWER_THAN_ELSE_KW", "$accept",
  "barnameh", "tarifha", "tarif", "tarifeSakhtar", "tarifhayeMahalli",
  "tarifeMoteghayyerMahdud", "jens", "tarifeMoteghayyer",
  "tarifhayeMoteghayyerha", "tarifeMeghdareAvalie",
  "tarifeShenaseMoteghayer", "tarifeTabe", "vorudiha", "jensVorudiha",
  "shenaseyeVorudiha", "shenaseyeVorudi", "jomle", "jomleyeMorakkab",
  "jomleha", "jomleyeEbarat", "jomleyeEntekhab", "onsoreHalat",
  "onsorePishfarz", "jomleyeTekrar", "jomleyeBazgasht", "jomleyeShekast",
  "ebarat", "ebarateSade", "ebarateRabetei", "ebarateRiaziManteghi",
  "ebarateYegani", "amalgareYegani", "amel", "taghirpazir",
  "taghirnapazir", "sedaZadan", "bordareVorudiha", "meghdareSabet",
  "saved_identifier", "saved_integer", "saved_real", "saved_char",
  "saved_boolean", "M", "N", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,    17,    29,    63,    -1,    63,    64,    -1,
      64,    -1,    65,    -1,    69,    -1,    73,    -1,    18,    29,
       8,    66,     9,    -1,    18,    29,     8,     9,    -1,    66,
      67,    -1,    67,    -1,    68,    70,    27,    -1,     5,    -1,
       4,    -1,     7,    -1,     6,    -1,    68,    70,    27,    -1,
      71,    -1,    70,    16,    71,    -1,    72,    -1,    72,    42,
      89,    -1,   100,    -1,   100,    36,   101,    35,    -1,    68,
      29,    38,    74,    37,    78,    -1,    68,    29,    38,    37,
      78,    -1,    29,    38,    74,    37,    78,    -1,    29,    38,
      37,    78,    -1,    74,    27,    75,    -1,    75,    -1,    68,
      76,    -1,    76,    16,    77,    -1,    77,    -1,    29,    -1,
      29,    36,    35,    -1,    79,    -1,    81,    -1,    82,    -1,
      85,    -1,    86,    -1,    87,    -1,     8,    66,    80,     9,
      -1,     8,    66,     9,    -1,     8,    80,     9,    -1,     8,
       9,    -1,    80,   105,    78,    -1,    78,    -1,    88,    27,
     105,    -1,    27,   105,    -1,    20,    89,    21,    78,   105,
      -1,    20,    89,    21,   105,    78,   106,    22,   105,    78,
      -1,    31,    38,    89,    37,   106,    83,    84,    12,    -1,
      31,    38,    89,    37,    83,    12,    -1,    11,   105,   101,
     106,    49,   105,    78,    27,    -1,    83,    11,   105,   101,
     106,    49,   105,    78,    27,    -1,    13,    49,   105,    78,
     106,    27,    -1,    26,    38,   105,    89,    37,   105,    78,
      -1,    15,   105,    27,    -1,    15,    88,    27,    -1,    14,
     105,    27,    -1,    95,    42,    88,    -1,    95,    54,    88,
      -1,    95,    57,    88,    -1,    95,    58,    88,    -1,    95,
      44,    88,    -1,    95,    55,    -1,    95,    56,    -1,    89,
      -1,    89,    24,   105,    89,    -1,    89,    23,   105,    89,
      -1,    89,    45,   105,    89,    -1,    89,    47,   105,    89,
      -1,    25,    89,    -1,    90,    -1,    91,    -1,    91,    52,
      91,    -1,    91,    50,    91,    -1,    91,    32,    91,    -1,
      91,    53,    91,    -1,    91,    41,    91,    -1,    92,    -1,
      91,    10,    91,    -1,    91,    48,    91,    -1,    91,    34,
      91,    -1,    91,    43,    91,    -1,    91,    51,    91,    -1,
      93,    92,    -1,    94,    -1,    48,    -1,    34,    -1,    40,
      -1,    95,    -1,    96,    -1,   100,    -1,    95,    36,    88,
      35,    -1,    95,    33,   100,    -1,    38,    88,    37,    -1,
      97,    -1,    99,    -1,   100,    38,    98,    37,    -1,   100,
      38,    37,    -1,    98,    16,    88,    -1,    88,    -1,   101,
      -1,   102,    -1,   103,    -1,   104,    -1,    29,    -1,    28,
      -1,    59,    -1,    30,    -1,    39,    -1,    46,    -1,    -1,
      -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     7,    10,    12,    14,    16,    18,    24,
      29,    32,    34,    38,    40,    42,    44,    46,    50,    52,
      56,    58,    62,    64,    69,    76,    82,    88,    93,    97,
      99,   102,   106,   108,   110,   114,   116,   118,   120,   122,
     124,   126,   131,   135,   139,   142,   146,   148,   152,   155,
     161,   171,   180,   187,   196,   206,   213,   221,   225,   229,
     233,   237,   241,   245,   249,   253,   256,   259,   261,   266,
     271,   276,   281,   284,   286,   288,   292,   296,   300,   304,
     308,   310,   314,   318,   322,   326,   330,   333,   335,   337,
     339,   341,   343,   345,   347,   352,   356,   360,   362,   364,
     369,   373,   377,   379,   381,   383,   385,   387,   389,   391,
     393,   395,   397,   399,   400
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   212,   212,   218,   221,   226,   229,   232,   237,   241,
     246,   250,   255,   336,   342,   347,   352,   359,   436,   448,
     466,   472,   506,   513,   532,   536,   540,   542,   545,   547,
     550,   553,   555,   558,   559,   562,   566,   570,   574,   578,
     582,   587,   591,   595,   599,   604,   611,   619,   625,   631,
     637,   647,   669,   673,   683,   696,   703,   713,   717,   722,
     727,   753,   788,   823,   858,   893,   895,   897,   905,   916,
     927,   949,   971,   981,   991,  1000,  1014,  1028,  1042,  1056,
    1071,  1108,  1148,  1187,  1226,  1266,  1314,  1316,  1324,  1326,
    1328,  1331,  1340,  1348,  1357,  1359,  1362,  1369,  1371,  1381,
    1383,  1386,  1388,  1391,  1402,  1413,  1424,  1436,  1448,  1465,
    1481,  1496,  1511,  1530,  1538
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 383;
  private static final int yynnts_ = 46;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 61;

  private static final int yyuser_token_number_max_ = 315;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 875 of lalr1.java  */
/* Line 24 of "YYParser.y"  */


	public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";

	private static final String tempStr = "tempVar";
	public static final String startStr = "StartVar";
	public static final String sizeStr = "SizeVar";
	public static final String indexStr = "IndexVar";
	public static final String condStr = "ConditionVar";
	
	public static String lexIdentifier;
	public static int lexInt;
	public static double lexReal;
	public static boolean lexBoolean;
	public static char lexChar;

	private ArrayList<Quadruple> quadruples = new ArrayList<>();
	private SymbolTable symbolTable = new SymbolTable();
	public static PrintStream writer;

	private int tempCounter = 0;

	public String fileAddress;

	public static void main(String args[]) throws IOException {
        YYParser yyparser;
        final Yylex lexer;

        String inputCode = "code.txt";
        String outputCode = "out.c";
        String output = "output.txt";

        if (args.length == 1) {
            inputCode = args[0];
            outputCode = args[0] + ".c";
            output = args[0] + ".txt";
        }
        if (args.length == 2) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[0] + ".txt";
        }
        if (args.length == 3) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[2];
        }

        writer = new PrintStream(new File(output));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(inputCode)));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error: " + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error! " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.fileAddress = outputCode;
        yyparser.parse();

        return;
	}

	private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}

	private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}

	private void backpatch(int quadNumber, int destination) {
		quadruples.get(quadNumber).result = String.valueOf(destination);
	}

	private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array);
		return name;
	}

	private int nextQuad() {
		return quadruples.size();
	}

	private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
			case EVal.TYPE_CODE_UNKNOWN:
			case EVal.TYPE_CODE_RANGE:
			default:
				return null;
		}
	}

	private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t\n");
			// Backpatch of error controllers.
			backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



/* Line 875 of lalr1.java  */
/* Line 3463 of "YYParser.java"  */

}


/* Line 879 of lalr1.java  */
/* Line 1546 of "YYParser.y"  */

class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	

	public String place;
	public int type;
	public boolean array;

	public int quad;

	public static ArrayList<Integer> arrayIndexOutOfBoundList = new ArrayList<>();
	public static ArrayList<Integer> invalidArraySizeList = new ArrayList<>();
	public ArrayList<Integer> initList;
	public ArrayList<Integer> nextList;
	public ArrayList<Integer> trueList;
	public ArrayList<Integer> falseList;

	public ArrayList<ArrayList<EVal>> initializersList;
	public ArrayList<EVal> declareds;

	public ArrayList<EVal> initializers;

	public EVal() {
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(al1);
		result.addAll(al2);
		return result;
	}

	public static ArrayList<ArrayList<EVal>> makeInitializersList(ArrayList<EVal> initializers) {
		ArrayList<ArrayList<EVal>> result = new ArrayList<>();
		result.add(initializers);
		return result;
	}

	public static ArrayList<EVal> makeInitializersOrDeclareds(EVal initializerOrdDeclared) {
		ArrayList<EVal> result = new ArrayList<>();
		result.add(initializerOrdDeclared);
		return result;
	}
}

class Quadruple {

	public static final String LINE_STR = "Line";

	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "==":
			case "<":
			case "<=":
			case ">":
			case ">=":
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "=":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
			case "<>":
				return result + " != " + arg0 + " " + "==" + " " + arg1 + ";";
			case "usub":
				return result + " = -" + arg0 + ";";
			case ":=":
				return result + " = " + arg0 + ";";
			case "cast":
				return result + " = (" + arg1 + ") " + arg0 + ";";
			case "init":
				return arg1 + " " + result + ";";
			case "iprint":
				return "printf(\"%s = %d\\n\", \"" + result + "\", " + result + ");";
			case "rprint":
				return "printf(\"%s = %f\\n\", \"" + result + "\", " + result + ");";
			case "cprint":
				return "printf(\"%s = '%c'\\n\", \"" + result + "\", " + result + ");";
			case "bprint":
				return "printf(\"%s = %s\\n\", \"" + result + "\", " + result + " ? \"true\" : \"false\");";
			case "aiprint":
				return "printf(\"%s[%d] = %d\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "arprint":
				return "printf(\"%s[%d] = %f\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "acprint":
				return "printf(\"%s[%d] = '%c'\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "abprint":
				return "printf(\"%s[%d] = %s\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "] ? \"true\" : \"false\");";
			case "[]=":
				return "*(" + result + " + " + arg1 + ") = " + arg0 + ";";
			case "=[]":
				return result + " = *(" + arg0 + " + " + arg1 + ");";
			case "malloc":
				return result + " = " + "malloc(sizeof(" + arg0 + ") * " + arg1+ ");";
			default:
				return null;
		}
	}
}

class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public boolean addToSymbolTable(String name, int type, boolean array) {
		if (lookUp(name) == -1) {
			System.out.println(name+" added");
			names.add(name);
			types.add(type);
			arrays.add(array);
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + YYParser.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + YYParser.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + YYParser.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
                    break;
                case EVal.TYPE_CODE_RANGE:
                    continue;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}

