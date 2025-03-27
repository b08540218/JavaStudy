package ex12inheritance;

public class Animal {

	private String species;
//	private String specics;
	public int age;
	public String gender;
	
	
	
	public void showAnimal() {
		System.out.println("## Animal ##");
		System.out.print("동물의 종류:"+ species);
		System.out.print("나이:"+ age);
		System.out.println("성별:"+ gender);
	}
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	//놓침
	public String getSpecies() {
		return species;
	}
	
}
