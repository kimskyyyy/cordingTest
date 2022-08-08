package cordingTest;

import java.util.Scanner;

public class test21 {	
	public static String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int cnt = 0;
        
        for(String array2 : array) {
            cnt = array2.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0? array2.toLowerCase() : array2.toUpperCase();
        } //3항 연산자 mod 이용해서 홀짝 구분 -> 홀수는 소문자, 짝수는 대문자로 변경 
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
  
        System.out.println(solution(s));
       sc.close();
       }
}

//이상한 문자 만들기
//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//
//제한 사항
//문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
