import java.util.*;
public class Employee {
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public void acceptUserInputs() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id = s.nextInt();
		
		System.out.println("Enter Name: ");
		name = s.next();
		
		
		System.out.println("Enter Department: ");
		dept = s.next();
		
		
		System.out.println("Enter Salary: ");
		salary = s.nextDouble();
	}
	
	public void displayE() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + dept);
		System.out.println("Salary: " + salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
}
