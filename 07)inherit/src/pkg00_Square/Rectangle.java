package pkg00_Square;

public class Rectangle {
//필드만들기
  private int width;
  private int height;
 //생성자 만들기
  public Rectangle(int width, int height) {
    this.width=width;
    this.height=height;
  }
  
  //메소드 만들기 
  public int getArea() {
   return width*height;
  }
  
}
