import java.util.*;
public class StudentTotalValid {
    public static void main(String[] args) {
            Scanner in =  new Scanner(System.in);
            //number of students
        int numberOfStudents;
            while(true){
            System.out.print("Enter the number of students: ");
            String noInput=in.nextLine().trim();
                if (noInput.matches("\\d+")){
                    numberOfStudents=Integer.parseInt(noInput);
                    break;
                }
                else{
                    System.out.print("Please enter the whole numbers...");
                }
            }
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

                while(true) {
                    System.out.print("Enter the Student Id(7 digits):");
                    String inputValue = in.nextLine().trim();
                    if (inputValue.matches("\\d{7}")) {
                        studentId[i] = Integer.parseInt(inputValue);
                        break;
                    } else {
                        System.out.print("Please enter the 7 digit...");
                    }
                }

                while (true) {
                    System.out.print("Name (letters only): ");
                    String nameInput = in.nextLine().trim();
                    if (nameInput.matches("[a-zA-Z ]+")) {
                        String[] words = nameInput.split(" ");
                        StringBuilder pascalCaseName = new StringBuilder();
                        for (String word : words) {
                            if (!word.isEmpty()) {
                                pascalCaseName.append(Character.toUpperCase(word.charAt(0)))
                                        .append(word.substring(1).toLowerCase())
                                        .append(" ");
                            }
                        }
                        studentName[i] = pascalCaseName.toString().trim();
                        break;
                    }
                    else {
                        System.out.println("Error: Name must contain only letters and spaces.");
                    }
                }

                marksInTamil[i] = isValid(in, "Tamil");
                marksInEnglish[i] = isValid(in, "English");
                marksInMaths[i] = isValid(in, "Maths");
                marksInScience[i] = isValid(in, "Science");
                marksInSocialScience[i] = isValid(in, "Social Science");

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
    public static int isValid(Scanner in, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter the Marks in " + subject + " (0-100): ");
            String marksOfStudents = in.nextLine().trim();
            if (marksOfStudents.matches("\\d+")) {
                marks = Integer.parseInt(marksOfStudents);
                if (marks >= 0 && marks <= 100) {
                    return marks;
                }
            } else {
                System.out.println("Error: Marks must be an integer between 0 and 100.");
            }
        }
    }
}
