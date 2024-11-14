package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
  
  /**
   * Mutable 객체
   * 저장된 요소의 갯수를 변경할 수 있다. 
   */

  public static void a() {


    //ArrayList 선언 : 타입은 List 인터페이스 타입 사용
    List<String> members;
    //ArrayList 생성 : 제네릭 타입 생략 가능 
    members= new ArrayList<String>();//members = new ArrayList<>(); 로 할 수 있다. 기본크기는 10임 
    //요소 추가하기 (인덱스 0부터 순차적으로 추가 된다)
    members.add("제니");
    members.add("지수");
    members.add("태양");
    members.add("로제");
    members.add("리사");
    //요소 삭제하기 (삭제된 요소 자리로 이후 요소들이 이동한다.)
    members.remove(2);
    //요소 수정하기
    members.set(1,"jenny");
    members.set(2,"jisu");
    members.set(3,"rose");
    members.set(4,"lisa");
    //요소 전체 확인
    System.out.println(members);
    //요소 개별 확인 
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    //요소 개수 확인
    System.out.println(members.size());
    
  }
  /**
   * immutable 객체 
   * 저장된 요소의 갯수를 변경할 수 없다.
   * 크기는 자동으로 조정된다. 
   */
  public static void b() {
    // 배열 초기화를 이용한 ArrayList 생성
    List<Integer>numbers= Arrays.asList(10,20,30,40,50);
    //요소 추가하기 안됨
   // numbers.add(60);
    //요소 삭제하기 안됨
    //numbers.remove(0);
    numbers.set(0,100);
    System.out.println(numbers);
   
  }
  public static void c() {
    String [] words= {"봄", "여름", "가을","겨울"};
    List<String>seasons = Arrays.asList(words);
    
    for(int i = 0, size=seasons.size(); i<size; i++) {            //size()메소드는 한번만 호출할 수 있도록 초기화 영역에서 변수로 처리한다. 
      System.out.println(seasons.get(i));
    }
    for(int i = 0; i<words.length; i++) {
      System.out.println(words[i]);
    }
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    c();
  }

}
