package cordingTest;

import java.util.Scanner;

public class test24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
       System.out.println(solution(a));
       
       sc.close();
       }
	public static long solution(long n) {
	    char[] sort = String.valueOf(n).toCharArray();
		int tmp = 0;
		for(int i=0; i<sort.length; i++) {
			for(int j=i+1; j<sort.length; j++) {
				if(sort[i] < sort[j]) {
					tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = (char) tmp;
				}
			}
		}
		
		return Long.parseLong(String.valueOf(sort));
	    }
}

//정수 내림차순으로 배치하기
//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.