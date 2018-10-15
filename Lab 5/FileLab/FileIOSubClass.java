import java.util.Scanner;
import java.io.*;

public class FileIOSubClass extends FileIO
{
  void fileRead(String s)
  {
    try
    {
      File file = new File(s);
      Scanner inFile = new Scanner(file);
      while (inFile.hasNextLine())
      {
        String str = inFile.nextLine();
        System.out.println(str);
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
    }
  }

  void fileWrite(String s, String[] a)
  {
    try
    {
      File file = new File(s);
      PrintWriter pw = new PrintWriter(file);
      for (int i = 0; i < a.length; i++)
      {
        pw.println(a[i]);
      }
      pw.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
    }
  }
  
  void fileRead(File f)
  {
    try
    {
      Scanner inFile = new Scanner(f);
      while (inFile.hasNextLine())
      {
        String str = inFile.nextLine();
        System.out.println(str);
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
