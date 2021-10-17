package baekjoon;
import java.util.*;

public class Baekjoon {
	
	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; //1���� 10000�̹Ƿ�
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) { //false�� �ε����� ���
				System.out.println(i);
			}
		}
	}
	
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); //ù° �ڸ���.
			number = number/10; //10�� ������ ù ° �ڸ��� ���ش�.
		}
		return sum;
	}
}


