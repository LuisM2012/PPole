package compiler.helpers;

import java.io.File;
import java.io.PrintStream;

public class Printer {
  private String TAB = "\t";
  private PrintStream out;
  
  public Printer(File file) {
    try {
      this.out = new PrintStream(file);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public Printer(PrintStream out) {
    this.out = out;
  }

  public void setTab(String tab) {
    this.TAB = tab;
  }

  public void println(String line) {
    this.out.println(line);
  }

  public void println(String format, Object ... args) {
    this.out.println(String.format(format, args));
  }

  public void tabln(String line) {
    this.out.println(this.TAB+line);
  }

  public void tabln(String format, Object ... args) {
    this.out.println(this.TAB+String.format(format, args));
  }
}
