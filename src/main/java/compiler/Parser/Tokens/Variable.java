package compiler.Parser.Tokens;

import java.util.regex.Pattern;

import compiler.Parser.Model.Token;

public class Variable extends Token {

  public static String pattern = "[_a-zA-Z][_a-zA-Z0-9]*";

  public static boolean matches(String input) {
    return Pattern.matches(pattern, input);
  }

  public Variable(String value) {
    this.value = value;
  }
}
