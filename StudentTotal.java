import java.util.*;
public class StudentTotal {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        //number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents=in.nextInt();
        //declaring an array
        int[] studentId=new int[numberOfStudents];
        String[] studentName=new String[numberOfStudents];
        int[] marksInTamil=new int[numberOfStudents];
        int[] marksInEnglish=new int[numberOfStudents];
        int[] marksInMaths=new int[numberOfStudents];
        int[] marksInScience=new int[numberOfStudents];
        int[] marksInSocialScience=new int[numberOfStudents];
        int[] totalMarks=new int[numberOfStudents];
        double[] percentageOfStudent=new double [numberOfStudents];

        for(int i=0;i<numberOfStudents;i++){
            System.out.println("Enter the Details of Student "+(i+1)+":");
            System.out.print("Enter the Student Id:");
            studentId[i]=in.nextInt();
            System.out.print("Enter the Student Name:");
            studentName[i]=in.next();
            System.out.print("Enter the Marks in Tamil:");
            marksInTamil[i]=in.nextInt();
            System.out.print("Enter the Marks in English:");
            marksInEnglish[i]=in.nextInt();
            System.out.print("Enter the Marks in Maths:");
            marksInMaths[i]=in.nextInt();
            System.out.print("Enter the Marks in Science:");
            marksInScience[i]=in.nextInt();
            System.out.print("Enter the Marks in Social Science:");
            marksInSocialScience[i]=in.nextInt();

            totalMarks[i]=marksInTamil[i]+marksInEnglish[i]+marksInMaths[i]+marksInScience[i]+marksInSocialScience[i];
            //System.out.println(totalMarks[i]);
            percentageOfStudent[i]=(totalMarks[i]/500.0)*100;
            //System.out.println(percentageOfStudent[i]);
        }

        System.out.println("Student details:");
        System.out.printf("-------------------------------------------------------------------------------------------------\n");
        System.out.printf("|Id     |Name           |Tamil  |English  |Maths  |Science  |SocialScience  |Total  |Percentage  |\n");
        System.out.printf("-------------------------------------------------------------------------------------------------\n");
        for(int i=0;i<numberOfStudents;i++) {
            System.out.printf("|%-7d|%-15s|%-7d|%-9d|%-7d|%-9d|%-15d|%-7d|%-12.2f|\n",studentId[i], studentName[i], marksInTamil[i], marksInEnglish[i], marksInMaths[i], marksInScience[i],
                    marksInSocialScience[i], totalMarks[i], percentageOfStudent[i]);
        }
        System.out.printf("-------------------------------------------------------------------------------------------------\n");
    }
}


