package pkg01_instance;

public class InstanceEx {

  public static void main(String[] args) {

    //클래스 Car타입의 객체(인스턴스)
    //클래스 Car타입의 객체 선언 : 클래스가 곧 타입이다.(참조 타입)
    Car myCar;
    //객체 생성 (생성된 객체는 인스턴스이다.) 
    new Car();
  //인스턴스가 가지고있는 멤버 사용하기(인스턴스.멤버)
    myCar.speed=50;
    myCar.drive();
  //하나의 클래스를 이용해 여러개의 인스턴스를 생성할 수 있다.
    Car momCar=new Car();
    momCar.drive();
    
  }
  

}
