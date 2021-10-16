package in.edu.tint.cse.demo;

public class B extends A {
	int y;
	public B(int x, int y){
//		By default every constructor at first 
//		after calling from main method its called 
//		its Super class using super() method
//		here we pass the value of x which is  
//		the member of super class A
		super(x);
		this.y = y;
		System.out.println(this.y);
	}
	public B(int y){
		super();
		this.y = y;
		System.out.println(this.y);
	}
}
