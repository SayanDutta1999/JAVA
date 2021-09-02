/*
Java Constructors
A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
*/
public class Constructor {
    int x; // Create a class attribute

    // Create a class constructor for the Main class
    public Constructor(){ 
        int x = 7; // Set the initial value for the class attribute x
    }
    public static void main(String[] args) {
        Constructor myobj = new Constructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(myobj.x); // Print the value of x
    }

}
