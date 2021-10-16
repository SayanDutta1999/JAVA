interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println(" I am in Rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println(" I am in Circle");
    }
}

public class TestInterface{
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();

        d1.draw();
        d2.draw();

    }
}
