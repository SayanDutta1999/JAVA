// Construtor Overloading
public class Testmain {
    public static void main(String[] args){
        // Object Construction
        Book b1 = new Book(); // b1 is creating a reference to the Book class
        Pen p1 = new Pen(); // here also
        Book b2 = new Book(); // Book() is a Constructor
      
        b1.setName("Alchemist");
        b2.setName("Harry Potter");
        System.out.println(b1.getName());
        System.out.println(b2.getName());
        System.out.println(p1.type);
        
        System.out.println("--------------------------------");

        // Book b3 = new Book("C programming");
        // System.out.println(b3.name);
        // it also called contructor over loading 
        Book b4 = new Book("Java Programming", "10001465496");
        // System.out.println(b4.name);
        System.out.println(b4.isbn);

        System.out.println("--------------------------------");

        Book b5 = new Book("9163075900", 400);
        System.out.println(b5.isbn);
        System.out.println(b5.price);

        System.out.println("--------------------------------");

        Book b6 = new Book(400, "9163075900");
        System.out.println(b6.price);
        System.out.println(b6.isbn);

        System.out.println("--------------------------------");

        SavingAccount person1 = new SavingAccount(1, "Sayan", "Rishra", "165431", "888456461915");
        System.out.println("Before update voter information");
        System.out.println(person1.getaccountNo());
        System.out.println(person1.getcustomerName());
        System.out.println(person1.getaddress());
        System.out.println(person1.getpan());
        System.out.println(person1.getaadher());
        System.out.println("After update voter information");
        person1.setVoter("voter 165456");
        System.out.println(person1.getaccountNo());
        System.out.println(person1.getcustomerName());
        System.out.println(person1.getaddress());
        System.out.println(person1.getpan());
        System.out.println(person1.getaadher());
        System.out.println(person1.getvoter());

        System.out.println("--------------------------------");

        SavingAccount person2 = new SavingAccount(2, "Sayan", "Rishra", "165431", "888456461915", "456643");
        System.out.println("Before update voter and passsport information");
        System.out.println(person2.getaccountNo());
        System.out.println(person2.getcustomerName());
        System.out.println(person2.getaddress());
        System.out.println(person2.getpan());
        System.out.println(person2.getaadher());
        System.out.println(person2.getpassport());
        System.out.println("After update voter and passsport information");
        person2.setVoter("voter 4987265", "55556");
        System.out.println(person2.getaccountNo());
        System.out.println(person2.getcustomerName());
        System.out.println(person2.getaddress());
        System.out.println(person2.getpan());
        System.out.println(person2.getaadher());
        System.out.println(person2.getvoter());
        System.out.println(person2.getpassport());


        

    }
}
