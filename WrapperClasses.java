Boxing (Manual vs. Automatic):

Explicit Boxing: Integer obj = Integer.valueOf(5);

Autoboxing: Integer obj = 5;

Unboxing (Manual vs. Automatic):

Explicit Unboxing: int num = obj.intValue();

Auto-unboxing: int num = obj;


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
