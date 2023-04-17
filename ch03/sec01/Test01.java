package ch03.sec01;

public class Test01 {

	public static void main(String[] args) {

		final byte MAX = 127;
		final byte MIN = -128;
		// 이런 식으로 기호 상수를 만들어서 쓴다.
		final String RED = "#ff00000";
		
		System.out.println("MIN=" + MIN);
		
		byte i = 17;
		System.out.println(i);
		
		i = 127;
		System.out.println(i);
		
		i = -128;
		System.out.println(i);
		
		
	}

}
