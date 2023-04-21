package compiler.Translator.Translations;

import compiler.Generator.Generator;
import compiler.Translator.Model.Translation;

public class While extends Translation {
 
  
  @Override
  public void visit(Generator gen) {
    gen.visit(this);
  }
}
