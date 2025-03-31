package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		list.add(new Student("가길동", 10, "2018"));
		list.add(new Student("나길동", 20, "2017"));
		list.add(new Student("다길동", 30, "2016"));
		list.add(new Student("라길동", 40, "2015"));
		//객체 추가(컬렉션에 저장)
		Student st1;
		Student st2;
		Student st3;
		Student st4;
		
			
		//1.검색할 이름을 입력받음
		System.out.print("검색할 이름을 입력하세요");
		String searchName = scanner.nextLine();
		
		
		//2.확장for문으로 컬렉션 전체를 접근
		int index = -1;
		for(Student st : list) {
			if (st.getName().equals(searchName)) {
				index = list.indexOf(st);
				System.out.println("찾은인덱스값: "+ index);
			}
		}
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().equals(searchName)) {
//                index = i;
//                break;
//            }
//        }
		
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력
		if (index != -1) {
			Student removedStudent = list.remove(index);
			System.out.println("삭제된 학생 정보:"+ removedStudent);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		//4.전체정보 출력
		System.out.println("전체 학생 목록");
		for (Student student : list) {
			System.out.println(student);
		}
		
		scanner.close();
	}


}
