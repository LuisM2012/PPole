package compiler;

import java.io.File;
import java.io.PrintStream;

import compiler.Checker.Checker;
import compiler.Generator.Generator;
import compiler.Parser.Parser;
import compiler.Parser.TokenStream;
import compiler.Translator.Translator;
import compiler.Translator.Model.Program;

public class Compiler {
  private final String author = "Luis E. Morales";
  private final String OUT = "a.s";
  private final String EXT = ".ppl";
  private final PrintStream out = System.out;
  private final PrintStream err = System.err;
  private String file;

  private boolean parse;
  private boolean translate;
  private boolean check;
  private boolean generate;
  
  public Compiler() {
    this.file = null;
    parse = true;
    translate = true;
    check = true;
    generate = true;
  }
  
  public void compile() {
    Program program = null;
    TokenStream stream = null;
    if (this.file == null) {
      err.println("[ERROR]: no file given, make sure you provide a "+EXT+" file.");
    }
    if (parse) {
      try {
        File in = new File(this.file);
        stream = new Parser().parse(in);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    if (translate) {
      program = new Translator().translate(stream);
    }
    if (check) {
      new Checker().check(program);
    }
    if (generate) {
      try {
        File out = new File(OUT);
        new Generator().generate(program, out);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public void cli(String arg) {
    switch (arg) {
      case "-a": 
        out.println(this.author);
        return;
      case "-p":
        translate = false;
      case "-t":
        check = false;
      case "-c":
        generate = false;
      case "-g":
        return;
      default:
        if (arg.endsWith(EXT)) {
          if (file != null) {
            err.println("[ERROR]: cannot compile two files at the same time. Only the first file will be compiled.");
          } else {
            file = arg;
          }
        } else {
          err.println(String.format("[ERROR]: unrecognized option '%s'", arg));
        }
    }
  }
    
  public static void main(String[] args) {
    Compiler compiler = new Compiler();
    
    for (String arg : args) {
      compiler.cli(arg);
    }

    compiler.compile();
  }
}
