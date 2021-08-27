public class NarrowingTypeCusting  {
    public static void main(String[] args) {
        double mydouble = 9.78d;
        int mynum = (int) mydouble; // Manual casting: double to int
        System.out.println(mydouble);   // Outputs 9.78
        System.out.println(mynum);      // Outputs 9
    }
    
}
