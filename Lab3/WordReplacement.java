import java.util.Scanner;

public class WordReplacement
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("enter a line of text (blank line to stop):");
    String line = kb.nextLine();
    System.out.println("enter a substring to be replaced:");
    String replace = kb.nextLine();
    System.out.println("enter the new substring:");
    String replacement = kb.nextLine();
    String statement = replaceSubstring(line, replace, replacement);
    System.out.println("I have rephrased that line to read: \n" + statement);
    System.out.println();
    System.out.println("enter another line of text (blank line to stop):");
    while (true)
    {
      line = kb.nextLine();
      if (line.isEmpty())
        break;
      System.out.println("enter a substring to be replaced:");
      replace = kb.nextLine();
      System.out.println("enter the new substring:");
      replacement = kb.nextLine();
      statement = replaceSubstring(line, replace, replacement);
      System.out.println("I have rephrased that line to read: \n" + statement);
      System.out.println();
      System.out.println("enter another line of text (blank line to stop):");
    }
  }
  public static String replaceSubstring(String string1, String string2, String string3)
  {
    int index;
    int length = string2.length();
    String notFound = "\"" + string2 + "\"" + " is not found.";
    String newString = "";
    for (int i = 0; i < string1.length(); i++)
    {
      if (string1.indexOf(string2) >= 0)
      {
        index = (string1.indexOf(string2));
        int finalIndex = index + length;
        newString = string1.substring(0,index) + string3 + string1.substring(index + length, string1.length());
      }
      else
      {
        return notFound;
      }
    }
    return newString;
  }
}
