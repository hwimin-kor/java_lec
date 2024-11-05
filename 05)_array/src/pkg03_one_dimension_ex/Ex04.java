package pkg03_one_dimension_ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04 {

  public static void main(String[] args) {
    //10진수를 2진수로 변환한 결과를 배열에 저장하기  
    
    int number=35;
    int[]binary=new int[10];
    
    
    for(i=0; number>0; i++) {
             binary[i]=number%2;
             number/=2
    }
    System.out.println(Arrays.toString(binary));
    
   /* int i=0;;
    while(number>0) {
      binary[i++]=number%2; 
    number/=2;
      }
    for(int j=i-1; j>=0; j--) {
     System.out.print(binary[j]);
    }*/
    }

}
