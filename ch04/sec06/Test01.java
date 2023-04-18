package ch04.sec06;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		String id;
		String password;
		int count = 0;
		System.out.println("로그인을 해주세요:)");

		do {
			System.out.print("ID 입력:");
			id = scanner.nextLine();
			if(id.equals("ezen")) {
				System.out.print("PW 입력:");
				password = scanner.nextLine();
				if(password.equals("12345")) {
					System.out.println("OK");
					run = false;
				} else {
					for(int i = 0; i < 2; i++) {
						System.out.print("PW 입력:");
						password = scanner.nextLine();
						if(password.equals("12345")) {
							System.out.println("OK");
							run = false;
							break;
						}
					}
					if (!password.equals("12345")) {
						System.out.println("Get Out!");
						run = false;
					}
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		} while(run);
	}
}
