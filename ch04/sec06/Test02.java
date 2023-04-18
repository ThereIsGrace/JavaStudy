package ch04.sec06;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 로그인 프로그램 
		// ID, PW;
		String id;
		String pw;

		// ID, PW 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("환영합니다. 로그인을 해주세요.");
		System.out.print("ID 입력: ");
		id = scanner.nextLine();
		
		// ID를 올바르게 입력하지 않은 경우
		if(!id.equals("ezen")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		// ID를 올바르게 입력한 경우
		for(int i = 0; i < 3; i++) {
			System.out.print("PW 입력: ");
			pw = scanner.nextLine();
			
			// PW를 올바르게 입력한 경우
			if(pw.equals("12345")) {
				System.out.println("OK");
				break;
			}
			// PW를 올바르게 입력하지 않았는데 횟수가 더 남은 경우
			else if(i!=2) {
				System.out.println("비밀번호를 잘못 입력하셨습니다. 최종까지 남은 횟수: " + (2-i) + "회");
			}
			// PW를 올바르게 입력하지 않았고 횟수도 안 남은 경우
			else {
				System.out.println("비밀번호를 3번 틀리셨습니다.");
				System.out.println("Get Out");
			}
		}
	}
}
