package ch05_java_0729_array;

public class MainStringArray {

	public static void main(String[] args) {
		
		if(args.length!=2) { // args �ε����� ������ ���� true false ������ ���纽.
			System.out.println("���� �����մϴ�.");
			
		}
		String strNum1 = args[0]; //args�� ù��° �ε���
		String strNum2 = args[1]; //args�� �ι��� �ε���
		
		int num1 = Integer.parseInt(strNum1); // strNum1�� ��Ʈ�� ���� ������ �ٲ���.
		int num2 = Integer.parseInt(strNum2); // ���� ���� 

		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "= " + result);
	}

}
