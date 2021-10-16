interface Printable{
    void print();
}

interface Showable{
    void show();
}

public class MultipleInheritenceInterface implements Printable, Showable {
    public void print(){
        System.out.println("Hello");
    }

    public void show(){
        System.out.println("Welcome");
    }
public static void main(String[] args) {
    MultipleInheritenceInterface mul = new MultipleInheritenceInterface();
    mul.print();
    mul.show();


}

    
}
