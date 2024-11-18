package pkg09_BankAccount;

public class DepositException extends BankAccountException {

  private static final long serialVersionUID = 613939614009233372L;

  public DepositException(String message, int code) {
    super(message, code);
  }
  
}