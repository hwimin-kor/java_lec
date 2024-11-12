package pkg00_Carrier;

public class Cup {
  //필드로 커피타입을 잡기  setter and getter  세터에 뉴아메리카노 전달시 컵에 아메리카노가 담김 
  //필드생성
  private Coffee coffee;
  //생성자
  public Cup() {
  
  }
  public Coffee getCoffee() {
    return coffee;
  }
  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
  
}
