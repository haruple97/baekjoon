package baekjoon;
import java.util.*;

public class Baekjoon {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//�ҹ��� ���̸�ŭ �����迭 ����
		int[] arr = new int[26];
		
		//�迭 ��ü -1�� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		//���ڿ� �Է�
		String S = in.nextLine();
		
		//���ڿ��� ���̸�ŭ �ݺ�
		for(int i=0; i<S.length(); i++) {
			//���ڿ��� �� ���ڷ� ����
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) { //arr ���� ���� -1�� ��쿡�� �ʱ�ȭ
				//�ƽ�Ű�ڵ尪 ch �� -'a' Ȥ�� 97 �ϸ��.
				arr[ch - 'a'] = i; 
			}
		}
		
		for(int val : arr) { //�迭 ���
			System.out.println(val + " ");
		}
	}
}


