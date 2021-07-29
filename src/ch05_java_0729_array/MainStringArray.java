package ch05_java_0729_array;

public class MainStringArray {

	public static void main(String[] args) {
		
		if(args.length!=2) { // args 인덱스의 갯수에 따라 true false 조건을 맞춰봄.
			System.out.println("값이 부족합니다.");
			
		}
		String strNum1 = args[0]; //args의 첫번째 인덱스
		String strNum2 = args[1]; //args의 두번쨰 인덱스
		
		int num1 = Integer.parseInt(strNum1); // strNum1의 스트링 값을 정수로 바꿔줌.
		int num2 = Integer.parseInt(strNum2); // 위와 동일 

		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "= " + result);
	}

}
