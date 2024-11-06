package pkg02_two_dimension;

public class TwoEx {

  public static void main(String[] args) {
    // 2차원 배열: 테이블 형태로 이해 ( 실제로는 1차원배열이 여러 개 존재) 
    //배열 선언 
    String[][] seats=
    //배열 생성
    new String[3][2];//행 2열의 테이블로 이해( 길이가 2인 1차원 배열이 3개있는것)
    //배열 요소 1행의 2개 데이터(1번째1차원 배열의 요소)
    seats[0][0]="A1";
    seats[0][1]="A2";
    //배열요소 : 2행의 2개 데이터 (2번째 1차원 배열의요소)
    seats[1][0]="B1";
    seats[1][1]="B2";
    //배열요소: 3행의 2개 데이터 (3번째 1차원 배열의 요소)
    seats[2][0]="C1";
    seats[2][1]="C2";
    //2차원 배열을 구성하는 1차원 배열 확인 
    //1번째 1차원 배열
    for(int j=0; j<seats[0].length; j++) {
      System.out.print(seats[0][j]+"" );
    }
     System.out.println();  //줄 바꿈 
     for(int j=0; j<seats[1].length; j++) {
       System.out.print(seats[1][j]+"" );
       
  }
     System.out.println(); 
     
     for(int j=0; j<seats[2].length; j++) {
       System.out.print(seats[2][j]+"");
     }
     System.out.println(); 
     
     
     
     //2차원 배열 순회 1. 일반 for문 
     
     
     for(int i=0; i<3; i++) {
       for(int j=0; j<seats[i].length; j++) {
         System.out.print(seats[i][j]+"");
       }
       System.out.println();
     }
     
     
     
     //2차원 배열 순회 2. Advanced for 문
     
     //서로 길이가 다른 1차원 배열을 2차원 배열로 관리하기
     
     String[][] menus=new String[3][];//1차원 배열이 3개 있다. 각 1차원 배열의 길이는 모른다
     menus[0]=new String[3];
     menus[1]=new String[5];
     menus[2]=new String[4];
     //2차원 배열 순회하기 일반for문
     
     for(int i=0; i <menus.length; i++) {
       for(int j=0; j<menus[i].length; j++) {
         System.out.print(menus[i][j]+"");
       }
       System.out.println();
     }
     
     
     //2차원 배열의 초기화 1
     
     String[][] animals= {
         {"tiger","lion"},
         {"dolphin","shark"},
         {"falcon","eagle"}
     };
     for(int i=0; i<animals.length; i++) {
       for(int j=0; j<animals[i].length; j++ ) {
         System.out.print(animals[i][j]+"");
       }
       System.out.println();
     }
     //for 문 출력 
     
     
     //2차원 배열의 초기화2(선언과 초기화)
     String[][]flowers;
     flowers=new String[][] {
       {"장미","안개꽃"},
       {"동백","튤립","프리지아"}
     };
     for(int i=0; i<flowers.length; i++) {
       for(int j=0; j<flowers[i].length; j++) {
         System.out.print(String.format("%-5s",flowers[i][j]));
       }
       System.out.println();
     }
     
     
     
     
     
     
     
     
     
     
     
  }
}
