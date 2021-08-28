/*
Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:




*/

public class CreateObject{
    int x = 7;
    public static void main(String[] args) {
        CreateObject object = new CreateObject(); // we create an instance object of this CreateObject
        CreateObject oBject = new CreateObject(); // can create multi ple object
        System.out.println(object.x); 
        System.out.println(oBject.x);
    }
}