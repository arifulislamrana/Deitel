/**Solving the class average problem using sentinel controlled iteration*/
//29-11-18//01:40am
/**
 *
 * @author arif
 */
package Chapt_4;

import java.util.Scanner;

public class D_Fig_4_12_Analysis {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int passes = 0;
         int failures = 0;
         int studentCounter = 1;
         
         while(studentCounter <= 10){
             
             System.out.print("Enter result (1 = pass, 2 = fail): ");
             int result = input.nextInt();
             
             if(result == 1){
                 passes = passes + 1;
             }
             else{
                 failures = failures + 1;
             }
             
             studentCounter = studentCounter + 1;
         }
         
         System.out.printf("Passed: %d%nfailed: %d%n", passes, failures);
         
         if(passes > 8){
             System.out.println("Bonus to instructor!");
         }
    }
}
