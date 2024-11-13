package pkg07_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    
    // BankAccount 타입의 인스턴스 2개 생성하기
    BankAccount myAcc = new BankAccount("010-1111-1111", 500_000);
    BankAccount momAcc = new BankAccount("010-9999-9999", 1_000_000);
    
    momAcc.transfer(myAcc, -100_000);
    momAcc.transfer(myAcc, 10_000_000);
    momAcc.transfer(myAcc, 100_000);
    
    myAcc.inquiry();
    momAcc.inquiry();

  }

}