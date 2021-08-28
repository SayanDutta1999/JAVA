public class array {
    public static void main(String[] args) {
        // Length
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);

        for( String i : cars){
            System.out.println(i);
        }

        //Multidimensional Array
        int[][] mynum = { {1, 2, 5, 8}, {8, 5, 6, 4} };
        int num = mynum[1][2];
        System.out.println(num);
        System.out.println("\n");
        for(int i = 0; i < mynum.length; i++){
            for(int j = 0; j < mynum[i].length; j++){
                System.out.println(mynum[i][j]);
            }
            
            
        }
    
    }
}
