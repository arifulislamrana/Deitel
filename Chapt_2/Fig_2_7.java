/*Addition program that inputs two numbers then displays their sum.*/
//24-11-18//03:57pm
/**
  @author arif
 */

package Chapt_2;

import java.util.*;

public class Fig_2_7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("enter second integer: ");
        int number2 = input.nextInt();
        
        int sum = number1 + number2;
        
        System.out.printf("Sum is %d%n", sum);
    }
}
