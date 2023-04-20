package ch05.sec07;

public class ThreeDimensionArrayPrint {

	public static void main(String[] args) {
		int[][][] threeDimensionArray = new int[3][2][3];
		
		// 입력
		int firstNum = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 3; k++) {
					threeDimensionArray[i][j][k] = firstNum;
					firstNum++;
				}
			}
			firstNum+=4;
		}
		
		//출력
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 3; i++) {
				for(int k = 0; k < 3; k++) {
				System.out.print(" " + threeDimensionArray[i][j][k] + " ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}