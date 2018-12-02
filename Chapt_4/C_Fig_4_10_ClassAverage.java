/**Solving the class average problem using sentinel controlled iteration*/
//29-11-18//01:30am
/**
 *
 * @author arif
 */
package Chapt_4;

import java.util.Scanner;

public class C_Fig_4_10_ClassAverage {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 0;
        
        System.out.print("Enter grade or -1 to quite: ");
        int grade = input.nextInt();
        
        while(grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.print("Enter grade or -1 to quite: ");
            grade = input.nextInt();
        }
        
        if(gradeCounter != 0){
            
            double average = (double) total / gradeCounter;
            
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else{
            System.out.println("No grade grade were entered");
        }
    }
}
