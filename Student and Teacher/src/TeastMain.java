public class TeastMain {

	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		Teacher[] teacher = new Teacher[5];
		
		for(int i = 0; i < 5; i++) {
			student[i] = new Student("Sayan Dutta", "CSE", 180);
			teacher[i] = new Teacher("Pritam Ghosh", "CSE", 56000);
		}
		
		System.out.println(student[0].toString(student[0]));
		System.out.println(" ");
		System.out.println(teacher[0].toString(teacher[0]));
	}

}
