import java.util.*;
public class Manager extends Employee{
	private double bonus;
	
	public void acceptBonus() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Bonus: ");
		bonus = s.nextDouble();
	}
	
	public void displayM() {
		System.out.println("Bonus: " + bonus);
	}
	
	static int max(Manager[] m, int n) {
		double max = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			if (max < m[i].getSalary() + m[i].bonus) {
				max = (m[i].getSalary() + m[i].bonus);
				temp = i;
			}
		}
		System.out.println("Max Salary is: " + max);
		return temp;
	}
	
}
