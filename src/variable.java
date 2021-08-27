public class variable {
    public static void main(String[] args) {
        // String
        String name = "sayan";
        System.out.println(name);
        
        // Integer (whole number)
        int num = 10;
        System.out.println(num);

        int mynum = 100000;
        System.out.println(mynum);
        /**
         * Final Variables
         * However, you can add the final keyword if you don't want others (or yourself) 
         * to overwrite existing values (this will declare the variable as "final" or "constant", 
         * which means unchangeable and read-only):
         */

        final int num1 = 12; 
        System.out.println(num1);

        // Floating point number
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        //Boolean
        boolean bool = true;
        System.out.println(bool);

        // Character

        char myLetter = 'D';
        System.out.println(myLetter);

        /**
         * Integer Types
         * Byte
         * The byte data type can store whole numbers from -128 to 127. This can be used instead 
         * of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
         */
        
        byte MyNum = 100;
        System.out.println(MyNum);

        // Long 
        /**
         * The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
         * This is used when int is not large enough to store the value.
         *  Note that you should end the value with an "L":
         *
         * 
         * 
         */
        long myNum = 15000000000L;
        System.out.println(myNum);

        /**
         * Floating Point Types
        `* You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.

         * Float
         * The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f
         * 
         */

        float myNm = 5.75f;
        System.out.println(myNm);



    }
    
    
}
