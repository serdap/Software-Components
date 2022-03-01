package lab3;

public class Author3 {
	private String name;
	private String email;
	
	public Author3(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Author[name = " + name + ", email = " + email + "]";
	}

}
