package cordingTest;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		int[] num;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
        num[i] = sc.nextInt();
		}
       System.out.println(solution(num));
       
       sc.close();
       }
	public int solution(int[] numbers) {
        int answer = 45;
        for(int n : numbers) {
            answer = answer - n;
        }
        return answer;
    }
}

//없는 숫자 더하기
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요..
