/**
 * For attributes, methods and constructors, you can use the one of the following:
 * public, private, default, protected
 * 	The code is only accessible within the declared class
 */

public class  privateAccessMofiers {
    private String name = "sayan";
    public static void main(String[] args) {
        privateAccessMofiers myObj = new privateAccessMofiers();
       System.out.println(myObj.name);
    }
}