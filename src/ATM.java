
/* Problem statement
Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X
is a multiple of 5, and Pooja's account balance has enough
cash to perform the withdrawal transaction
(including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an
 attempted transaction.
*/

public class ATM
{
    public static void main(String[] args) {
        float bal = 1000, withdrawal = 979;

        if(withdrawal > bal - 0.50f)
        {
            System.out.println("Your account doesn't have enough balance");
        }

        else
        {

            if(withdrawal % 5 != 0)
            {
                System.out.println("Invalid amount, withdrawal amt. should be multiple of 5");
            }

            else
            {
                bal -= (withdrawal + 0.50f);
                System.out.println("Your current balance is: "+bal);
            }
        }
    }
}
