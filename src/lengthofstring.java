public class lengthofstring {
    public static void main(String[] args) {
        // String length
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + text.length());

        //toUpperCase() and toLowerCase()
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        /**
         * Finding a Character in a String
         * The indexOf() method returns the index (the position) 
         * of the first occurrence of a specified text in a string (including whitespace):
         */
            String Txt = "Please locate where 'locate' occurs!";
            System.out.println(Txt.indexOf("locate"));

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.concat(lastName));


    }
    
}
