package baekjoon;
import java.util.*;

public class Baekjoon {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//소문자 길이만큼 정수배열 선언
		int[] arr = new int[26];
		
		//배열 전체 -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		//문자열 입력
		String S = in.nextLine();
		
		//문자열의 길이만큼 반복
		for(int i=0; i<S.length(); i++) {
			//문자열을 각 문자로 읽음
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) { //arr 원소 값이 -1인 경우에만 초기화
				//아스키코드값 ch 에 -'a' 혹은 97 하면됨.
				arr[ch - 'a'] = i; 
			}
		}
		
		for(int val : arr) { //배열 출력
			System.out.println(val + " ");
		}
	}
}


