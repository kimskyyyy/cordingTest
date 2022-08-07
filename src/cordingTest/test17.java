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
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }        
        return true;
    }
}

//문자열 다루기 기본
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.