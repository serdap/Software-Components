package lab3;

public class Book2 {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book2(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		qty = 0;
	}

	public Book2(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public String toString() {
		return "Book[name = " + name + ", authors =[" + getAuthorsName() + "]" + ", price = " + price + ", qty = " + qty
				+ " ]";
	}

	public String getAuthorsName() {
		String authorName = "";
		for (int i = 0; i < authors.length - 1; i++) {
			authorName += authors[i].getName() + ", ";
		}

		return authorName + authors[authors.length - 1].getName();
	}

}
