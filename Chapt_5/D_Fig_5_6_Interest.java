/**Compound interest calculations with for*/
//30-11-18//01:53am
/**
 *
 * @author arif
 */
package Chapt_5;

public class D_Fig_5_6_Interest {
    public static void main(String[] args) {
        
        double principle = 1000.0;
        double rate = 0.05;
        
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        for(int year = 1; year <= 10; ++year){
            
            double amount = principle * Math.pow(1.0 + rate, year);
            
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
