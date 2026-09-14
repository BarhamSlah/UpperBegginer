1- You can have abstract method only in abstract class.
​2- You can not create object from abstract class.
but you can reference object form abstract class.
3- Abstract methods have no body
​4- Abstract Class: Can contain all types of methods, except you cannot create objects from this class.
​5- Non-Abstract Class: Can contain all methods, except abstract methods.
6- Normal class → must implement all inherited abstract methods.
Abstract class → can leave abstract methods unfinished.
7- It is used when multiple classes share common features, but some behaviors should be implemented differently by their subclasses
  
***********************************************************************************************************************************************************

Abstraction : is use to hide detail and display just the important things
1 - You write something in SuperClass (what to do )
2 - You write something in SubClass (how to do)

Abstraction has 2 types : 1- Abstract Class  &  2- Interface  

Abstract Class: It can contain both regular methods (with code/body) and abstract methods (without code/body).
  
Interface: It is completely abstract: it contains only and exclusively abstract methods
(without code/body) which the subclasses must write entirely by themselves.  

  
*******************************************************************************************************************************

package Animals;

abstract public class Animal {

    abstract public void makeSound();

    public static void eat() {
        IO.println("All animal eat");
    }
}

/////////

package Animals;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        IO.println("Dog is woofing");
    }

}

///////////

package Animals;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        IO.println("Cat is meowing");
    }

}

///////////

package Animals;

public class JellyFish extends Animal {

    @Override
    public void makeSound(){
        IO.println("JellyFish has no sound");
    }


}

/////////

import Animals.*;

public class Main {
public static void main() {

    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[1] = new Cat();
    animals[2] = new JellyFish();

    Animal.eat();

    for (Animal eachAnimal : animals) {
        eachAnimal.makeSound();
    }

}
}
