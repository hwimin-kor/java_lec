package pkg11_Fighter;

public class Fighter {

  // field
  private String name;
  private int hp;

  // constructor
  public Fighter(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
  public boolean isAlive() {
    return hp > 0;
  }
  
  public void punch(Fighter other, int power) {
    System.out.println(name + "의 펀치 공격");
    if(power > other.hp) {
      other.hp = 0;
    } else {
      other.hp -= power;
    }
    System.out.println("  " + name + "의 hp: " + hp);
    System.out.println("  " + other.name + "의 hp: " + other.hp);
  }
  
}