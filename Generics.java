1. Code Reusability (Write Once, Use Many Times)
Instead of creating separate classes for every data type (like IntegerBox, StringBox, DoubleBox),
you write one generic class using a type parameter like <T>.


        2. Type Safety (Catch Errors at Compile Time)
Generics force you to specify what data type a collection or class works with.
If you try to pass the wrong data type, Java catches the mistake
while you code (at compile time) rather than crashing your program when it runs (at runtime).

***************************************************************************************

public class Main {

    public static void main() {

        Box<String> box = new Box<>();

        box.setThing("a");  // if you don't write that the compiler will give null

        System.out.println(box.getThing());

    }
}

//////////////
public class Box<T>{

    T thing;

    public void setThing(T thing){
        this.thing = thing;
    }

    public T getThing(){
        return this.thing;
    }

}
*********************************************************************************************

void main() {

    Car<Double , String  , Integer > car1 = new Car<>(18300.0 , "Hiluix" , 2013);
    Car<Double  , String , Integer> car2 = new Car<>(10500.0 , "Kicks" , 2022);

    System.out.println(car1.getModel() + " " +  car1.getYear() + " is costs " + car1.getPrice());
    System.out.println(car2.getModel() + " " +  car2.getYear() + " is costs " + car2.getPrice());

}

/// /////////////
public class Car<T , U  , V>{

    T price;
    U model;
    V year;

    Car(T price , U model , V year){
        this.price = price;
        this.model = model;
        this.year = year;
    }

    public T getPrice(){
        return this.price = price;
    }

    public U getModel(){
        return this.model = model;
    }

    public V getYear(){
        return this.year = year;
    }

}
