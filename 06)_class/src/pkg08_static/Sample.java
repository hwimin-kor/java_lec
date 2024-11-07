package pkg08_static;
/*
 * 클래스 맴버
 * 1.메모리에 클래스 영역에 저장된다.
 * 2.인스턴스의 생성이 없어도 접근할 수 있다. 
 * 3.멤버 앞에 static 키워드를 추가한다.
 * 4.클래스로 호출한다. (단 인스턴스로 호출할수도 있으나 권장하지 않는다.)
 * 5.클래스 메소드는 오직 클래스 멤버만 호출해서 사용할 수 있다.
 *    (클래스 메소드는 인스턴스 멤버를 호출 할 수 없다.)
 */

/*
 * 메모리 할당 순서
 * 
 * 영역           :클래스영역       ->스택영역             ->힙영역
 * 종류           : 클래스.static     지역변수             new 키워드로 생성하는것 인스턴스등
 * 라이프 사이클  : 계속 유지       중괄호벗어나면소멸      Garbage Collector 가 소멸
 *                [methodB]+item                                 [item2] [methodA] 
 *                 (클래스멤버)      
 *    
 */
public class Sample {
    static String item;
    String item2;
   //인스턴스멤버
    public void methodA() {
      System.out.println("인스턴스 메소드 methodA");
      System.out.println(item);
      System.out.println(item2);
    }
    //클래스멤버 
    public static void methodB() {
      System.out.println("클래스 메소드 methodB");
      System.out.println(item);
     // System.out.println(item2); 클래스 메소드는 인스턴스 멤버인 item2를 사용할 수 없다. 
    }
}
