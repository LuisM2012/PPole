package compiler.Translator.Translations;

import compiler.Generator.Generator;
import compiler.Translator.Model.Translation;

public class For extends Translation{
  
  @Override
  public void visit(Generator gen) {
    gen.visit(this);
  }
}
