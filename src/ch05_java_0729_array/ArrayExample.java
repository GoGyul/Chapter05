package ch05_java_0729_array;

public class ArrayExample {

	public static void main(String[] args) {
		
//// �迭 ����.		
//		int[] score;
//		score = new int[] {12,19,55,76}; //�迭 ����.
//		
//		int sum = 0;
//		
//// 	�迭 , score�� �ε��� ��ŭ for�� ����.
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i]; //sum�� �ε����� ���� ����..
//		}
//		System.out.println("�ε����� �� ����? " +sum);
		
		
		
// 	add�ż��� ȣ�� new Ű���带 ����Ͽ� �Ű������� ������ ��ߵ�.	
// 	�żҵ��� �Ű����� �迭�� ���!.		
		double sum3 = add(new double[] {17,15,11,});
		System.out.println(sum3);// �ּҰ��� ��� ������ �ǳ�/
	
		
// new Ű����� arr �迭 ������ �ε����� 30���� �־���.
// �ڹٿ����� ����Ʈ�� 0�� �����Ѵ�.		
		int[] arr;
		arr = new int[30];
		System.out.println(arr[4]);
		
		
	}
	
// �ż���� ����.
	public static double add(double[] scoreTotal) { // �Ű������� �̷��� �޾ƾ���.
		int sum2 = 0;
		for(int i = 0; i < scoreTotal.length; i++) {
			sum2 += scoreTotal[i];	
		}
		double sum2n = (double) sum2/scoreTotal.length;
		return sum2n;
		
	}

}
