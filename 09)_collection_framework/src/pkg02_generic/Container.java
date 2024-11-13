package pkg02_generic;
/**
 * 제네릭 타입 T: 컨테이너 인스턴스 생성 시 전달되는 타입 
 * @param <T> 오직 Reference 타입만 전달 할 수 있다. 
 */
public class Container<T> {
  //field
  private T item;

  
  //getter &setter
  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  
  
}
