package pkg13_Cart;

import java.util.Arrays;

public class CartEx {

  public static void main(String[] args) {
    
    Cart cart= new Cart(5);
    
    cart.addProduct(null);
    cart.addProduct(new Product("새우깡",1000));
    cart.addProduct(new Product("티비",3000));
    cart.addProduct(new Product("라디오",4000));
    cart.addProduct(new Product("바지",5000));
    cart.addProduct(new Product("컵",1000));
    cart.addProduct(new Product("차",4000));
    
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    for(int i =0; i<cart.getIdx(); i++) {
      System.out.println(cart.getProducts()[i].getPrice()
          );
    }
    

    
    
    

  }

}
