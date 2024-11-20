package pkgEx;

public class IstanceEx {

  public static void main(String[] args) {
   //Car 클래스를 생성했으니까 Car의 인스턴스(객체)사용을 해야한다 
    //클래스 car를 먼저 선언하자 
    
    Car myCar;
    myCar=new Car();//객체 생성임 
    //인스턴스가 가지고있는 멤버 사용하기 
    myCar.speed=100;
    myCar.drive();
    //하나의 클래스를 이용해 여러개의 인스턴스를 생성할 수 있다. 
    Car momCar=new Car();//엄마차라는 객체 생성 
    momCar.drive();
    
    
  }

}
