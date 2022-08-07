package cordingTest;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	class Solution {
		boolean solution(String s) {
			int pCount = 0, yCount = 0;
			String[] array = s.toLowerCase().split(""); //  소문자로 바꿔서 잘라서 배열에 넣음
			
			for (int i = 0; i < array.length; i++) { //for문 돌리면서 p 와 y 카운터 세기
				if ("p".equals(array[i])) { 
					pCount++;
				} else if ("y".equals(array[i])) {
					yCount++;
				}
			}
			if (pCount != yCount) {
				 return false;
			}
				return true;
		}
	}
}

//문자열 내 p와 y의 개수
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
