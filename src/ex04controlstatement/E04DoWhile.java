package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
do~whil문
	: 반드시 한번은  실행해야 할 경우 사용하는 반복문으로 조건검사없이
	무조건 한번은 실행된다
	형식]
		반복을 위한변수
		do{
			실행문장;
			증감식;
		}while(조건식); <= 문장끝에 세미콜론이 들어간다.
 */
public class E04DoWhile {

	public static void main(String[] args) throws IOException{

		//누적합과 반복을 위한 변수 선언
		int sum = 0;
		int i = 1;
		//조건없이 진입해서 실행
		do {
			//증가하는 변수 i를 누적해서 sum에 더함
			sum += i;
			i++;
			//탈출의 조건을 위해 증가시킨후 체크한다.
		} while(i<=10);
		System.out.println("1~10까지의 누적합:"+ sum);
		
		
		
		
		int total = 0;
		int j = 1;
		do {
			//4 혹은 7의 배수인지 확인
			if(j%4==0 || j%7==0) {
				//배수 확인용 출력문장
				System.out.println("j="+ j);
				//증가하는 j를 누적해서 더해준다.
				total +=j;
			}
			j++;
			//탈출의 조건을 위해 j를 증가시킨후 확인한다.
		}while(j<1000);
		System.out.println("1~1000사이 4or7의 배수합:"+ total);
		
		//사용자 입력을 위한 참조변수 생성
		Scanner scanner = new Scanner(System.in);
		//점수와 탈출문자 입력을 위한 변수 생성
		int kor, eng, math, avg;
		int exitCode;
		do {
			//점수를 정수로 입력받음
				System.out.println("국어점수");
			kor = scanner.nextInt();
				System.out.println("영어점수");
			eng = scanner.nextInt();
				System.out.println("수학점수");
			math = scanner.nextInt();
			
			//평균값 계산(평균점수의 구간을 위해 10을 곱해준다.)
			avg = (kor+eng+math) / (3 * 10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8: 
				System.out.println("B학점");break;
			case 7: 
				System.out.println("C학점");break;
			case 6: 
				System.out.println("D학점");break;
			case 5: 
				System.out.println("F학점");break;
			}
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
		
		}while(!(exitCode=='x' || exitCode=='X'));
		
		/*
		x를 입력한 경우
			!(true || false) => !(true) => false
			따라서 반복문을 탈출한다.
		a를 입력한 경우
			!(false ||  false) => !(false) = true
			반복을 위해 처음으로 돌아간다.
		 */
		}
		
	}







