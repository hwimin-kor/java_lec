package ex;

public class Person {
  
  //필드생성
  private String name;
  
  //생성자 
  public Person(String name) {
    this.name=name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
