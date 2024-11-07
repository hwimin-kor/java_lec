package pkg06_constructor;

public class ConstrutorEx {

  public static void main(String[] args) {
    // Sample타입의 인스턴스 s생성
   
    Sample s = new Sample();
    System.out.println(s.number);
    //Sample 타입의 인스턴스 s2생성
    Sample s2=new Sample(10);
        System.out.println(s2.number);
    
    //Sample타입의 인스턴스 s3생성
     Sample s3= new Sample("20");
     System.out.println(s3.number);
     
     //Sample타입의 인스턴스 s4생성 (인자 값 전달, 실수 전달)
     Sample s4=new Sample(1.5);
     System.out.println(s4.number);
  }
  
}

