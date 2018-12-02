/**Account class with a double instance variable balance and a constructor
 and deposit method that perform validation*/
//27-11-18//02:20am
/**
 *
 * @author arif
 */
package Chapt_3;

public class C_Fig_3_8_Account {
    
    private String name;
    private double balance;
    
    public C_Fig_3_8_Account(String name, double balance){
        this.name = name;
        if(balance>0){
            this.balance = balance;
        }
    }
    
    public void deposit(double depositAmount){
        if(depositAmount>0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }    
    
}
