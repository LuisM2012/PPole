package compiler.Translator.Model;

import java.util.HashMap;
import java.util.Set;

import compiler.Checker.Types.Type;

public class Program {
  
  HashMap<Variable, Type> global;
  Translation start;

  public Program() {

  }

  public void addGlobal() {

  }

  public Set<Variable> getGlobal() {
    return global.keySet();
  }

  public void setStart(Translation start) {
    this.start = start;
  }

  public Translation getStart() {
    return start;
  }
}
