package pkg00_Square;

public class SquareEx {

  public static void main(String[] args) {
    
    //사각형
    Rectangle rectangle= new Rectangle(4,5);//너비가 4 높이가 5인 사각형
    System.out.println("넓이:"+ rectangle.getArea());
    
    //정사각형
    Square square= new Square(4);
    System.out.println("넓이:"+ square.getArea());
  }

}
