package ch05_java_0729_array;

public class ArrayExample2 {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		for(int i = 0; i <arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		
		
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
// 스트링 배열의 디폴트값은 null.
		String[] arr3 = new String[3];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
		int sum = 0;
		int[] arr4 = {135,7521,47};
		for(int i = 0; i<arr4.length; i++) {
			sum += arr4[i];
		}
		System.out.println(sum);
		double total = (double) sum/arr4.length;
		System.out.println(total);
		
		
		

	}

}
