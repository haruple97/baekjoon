package baekjoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr; //점수 배열
		
		//테스트 케이스의 개수
		int C = sc.nextInt();
	
		for(int i=0; i<C; i++) { //테스트 케이스 개수
			
			int N = sc.nextInt(); //학생 수
			arr = new int [N];
			
			double sum = 0; //성적 합계
			
			//성적 입력
			for(int j=0; j<N; j++) {
				int score = sc.nextInt(); //성적
				arr[j] = score;
				sum += score;
			}
			
			double avg = (sum/N);
			double count = 0; //평균 넘는 학생 수
			
			//평균 넘는 학생 비율
			for(int j=0; j<N; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);

		}
		sc.close();
		
	}
}