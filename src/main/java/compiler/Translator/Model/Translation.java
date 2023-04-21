package compiler.Translator.Model;

import java.util.Set;

import compiler.Generator.Generator;
import compiler.Generator.Model.Instruction;

public abstract class Translation {
  
  private Translation next;

  public Translation() {
    next = null;
  }

  public Translation getNext() {
    return this.next;
  }

  public void setNext(Translation next) {
    this.next = next;
  }
  
  public abstract void visit(Generator gen);
}
