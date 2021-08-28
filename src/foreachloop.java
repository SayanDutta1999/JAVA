public class foreachloop {
    public static void main(String[] args) {
        /**
         * For-Each Loop
         * There is also a "for-each" loop, 
         * which is used exclusively to loop through elements in an array:
         */

         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
         for(String i : cars){
             System.out.println(i);
        }
        System.out.println(cars[0]);

         int[] num1 = {10, 24, 56, 58};
         for(int i : num1){
             System.out.println(i);
        }
        System.out.println(num1[0]);
    }
}



