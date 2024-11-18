package pkg05_field;

public class FieldEx{

  public static void main(String[] args) {
    // Car타입의 인스턴스 car생성
  
    
     Car car=new Car();
     car.gasStation(500);
     
    for(int i=0; i<200; i++) {
     car.accel()
      ;
    }
    car.panel();
    for(int i=0; i<200; i++) {
      car.brake();
    }
    car.panel();
    

  }

}

