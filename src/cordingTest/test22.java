package cordingTest;

import java.util.*;

public class test22 {
    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n); //int n을 String으로 변환
        
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       System.out.println(solution(n));
       
       sc.close();
       }
}
	
//	자릿수 더하기 
//	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다