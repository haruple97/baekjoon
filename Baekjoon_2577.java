package baekjoon;

import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		String str = Integer.toString(result);
		sc.close();
		
		//0~9까지 각각의 수 검사
		for(int i=0; i<10; i++) {
			int cnt = 0;
			
			for(int j=0; j<str.length(); j++) {
				//글자 마다 0~9까지 검사하는 i와 동일한가?
				//charAt 쓸때는-'0'또는 -48을 꼭 해야함.
				//아니면 아스키코드에 대응하는 문자 출력.
				if((str.charAt(j)-'0' == i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
