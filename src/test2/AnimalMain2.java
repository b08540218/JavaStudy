package test2;

public class AnimalMain2 {

	public static void main(String[] args) {
		
		Bird bird = new Bird("조류", "견과류", 2, "남성", "앵무새", "초코");
				
		bird.showAnimal2();
		System.out.println("====================");
		bird.bark();
		System.out.println("====================");
		bird.showBird();
	}
}
