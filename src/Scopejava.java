public class Scopejava {
    public static void main(String[] args) {

        /**
         * Block Scope
         * A block of code refers to all of the code between curly braces {}.
         *  Variables declared inside blocks of code are only accessible by the code between the curly braces, 
         * which follows the line in which the variable was declared:
         * 
         * 
         * 
         */
        
    // Code here CANNOT use x
        { // This is a block
             // Code here CANNOT use x
             
            int x = 67;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here
        
        // Code here CANNOT use x
    }
}
