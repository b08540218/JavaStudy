package ex04controlstatement;

public class QuizDoWhile {

	public static void main(String[] args) {

		
		/*
		퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		/*
		//단에 해당하는 for문(2~9단)
		 for(int x=2; x<=9; x++) {
			 //수에 해당하는 for문(2~9)까지
			 for(int y=1; y<=9; y++) {
			 
				 System.out.printf("%d*%d=%2d ", x, y, x*y);
//				 System.out.print(x +"*"+ y +"="+ x*y+"");				
				 }
			 //하나의 단을 출력할 후 줄바꿈
			 System.out.println();
			 
			 }
				*/
		 
		 /*
			퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
			해법 : x와 y를 더해서 5가 될때 1을 출력한다.
			 */
//		
//		for(int x=1 ; x<=4 ; x++) {
//			for(int y=1 ; y<=4 ; y++) {
//				if(x+y==5)
//					System.out.print("1 ");
//				else
//					System.out.print("0 ");
//			}
//			System.out.println();
//		}
//	}
//		 
//		
//		 for(int x2=0; x2<4; x2++) {
//			 for(int y2=0; y2<4; y2++) {
//				 if(x2 + y2 ==3) {
//					 System.out.print("1 ");
//				 }
//				 else {
//					 System.out.print("0 ");
//				 }
//			 }
//			 System.out.println();
//		 }
//		 

//		
//		 int x=0;
//		 
//		 while(x<4) {
//			 //행(x)이 고정된 상태에서 열을 4번 반복하기 위한 변수
//			 int y=0;
//			 
//			 while(y<4) {
//				 //행과 열의 번호가 돌일할때 1을 출력
//				 if(x + y ==3) {
//					 System.out.print("1 ");
//				 }
//				 else {
//					 //나머지 0을 출력
//					 System.out.print("0 ");
//				 }
//				 y++;
//			 }
//			 System.out.println();
//			 x++;
//		 }
//		 
		
		/*
		퀴즈) 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *
		 **
		 ***
		 ****
		 *****
		*/
		
		//1.행을 위한 반복문 생성
//		int a = 1;
//		do {
//			//2.열을 위한 반복문 생성
//			int b = 1;
//			do	{
//				//3.반복문확인
//				System.out.print("*");
//				b++;
//			//5.행에 해당하는 a의 갯수만큼만 *를 출력한다
//			}while(b<=a);
//			//4.5개 출력후 줄바꿈
//			System.out.println();
//			a++;
//		}while(a<=5);
//		
//		System.out.println();
//		System.out.println("if문으로 구현하기");
//		
//		int i=1;
//		do	{
//			int j=1;
//			do	{
//				//i의 크기만큼 반복해서 *를 출력한다.
//				if(i>=j) {
//					System.out.print("* ");
//							
//				}
//				j++;
//				
//			}while(j<=5);
//			System.out.println();
//			
//			i++;
//		}while(i<=5);
		
	}
}

