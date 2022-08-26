abstract class Animal {
	abstract public String getName();
	abstract public String cry();
}

class Cat extends Animal {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String cry() {
		return "야오오옹";
	}
}

class Dog extends Animal {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String cry() {
		return "월월월";
	}
}
public class ProblemSolve {

	public static void main(String[] args) {
		Cat cat = new Cat("고양이");
		Dog dog = new Dog("강아지");
		
		System.out.println(cat.getName() + "의 울음소리는 " + cat.cry());
		System.out.println(dog.getName() + "의 울음소리는 " + dog.cry());
	}

}
