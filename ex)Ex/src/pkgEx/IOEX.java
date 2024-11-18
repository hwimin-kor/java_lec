package pkgEx;

import java.util.Arrays;

public class IOEX {
  
  

  public static void main(String[] args) {
  //연습 1 배열
    
    String[] members; //참조변수 멤버스가 하나 생성됨
    //배열선언임 
    
    //배열생성
    members = new String[4];//힙영역에 공간을 4개 생성함그후 해당 참조를 멤버스변수에 할당하는 작업을함
    members[0]="a";
    members[1]="b";
    members[2]="c";
    members[3]="d";
    
    //배열의 초기화 (선언시에만  배열을 초기화 할 수 있다/
    String[] hobbies= {" 게임","영화","등산"};
    System.out.println(hobbies);// 이러면 배열의 참조값이 나온다
    System.out.println(hobbies.toString());//이것도 참조값
    System.out.println(Arrays.toString(hobbies));
    // 배열 요소의 초기화-2 (선언과 초기화를 분리할 수 있다.) 
    String[] movies; //초기와
    movies= new String[] {"타이타닉","스타워즈","에일리언"};
    
    //배열 순회 ! 
    String[] animals= new String[] {"코뿔소","기린","코끼리"};
    for(int i=0; i<animals.length; i++) {
      System.out.println(animals[i]);
    }
    // 배열의 길이 늘리기 
    String[] seasons= {"봄","여름"};
    String[] temp= new String[4];
    for(int i=0; i<seasons.length; i++) {
      temp[i]=seasons[i];
    }
    seasons=temp;
    System.out.println(Arrays.toString(seasons));
    
    
    //10진수를 2진수로 변환한 결과를 배열에 저장하기 
    int number=35;
    //2진수 선언과 초기화 
    int[]binary=new int[10];
    int i=0;
    while(number>0) {
      binary[i++]=number %2;
      number/=2;
    }
    for(int j=i-1; j>=0; j--) {
      System.out.println(binary[j]);
    }
  }

}
