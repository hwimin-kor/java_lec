package pkg08_BankAccount;

import javax.management.RuntimeErrorException;

public class BankAccount {
  
  private String accNo;
  private long balance;
  
  public BankAccount(String accNo, long balance) {
    this.accNo=accNo;
    this.balance=balance;
  }
  /**
   * 입금처리
   * @param money 입금액.
   * @throws RuntimeException 마이너스 금액 입금 불가. 
   */
    public void deposit(long money)throws RuntimeException{
      if(money<0)
        throw new RuntimeException(money+"원은 입금할 수 없습니다.");
      balance+=money;
    }
    /**
     * 출금처리
     * @param money 출금액
     * @return 실제 출금액
     * @throws RuntimeException 마이너스 출금 불가, 잔액보다 큰 금액 출금 불가. 
     */
    public long withdrawal(long money) throws RuntimeException{
      if(money<0)
        throw new RuntimeException(money+"원은 출금할 수 없습니다");
      if(money>balance)
        throw new RuntimeException("잔액이 부족합니다");
      balance-=money;
      return money;
    }
    /**
     * 이체 처리 
     * @param bankAccount이체할 계좌 정보
     * @param money  이체할 금액
     * @throws RuntimeException 입금 처리 예외와 출금 처리 예외
     */
    
    public void transfer(BankAccount bankAccount, long money)throws RuntimeException{
      bankAccount.deposit(this.withdrawal(money));
    }
      /**
       * 계좌 조회, 계좌번호와 통장잔액을 출력, 
       */
    public void inquiry() {
      System.out.println("계좌번호:"+accNo);
      System.out.println("잔액"+balance);
    }
    
    
    
    
    
    
    
    }


