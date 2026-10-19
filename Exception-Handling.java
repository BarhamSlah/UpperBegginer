Compile-time errors: Syntax mistakes that the compiler flags before your code ever runs. system.out.println  // System not system
Logical errors: The program runs fine, but calculates the wrong answer (e.g., getting 5 instead of 4). // also call bugs
Runtime errors: The code is written correctly and compiled fine, but it suddenly stops execution in the middle of running. // just like missing file and dividing by zero

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
