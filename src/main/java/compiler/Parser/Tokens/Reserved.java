package compiler.Parser.Tokens;

import java.util.regex.Pattern;

import compiler.Parser.Model.Token;

public class Reserved extends Token {
  
  public static String pattern = "(for|while|if|else|elif|class|final|true|false|break)";

  public static boolean matches(String input) {
    return Pattern.matches(pattern, input);
  }
  
  public Reserved(String value) {
    this.value = value;
  }
}
