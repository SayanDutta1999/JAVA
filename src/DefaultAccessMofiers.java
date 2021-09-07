/**
 *  For classes, you can use either public or default:
 * The class is only accessible by classes in the same package. 
 * This is used when you don't specify a modifier.
 */
class DefaultAccessMofiers {
    String name = "Sayan";
   public static void main(String[] args) {
       System.out.println("Sayan Dutta");
       DefaultAccessMofiers myObj = new DefaultAccessMofiers();
       System.out.println(myObj.name + " " + "Dutta");
   } 
}
