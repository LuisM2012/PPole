package compiler.Parser.Model;

import java.util.regex.Pattern;

public class Token {
  
  public static String pattern = "[.]+"; // matches any string

  public static boolean matches(String input) {
    return Pattern.matches(pattern, input);
  }
  
  public String value;

  public String getValue() {
    return this.value;
  }
}
