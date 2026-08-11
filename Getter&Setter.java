Constructor: Sets the initial values when the object is created.

        Getters: Read/retrieve those values.

        Setters: Only added if you explicitly need to change/update those values later in your program.
********************************************************************************
public class Main {
    public static void main(String[] args) {

        Car car = new Car(18_300,2012, "Toyota-Hiluix");

        /*
        car.model = 2026;  now the model is 2026 not 2013
        because the variable is public not private
        but when public int model = 2013; you can't change unless in the object


        the public variable won't work just like private variable
        you should write setter or getter or  both of them
        */


        // THIS IS FOR PUBLIC VARIABLE
      //  System.out.println(car.name + " model of car " + car.model + " by this price " + car.price);

//WHICH SETTER OR GETTER CREATE AT LAST THE OUTPUT IS ITS
// SETTER AND GETTER HAS SAME OUTPUT BUT IN DIFFERENT WAY
car.setName("Ferrari");
car.setPrice(440_000);
car.setModel(2025);

       System.out.println(car.getName() + " model of car " + car.getModel() + " by this price " + car.getPrice());

    }
    }
/////////////////////////////////////////////////
public class Car {

   private String name;
   private int price;
   private int model;

    Car(int price , int model , String name ){
        this.model = model;
        this.price = price;
        this.name = name;
    }
// THIS IS ALSO GETTER & THE DATATYPE IS SELECT BASED ON WHAT IS THE DATATYPE OF RETURN
    public String getName(){
        return this.name;
    }

    public String getPrice(){
        return "$" + this.price;
    }

    public int getModel(){
        return this.model;
    }

    //////////////

    // THIS IS ALSO SETTER YOU MAKE PARAMETER & ARGUMENT

    public void setName(String name){
this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setModel(int model){
        this.model = model;
    }
}
***************************************************************************************************************************

void main() {

    Car<Double , String  , Integer > car1 = new Car<>(18300.0 , "Hiluix" , 2013);
    Car<Double  , String , Integer> car2 = new Car<>(10500.0 , "Kicks" , 2022);

    System.out.println(car1.getModel() + " " +  car1.getYear() + " is costs " + car1.getPrice());
    System.out.println(car2.getModel() + " " +  car2.getYear() + " is costs " + car2.getPrice());

}

////////////////

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
**********************************************************************************