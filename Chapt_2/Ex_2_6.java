/*Calculate the products of three integers */
//25-11-18//02:10am
/**
 *
 * @author arif
 */

package Chapt_2;

import java.util.Scanner;

public class Ex_2_6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first intger: ");
        int x = input.nextInt();
        
        System.out.print("Enter second intger: ");
        int y = input.nextInt();
        
        System.out.print("Enter third intger: ");
        int z = input.nextInt();
        
        int result = x * y * z;
        
        System.out.printf("Product is %d%n", result);
    }
}
