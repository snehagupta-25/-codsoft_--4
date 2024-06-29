import java.util.*;
import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args){
        int subjects=4;
        int sumsubjects=0;
        float percentage;
        
        StudentGradeCalculator st = new StudentGradeCalculator();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i<subjects;i++){
            System.out.println("enter marks of subjects:");
            sumsubjects=sumsubjects + sc.nextInt();
        }
        percentage = sumsubjects / subjects;
        System.out.println("Sum of all subjects:"+subjects);
        System.out.println("Percentage:"+percentage);
        
        if(percentage<35){
            System.out.println("fail");
        }
        else if (percentage>35 && percentage<50){98
            System.out.println("Grade D");
        }
        else if (percentage>50 && percentage<65){
            System.out.println("Grade C");
        }
        else if (percentage>65 && percentage<80){
            System.out.println("Grade B");
        }
        else if (percentage>80 && percentage<100){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Invalid");
            
        }
    }
}