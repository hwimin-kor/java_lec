package pkg03_constructor;

public class Developer extends Person{
  
  private String[] skills;

  public Developer(String[] skills) {
    super();//인자가없는 public Person()을 부른것임 
    this.skills = skills;
  }


  public Developer(String name, String[] skills) {
    //자식은 반드시 슈퍼클래스의 생성자를 호출해야한다. 
    super(name);  //public Person(string name){}생성자 호출한것
    this.skills=skills;
    
  }
  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
  
  
  
}

