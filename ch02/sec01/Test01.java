package ch02.sec01;

public class Test01 {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 5;

		System.out.println((b+c) *  a / b);
		System.out.println(b+c *  a / b);
		// 산술 연산자에는 우선 순위가 있다. 두 연산 결과는 같지 않다.
	}

}
