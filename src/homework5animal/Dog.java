package homework5animal;

public class Dog extends Mammal {
	public Dog() {
		super();
	}
	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
}
