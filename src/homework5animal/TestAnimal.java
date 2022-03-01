package homework5animal;

public class TestAnimal {
	public static void main(String[] args) {
		Cat miu = new Cat("miu");
		Dog bac = new Dog("bac");
		Dog cab = new Dog("cab");
		Animal xa = new Animal("xa");
		Mammal bug = new Mammal("bug");
		System.out.println(miu);
		System.out.println(bac);
		System.out.println(xa);
		System.out.println(bug);
		miu.greets();
		bac.greets(cab);
		bac.greets();
	}
}
