public class Book {
    // Atrributes of books
   private String name;
    String isbn;
    String[] author; // use string array bcoz one book may be has mimultiple authors
    int noOfPages;
    int price;
    int volumenumber;
    int yearOfPublicing;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    // if here we have not declares any constructor then JVM create a default Constructor
    Book(){
        name = "ABC";
    }
    
    // passing parameter fro varius value of variable
    Book(String name){
        this.name = name;
    }
   
    Book(String name, String isbn){
        this.name = name;
        this.isbn = isbn;
    }
    // we can not make a constructor with same datatype twice
    // multiple argument constructor depends on their argument and datatypes
    // Book(String isbn, String name){
    //     this.name = name;
    //     this.isbn = isbn;
    // }
    
    // if the arguments same and data type is different then its works
    Book(String isbn, int price){
        this.price = price;
        this.isbn = isbn;

    }

    Book(int price, String isbn){
        this.price = price;
        this.isbn = isbn;

    }
    
    

    // Define Method
    

}
