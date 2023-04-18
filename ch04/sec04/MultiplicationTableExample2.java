package ch04.sec04;

public class MultiplicationTableExample2 {

	public static void main(String[] args) {
		for(int k = 0; k < 2; k++) {
			for (int i = 1; i<= 9; i++) {
				for (int j = 4*k+2 ; j < 4*(k+1)+2; j++) {
					System.out.print(j + " x " + i + " = " + String.format("%2d", (i*j)) + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
