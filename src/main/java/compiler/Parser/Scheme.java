package compiler.Parser;

import compiler.Parser.Model.Token;
import compiler.Parser.Tokens.Character;
import compiler.Parser.Tokens.Operation;
import compiler.Parser.Tokens.Reserved;
import compiler.Parser.Tokens.Value;
import compiler.Parser.Tokens.Variable;

public class Scheme {
  
  public Scheme() {}
  
  public Token match(String input) {
    if (Character.matches(input)) {
      return new Character(input);
    }

    if (Operation.matches(input)) {
      return new Operation(input);
    }

    if (Reserved.matches(input)) {
      return new Reserved(input);
    }

    if (Variable.matches(input)) {
      return new Variable(input);
    } else {
      return new Value(input);
    }
  }
}
