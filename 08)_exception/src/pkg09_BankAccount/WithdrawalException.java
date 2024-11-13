package pkg09_BankAccount;

public class WithdrawalException extends BankAccountException {


  private static final long serialVersionUID = -7659564360261604837L;

  public WithdrawalException(String message, int code) {
    super(message, code);

  }

  
}
