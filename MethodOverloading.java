Method Overloading = Static Polymorphism (Compile-Time Polymorphism)
    
Same method name but should be different ini one of three points :

1- number of parameters.
2- data types of parameters. 
3- order/sequence of parameters.
    
Method Overloading → Does NOT require inheritance 

It usually happens inside the same class.
@Override?
❌ There is no @Overloading annotation in Java.

*********************************************************************************************************************************************

void main()  {

IO.println(numbers( 2  , 3  , 4));

    }

public static int numbers(int number1 , int number2){
    return number1 + number2;
}

public static int numbers(int number1 , int number2 , int number3){
return number1 + number2 +  number3;
}

public static int numbers(int number1 , int number2 , int number3 , int number4){
return number1 + number2 + number3 + number4;
}  
  
