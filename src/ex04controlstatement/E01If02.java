package ex04controlstatement;

/*
 if문의 형식2
 	if(조건식){
 		조건이 true일때 실행문장;
 	}
 	else{
 		조건이 false일때 실행문장;
 	}
 */
public class E01If02 {

	public static void main(String[] args) {
		
		//120을 2로 나누면 나머지가 0이므로 짝수로 판단
		int num = 120;
		if(num%2 == 2) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		/*
		삼항연산자(조건연산자)
		: if~else문과 동일하지만 짧은 코드로 표현이 가능하므로
		실무에서 자주 사용된다.
		형식]
			변수 = (조건식) ? true일때 : false일때;
		 */
		String numberResult = (num%2==0) ? "짝수임":"홀수임";
		System.out.println("숫자 "+ num +"은 "+numberResult);
		
		
		
		int num2 = 100;
		//중첩된 if문으로 여러 조건으로 추가할 수 있다.
		if(num2%2 == 0) {
			if(num2>=100) {
				System.out.println("짝수이면서 100이상");
			}
			else {
				System.out.println("짝수이면서 100미만"); 
			}
		}
		else {
			if(num2>=100)
				System.out.println("홀수이면서 100이상");
			else
				System.out.println("홀수이면서 100미만");
		}
	}

}
