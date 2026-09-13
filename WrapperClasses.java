void main() {

    int number = 5;
    
    // Autoboxing (Automatic conversion from int to Integer)
    Integer number1 = number; 
    
    // Explicit Boxing (Manual conversion using valueOf())
    Integer number2 = Integer.valueOf(number); 

    // Auto-unboxing (Automatic conversion from Integer to int)
    int number3 = number2; 
    
    // Explicit Unboxing (Manual conversion using intValue())
    int number4 = number2.intValue(); 

    IO.println(number1 + number2 + number3 + number4); // Output: 20
}

*****************************************************************************************************************************************************************

       // to convert Primitives datatype to String
       String e = Integer.toString(123);
       String f = Double.toString(3.14);
       String g = Character.toString('@');
       String h = Boolean.toString(false);


       // to convert String to Primitives datatype
       int i = Integer.parseInt("123");
       double j = Double.parseDouble("3.14");
       char k = "Pizza".charAt(0);
       boolean l = Boolean.parseBoolean("true");


       char letter = 'B';

       System.out.println(Character.isLetter(letter));      // prints true
       System.out.println(Character.isUpperCase(letter));   // prints true
