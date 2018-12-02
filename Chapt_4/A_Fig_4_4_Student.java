/**Student class that stores a student name and average */
//28-11-18//10:15pm
/**
 *
 * @author arif
 */
package Chapt_4;

public class A_Fig_4_4_Student {
    private String name;
    private double average;
    
    
    public A_Fig_4_4_Student(String name, double average){
        this.name = name;
        if(average > 0){
            if(average <= 100){
                this.average = average;
            }
        }
    }

    
    public void setName(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }
    
    
   public void setAverage(double studentAverage){
       if(average > 0){
            if(average <= 100){
                this.average = average;
            }
        }
   }

   
    public double getAverage() {
        return average;
    }
   
   
    public String getLetterGrade(){
        String letterGrade = "";
        
        if(average >= 90.0){
            letterGrade = "A";
        }
        
        else if(average >= 80.0){
            letterGrade = "B";
        }
        
        else if(average >= 70.0){
            letterGrade = "C";
        }
        
        else if(average >= 60.0){
            letterGrade = "D";
        }
        
        else{
            letterGrade = "F";
        }
        
        return letterGrade;
    }
}
