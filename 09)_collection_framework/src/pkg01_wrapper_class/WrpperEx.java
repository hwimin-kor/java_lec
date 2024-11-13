package pkg01_wrapper_class;

public class WrpperEx {

  public static void main(String[] args) {
    // primitive type-> Wrapper class 프리미티브 타입을 참조타입으로 바꿈 
    Short b=2;
    Integer c =3;
    Long d=4L;
    Float e=5.0F;
    Double f=6.0;
    Character g='A';
    Boolean h=true;
    
    //Auto Boxing : primitive 가 자동으로 wrapper class 로 바뀌는 것 
    Integer x =10;
    //Auto Unboxing :wrapper class 값이 자동으로 primitive 로 바뀌는 것
    int y =x+10; //x 가 Integer 에서 int 로 바뀌는게 언박싱임 
  }

}
