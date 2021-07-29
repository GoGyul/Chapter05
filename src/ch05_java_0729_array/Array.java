package ch05_java_0729_array;

public class Array {

	public static void main(String[] args) {
		
		
// 배열 선언.
		int [] arr = {11,22,33,44,55};
		System.out.println(arr[0]); // 배열의 인덱스 출력.
		
		
		
// 배열 선언.		
		int [] score = { 83, 97, 94, 53};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) { // 배열의 인덱스 만큼 포문 돌리기.
// sum = sum + score[i];
			sum += score[i];
		}
		double total = (double)sum/score.length;
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
	}

}
