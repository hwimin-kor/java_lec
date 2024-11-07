package pkg10_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    // BankAccount타입의 인스턴스 2개 생성하기
   BankAccount myAcc=new BankAccount("000-000-0000", 500_000);
   BankAccount momAcc=new BankAccount("111-1111-1111",1_000_000);
    
    momAcc.transfer(myAcc, 100_000);
    momAcc.transfer(myAcc, -10000);
    momAcc.transfer(myAcc, 10_000_000);
    
    myAcc.inquiry();
    momAcc.inquiry();

  }

}
