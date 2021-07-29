package ch05_java_0729_array;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		
		
// 2차원 배열 생성                        인덱스       줄  행
		int[][] mathScore = new int[2][2];
		for(int i = 0; i < mathScore.length; i++) { //
			for(int k = 0; k <mathScore[i].length; k++) {
				System.out.println("mathScore[" + i + "][" + k +"] = " +  mathScore[i][k]);
			}
		}
		
		
		
//  	열은 지정해 주지 않음. 
		int[][] engScore = new int[2][]; //줄은 두개!            추가된 행     0    1    2
		engScore[0] = new int[2]; // 첫번째 줄에서 2개의 행을 추가 / 0번째 인덱스 0.0, 0.1   x
		engScore[1] = new int[3]; // 두번째 줄에서 3개의 행을 추가 / 1번째 인덱스 1.0, 1.1, 1.2
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
		System.out.println(javaScore[0].length); // 첫번째 줄의 length
		System.out.println(javaScore[1].length); // 두번째 줄의 length
//		System.out.println(javaScore[2].length); // 세번쨰 줄은 존재하지 않음.
		
		
		
		
		
		
		

	}

}
