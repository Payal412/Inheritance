package encapsulationPackage;

public class Employee {

	//Private class variables
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private String gender;
	
	//Getter and Setter for name
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Getter and Setter for age
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//Getter and Setter for salary
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//Getter and Setter for isActive
	public boolean getIsActive()
	{
		return isActive;
	}
	
	public void setIsActive(boolean isActive)
	{
		this.isActive = isActive;
	}
	
	//Getter and Setter for gender
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getEmployeeInfo()
	{
		return("Name: " + name + "\n" + "Age: " + age + "\n" + "Salary: " + "\n" + "Active: " + isActive + "\n" + "Gender: " + gender);
	}
}
