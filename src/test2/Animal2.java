package test2;

public class Animal2 {
	
	public String spaecies;
	public String like;
	public int age;
	public String gender;

	public void showAnimal2() {
		System.out.println("### Animal ###");
		System.out.println("동물의 종류: "+ spaecies);
		System.out.println("동물이 좋아하는 것: "+ like);
		System.out.println("나이: "+ age);
		System.out.println("성별: "+ gender);
		
	}
	
	public Animal2(String spaecies, String like, int age, String gender) {
		super();
		this.spaecies = spaecies;
		this.like = like;
		this.age = age;
		this.gender = gender;
	}
	
	public String getSpaecies2() {
		return spaecies;
	}
	
}
