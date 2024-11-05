package pkg01_branch;

public class IfEx {

  public static void main(String[] args) {
    // if문
    int a =5;
    if( a%2==0) {
      System.out.println(a+"는짝수");
    }
    else {
      System.out.println(a+"는홀수");
    }
   
    int b=6;
    if(b%3==0) {
      System.out.println(b+"은3의배수");
    }
    else if (b%2==0) {
      System.out.println(b+"는 짝수");
    }
    else {
      System.out.println(b+"는 홀수");
    }
      
    
  }

}
