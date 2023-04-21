package compiler.Generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import compiler.Generator.Model.Memory;
import compiler.Translator.Model.Variable;

public class MemoryManager {
  
  private final Integer startOffset = 8;
  private final Integer gap = 8;
  private HashMap<Variable, Memory> map;
  private HashMap<String, Memory> globals;
  private String base;
  private Integer offset;

  public MemoryManager() {
    map = new HashMap<Variable, Memory>();
  }

  public String getAddress(Variable variable) {
    if (! map.containsKey(variable)) {
      map.put(variable, new Memory(base, addVariable()));
    }
    return map.get(variable).getAddress();
  }

  private Integer addVariable() {
    this.offset += gap;
    return offset;
  }

  public void reset(String base) {
    this.base = base;
    this.offset = startOffset - gap;
  }

  public Collection<Memory> addGlobal(Set<Variable> set) {
    for (Variable global : set) {
      globals.put(global.getName(), new Memory(base, addVariable()));
    }
    return globals.values();
  }
}
