package basic;

/**
 * Java 의 함수는 Class 내에 존재해야 하고 Class 가 꼭 필요로 하다.
 */
public class JavaMethod {
	public static void main(String[] args) {
		JavaMethod javaMethod = new JavaMethod();
		var result = javaMethod.add(1, 2);
		System.out.println(result);
	}

	public int add(int a, int b) {
		return a + b;
	}
}


