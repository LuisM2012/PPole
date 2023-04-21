package compiler.Generator.Model;

public class Instruction {
  private String code = "";

  public String getCode() {
    return this.code;
  }

  public String toString() {
    return String.format("[%s] (%s)", getClass().getName(), this.code);
  }
}
