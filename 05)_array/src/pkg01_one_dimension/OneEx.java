package pkg01_one_dimension;

import java.util.Arrays;

public class OneEx {

  public static void main(String[] args) {
    
    
    
    // 1차원 배열: 하나의 인덱스를 사용하는 배열 
    
    //배열 선언 
    String[]members;//참조 변수 하나가 생성된다.
    //배열 생성 
    members= new String[4]; // 배열의 길이임 4개 힙 영역에 연속된 4개 공간이 생기고 해당 참조를 members 변수에 할당한다. 
    //배열 요소 (배열이름 + 인덱스)
    members[0]="지수";
    members[1]="로제";
    members[2]="리사";
    members[3]="제니";
    System.out.println( members[0]);
    System.out.println( members[1]);
    System.out.println( members[2]);
    System.out.println( members[3]);
    //배열 요소의 초기화 (선언과 초기화를 분리할 수 없다)
    
    String[] hobbies= {"게임","여행","독서"};
    System.out.println(hobbies);
    System.out.println(hobbies.toString());
    System.out.println(Arrays.toString(hobbies));
    //배열 요소의 초기화2(선언과 초기화를 분리할 수 있다.)
    String[] movies;
    movies=new String[] {"타이타닉","스타워즈","에일리언"};
    System.out.println(Arrays.toString(movies));
    //배열 길이 (배열길이는 수정이 불가능함)
    String[]flowers= {"장미","동백","할미"};
    System.out.println(flowers.length);
    //flowers.length=10; 실행불가능함 length필드는 final필드임
    
    
    //배열 순회(일반for문)
   
    
    String[] animals=new String[] {"코뿔소","기린","코끼리"};
    for(int i= 0; i<animals.length; i++) {
      System.out.println(animals[i]);
    }

    //배열의 길이를 늘리는 방법
    //1.새로운 길이의 새로운 배열을 만든다.
    //2. 기존 배열의 요소를 모두 새로운 배열로 옮긴다
    //3. 기존 배열의 참조를 새로운 배열의 참조를 바꾼다
    String[] seasons= {"봄","여름"};
    String[] temp= new String[4];
    for(int i=0; i< seasons.length; i++) {
      temp[i]=seasons[i];
    }
    seasons=temp;
    System.out.println(Arrays.toString(seasons)); 
    //배열 순회(Advanced for 문) 배열 요소를 수정할때는 사용할 수 없다. 
    String[] foods= {"김치","보쌈","시금치"};
    for(String food:foods) { 
    food="오리로스";
    }//모든 요소를 오리로스로 수정하는 코드가 아님 
    System.out.println(Arrays.toString(foods));
    //단순 참조 용으로 사용
    for(String food : foods) {
      System.out.println(food);
    }
    
    
  }
}