public class DiffStaticpublic {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
          // myPublicMethod(); This would compile an error
          DiffStaticpublic PublicMethod = new DiffStaticpublic(); // Create an object of Main
          PublicMethod.myPublicMethod();  // Call the public method on the object
    }
}
