package pkg00_Bus;

public class Bus {

    private Seat[] seats;

    private int numOfPerson;
    
    public Bus(int limit) {
      seats= new Seat[limit]; //대괄호는 배열을 만든것임 seat 는 없음 
      for(int i =0; i<limit; i++) {
        seats[i]= new Seat();// 각배열에 seat 를 만들어주는 작업임 
      }
    }
    
    //버스탑승 반드시 앞자리부터 채우기 입석금지 
    
    public void on(Person person) {
      if(numOfPerson >=seats.length) {
        System.out.println("만석입니다. 다음버스를 이용해 주세요.");
        return;
      }
      for(int i=0; i< seats.length; i++) {
        if(seats[i].getPerson()==null) {
          seats[i].setPerson(person);
          numOfPerson++;
          return;
        }
      }
    }
    //버스 하차 (내리는 사람의 좌석 번호를 이용해서 하차 ) 
    public void off(int seatNo) {
      seatNo--;
      if(seatNo<0|| seatNo>=seats.length) {
        System.out.println("좌석 번호가 잘못 전달되었습니다.");
      }
      seats[seatNo].setPerson(null);
      numOfPerson--;
    }
    //버스 탑승 명단 (1번좌석 : 홍길동 , 2번좌석 비어있음 ,,,,,)
    public void info() {
      for(int i = 0; i < seats.length; i++) {
        Person p = seats[i].getPerson();  // 각 좌석에 앉은 사람
        if(p == null)
          System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
        else
          System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + p.getName());
      }
      
    }
}
