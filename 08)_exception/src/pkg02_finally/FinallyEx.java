package pkg02_finally;

public class FinallyEx {
/*
 * finally 블록
 * 1. try catch 블록 마지막에 추가할 수 있는 선택 블록이다. (선택임) 
 * 2.언제나 마지막에 실행되는 블록이다. 
 * 3. 실행 순서 
 *    1)예외가 없는 경우 try->finally
 *    2)에외가 있는 경우 try->catch->finally
 */
  
  
  public static void main(String[] args) {
    try {
      int a=100;
      int b=0;
      int mod =a%b;
      System.out.println(a+"%"+b+"="+mod);
      
    }catch(Exception e){
      System.out.println(e.getMessage());
      System.out.println(e.getClass().getName());
    }finally {
      System.out.println("작업이완료되었습니다.");
    }
  }

}
