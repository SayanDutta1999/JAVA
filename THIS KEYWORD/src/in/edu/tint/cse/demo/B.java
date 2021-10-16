package in.edu.tint.cse.demo;

public class B extends A{
	int y;
	int w;
	String z;
	String s;

	public B(int x, int y) {
		super(x);
//		Constructor may not be recursive
//		this("hello"); we can't called multiple super 
//		class constructor from a object
		this.y = y;
		System.out.println("I am in B int y first constractor :" + this.y);
	}
	
	
	public B(int y, String z) {
		this("World");
		this.y = y;
		this.z = z;
		System.out.println("I am in B int y last constractor :" + this.y);
		System.out.println("I am in B int z last constractor :" + this.z);
	}
	public B(String s) {
		super(1);
		this.s = s;
		System.out.println(this.s);
	}
	
	
}
