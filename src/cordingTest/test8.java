package cordingTest;

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	
	public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum /arr.length; 
        return answer;
    }

}

//평균 구하기
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.