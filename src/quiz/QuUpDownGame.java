package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while (true) {
			int Number = random.nextInt(100) +1;
			System.out.println("생성된 난수: "+ Number);
			
			boolean iWin = playGame(scanner, Number);
			
			if (iWin) {
				System.out.println("승리하였습니다.");
			} else {
				System.out.println("실패하였습니다.");

			}
			
			if (!gameRetry(scanner)) {
				System.out.println("감사합니다. 프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
	
	public static boolean playGame(Scanner scanner, int Number) {
		int timeNumber = 7;
		
		while (timeNumber > 0) {
			System.out.print("1~100사이의 정수를 입력하세요: ");
			int user = scanner.nextInt();
			
			if (user < Number) {
				System.out.println("Up입니다.");
			} else if (user > Number){
				System.out.println("Down입니다");
			}else {
				System.out.println("정답입니다.");
				return true;
			}
			timeNumber--;
		}
		return false;
	}
	public static boolean gameRetry(Scanner scanner) {
		System.out.println("게임을 다시 시작할까요?\n1.게임재시작, 0:게임종료");
		int choice = scanner.nextInt();
		return choice == 1;
	}

}
