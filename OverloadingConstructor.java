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

    }
}


void main()  {

    new Buggati();

    }
