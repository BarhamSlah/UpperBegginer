   CONSTRUCTOR : 
    
   1- WE HAVE 2 TYPES OF CONSTRUCTOR : 1- DEFAULT CONSTRUCTOR  2- PARAMETERIZED CONSTRUCTOR 
   2- JAVA CREATE DEFAULT CONSTRUCTOR AUTO   
   3- YOU DON'T NEED TO WRITE DATATYPE
   4- THE NAME OF COONSTRUCTOR SHOULD BE SAME WITH NAME OF CLASS 
   5- WHEN YOU CREATE OBJECT IT AUTO CALLING CONSTRUCTOR
   6- IF YOU DON'T CREATE OR CALL SET METHOD DEFAULT CONSTRUCTOR COMES INSTEAD 

*************************************************************************************************************************************************     
      
   public class Challenge {
   public static void main(String[] args) {

    Car car1 = new Car("Toyata" , "Hiluix" , "White" , 12425 , 18_000 , 2013 );

       System.out.println("Company: " + car1.company);
       System.out.println("Model: " + car1.model);
       System.out.println("Color: " + car1.color);
       System.out.println("Number: " + car1.number);
       System.out.println("Price: " + car1.price);
       System.out.println("Year: " + car1.year);

       System.out.println();   // THIS IS USE TO MAKE SPACE BETWEEN OUTPUT

    Car car2 = new Car("Nissan" , "Altima" , "Black" , 1934 , 13_000 , 2023 );

       System.out.println("Company: " + car2.company);
       System.out.println("Model: " + car2.model);
       System.out.println("Color: " + car2.color);
       System.out.println("Number: " + car2.number);
       System.out.println("Price: " + car2.price);
       System.out.println("Year: " + car2.year);

       System.out.println();   // THIS IS USE TO MAKE SPACE BETWEEN OUTPUT

 }
}

//////

public class Car {

    String company;
    String model;
    String color;
    int number;
    int price;
    int year;

   Car(String company , String model , String color , int number , int price , int year){
     
        this.company = company;   // this.company = company line 3  *  company = company line 10
        this.model = model;       // keyword (this) use to separate  which one do you mean
        this.color = color;       // that is mean if tne name is NOT equal (this) is unnecessary
        this.number = number;
        this.price = price;
        this.year = year;
    }
}

*********************************************************************************************************************************

HERE I TALKED ABOUT CONSTRUCTOR OVERLOADED THAT MEAN HOW YOU CAN WRITE MORE THAN ONE CONSTRUCTOR BY DIFFERENCE OF PARAMETER 

THE COMPILER CAN SEPARATE BETWEEN CONSTRUCTOR OVERLOADED JUST LIKE METHOD OVERLOADED BY (SORT DATATYPE , NUMBER , SEQUENCE)

public class Challenge {
   public static void main(String[] args) {

Car car1 = new Car("Toyota");
Car car2 = new Car("BMW" , 2020);
Car car3 = new Car(10_000 , "MG");
Car car4 = new Car(20_000 , "Maxima" , 2025);  
Car car5 = new Car();     

System.out.println("Car1 company is : " + car1.company);
System.out.println("Car2 company is : " + car2.company + " & year is : " +car2.year );
System.out.println("Car3 model is : " + car3.model + " & price is : " + car3.price);
System.out.println("Car4 model is : " + car4.model + " & price is : " + car4.price + " & year is : " + car4.year);
System.out.println(//car5.nameofvariable);
       // the result is random based on datatype that declared variable for example int = 0 : String = null

   }
}

//////////

public class Car {

    String company;
    String model;
    double price;
    int year;

    Car(String company) {

        this.company = company;
    }

     Car(String company, int year) {

            this.company = company;
            this.year =year;
    }

    Car(double price , String model) {

        this.model = model;
        this.price = price;
    }

   Car(double price , String model , int year) {
      this.model = "Maxima";   // this is selected when write argument this alo appear
      this.year = 2025;         // this is selected when write argument this alo appear
      this.price = price;
     
   }

   Car(){
     // here the blank constructor
   }      
    }  
