import java.util.Scanner;
public class Stud2entGradeTracker{
    public static void main(String args[]){
        System.out.println("**************STUDENT GRADE TRACKER******************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of subjects");
        int numSubjects=sc.nextInt();
        int totalMarks=0;
        for(int i=1; i<=numSubjects; i++){
            System.out.println("Enter marks of "+i+" out of 100");
            int marks=sc.nextInt();
            //input validation
            if(marks<0||marks>100){
                System.out.println("Enter marks between 1-100");
                System.out.println("Enter marks of subject "+i+" out of 100");
                marks=sc.nextInt();
            }
            totalMarks+=marks;

        }
        System.out.println("student result");
        System.out.println("Total marks obtained in all subjects "+totalMarks);
        sc.close();

        //calculate average percentage
        int averagePercentage=totalMarks/numSubjects;
        System.out.println("Average percentage = "+averagePercentage +"%");

        //add Grades
        if(averagePercentage>=90){
            System.out.println("You have obtained A+ grade ");
        }
        else if(averagePercentage>=82){
            System.out.println("You have obtained A grade ");
        }
        else if(averagePercentage>=64){
            System.out.println("You have obtained B+ grade ");
        }
        else if(averagePercentage>=55){
            System.out.println("You have obtained B grade ");
        }
        else if(averagePercentage>=50){
            System.out.println("You have obtained C grade ");
        }
        else{
            System.out.println("   You are Fail.........!");
        }


    }
}