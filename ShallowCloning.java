import java.util.Scanner;
class Student implements Cloneable {
    private String name;
    private int rollNumber;
    private String collegeName;
    private int marks1, marks2, marks3;
    // user
    public void userDetails() {
        Scanner in = new Scanner(System.in);
        //Name
        while (true) {
            System.out.print("Enter Student Name: ");
            this.name = in.nextLine().trim();
            if (!name.trim().isEmpty()) {
                break;
            } else {
                System.out.print("Error: Name cannot be empty. Please enter a valid name.");
            }
        }
        // Roll Number
        while (true) {
            System.out.print("Enter Roll Number: ");
            String strInput = in.nextLine().trim();
            if (strInput.matches("\\d+")) {
                rollNumber = Integer.parseInt(strInput);
                if (this.rollNumber > 0) {
                    break;
                } else {
                    System.out.print("Error: Roll number must be a positive integer.");
                }
            } else {
                System.out.print("Error: Invalid input. Roll number must be an integer.");

            }
        }
        // College Name
        while (true) {
            System.out.print("Enter College Name: ");
            this.collegeName = in.nextLine().trim();
            if (!collegeName.trim().isEmpty()) {
                break;
            } else {
                System.out.print("Error: College name cannot be empty. Please enter a valid name.");
            }
        }

        //  Marks (0 to 100)
        this.marks1 = validateMarks(in, "Enter marks for Subject 1 (0-100): ");
        this.marks2 = validateMarks(in, "Enter marks for Subject 2 (0-100): ");
        this.marks3 = validateMarks(in, "Enter marks for Subject 3 (0-100): ");
    }

    // Method to validate marks (between 0 and 100)
    private int validateMarks(Scanner in, String message) {
        int marks;
        while (true) {
            System.out.print(message);
            String strInput = in.nextLine().trim();
            if (strInput.matches("\\d+")) {
                marks = Integer.parseInt(strInput);
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Error: Marks must be between 0 and 100. Try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Marks must be an integer.");
            }
        }
        return marks;
    }
    // display college details
    public void collegeDetails() {
        System.out.println("College Name: " + collegeName);
    }

    //percentage
    public double percentageCalculation() {
        int totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 3.0);
    }

    //clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber +
                ", collegeName='" + collegeName + "', percentage=" + percentageCalculation() + "%}";
    }
}
public class ShallowCloning {
    public static void main(String args[]) {
        try {
            // Create and initialize original student object
            System.out.println("Enter Original Student Details:");
            Student originalStudent = new Student();
            originalStudent.userDetails();

            // Shallow cloning the original student object
            Student clonedStudent = (Student) originalStudent.clone();

            // Modifying cloned object's details
            System.out.println("\n--- Modifying Cloned Student Details ---");
            System.out.println("Enter new details for the cloned student:");
            clonedStudent.userDetails();

            // Displaying both original and cloned student details
            System.out.println("\nOriginal Student Details: ");
            System.out.println(originalStudent);
            originalStudent.collegeDetails();

            System.out.println("\nCloned Student Details: ");
            System.out.println(clonedStudent);
            clonedStudent.collegeDetails();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

