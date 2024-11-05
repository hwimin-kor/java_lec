package pk04_logical;

public class LogicalEx {

  public static void main(String[] args) {
    
    
    //논리 연산 3개 
    //1.논리 AND:&&
    //2.논리 OR: ||
    //3.논리 NOT: ! 
    //숏 서킷 
    int a = 10;
    int b = 10; 
    System.out.println(a>0 &&b>0);
    System.out.println(a>0 ||b>0);
    System.out.println(!(a>0));
    //숏 서킷
    int x =10;
    System.out.println(x <0&& ++x==0);  //&& and 는 false가 발생하면 더이상 연산을 진행하지 않는다 . 
    System.out.println(x>0 || ++x==1);  // || or은 true가 발생하면 더이상 연산을 진행하지 않는다. 
    System.out.println(x);
  }
  
}
