import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		int n, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of details");
		n = s.nextInt();
		Manager[] m = new Manager[n];
		for (int i = 0; i < n; i++) {
			m[i] = new Manager();
			m[i].acceptUserInputs();
			m[i].acceptBonus();
		}
		result = Manager.max(m, n);
		m[result].displayE();
		m[result].displayM();
		

	}

}
