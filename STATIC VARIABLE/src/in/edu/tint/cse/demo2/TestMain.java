package in.edu.tint.cse.demo2;

public class TestMain {

	public static void main(String[] args) {
/*
  		when we are creating a class or defining or loading a class in JVM a class at that time memory is 
  		being allocated for the shared variable or the static variable. 
  		
  		But for instant variable memory is allocated at the time of object creation.
  
 
*/
//		Before creating objects we are access the static variable.
		
		B b1 = new B();
		System.out.println("Object of class B has been created");
		
		System.out.println(A.s + 1);
		
		System.out.println(" ");
		
		
		System.out.println(" ");
		A a1 = new A(5,10);
		System.out.println(a1.x + " " + a1.s);
		A a2 = new A(10, 20);
		System.out.println(a2.x + " " + a2.s);
		A a3 = new A(2, 4);
		System.out.println(a3.x + " " + a3.s);
		
		
/*      here we print the after each so this values of s is not override.
		5 10
		10 20
		2 4

*/	
		
		System.out.println(" ");
		
		System.out.println(a1.x + " " + a1.s);
		System.out.println(a2.x + " " + a2.s);
		System.out.println(a3.x + " " + a3.s);
//		
/*		output for this block is 
		5 4
		10 4
		2 4
		because of s is static and its memory is shared for 
		this it override its value for each call
*/		
		a1.method1();
		a1.method2(56); 
		A.method2(23); // but method1 is not access by Class name A 
		
	}

}
