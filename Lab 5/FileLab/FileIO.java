public class FileIO
{
  // This method opens up file s,
  // reads and outputs to screen its contents
  void fileRead(String s)
  {
    System.out.println("fileRead in the base class reached");
  }

  // This method opens up file s
  // and writes array a to it
  void fileWrite(String s, String[] a)
  {
    System.out.println("fileWrite in the base class reached");
  }
}
