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

