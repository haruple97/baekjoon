package baekjoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//N, X 입력
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		//A 배열 생성
		int A[] = new int[N];
		
		//A 배열 입력
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		//X보다 작은 경우 A + " " 값 출력
		for(int i=0; i<N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}