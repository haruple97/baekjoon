package baekjoon;

import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ù°�� �׽�Ʈ���̽�
		int testcase = sc.nextInt();
		String a = sc.next();
		sc.close();
		
		int sum = 0;
		
		for(int i=0; i<testcase; i++) {
			sum += a.charAt(i)-'0';
		}
		
		System.out.print(sum);
		
	}
}
