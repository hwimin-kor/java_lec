package pk01_Functional_interface;

/*
 * @FunctionalInterface Annotation
 * 1. 함수형 인터페이스이다.
 * 2. 함수형 프로그래밍을 위해서 도입되었다.
 * 3. 오직 1개의 추상 메소드만 가질 수 있다.
 */

@FunctionalInterface
public interface MyInterfaceA {
  void method();
}