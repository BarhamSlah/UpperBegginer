Compile-time errors: Syntax mistakes that the compiler flags before your code ever runs. system.out.println  // System not system
Logical errors: The program runs fine, but calculates the wrong answer (e.g., getting 5 instead of 4). // also call bugs
Runtime errors: The code is written correctly and compiled fine, but it suddenly stops execution in the middle of running. // just like missing file and dividing by zero
***************************************************************************************************************************************************************************************
 
Exceptions :  are issues in your code (like dividing by zero or bad array indexes) that you can and should handle.

Errors : are issues in your code (like OutOfMemoryError or StackOverflowError) . You cannot handle them in code.
***************************************************************************************************************************************************************************************
🛑 Checked Exception: The compiler stops you before running. It says, "Nope, you aren't allowed to build this until you handle this potential risk."

💥 Unchecked Exception: The compiler lets you build and run the code fine. But if the bad condition happens while running (like a null or a division by zero),
 boom—the app crashes right there unless you wrapped it in a try-catch.

 
Checked (compile-time)                        	Unchecked (runtime)
IOException          	                         ArithmeticException
FileNotFoundException (extends IOException)	   NullPointerException
MalformedURLException (extends IOException)	   ArrayIndexOutOfBoundsException
SQLException	                                  NumberFormatException
ClassNotFoundException	                        ClassCastException
InterruptedException                          	IllegalArgumentException
***************************************************************************************************************************************************************************************
 
🚨 ArithmeticException: Triggered by illegal math operations, such as dividing an integer by zero (18 / 0).

📦 ArrayIndexOutOfBoundsException: Triggered when trying to access an invalid array index (e.g., fetching index 5 on an array of length 5, where valid indices are 0–4).

📭 NullPointerException: Triggered when performing an operation on an object reference that is null (e.g., calling .length() on a null string).

🛡️ Exception: The parent class for all exceptions.    
***************************************************************************************************************************************************************************************

 try {
    String str = null;
    System.out.println(str.length());
} catch (NullPointerException e) {
    System.out.println("Error: Object is null!");
}     

/*
      finally always execute

      when you just write Exception you don't select the error
      so the user doesn't know what is the problem

      So always select specific exception

      put things inside try if you try to create files because it is automaticlly close the
      file on the another hand it won't do that if it is not in try block

      you should write letter or word just after Exception in catch

      Never leave catch block empty

      Golden Rule: If you can prevent an error with a simple `if` statement, use `if`.
      But if the error is related to an external system (like a database or a file) that you don't have control over,
      then use `try-catch`.
*/

      try{
              System.out.println(1 / 0);
      } catch (ArithmeticException error){
        System.out.println("You can't divide by zero");
      } finally {
              System.out.println("finally always execute");
      }
***************************************************************************
              
 try {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your number ");
      double yourNumber = scanner.nextDouble();

       }catch (InputMismatchException e){
         System.out.println("You should enter number");
       }
***************************************************************************************************************************************************************************************

void main() {

    int a = 0;

    try {
      int b = 10 / a;
      if(b == 0){
       throw new ArithmeticException(){  // Custom logic: if the result is 0, manually throw an exception
       };
      }

    } catch(ArithmeticException e){
         IO.println("This is default output and equal to 1");
    }catch (Exception e){
        IO.println("The error " + e);
    }

}
