package pkg02_loop;

public class ForEx {

  public static void main(String[] args) {
    //1~10홀수 평균구하기
    int count=0;
    int total=0;
    for(int a=1; a<=10; a++) {
      if(a%2==1) {
        total+=a;
        count++;
      }
    }
    System.out.println((double)total/count);
   
    
    
    
    
    for(int a=1; a<=9; a++)  {
      System.out.println("3x"+a+"="+(3*a));
    }
    
  }
}
  
