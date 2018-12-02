/**Using the account constructor to initialize the name instance 
 variable at the time each Account object is created*/
//27-11-18//01:54am
/**
 *
 * @author arif
 */

package Chapt_3;


public class B_Fig_3_6_AccountTest {
    public static void main(String[] args) {
        B_Fig_3_5_Account account1 = new B_Fig_3_5_Account("Jane Green");
        B_Fig_3_5_Account account2 = new B_Fig_3_5_Account("John Blue");
        
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
