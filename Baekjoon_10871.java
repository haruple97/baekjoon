package baekjoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//N, X �Է�
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		//A �迭 ����
		int A[] = new int[N];
		
		//A �迭 �Է�
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		//X���� ���� ��� A + " " �� ���
		for(int i=0; i<N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}