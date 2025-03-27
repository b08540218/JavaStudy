package ex12inheritance;

//놓침
public class Dog extends Animal{ 

	public String dogKind;
	public String name;
	
	//놓침
	void bark() { 
		System.out.printf("\n이름이 %s이고 종이 %s인 강아지가 짖는다\n", 
				this.name, super.getSpecies());
	}
	
	void showDog() {
		super.showAnimal(); //놓침
		System.out.println("종류는:"+ dogKind);
		System.out.println("이름은:"+ name);

	}

	public Dog(String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}
	
}
