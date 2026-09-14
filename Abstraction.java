1- You can have abstract method only in abstract class.
​2- You can not create object from abstract class.
but you can reference object form abstract class.
3- It is used when multiple classes share common features, but some behaviors should be implemented differently by their subclasses.
​4- Abstract Class: Can contain all types of methods, except you cannot create objects from this class.
​5- Non-Abstract Class: Can contain all methods, except abstract methods.
6- Abstract methods have no body
7- Normal class → must implement all inherited abstract methods.
Abstract class → can leave abstract methods unfinished.

***********************************************************************************************************************************************************

Abstraction : is use to hide detail and display just the important things
1 - You write something in SuperClass (what to do )
2 - You write something in SubClass (how to do)

Abstraction has 2 types : 1- Abstract Class  &  2- Interface  

Abstract Class: It can contain both regular methods (with code/body) and abstract methods (without code/body).
  
Interface: It is completely abstract: it contains only and exclusively abstract methods
(without code/body) which the subclasses must write entirely by themselves.  

 // aw classay abstract dakre natwanre objecty le drwst bkret 
*******************************************************************************************************************************
public class Main {
public static void main(String[] args) {

Rectangle rectangle = new Rectangle(2, 7);
Traingle traingle = new Traingle(3);

        System.out.println("This is traingle area " + traingle.area());
        System.out.println("This is rectangle area " + rectangle.area());
    }
}

/////////////////////
public abstract class Shape {

    abstract double area();
    // awa methody abstracta boya hichy teda nanwsret
    // la subclass override dakret bo away har yakaw featurey xoy habet
}
////////////////////
public class Rectangle extends Shape{

    double length;
    double width;

 Rectangle(double length , double  width){
    this.length = length;
    this.width = width;
}

    @Override
    double area() {
        return length * width;
    }
}
////////////////////////////
public class Traingle extends Shape{

    double side;

    Traingle(double side){
        this.side = side;
    }

    @Override
    double area(){
      return side * side * side;
    }

}
///////////////////////////////
