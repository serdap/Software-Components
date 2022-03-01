package lab3;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id, Customer customer, double amount) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getID() {
		return id;
	}
	
	public int getCustomerID() {
		return customer.getID();
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return amount - amount * getCustomerDiscount() / 100;
	}
	
	public String toString() {
		return "Invoice[id = " + id + ", customer = " + customer.toString() + ", amount = " + amount + "]";
	}
	
	

}