package compiler.Parser;

import java.io.File;
import java.util.Scanner;


public class Parser {
  private TokenStream stream;

  public TokenStream parse(File file) {
    this.stream = new TokenStream();

    try {
      Scanner scanner = new Scanner(file);
      this.start(scanner);
      scanner.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return this.stream;
  }

  private void start(Scanner scanner) {
    while (scanner.hasNextLine()) {
      this.parseLine(scanner.nextLine());
    }
  }

  private void parseLine(String line) {
    line.replace('\t', ' ');
    String list[] = line.split(" ");

    for (String token : list) {
      if (token.startsWith("//")) {
        break;
      }
      if (!token.equals("")) {
        this.stream.addToken(token);
      }
    }
  }
}
