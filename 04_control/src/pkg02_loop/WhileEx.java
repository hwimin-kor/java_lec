package pkg02_loop;

public class WhileEx {

  public static void main(String[] args) {
    
    
    
    //12345출력
    int a =1;
    while(a<=5) {
      System.out.println(a++);
    }
  
    //1~10사이 짝수 출력하기 
    int b=1;
    while (b<=10) {
      if(b%2==0) {
        System.out.println(b++);
      }
      
    }
  
    //1~10사이 홀수 누적하기 
    int c=1;
    int total=0;
    while(c<=10) {
      if(c%2==1) {
      total+=c;
      }
     c++;
   }
    System.out.println(total);
  }
}

