/*Creating and manipulating an Account object*/
//26-11-18/02:15am
/**
 *
 * @author arif
 */

package Chapt_3;

import java.util.Scanner;

public class A_Fig_3_2_AccountTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        A_Fig_3_1_Account myAccount = new A_Fig_3_1_Account();
        
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        
        myAccount.setName(theName);
        System.out.println();
        
        System.out.printf("Name in object myAccount is: %n%s%n",
                myAccount.getName());
    }
}
