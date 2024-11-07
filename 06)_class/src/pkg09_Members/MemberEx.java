package pkg09_Members;

public class MemberEx {

  public static void main(String[] args) {
    //Member타입의 인스턴스  m 생성
    
   Address address=new Address("123","서울시강남구 테헤란로","장연빌딩5층");
   Contact contact=new Contact("010-123-123");
   Member m=new Member("tom", address, contact);
       
   m.info();

  }
}
