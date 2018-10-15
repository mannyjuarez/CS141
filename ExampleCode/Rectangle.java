public class Rectangle {
  // private member varibales
  private int length;
  private int width;
  // WRONG 
  private int area;
  
  // no arg constructor
  public Rectangle(){}
  public Rectangle(int l, int w) {
    length = l;
    width = w;
  }

  // public methods
  public void setLength(int l){
    length = l;
  }

  public void setWidth(int w){
    width = w;
  }

  // WRONG
  public void setArea(int a){
    area = a;
  }

  public int getLength(){
    return length;
  }

  public int getWidth(){
    return width;
  }
  
  public int getArea() {
    return length * width;
  }

  public int getAreaWrong(){
    return area;
  }
}
