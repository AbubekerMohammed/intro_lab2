import java.util.Scanner;

public class TextMessageExpander {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      System.out.println("Enter text:");
      String text = scnr.nextLine();

      System.out.println("You entered: " + text + "\n");

      if (text.contains("BFF")) {
      System.out.println("Replaced \"BFF\" with \"best friend forever\".");
      text = text.replaceAll("BFF", "best friend forever");
      }

      if (text.contains("IDK")) {
      System.out.println("Replaced \"IDK\" with \"I don't know\".");
      text = text.replaceAll("IDK", "I don't know");
      }
      
      if (text.contains("JK")) {
      System.out.println("Replaced \"JK\" with \"just kidding\".");
      text = text.replaceAll("JK", "just kidding");
      }

      if (text.contains("TMI")) {
      System.out.println("Replaced \"TMI\" with \"too much information\".");
      text = text.replaceAll("TMI", "too much information");
      }

      if (text.contains("TTYL")) {
      System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
      text = text.replaceAll("TTYL", "talk to you later");
      }

      System.out.print("\nExpanded: ");
      System.out.println(text);
   }
}
