package pkg06_constructor;


/**
 * 생성자 
 * 1.인스턴스를 생성할 때 호출하는 특별한 메소드이다.
 * 2.new키워드와 함께 사용된다
 * 3.특징
 *  1)이름이 클래스와 같다.
 *  2)반환타입이 존재하지 않음 
 *  3)매개변수는 일반 메소드처럼 존재한다.(생성자의 오버로딩이 가능함)
 */








public class Sample {
  
  int number; 
  
  //디폴트 형식의 생성자
  //디폴트 형식의 생성자는 생성자가 없는 경우에만 자동으로 생성되는 생성자이다. 
  Sample(){
    
  }
  Sample(int number){
    this.number=number;   
  }
  //매개변수가 있는 생성자
  Sample(String number){
    //this.number=Integer.parseInt(number);
    //this ():생성자를 호출한다. 
    this(Integer.parseInt(number));;
  }
  //매개변수가 있는 생성자 만들기 
  Sample(double number){
  //  this.number=(int)number;    
      this((int)number);
  }
  
  

  
  
}
