package pkg10_BankAccount;

public class BankAccount {

  String accNo;
  long balance;
  
  BankAccount(String accNO, long balance){
    this.accNo=accNO;
    this.balance=balance;
  }
  /**
   * 입금 처리 
   * @param money 입금액. 마이너스금액 불가능
   */
  void deposit(long money) {
    if(money<0)
      return;
    balance+=money;
    
  }
  /**
   * 출금 처리
   * @param money 출금액 마이너스 출금 불가능 . 잔액보다 큰 출금 불가능 
   * @return 실제 출금액.
   */
  long withdrawal(long money) {
    if(money<0)
      return 0L;
    if(money>balance)
      return 0L;
    balance-=money;
    return money;
  }
  /**
   * 이체 처리 
   * @param bankAccount 이체할 계좌 정보
   * @param money 이체할금액
   */
  void transfer(BankAccount bankAccount, long money) {
   long withdrawalMoney = this.withdrawal(money);
   bankAccount.deposit(withdrawalMoney);
   //bankAccount.deposit(this.withdrawal(money));
  }
  /**
   * 계좌 조회. 계좌 번호와 통장잔액을 출력
   */
  void inquiry() {
    System.out.println("BankAccountNO:" +accNo);
    System.out.println("Balance:"+balance);
  }
}
