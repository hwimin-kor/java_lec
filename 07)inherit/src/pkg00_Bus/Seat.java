package pkg00_Bus;

public class Seat {
  //private Man man;을 하게되면 남자만 앉는 시트가되어버림 
  //남자 여자 아무나 앉을수 있는 의자를 어떻게 만들지???? 
  //남자 여자 위에 부모인 Person 을 만들어서 ? 
  private Person person;
  
  public Seat() {
    
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
   
  }
}
