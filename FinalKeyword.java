Final Keyword is use to ( Variable _ Method _ Class ) : 

1- Variable : To make your variable's value constant 
  
final int number = 9;
// number = 2; the compiler will give error
IO.println(number);


2- Method : to stop overriding your method.
3- Class : to stop inheritance your class.

public class Calculator {     // if you write final we can't extend it


        final void show(){
            IO.println("This calculator created by barham");
        }

        double add(int a, int b){
            return a+b;
        }
    }

/////////////

class AdvanceCalc extends Calculator {

    double sub(int a, int b){
        return a-b;

           /*
            we can't do that show method has a final keyword
           @Overrrde
            void show(){
               IO.println("This calculator created by barham");
           }
           */
    }
}

////////////

void main(){

Calculator calc = new Calculator();
IO.println(calc.add(1,2));
AdvanceCalc advanceCalc = new AdvanceCalc();
IO.println(advanceCalc.sub(1,2));

}


  
  
