package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		for (int a=1; a<=5; a++) {
			//공백 출력 (반비례)
			for (int b = 5; b>=a; b--) {
				System.out.print(" ");
			}
			// *을 출력하는 부분(반비례)
			for (int x = 1; x <=a*2-1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
