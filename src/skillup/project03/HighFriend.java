package skillup.project03;

//Friend클래스를 상속하여 확장한 고딩친구 클래스
//고등학교 친구를 추상화한 클래스
public class HighFriend extends Friend{
	//'별명'을 자식에서 확장
	//멤버변수 : 친구의 이름부터 별명까지의 데이터 표현
	public String nickname; ///별명
	
	
	//생성자
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		//3개의 인순느 부모의 생성자를 호출하기 위해 super사용
		this.nickname = nickname;
		//1개의 멤버변수 초기화
	}
	//생성자 : 인스턴스 생성 및 멤버변수 초기화
	//친구의 전체정보를 출력하는 멤버메서드
	//멤버변수 전체 출력용 메서드
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		//부모클래스에 정의된 메서드로 공통사항 출력
		super.showAllData();
		//자신의 멤버변수 출력
		System.out.println(", 별명:"+ nickname);
	}
	//친구의 간략정보를 출력
	//간략정보 2가지만 출력하는 메서드
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.print("별명:"+ nickname);
		System.out.println(", 전번:"+ phone);
	}
}
