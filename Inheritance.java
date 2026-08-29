Dog is animal this is inheritance (is-a not has-a)

SubClass = ChildClass  &  SuperClass = ParentClass

lera ema basy Inheritance dakain :

ema constructor man la parent drwst dakain agar :

1- agar parametery nabw awa dabet lanaww constructor valuey ba variable bdain

2- agar paremetery habw awa la subclass 2 shewazman haya bo away valuey ba variable bdain lanaw constructor

1- super (lera valuey danwsy)
** la katy drwst krdny object hich nanwsy lanaw ()   

2- super (nawy variable danwsy)
** la katy drwst krdny object valuey lanaw () danwsy   

***************************************************************************************************************************
   
public class Factory {

   public static void main() {
       
        Car car = new Car();
        Nissan nissan = new Nissan();
        BMW bmw = new BMW();

        System.out.println("Car value: " + car.value);
        System.out.println("Nissan value: " + nissan.value);
        System.out.println("BMW value: " + bmw.value);
        
        nissan.start();
        bmw.start();
        car.start();
        
    }
}

////////////////////////////

public class Car {   // THIS IS A PARENT CLASS 

    boolean value;

    Car () {
        this.value = true;   
    }

 // agadarba agar la classy parent constructort bakar hena nabet argumenty habet agar habet dabet super bakar beny
   
    void start () {
       
        System.out.println("Your car is working");
       
    }
}

/////////////////////////

public class Nissan extends Car {   // THIS IS A CHILD CLASS 
// LERA AWAY LA CLASSY PARENT HAYA LA CLASSY CHILDISH HAYA
}

/////////////////

public class BMW extends Car {   // THIS IS A CHILD CLASS
// LERA AWAY LA CLASSY PARENT HAYA LA CLASSY CHILDISH HAYA
}

*********************************************************************************************************************

public class Factory {

   public static void main() {

   Car car = new Car (20_000, 12345 , "camry");
   Toyota toyota = new Toyota();
   Nissan nissan = new  Nissan(25_000 , 2004 , "Maxima" , "Ivan Espinosa");

System.out.println("Car: " + car.name + " Value: " + car.value + " Number: " + car.number);
System.out.println("Toyota: " + toyota.name + " Value: " + toyota.value + " Number: " + toyota.number);
System.out.println("Nissan: " + nissan.name + " Value: " + nissan.value + " Number: " + nissan.number  + " \n CEO of Nissan is " + nissan.nameOfCEO);

    }
}

//////////////////////////////

public class Car {

    int value;
    int number;
    String name;

    Car(int value, int number, String name){
        this.value = value;
        this.number = number;
        this.name = name;
    }
}

//////////////////////////////

public class Toyota extends Car {

    Toyota(){
        super(18_300 , 12425 , "Hiluix");
    }

}

//////////////////////////////

public class Nissan extends Car {

    String nameOfCEO;   // labar away awa haqy ba superclass nya boya wakw variabley asayi mamallay lagall dakret 

    Nissan(int value, int number, String name , String nameOfCEO ){
        super(value, number, name);
        this.nameOfCEO = nameOfCEO;    // labar away awa haqy ba superclass nya boya wakw variabley asayi mamallay lagall dakret 

    }
}

///////////////////////////////


   
