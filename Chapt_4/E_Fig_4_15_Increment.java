/**Prefix increment and postfix increment operators*/
//29-11-18//01:57am
/**
 *
 * @author arif
 */
package Chapt_4;

public class E_Fig_4_15_Increment {
    public static void main(String[] args) {
        
        int c = 5;
        
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);
        
        System.out.println();
        
        c=5;
        System.out.printf(" c before preincrement: %d%n", c);
        System.out.printf("     preincrementing c: %d%n", ++c);
        System.out.printf("  c after preincrement: %d%n", c);
    }
}
