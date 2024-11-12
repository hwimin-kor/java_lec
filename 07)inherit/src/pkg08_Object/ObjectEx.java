package pkg08_Object;

public class ObjectEx {

  public static void main(String[] args) {
    // object 타입의 인스턴스 생성
    Object car=new Car("benz","E300");
    
    //인스턴스 카를 car 타입으로 변환하는 코딩이 필요 다운캐스팅
    
    if(car instanceof Car) {
      System.out.println(((Car)car).getBrand());
      System.out.println(((Car)car).getModel());
    }
  //Car 타입의 인스턴스
    Car car2= new Car("bmw","520d");
    //아래 두 코드는 동일하다 . 
    System.out.println(car2);
    System.out.println(car2.toString());
   
    
  }
  

}
