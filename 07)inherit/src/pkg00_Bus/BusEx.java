package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {
    
    Bus bus = new Bus(5);
    
    bus.on(new Man("톰"));
    bus.on(new Man("에릭"));
    bus.on(new Man("마이클"));
    bus.on(new Man("필립"));
    bus.on(new Man("조나단"));
    bus.on(new Man("케빈"));
    bus.info();
    
    bus.off(3);
    bus.info();
    
    bus.on(new Woman("제시카"));
    bus.info();

  }

}
