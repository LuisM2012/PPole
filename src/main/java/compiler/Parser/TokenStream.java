package compiler.Parser;

import java.util.ArrayList;
import java.util.List;

import compiler.Parser.Model.Token;

public class TokenStream {
  private List<Token> stream;
  private Scheme scheme;

  public TokenStream() {
    this.stream = new ArrayList<Token>();
  }

  public List<Token> getStream() {
    return this.stream;
  }

  protected void addToken(String token) {
    if (!token.equals("")) {
      stream.add(scheme.match(token));
    }
  }
}
