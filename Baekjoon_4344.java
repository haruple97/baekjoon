package baekjoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr; //���� �迭
		
		//�׽�Ʈ ���̽��� ����
		int C = sc.nextInt();
	
		for(int i=0; i<C; i++) { //�׽�Ʈ ���̽� ����
			
			int N = sc.nextInt(); //�л� ��
			arr = new int [N];
			
			double sum = 0; //���� �հ�
			
			//���� �Է�
			for(int j=0; j<N; j++) {
				int score = sc.nextInt(); //����
				arr[j] = score;
				sum += score;
			}
			
			double avg = (sum/N);
			double count = 0; //��� �Ѵ� �л� ��
			
			//��� �Ѵ� �л� ����
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