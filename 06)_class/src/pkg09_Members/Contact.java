package pkg09_Members;

public class Contact {
  private String tel;
  private String mobile;
  
 public Contact(){
    
  }
 public Contact(String mobile){
    //this.mobile=mobile;
    this(null,mobile);
  }
 public Contact(String tel,String mobile){
    this.tel=tel;
    this.mobile=mobile;
    
  }
 public void info() {
    System.out.println("TEL:"+(tel==null? "없음":tel));
    System.out.println("mobile:"+(mobile==null? "없음":mobile));
  }
}
