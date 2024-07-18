package encapsulationPackage;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		//set the values using setter methods
		emp.setName("John");
		emp.setAge(28);
		emp.setSalary(55000);
		emp.setIsActive(true);
		emp.setGender("Male");
		
		//Get the employee information
		System.out.println(emp.getEmployeeInfo());
	}
}
