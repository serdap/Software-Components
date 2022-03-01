package homework5;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Jame", "Fauntleroy Circus", "Computer Science", 2020, 23000000);
		System.out.println(stu1);
		
		System.out.println(stu1.getAddress());
		System.out.println(stu1.getFee());
		System.out.println(stu1.getName());
		System.out.println(stu1.getProgram());
		System.out.println(stu1.getYear());
		stu1.setAddress("Avda. de la Constitución 2222");
		stu1.setFee(43200300);
		stu1.setProgram("Biomedical Engineering");
		stu1.setYear(2018);
		
		System.out.println(stu1);
		
		Staff staff1 = new Staff("Anny", "Estrada da saúde n. 58", "Hanoi University of Science", 15000000);
		System.out.println(staff1);
		
		System.out.println(staff1.getAddress());
		System.out.println(staff1.getName());
		System.out.println(staff1.getPay());
		System.out.println(staff1.getSchool());
		
		staff1.setAddress("Avda. de la Constitución 2222");
		staff1.setPay(13004000);;
		staff1.setSchool("Hanoi University of Science and Technology");
		
		System.out.println(staff1);
		
		

	}

}