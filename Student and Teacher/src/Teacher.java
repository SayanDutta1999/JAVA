public class Teacher extends Person {
	
	private int salary;
	
	public Teacher(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString(Teacher t) {
		return "Name:" + " " + t.getName() + "\nDepartment:" + " " + t.getDept() + "\nSalary:" + " " + t.getSalary(); 
	}
}
				