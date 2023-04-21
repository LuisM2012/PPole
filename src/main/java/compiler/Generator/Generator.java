package compiler.Generator;

import java.io.File;
import java.util.Set;

import compiler.Translator.Model.Program;
import compiler.Translator.Model.Translation;
import compiler.Translator.Model.Variable;
import compiler.Translator.Translations.*;
import compiler.Translator.Translations.Class;
import compiler.helpers.Printer;

public class Generator {
  private MemoryManager manager;
  private Printer printer;

  public Generator() {}

  public void generate(Program program, File file) {
    this.printer = new Printer(file);
    this.manager = new MemoryManager();
    this.addGlobal(program.getGlobal());
    this.start(program.getStart());
  }

  public void addGlobal(Set<Variable> globals) {
    this.manager.addGlobal(globals); 
  }

  public void start(Translation first) {
    Translation node = first;
    while (node.getNext() != null) {
      node.visit(this);
      node = node.getNext();
    }
  }

  public String visit(Assign node) {
    
    return null;
  }
  public String visit(Class node) {
    return null;
  }
  public String visit(For node) {
    return null;
  }
  public String visit(Function node) {
    return null;
  }
  public String visit(IfElse node) {
    return null;
  }
  public String visit(Operate node) {
    return null;
  }
  public String visit(While node) {
    return null;
  }
}
