In Java package : is a mechanism used to group related (classes, interfaces, and sub-packages) together acting like a folder structure on your laptop.

To declare a package :  use the package keyword at the very first line of your Java source file.

Naming Convention: Package names are written in all lowercase to avoid conflicts with class names.

Automatic Import: The java.lang package (which contains fundamental classes like String, System, and Math) 
is automatically imported into every Java program without needing an explicit import statement.

import vehicles.Car;
means:
"Java, I want to use the Car class from the vehicles package."  

Package = Folder 📁
Class = File 📄

Package Declaration: You must declare the package at the top of the class file that belongs to it.

Class Import: You must import the specific class from that package into any file that needs to use it.  

import tools.*;
Imports only the classes directly inside the tools package (e.g., Calc.java). It ignores any sub-folders or sub-packages within tools.

import tools.extra.*;
Imports only the classes inside the tools.extra sub-package (e.g., SuperCalc.java). It ignores the parent classes directly inside tools.

Default Package Restriction:
Classes written in the default/root package (without a package declaration) cannot be imported into any other package.

src/
├── Demo.java            <-- Default package (no package statement)
└── tools/
    ├── Calc.java        <-- In package 'tools'
    └── extra/
        └── SuperCalc.java <-- In package 'tools.extra'

***********************************************************************************************************************************************

package Animals;

public class Animal {

    public static void noise() {
       System.out.println("Animals make sound");
    }
}


package Animals;

 public class Cat extends Animal {
  public void meow() {
        System.out.println("Cat: Meow Meow!");
    }
}


package Animals;

public class Dog extends Animal {
   public void bark() {
        System.out.println("Dog: Woof Woof!");
    }
}


package Animals;

 public class Lion extends Animal {
   public void roar() {
        System.out.println("Lion: Roar!");
    }
}


import Animals.*;

        void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();

        Animal.noise();
        // because Animal class was extended it is not unnecessary to create object for it
        dog.bark();
        cat.meow();
        lion.roar();

    }


    
