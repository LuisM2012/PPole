package compiler.Translator;


import java.util.Iterator;
import compiler.Parser.TokenStream;
import compiler.Parser.Model.Token;
import compiler.Parser.Tokens.Variable;
import compiler.Translator.Model.Program;

public class Translator {
  private Iterator<Token> stream;
  private Program program;

  public Translator() {}

  public Program translate(TokenStream stream) {
    this.stream = stream.getStream().iterator();
    this.program = new Program();
    return this.start();
  }

  private Program start() {
    while (this.stream.hasNext()) {
      Token next = this.stream.next();
      if (next instanceof Variable) {
        
      }
    }
    return null;
  }



}
