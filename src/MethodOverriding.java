public class MethodOverriding {
    int x = 10;
    // Final keyword fixed the value for this variable
    // final int y = 20;
    public static void main(String[] args) {
        MethodOverriding myobj1 = new MethodOverriding();
        // MethodOverriding myobj2 = new MethodOverriding();
        // Override privious value 10 to 20
        myobj1.x = 20;
        // Override privious value 20 to 10
        // myobj2.y = 10;
        System.out.println(myobj1.x); // This print 20

        // System.out.println(myobj2.y); // This return error
    }
}
