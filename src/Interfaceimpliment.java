interface Interface {
  //  public static final int min = 5;
     void print();
    /* The Java compiler adds public and abstract keywords before the interface method. Moreover, 
    it adds public, static and final keywords before data members. 
    public static final int min = 5; 
    public abstract void <method_name>*/
}

class Interfaceimpliment implements Interface{


    public void print(){System.out.println("hello world");}
    public static void main(String[] args) {
        Interfaceimpliment im = new Interfaceimpliment();
        im.print();

    }


}