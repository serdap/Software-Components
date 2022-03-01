package homework6_animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Meow");
	}
}
