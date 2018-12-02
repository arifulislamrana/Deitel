/**Solving the class average problem using counter controlled iteration*/
//29-11-18//01:20am
/**
 *
 * @author arif
 */
package Chapt_4;

import java.util.Scanner;

public class B_Fig_4_8_ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 1;
        
        while(gradeCounter <= 10){
            System.out.printf("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
        }
        
        int average = total / 10;
        
        System.out.printf("%nTotal of all grade is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}