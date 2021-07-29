package ch05_java_0729_array;

public class ArrayExample {

	public static void main(String[] args) {
		
//// 배열 선언.		
//		int[] score;
//		score = new int[] {12,19,55,76}; //배열 만듬.
//		
//		int sum = 0;
//		
//// 	배열 , score의 인덱스 만큼 for문 돌림.
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i]; //sum에 인덱스의 합을 담음..
//		}
//		System.out.println("인덱스의 총 합은? " +sum);
		
		
		
// 	add매서드 호출 new 키워드를 사용하여 매개변수를 전달해 줘야됨.	
// 	매소드의 매개값이 배열일 경우!.		
		double sum3 = add(new double[] {17,15,11,});
		System.out.println(sum3);// 주소값은 어디에 저장이 되나/
	
		
// new 키워드로 arr 배열 성생후 인덱스로 30개를 주었다.
// 자바에서는 디폴트로 0을 제공한다.		
		int[] arr;
		arr = new int[30];
		System.out.println(arr[4]);
		
		
	}
	
// 매서드로 만들어봄.
	public static double add(double[] scoreTotal) { // 매개변수로 이렇게 받아야함.
		int sum2 = 0;
		for(int i = 0; i < scoreTotal.length; i++) {
			sum2 += scoreTotal[i];	
		}
		double sum2n = (double) sum2/scoreTotal.length;
		return sum2n;
		
	}

}
