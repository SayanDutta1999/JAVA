package in.edu.tint.cse.demo;

public class A {
	int x;
	String s;
	public A(int x) {
		this("Hello");
		this.x = x;
		System.out.println("I am in int x first constractor :" + this.x);
	}
	
	public A(String s) {
		this("Hello", 1000);
		this.s = s;
		System.out.println("I am in String s middle  constractor :" + this.s);
	}
	
	public A(String s, int x) {
		this.s = s;
		this.x = x;
		System.out.println("I am in String s last constractor :" +this.s);
		System.out.println("I am in int x last constractor :" +this.x);
	}
	
}
