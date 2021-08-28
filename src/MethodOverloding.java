public class MethodOverloding {
    /**
     * Method Overloading
     * With method overloading, 
     * multiple methods can have the same name with different parameters:
     * 
     * 
     * Instead of defining two methods that should do the same thing, it is better to overload one.

     * In the example below, we overload the plusMethod method to work for both int and double:
     * 
     * 
     */
    static int sum(int x, int y){
            return x + y;
    }
    static double sum(Double x, Double y){
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = sum(12,45);
        double num2 = sum(45.2, 7.8);

        System.out.println("Int:" + " " + num1);
        System.out.println("Double:" + " " + num2);
    }
    
}
