Method Overriding
Method Name: Must be same
Parameter Data Types: Must be same
Return Data Type: Must be same
Action/Task: Different (modified in subclass)

 *******************************************************************************************************************************

Method Override: when you write a method in SubClass that already has in SuperClass but there is a different that is the task in the method
but you should inheritance it and same name of method and should be same datatypes

Method Overriding requires two classes—a Superclass (parent) and a Subclass (child) . Since there is no inheritance here, it cannot be overriding

that is not necessarily but good if you do it :
write @methodoverriding before the method that you wanna overriding it

****************************************************************************************************************************  

  public class Animal {

    public void eat(){
        System.out.println("part of animal are herbivore");
    }
}

 public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("Dog is carnivore.");
    }
}

void main()  {

Animal animal = new Animal();
Dog dog = new Dog();
dog.eat();
animal.eat();

}
 
**************************************************************************************************************************************
