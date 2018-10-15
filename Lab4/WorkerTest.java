public class WorkerTest
{
  public static void main(String[] args)
  {
    ProductionWorker p1 = new ProductionWorker("George", "432-A", "01/02/03", 1, 17.5);
    ProductionWorker p2 = new ProductionWorker("Joan", "11-11", "1-23-2006", 3, 15.0);
    ProductionWorker p3 = new ProductionWorker("Manny", "715-M", "9/25/14", 2, 25.0);
    System.out.println("Here's the first production worker.");
    System.out.println(p1.toString());
    System.out.println("Here's the second production worker.");
    System.out.println(p2.toString());
    System.out.println("Here's the third production worker.");
    System.out.println(p3.toString());
  }
}
