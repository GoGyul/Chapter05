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

		String strVar1 = "신민철 ";
		String strVar2 = "신민철 ";
		
		if(strVar1==strVar2) {
			System.out.println("참조가 같다.");
		}else {
			System.out.println("참조가 다르다.");
		}
		
		if(strVar1.equals(strVar1)) {
			System.out.println("문자열이 같음.");
		}
	
		StringEqulasEx s1 = new StringEqulasEx(10,"야스오");
		System.out.println(s1.aa()); //16진수로 표현됨.
		System.out.println(s1.hashCode()); // 10진수로 표현됨 .
		System.out.println(System.identityHashCode(s1));
		

// 같은 주소값을 가지고 있다.
		String st1 = "java";
		String st2 = "java";
		System.out.println(st1==st2);
// 객체를 식별하기 위해 주소값을 찾는 매서드.
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		
		String st3 = new String("java");
		
// new 생성한 인스턴스에 키워드로 문자열 Java를 넣은뒤 비교를 해보니 다름. 		
		System.out.println("주소값이 같은가? : " + st3==st2);
// 문자열 자체만 비교하고 싶다면 equals메서드 사용.
		System.out.println("문자열이 같은가? :" + st3.equals(st2));
		
// 문자열을 new 키워드로 생성하는것을 최대한 기피하라.
		
	}

}
