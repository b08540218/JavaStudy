package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	static void arithmetic(int x, int y) {
		System.out.println("덧셈결과: " + (x + y));
		System.out.println("뺄샘결과: " + (x - y));
		System.out.println("곱셈결과: " + (x * y));
		System.out.println("나숫셈 몫: " + (x / y));
		System.out.println("나숫셈 나머지: " + (x % y));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 양의 점수:");
		int n1 = scanner.nextInt();
		System.out.print("두 번째 양의 점수:");
		int n2 = scanner.nextInt();
		
		if (n1 > 0 && n2 > 0) {
			arithmetic(n1, n2);
		}else {
			System.out.println("0 이상의 정수를 작성하세요.");
		}
	scanner.close();
	}

}
