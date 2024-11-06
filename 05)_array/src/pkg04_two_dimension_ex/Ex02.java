package pkg04_two_dimension_ex;

import java.nio.file.spi.FileSystemProvider;

public class Ex02 {

  public static void main(String[] args) {
    //각 층에 거주하는 인원 수 출력하기 
  /*  int[][] apt={
      {2,5},
      {3,4},
      {1,4},
      {2,3},
      {3,3}
      
    };
    for(int i=0; i<apt.length; i++) {
      int total=0;
      for(int j=0; j<apt[i].length; j++) {
        total +=apt[i][j];
      }
      System.out.print((i+1)+"층:"+total+"명" );
      System.out.println();
    }
    
    */
    int[][] T = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };

    
    int[][]temp=new int[5][5];
    
    for(int i=0; i<T.length; i++) {
      for(int j=0; j<T[i].length; j++){
        temp[j][4-i]=T[i][j];
      }
    }
        
        T=temp;
        for(int i=0; i<T.length; i++) {
          for(int j=0; j<T[i].length; j++){
            System.out.print(String.format("%-2d",T[i][j]));
          }
          System.out.println();
        }
    
    
    
    
    
    
  }

}
