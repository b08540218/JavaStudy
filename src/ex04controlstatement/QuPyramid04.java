package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		
		for (int a = 1; a <=5; a++) {
			for (int b = 1; b <=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int x = 4; x >=1; x--) {
			for (int y = 1; y <=x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}