package pkg00_Carrier;

public class Carrier {

  private Cup[] cups;
  private int idx;
  
  //new Carrier(3)을 돌리기 위한 생성자 작업
  public Carrier(int cupCount) {
   cups= new Cup[cupCount];//컵이 들어갈 자리를 만드는거임
  }
  
  public void addCup(Cup cup) {
    if(idx==cups.length) {
      System.out.println("캐리어가 가득 찼습니다.");
      return;
    }
    cups[idx++]=cup;
  }
  
  public void info() {
    if(idx == 0) {
      System.out.println("캐리어가 비어 있습니다.");
      return;
    }
    for(int i=0; i<idx; i++) {
      System.out.println(cups[i].getCoffee().getName());
    }
  }
  



}
