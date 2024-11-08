package pkg13_Cart;

public class Cart {

  private Product[] products;
  private int idx; //인덱스==Product 의 갯수  
  
  public Cart(int length) {
    products=new Product[length];
  }

  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getIdx() {
    return idx;
  }

  public void setIdx(int idx) {
    this.idx = idx;
  }
  public void addProduct(Product product) {
    if(product == null) {
      System.out.println("Cart에 담을 Product 이 없습니다.");
      return;
    }
    if(idx==products.length) {
      System.out.println("Cart가 가득 찼습니다.");
      return;
    }
    products[idx++] = product;
  }
  public Product removeProduct(int removeIdx) {
    
    if(idx ==0) {
      System.out.println("Cart 가 비어 있습니다.");
      return null;
    }
    
    if(removeIdx <0 || removeIdx>=idx) {
      System.out.println("존재하지 않는 인덱스 입니다.");
      return null;
    }
    Product removedProduct = products[removeIdx];
    
    System.arraycopy(products, removeIdx+1,products, removeIdx, idx-1- removeIdx);
    products[--idx]=null;
        return removedProduct;
  }





}
