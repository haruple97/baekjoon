package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//�׽�Ʈ ���̽� ���� �Է�
		String P = ""; //���� ���ڿ� P����
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt(); //���� �ݺ� Ƚ�� 1~8 �Է�
			String S = sc.next(); //���ڿ� �Է�
			
			for(int j = 0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
}