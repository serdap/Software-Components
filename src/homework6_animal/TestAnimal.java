package homework6_animal;

public class TestAnimal {
	   public static void main(String[] args) {
	      // Using the subclasses
	      Cat cat1 = new Cat("Miu");
	      cat1.greets();
	      Dog dog1 = new Dog("Dog");
	      dog1.greets();
	      BigDog bigDog1 = new BigDog("BigDog");
	      bigDog1.greets();

	      // Using Polymorphism
	      Animal animal1 = new Cat("animalcat");
	      animal1.greets();
	      Animal animal2 = new Dog("animaldog");
	      animal2.greets();
	      Animal animal3 = new BigDog("animalbigdog");
	      animal3.greets();
	      //Animal animal4 = new Animal("animal");

	      // Downcast
	      Dog dog2 = (Dog)animal2;
	      BigDog bigDog2 = (BigDog)animal3;
	      Dog dog3 = (Dog)animal3;
	      //Cat cat2 = (Cat)animal2;
	      dog2.greets(dog3);
	      dog3.greets(dog2);
	      dog2.greets(bigDog2);
	      bigDog2.greets(dog2);
	      bigDog2.greets(bigDog1);
	   }
	}
