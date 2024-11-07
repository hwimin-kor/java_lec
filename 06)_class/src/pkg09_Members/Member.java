package pkg09_Members;

public class Member {
  
  private String name;
  //클래스가 타입인거를 생각하기
  Address address;
  Contact contact;
  
  public Member(String name, Address address , Contact contact){
    this.name=name;
    this.address= address;
    this.contact= contact;
  }
 public void info() {
    System.out.println(name);
    address.info();
    contact.info();
    
  }
}

