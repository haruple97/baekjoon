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
		
		//0~9���� ������ �� �˻�
		for(int i=0; i<10; i++) {
			int cnt = 0;
			
			for(int j=0; j<str.length(); j++) {
				//���� ���� 0~9���� �˻��ϴ� i�� �����Ѱ�?
				//charAt ������-'0'�Ǵ� -48�� �� �ؾ���.
				//�ƴϸ� �ƽ�Ű�ڵ忡 �����ϴ� ���� ���.
				if((str.charAt(j)-'0' == i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
