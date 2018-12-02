/**Inputting and outputting floating_point numbers with Account objects*/
//28-11-18//10:20am
/**
 *
 * @author arif
 */
package Chapt_3;

import java.util.Scanner;

public class C_Fig_3_9_AccountTest {
    public static void main(String[] args) {
        
        C_Fig_3_8_Account account1 = new C_Fig_3_8_Account("Jane Green", 50.00); 
        C_Fig_3_8_Account account2 = new C_Fig_3_8_Account("John Blue", -7.53);
        
        
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        
        
        Scanner input = new Scanner(System.in);//java.util.Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);
        
        
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        
        
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);
        
        
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
    }
}
