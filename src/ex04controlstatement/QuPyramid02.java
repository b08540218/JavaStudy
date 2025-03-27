package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		int a = 5;
		do {
			int b = 1;
			do {
				System.out.print("* ");
				b++;
			}while(b<=a);
			System.out.println();
			a--;
		}while(a>=1);
	}

}
