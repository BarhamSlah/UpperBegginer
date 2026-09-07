public class Car {

    // Every constructor in Java calls a superclass constructor and Constructor has this by default
    Car(){
        System.out.println("Default Car Constructor ");
    }

    Car(int i){
        super();
        System.out.println("Parameter Car Constructor" );
    }
}


public class Buggati extends Car {

    Buggati() {
        super(0);
        System.out.println("Default buggati constructor");
    }

    Buggati(int n) {
        super(n);
        System.out.println("Parameter buggati constructor");
        
// If you want to call the default parent constructor, you don't need to write super() because Java inserts it automatically. 
// However, if you want to call a parameterized parent constructor, you must explicitly write super(...) and pass an argument.
    }
}


void main()  {

new Buggati();     // prints: Parameterized Car Constructor \n Default Buggati Constructor
// new Buggati(5); // prints: Parameterized Car Constructor \n Parameterized Buggati Constructor
    
    
    }
