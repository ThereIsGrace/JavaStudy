package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// 변수 value 선언
		// 변수 초기화를 하지 않으면 이 안에는 쓰레기값이 들어있다. 결과가 엉터리로 나오는게 GIGO이다. 
		int value = 0;
		
		// 연산 결과를 result의 초기값으로 대입
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}

}
