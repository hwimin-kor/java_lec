package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

  public static void main(String[] args) {
    // HashSet인스턴스 선언 (Set 인터페이스 타입 사용) 
    Set<String> set;
    //Hashset 인스턴스 생성
    set = new HashSet<String>();
    // HashSet은 인덱스가 없고(순서가없음) , 중복저장이 불가능 하다. 
    
    //요소중복확인
    set.add("봄");
    set.add("봄");
    set.add("봄");
    set.add("가을");
    set.add("여름");
    set.add("겨울");
    
    //전체요소확인
    System.out.println(set);
    
    //for문
    for(String item : set) {
      System.out.println(item);
    }
    //요소 개수 
    System.out.println(set.size());
    
  }

}
