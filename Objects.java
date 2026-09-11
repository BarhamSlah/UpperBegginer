WE HAVE 2 TYPES OF OBJECT : 

1- Referenced Object: An object assigned to a reference variable (e.g., Person p = new Person();).
2- It is stored in heap memory with its memory address kept in the stack variable p,
3- allowing you to reuse it multiple times throughout its scope.

1- Anonymous Object: An object created without assigning it to a reference variable (e.g., new Person();).
2- It exists in heap memory only for the duration of the statement in which it is instantiated,
3- after which it becomes immediately eligible for Garbage Collection.

Every class in java extend Object class even we don't mention.  

You don't have to use anonymous objects. They are useful only when you need an object once. 
It's clearer and easier to understand. when you become pro in java you can use it.

  
Animal animal = new Dog();   // it creates objects for Dog class not for Animal class (UPCASTING)
animal.sound();  


Laptop laptop1 = new Laptop("Dell", 1000); // Memory Address A
Laptop laptop2 = new Laptop("Dell", 1000); // Memory Address B

// Reference comparison (==): checks memory locations
System.out.println(laptop1 == laptop2); // false (Address A != Address B)

// Value comparison (.equals()): checks field data
System.out.println(laptop1.equals(laptop2)); // true ("Dell" == "Dell" and 1000 == 1000)

*********************************************************************************************************************************************************************
  
If two objects are equal according to equals(), they should have the same hashCode().

class Phone {

    String name;

    Phone(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        Phone other = (Phone) obj;

        return this.name.equals(other.name);
    }
}


///////////
void main(){

Phone phone1 = new Phone("Samsung");
Phone phone2 = new Phone("Samsung");

    if (phone1 == phone2) {
        System.out.println("They are the same object");

    } else if (phone1.equals(phone2)) {
        System.out.println("They have the same data");

    } else if (!phone1.equals(phone2)) {
        System.out.println("They are different");
    }

}
