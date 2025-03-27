package ex04controlstatement;

public class PatternPrinting {

	public static void main(String[] args) {
		
		int x=0;
        while (x<4) {
            int y=0;
            while (y<4) {
                if (x + y == 3) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                y++;
            }
            System.out.println(); 
            x++;
        }
	}

}
