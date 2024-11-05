package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {
    /*// 3단 구구단의 결과 (3,6,9,,,27)배열에 저장하기 
    int[] result = new int[9];
    for(int i=0; i <= result.length; i++) {
        // 계산 결과를 배열에 저장
      System.out.println(3*i);
    }   --->>> 이렇게하니까 결과값이 배열이 나오는게 아님 그냥내가 계산한거와다름없음 아래처럼 배열로서 진열하려면 배열에 값을 저장할줄 알아야함
    */
    //모범답안
    int[]samDan = new int[9];
    
    for(int i=0; i<samDan.length; i++) {
      samDan[i]=3*(i+1);
    }
    System.out.println(Arrays.toString(samDan));
 }
}