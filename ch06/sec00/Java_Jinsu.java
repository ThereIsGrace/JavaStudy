package ch06.sec00;

import java.util.Scanner;

public class Java_Jinsu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10진수를 입력하세요 : ");
		
		int ken = scan.nextInt();
		
		scan.close();
		
		// 10진수, 2진수, 8진수, 16진수 출력
		System.out.println("10진수는 : " + ken);
		System.out.println("2진수는 : " + Integer.toBinaryString(ken));
		System.out.println("8진수는 : " + Integer.toOctalString(ken));
		System.out.println("16진수는 : " + Integer.toHexString(ken));
	}
}
