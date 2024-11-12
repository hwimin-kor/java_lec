package pkg00_Square;

public class Square extends Rectangle {
  
  //생성자 만들기   (자식생성자는 반드시 부모 생성자를 호출해라)
  
 public Square(int side) {
   super(side, side);//자식생성자에서 부모 부르는것임 
 }

  
 
}
