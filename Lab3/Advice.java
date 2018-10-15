import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Advice
{
  public static void main (String[] args) throws IOException
  {
    System.out.print("enter input filename: ");
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    File file = new File(str);
    Scanner sc = new Scanner(file);
    String line;
    while(sc.hasNextLine())
    {
      line = sc.nextLine();
      System.out.println(line);
    }
    System.out.println("enter advice " +
                       "(hit return on empty line to quit):");
    Scanner input = new Scanner(System.in);
    FileWriter fw = new FileWriter(file, true);
    String s = input.nextLine();
    fw.append(s);
    while(s.length() > 0)
    {
      fw.append("\n");
      s = input.nextLine();
      fw.append(s);
    }
    System.out.println("Thank you, bye!");
    fw.close();
    kb.close();
    sc.close();
  } 
}
