// WE HAVE 2 TYPES OF POLYPORPHISM

Method Overloading = Static Polymorphism (Compile-time Polymorphism) 
Method Overriding = Dynamic Polymorphism (Runtime Polymorphism) 
    
***************************************************************************************************
THERE ARE 2 EXAMPLES OF METHOD OVERRIDING 
    
public class Main {
    public static void main(String[] args) {

        Falcon falcon = new Falcon();
        Cocktail cocktail = new Cocktail();
        Owl owl = new Owl();

        Bird[] birds = {falcon, cocktail, owl };

        for (Bird bird : birds) {
            bird.fly();
        }
      
      }
    }
//////////////////////
public interface Bird {

    void fly();

}
////////////////////////
public class Falcon implements Bird{

    @Override
    public void fly(){
        System.out.println("The falcon is flying");
    }

}
/////////////////////////
public class Cocktail implements Bird{

    @Override
    public void fly(){
        System.out.println("The cocktail is flying");

    }
}
//////////////////////////
public class Owl implements Bird {

    @Override
    public void fly(){
        System.out.println("The owl is flying");
    }

}
*********************************************************************************************************************************  
 
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DO YOU WANT HEAR OF DOG OR CAT ?  ");
        System.out.print("1 = Dog  *  2 = Cat ");
        int choice = scanner.nextInt();

        Animal animal;
        
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
        scanner.close();

    }
    }
////////////////////////
public abstract class Animal {

    abstract void speak();

}   
//////////////////////
public class Cat extends Animal{

    @Override
    void speak(){
        System.out.println("The cat is meowing");
    }

}
/////////////////////////
public class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The dog is woofing");
    }

}
****************************************************************************************************************************
