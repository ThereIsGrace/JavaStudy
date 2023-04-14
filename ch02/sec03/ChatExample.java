package ch02.sec03;

public class ChatExample {
	public static void main(String[] args) {
		char c1 = 'A';          //문자 저장
		char c2 = 65;           //유니코드 직접 저장
		
		char c3 = '가';          //문자 저장
		char c4 = 44032;         //유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		//모든 문자는 어차피 숫자이다.
	}
}