/**Create and test students objects */
//28-11-18//10:35pm
/**
 *
 * @author arif
 */
package Chapt_4;

public class A_Fig_4_5_StudentTest {
    public static void main(String[] args) {
        A_Fig_4_4_Student account1 = new A_Fig_4_4_Student("Jane Green", 93.5);
        A_Fig_4_4_Student account2 = new A_Fig_4_4_Student("John Blue", 72.75);
        
        System.out.printf("%s's letter grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account2.getName(), account2.getLetterGrade());
    }
}
