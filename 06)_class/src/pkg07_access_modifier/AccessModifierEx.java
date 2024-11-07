package pkg07_access_modifier;

public class AccessModifierEx {

  public static void main(String[] args) {
    // Sample타입의 인스턴스 s  생성
    
    Sample s = new Sample();
    //Sample 타입의 인스턴스 s 생성 
     s.setItem("데이터");
   //  System.out.println(s.item);
     System.out.println(s.getItem());
  }

}
