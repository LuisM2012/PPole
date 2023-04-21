package compiler.Parser.Tokens;

import java.util.regex.Pattern;

import compiler.Parser.Model.Token;

public class Value extends Token {

  public static String pattern = ".+";

  public static boolean matches(String input) {
    return Pattern.matches(pattern, input);
  }
  
  public Value(String value) {
    this.value = value;
  }
}
