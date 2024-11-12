package pkg10_interface.C_marker;

public class MarkerEx {

  public static void main(String[] args) {
    
    Kimchi kimchi= new Kimchi();
    Hamburger hamburger= new Hamburger();
    Sasimi sasimi = new Sasimi();
    
    Person person= new  Person();
    person.eat(hamburger);
   // person.eat(kimchi);
    //person.eat(sasimi);
    
    
        

  }

}
