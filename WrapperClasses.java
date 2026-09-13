int num = 7; 

Boxing (Explicit)
Integer num1 = Integer.valueOf(num); 

Autoboxing (Automatic)
Integer num2 = num;

String priceStr = "150";
int price = Integer.parseInt(priceStr);

// Now you can safely perform arithmetic
int total = price + 50; // Output: 200


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
