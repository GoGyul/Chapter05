package ch05_java_0729_array;

public class Array {

	public static void main(String[] args) {
		
		
// �迭 ����.
		int [] arr = {11,22,33,44,55};
		System.out.println(arr[0]); // �迭�� �ε��� ���.
		
		
		
// �迭 ����.		
		int [] score = { 83, 97, 94, 53};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) { // �迭�� �ε��� ��ŭ ���� ������.
// sum = sum + score[i];
			sum += score[i];
		}
		double total = (double)sum/score.length;
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
	}

}
