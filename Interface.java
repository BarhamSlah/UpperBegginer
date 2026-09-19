Use an interface when:

1. Multiple classes should follow the same contract

  
Every method without body in interface is public abstract, and every variable in interface is public final static.

  
*************************************************************************************
  
Class to Class: Use extends . Single inheritance only (Max 1 class)
  
Class to Interface: Use implements . Multiple inheritance allowed
  
Interface to Interface: Use extends . Multiple inheritance allowed
  
**************************************************************************************

package WaysToPay;

public interface Payment {

    void pay(double amount);

}

//////////
package WaysToPay;

public class Card implements Payment {

    @Override
    public void pay(double amount) {
      IO.println("Paying by Card " + amount +  "$");
    }

}
/////////
package WaysToPay;

public class Cash implements Payment {

    @Override
    public void pay(double amount) {
        IO.println("Paying by Cash " + amount +  "$");
    }

}

///////
package WaysToPay;

public class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        IO.println("Paying by PayPal " + amount +  "$");
    }

}
///////
import WaysToPay.Card;
import WaysToPay.Cash;
import WaysToPay.PayPal;
import WaysToPay.Payment;

void main (){

Payment[] payments = new Payment[3];

    payments[0] = new Cash();
    payments[1] = new Card();
    payments[2] = new PayPal();


    double[] amounts = {1, 2, 3};

   for(int i = 0; i < payments.length; i++){
       payments[i].pay(amounts[i]);
   }

}

**************************************************************************************************************************************************

  
*****************************************************************************************************************
 
