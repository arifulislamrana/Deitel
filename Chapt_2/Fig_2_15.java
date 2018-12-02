/*Compare integers using if statements, relational operators
and equality operators*/
//25-11-18//01:43am
/**
 *
 * @author arif
 */

package Chapt_2;

import java.util.Scanner;


public class Fig_2_15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integers: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second integers: ");
        int number2 = input.nextInt();
        
        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
        
        if(number1 != number2){
            System.out.printf("%d != %d%n", number1, number2);
        }
        
        if(number1 < number2){
            System.out.printf("%d < %d%n", number1, number2);
        }
        
        if(number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        }
        
        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1, number2);
        }
        
        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1, number2);
        }
    }
}
