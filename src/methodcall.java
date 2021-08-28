public class methodcall {
    /**
     * static means that the method belongs to the Main class and not an object of the Main class. 
     * You will learn more about objects and how to access methods through objects later in this tutorial. 
     */
    static void mymethod(String fname){
        System.out.println(fname + " " + "Dutta");
    }
    static void myMethod(){
        System.out.println("Hello World");
    }
     public static void main(String[] args) {
        myMethod();
        mymethod("Sayan");    
    }

    


}
