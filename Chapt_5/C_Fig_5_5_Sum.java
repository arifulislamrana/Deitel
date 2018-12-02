/**Summing integers with the for statement*/
//30-11-18//01:35am
/**
 *
 * @author arif
 */
package Chapt_5;

public class C_Fig_5_5_Sum {
    public static void main(String[] args) {
        
        int total = 0;
        
        for(int number = 2; number <= 20; number += 2){
            total += number;
        }
        
        System.out.printf("Sum is %d%n", total);
    }
}
