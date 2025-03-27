package ex05method;

public class QuSymmetry {

	public static void rotationSymmetry() {
		int[][] mat = new int[4][4];
		
		for (int x = 0; x < 4; x++) {
			mat[x][3 - x] = 1;
		}
		int y = 0;
		while (y<4) {
			int a = 0;
			while (a < 4) {
				System.out.print(mat[y][a]+" ");
				a++;
			}
			System.out.println();
			y++;
		}
	}
	public static void main(String[] args) {
		
		rotationSymmetry();
	}

}
