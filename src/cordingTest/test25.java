package cordingTest;

import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       System.out.println(solution(n));
       
       sc.close();
       }
	public static long solution(long n) {
		long answer = 0;
	      for (long i = 1; i <= n; i++) {
	          if (i * i == n) {
	              answer = (i + 1) * (i + 1);
	              break;
	          }
	          else answer = -1;
	      }
	      return answer;
	  }
}

//식을 직접 계산해서 정답 도출했는데 Math.pow, Math.sqrt 사용해서 풀이 가능 
//정수 제곱근 판별
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.