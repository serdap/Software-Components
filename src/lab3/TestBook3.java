package lab3;

public class TestBook3 {

	public static void main(String[] args) {
		Author3 author = new Author3("Tan Ah Teck", "alteck@nowhere.com");
		System.out.println(author);
		author.setEmail("ahteckauthor@nowhere.com");
		System.out.println(author);
		System.out.println("Name is: " + author.getName());
		System.out.println("Email is: " + author.getEmail());

		Book3 book = new Book3("12345", "Java for dummies", author, 8.8, 88);
		System.out.println(book);
		
		book.setPrice(9.9);
		book.setQty(99);
		
		System.out.println(book);
		System.out.println("isbn is: " + book.getISBN());
		System.out.println("name is: " + book.getName());
		System.out.println("price is " + book.getPrice());
		System.out.println("qty is: " + book.getQty());
		System.out.println("author is " + book.getAuthor());
		System.out.println("author's name is: " + book.getAuthorName());
		System.out.println("author's name is: " + book.getAuthor().getName());
		System.out.println("author's email is: " + book.getAuthor().getEmail());
	}

}
