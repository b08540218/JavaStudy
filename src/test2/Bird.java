package test2;

public class Bird extends Animal2{
	
	public String birdkind;
	public String name;
	
	void bark() {
		System.out.printf("\n 이름이%s %s이고 견과류를 좋아하는 종이 %s인 새가 짖는다.",
			this.name, super.getSpaecies2());
		
	}
	
	void showBird() {
		super.showAnimal2();
		System.out.println("종류는: "+ spaecies);
		System.out.println("좋아하는것은: "+ like);
		System.out.println("이름은: "+ name);
	}
	public Bird(String spaecies, String like, int age, String gender, String birdkind, String name) {
		super(spaecies, like, age, gender);
		this.birdkind = birdkind;
		this.name = name;
	}
	
	
}
