package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String str;

		for(int i=0; i<t; i++) {
			str = sc.next(); //next는 공백을 기준으로 한단어식만 입력 받음.
			int sum = 0;
			int cnt = 0;

			for(int j=0; j<str.length(); j++) {
				
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			
			System.out.println(sum);
		}
	}
}
