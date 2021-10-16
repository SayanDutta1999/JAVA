package in.edu.tint.cse.demo2;

public class A {
	static int s = 19;
	int x;
	
/*	static block: Static Block is basically a block which is being allocated during 
 	class loading in JVM 
 	
 	if we have a static block , so it contain set of instruction which will be executed
 	 during class loading in JVM so, at the very beginning without  creating any object 
 	  at first which have been loaded is class then static.
 	  
 	  here we use dynamic linking and dynamic loading.
 	  
 	  when we call a class from main method at that time class is loaded into JVM .
 	  when we try access any class then inly it is loaded in JVM.
 	  
 	  when a file or class is require at that time only that file or class will linked and loaded into JVM.
 	  it is called dynamic linking and dynamic loading.
 	  
 	  static block is being executed implicitly.
 	  
 	  static block executed when a class is loading into JVM only once.
 	  
 	  but for static method we have to call it explicitly.
 	
 	
 	
 	*/ 
	 static {
		 System.out.println("I am in a static block");
	 }
	
	public A(int x, int s) {
		this.x = x;
		this.s = s;
//		System.out.println(this.x + " " + this.s);
	}
	 void method1() {
		 System.out.println("I am a method");
	 }
	 static void method2(int p) {
//		 Using static method we can only use static variables, 
//		 because for a non static variable memory is being allocated 
//		 when object is created but static varible's memory allocated 
//		 when a class is created or loaded in JVM for this reason non static variable is not access 
//		 in a static method or a function.
		 s = p;
		 System.out.println("Static variable:" + " " + s);
		 System.out.println("I am a static method");
	 }
}
