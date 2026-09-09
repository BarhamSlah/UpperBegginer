Method Overriding = Dynamic Polymorphism (Runtime Polymorphism)

1- Same number of parameters. 
2- Same data types of parameters. 
3- Same order/sequence of parameters.

Method Overriding → Requires inheritance  

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
