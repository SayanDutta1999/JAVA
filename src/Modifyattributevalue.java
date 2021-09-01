public class Modifyattributevalue {
    int x ;
    int y =  9;
    //multiple atrributes
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {
        Modifyattributevalue myobj1 = new Modifyattributevalue();
        Modifyattributevalue myobj2 = new Modifyattributevalue();
        Modifyattributevalue myobj3 = new Modifyattributevalue();
        myobj1.x = 90;
        System.out.println(myobj1.x);

        // override existing values:
        myobj2.y = 100;
        System.out.println(myobj2.y);

        System.out.println("Name: " + myobj3.fname + " " + myobj3.lname);
        System.out.println("Age: " + myobj3.age);





    }

    
   
    
}
