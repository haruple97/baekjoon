package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//테스트 케이스 갯수 입력
		String P = ""; //최종 문자열 P선언
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt(); //문자 반복 횟수 1~8 입력
			String S = sc.next(); //문자열 입력
			
			for(int j = 0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
}
