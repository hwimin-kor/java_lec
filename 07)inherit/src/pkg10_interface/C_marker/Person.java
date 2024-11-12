package pkg10_interface.C_marker;

public class Person {
  
    /*public void eat(Food food) {
      food.eat();
    }*/ //모든 food 받기임
  
  public void eat(Eatable food) {//먹을 수 있는 것만 받기
    ((Food)food).eat();
  }
}
