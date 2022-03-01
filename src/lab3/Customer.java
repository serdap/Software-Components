package lab3;

public class Customer {
	private int id;
	private String name;
	private int discount;

	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + "(" + id + ")(" + discount + "%)";
	}

}
