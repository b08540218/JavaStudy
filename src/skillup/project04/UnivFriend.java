package skillup.project04;

//High 클래스와 구조가 동일함
//대학교친구의 정보 저장용 클래스
public class UnivFriend extends Friend{
	//자식에서 '전공'을 확장
	public String major; //전공
	
	//생성자
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	
	//멤버메서드
	public	void showAllDate() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println(", 전공:"+ major);
	}
	

	public	void shswBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.print("이름:"+ name);
		System.out.print("전공:"+ major);
		System.out.println(", 전화번호:"+ phone);
	}
}
