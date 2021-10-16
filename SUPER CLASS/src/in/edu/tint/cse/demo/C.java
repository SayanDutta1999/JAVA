package in.edu.tint.cse.demo;

public class C extends B{
	int z;
	public C(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println(this.z);
	}
//	Constructor Overloading
	public C(int y, int z) {
		super(y);
		this.z = z;
		System.out.println(this.z);
	}
	
}
