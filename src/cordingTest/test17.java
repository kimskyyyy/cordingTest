package cordingTest;

import java.util.Scanner;

public class test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	
	public static boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false; //문자열 s의 길이가 4, 6 아니면 false를 return 
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false; //char At(): string타입으로 받은 문자열을 char타입 i번째 문자를 받음   
        }        
        return true;
    }
}

//문자열 다루기 기본
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

//제한 사항
//s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.