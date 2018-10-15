import java.io.*;
import java.util.Scanner;

public class FileIOTest
{
  public static void main(String[] args)
  {
    FileIO file = new FileIOSubClass();
    String[] a = {"apple", "orange", "pear"};
    file.fileWrite("data.txt", a);
    file.fileRead("data.txt");
  }
}
