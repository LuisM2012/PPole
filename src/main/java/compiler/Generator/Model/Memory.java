package compiler.Generator.Model;


import compiler.Translator.Model.Variable;

public class Memory {
  private String base;
  private Integer offset;
  private Variable variable;

  public Memory(String base, Integer offset) {
    this.base = base;
    this.offset = offset;
  }

  public Integer getOffset() {
    return this.offset;
  }

  public String getBase() {
    return this.base;
  }

  public String getAddress() {
    return String.format("-%s(%s)", offset, base);
  }

  public Variable getVariable() {
    return this.variable;
  }
}
