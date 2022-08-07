package cordingTest;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	
public int solution(int[] absolutes, boolean[] signs) {
        
        int sum = 0;
        
        //배열 길이
        for(int i=0; i<absolutes.length; i++){
            
            if(signs[i] == true){
                sum += absolutes[i];
            }
            else if(signs[i] == false){
                sum -= absolutes[i];
            }
        }
        return sum;
    }

}

//음양 더하기
//어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요..