package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		
		*/

		System.out.println("\n### 1 ###");
		String juminNum =  "190419-1000000";
		
//		String s1_1 = "190419-3000000";
//		String s1_2 = "190419-4000000";
//		
//		System.out.println("\n### 1 ###");
//		System.out.print("남성입니다:"
//				+ s1_1.charAt(7));
//		System.out.println("\n여성입니다:"
//				+ s1_2.charAt(7));
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
//		System.out.println("\n### 2 ###");
//		String s2_1 = "hong@daum.net";
//		String s2_2 = "not@naver";
//		System.out.println(s2_1.contains("@")); //false_
//		System.out.println(s2_2.contains("@")); //true
//		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
//		System.out.println("\n### 3 ###");
//		System.out.println((s1_1.indexOf("3")!=-1)?
//				"남성입니다" : "여성입니다.");
//		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		//완료
//		System.out.println("\n### 4 ###");
//		String s4 = "my.file.images.jpg";
//		System.out.println(s4.substring(0));
//		System.out.println(s4.substring(0,14));
	}
}
