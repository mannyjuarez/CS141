// this is a driver class of Rectangle

public class RectangleDriver{
  // main
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.setLength(5);
    r1.setWidth(2);
    // wrong -- do noy do 
    r1.setArea(15);
    System.out.println("Length is :" + r1.getLength());
    System.out.println("Width is : " + r1.getWidth());
    System.out.println("Area is : " + r1.getArea());
    System.out.println("Wrong Area is : " + r1.getAreaWrong());

    Rectangle r2 = new Rectangle(10,20);
    System.out.println("Second Area: " + r2.getArea());
  } 
}
