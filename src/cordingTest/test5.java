package cordingTest;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	
	public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}

//문자열을 정수로 바꾸기
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.