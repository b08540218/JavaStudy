package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int game = 0;
		while (true) {
			
			while (game < 5) {
				System.out.print("무엇을 내겠습니까? \n(1:가위, 2:바위, 3:보) : ");
				int user = scanner.nextInt();
				
				if (user < 1 || user > 3) {
					System.out.println("가위바위보 할줄 모르세요? 제대로 내십시요");
					continue;
				}
				
				int computer = random.nextInt(3) + 1;
				
				System.out.println("사용자 : " + getChoiceName(user)+ ", 컴퓨터 : "
						+  getChoiceName(computer));
				
				int result = determinWinner(user, computer);
				if (result == 1) {
					System.out.println("이겼습니다.\n");
				} else if (result == -1) {
					System.out.println("졌습니다.\n");
				} else {
					System.out.println("비겼습니다.\n");
				}
				
				game++;
					
				}
			while (true) {
				System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
				int restart = scanner.nextInt();
				
				if (restart == 1) {
					System.out.println("\n....게임재시작...\n");
					break;
				} else if(restart == 0){
					System.out.println("게임이 종료되었습니다. 감사합니다.\n\n....게임종료...");
					scanner.close();
					return;
				}else {
					System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요.");
				}
			}
		}
	}
	public static String getChoiceName(int choice) {
		return switch (choice) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "";
		};
	}
	public static int determinWinner(int user, int computer) {
		if (user == computer) {
			return 0;
		} else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)){
			return 1;
		}else {
			return -1;
		}
	}
}


