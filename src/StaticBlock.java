public class StaticBlock{
    static{
        System.out.println("I am in Static");
    }
     StaticBlock(){
        System.out.println("I'm in Comstructor");
    }
    public static void main(String[] args) {
        new StaticBlock();
    }
} 