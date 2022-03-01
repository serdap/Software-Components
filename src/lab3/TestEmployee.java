package lab3;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee1 = new Employee ( 8 , "Peter " , "Tan" , 2500) ;
		System.out.println(employee1.toString() );
		employee1.setSalary(999 );
		System.out.println(employee1.toString()) ;
		System.out.println(" id is : " + employee1.getID());
		System.out.println( " first name is : " + employee1.getFirstName());
		System.out.println("last name is : " + employee1.getLastName()) ;
		System.out.println("salary is : " + employee1.getSalary()) ;
		System.out.println("name is : " + employee1.getName()) ;
		System.out.println("annual salary is : " + employee1.getAnnualSalary()) ; // Test method

		// Test r a i s e S a l a r y ( )
		System.out.println(employee1.raiseSalary(10)) ;
		System.out.println( employee1.toString() ) ;
		}
}
