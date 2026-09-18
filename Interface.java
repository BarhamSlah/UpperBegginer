Use an interface when:

1. Multiple classes should follow the same contract

  
Every method without body in interface is public abstract, and every variable in interface is public final static.

  
*************************************************************************************
Class to Class: Use extends . Single inheritance only (Max 1 class)
  
Class to Interface: Use implements . Multiple inheritance allowed
  
Interface to Interface: Use extends . Multiple inheritance allowed
**************************************************************************************
// THIS IS A EXAMPLE OF INTERFACE

public class Main {
    public static void main(String[] args) {

Dog dog = new Dog();
Cat cat = new Cat();
Mouse mouse = new Mouse();

dog.predator();
cat.predator();
cat.prey();
mouse.prey();

    }
}
//////////////////////  
 public interface Predator {

    void predator();

} 
///////////////////////
public interface Prey {

    void prey();

}
//////////////////////
public class Dog implements Predator {

    @Override
    public void predator(){
        System.out.println("The dog always predator");
    }

}
/////////////////////////
public class Mouse implements Prey {

    @Override
    public void prey(){
        System.out.println("The mouse Always prey");
    }

}
///////////////////////////
public class Cat implements Predator , Prey{   // THIS IS AN EXAMPLE OF SUBCLASS CAN HAS MORE THAN ONE INTERFACE

    @Override
    public void prey(){
        System.out.println("The cat at here is prey");
    }

    @Override
    public void predator(){
        System.out.println("The cat at here is predator");
    }

}
*****************************************************************************************************************
 
