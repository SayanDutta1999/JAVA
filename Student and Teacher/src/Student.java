public class Student extends Person{
	private int roll;
	
	public Student(String name, String dept, int roll) {
		super(name, dept);
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}


	public String toString(Student s) {
		return "Name:" + " " + s.getName() + "\nDepartment:" + " " + s.getDept() + "\nRoll Number:" + " " + s.getRoll();
	}
	
	
}
