package ch05_java_0729_array;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		
		
// 2���� �迭 ����                        �ε���       ��  ��
		int[][] mathScore = new int[2][2];
		for(int i = 0; i < mathScore.length; i++) { //
			for(int k = 0; k <mathScore[i].length; k++) {
				System.out.println("mathScore[" + i + "][" + k +"] = " +  mathScore[i][k]);
			}
		}
		
		
		
//  	���� ������ ���� ����. 
		int[][] engScore = new int[2][]; //���� �ΰ�!            �߰��� ��     0    1    2
		engScore[0] = new int[2]; // ù��° �ٿ��� 2���� ���� �߰� / 0��° �ε��� 0.0, 0.1   x
		engScore[1] = new int[3]; // �ι�° �ٿ��� 3���� ���� �߰� / 1��° �ε��� 1.0, 1.1, 1.2
		System.out.println(engScore[1].length);
		for(int i = 0; i < engScore.length; i ++) {
			for(int k = 0; k < engScore[i].length; k++) {
				System.out.println("eng score : "+engScore[i][k]);
			}
		}
		
		
		
		
		int sum = 0;
		int[][] javaScore = {{13,15},{54,87,115,1,23,4,2}};
		for(int i = 0; i < javaScore.length; i++) {
			for(int k = 0; k < javaScore[i].length; k++) {
				System.out.println("java score : "+javaScore[i][k]);
			}
		}
		System.out.println(javaScore[0].length); // ù��° ���� length
		System.out.println(javaScore[1].length); // �ι�° ���� length
//		System.out.println(javaScore[2].length); // ������ ���� �������� ����.
		
		
		
		
		
		
		

	}

}
