package pkg08_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    try {
      //BankAccount타입의 인스턴스 2개 생성하기       
      BankAccount myAcc= new BankAccount("010-1111-1111",500_000);
      BankAccount momAcc= new BankAccount("110-1111-1111",1_400_000);
      
      
      momAcc.transfer(myAcc, -100_000);
      myAcc.inquiry();
      momAcc.inquiry();
    }catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
