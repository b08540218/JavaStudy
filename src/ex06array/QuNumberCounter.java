package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		for (int a : answer) {
			if (a >= 1 && a <= 4) {
				counter[a - 1]++;
			}
		}
		
		for (int b = 0; b < counter.length; b++) {
			System.out.println("counter["+ b +"] => "+ counter[b]);
		}
	}

}
