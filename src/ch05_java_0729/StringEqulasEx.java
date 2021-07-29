package ch05_java_0729;

public class StringEqulasEx {

	int age;
	String name;
	
	public StringEqulasEx (int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public StringEqulasEx aa() {
		return this;
	}
	
	public static void main(String[] args) {

		String strVar1 = "�Ź�ö ";
		String strVar2 = "�Ź�ö ";
		
		if(strVar1==strVar2) {
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ٸ���.");
		}
		
		if(strVar1.equals(strVar1)) {
			System.out.println("���ڿ��� ����.");
		}
	
		StringEqulasEx s1 = new StringEqulasEx(10,"�߽���");
		System.out.println(s1.aa()); //16������ ǥ����.
		System.out.println(s1.hashCode()); // 10������ ǥ���� .
		System.out.println(System.identityHashCode(s1));
		

// ���� �ּҰ��� ������ �ִ�.
		String st1 = "java";
		String st2 = "java";
		System.out.println(st1==st2);
// ��ü�� �ĺ��ϱ� ���� �ּҰ��� ã�� �ż���.
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		
		String st3 = new String("java");
		
// new ������ �ν��Ͻ��� Ű����� ���ڿ� Java�� ������ �񱳸� �غ��� �ٸ�. 		
		System.out.println("�ּҰ��� ������? : " + st3==st2);
// ���ڿ� ��ü�� ���ϰ� �ʹٸ� equals�޼��� ���.
		System.out.println("���ڿ��� ������? :" + st3.equals(st2));
		
// ���ڿ��� new Ű����� �����ϴ°��� �ִ��� �����϶�.
		
	}

}
