package lab3;

public class TestBook2 {

	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		authors[1] = new Author("Paul Tan", "PaulTan@nowhere.com", 'm');

		Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
	}

}
