import java.util.ArrayList;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {

        // Welcome message
        System.out.println(
                "Welcome to the Gradebook App! Here you will be able to perform any necessary functions to keeping your gradebook up to date with ease!\n");

        // Initialize variables
        int choice = -1;
        int gradeInt;
        ArrayList<String> gradebook = new ArrayList<String>();
        ArrayList<String> studentGrades = new ArrayList<String>();
        String newGrade;

        // Create a loop for the main menu to repeat until the user selects option 8.
        while (choice != 8) {

            final Scanner inputObj = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("1. Create a new gradebook");
            System.out.println("2. Load gradebook");
            System.out.println("3. Add a new grade");
            System.out.println("4. Delete a grade");
            System.out.println("5. View a student's grades");
            System.out.println("6. Calculate a student's overall grade");
            System.out.println("7. Save gradebook");
            System.out.println("8. Quit");

            // Get user choice.
            String input = inputObj.nextLine();

            // Convert user choice from string to integer.
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    System.out.println("What would you like the filename to be? (Should end with .txt)\n");
                    String newGB = inputObj.nextLine();
                    createGradebook.main(newGB);
                    break;
                case 2:
                    System.out.println("What is the name of your gradebook file?\n");
                    String readGB = inputObj.nextLine();
                    gradebook = viewGradebook.main(readGB);
                    break;
                case 3:
                    System.out.println("For which student would you like to add a grade?\n");
                    String readStudentName = inputObj.nextLine();
                    System.out.println("What is the assignment name?\n");
                    String assignmentName = inputObj.nextLine();
                    System.out.println("How many points is the assignment worth?\n");
                    String pointValue = inputObj.nextLine();
                    System.out.println("What score did the student get?\n");
                    String studentScore = inputObj.nextLine();
                    newGrade = addGrade.main(readStudentName, assignmentName, pointValue, studentScore);
                    addGrade.add(gradebook, newGrade);
                    break;
                case 4:
                    System.out.println("For which student would you like to delete a grade?\n");
                    readStudentName = inputObj.nextLine();
                    studentGrades = viewStudent.assignments(readStudentName, gradebook);
                    System.out.println("Which grade would you like to delete?");
                    String gradeToDelete = inputObj.nextLine();
                    gradeInt = Integer.parseInt(gradeToDelete);
                    gradebook = deleteGrade.main(gradeInt, gradebook, studentGrades);
                    break;
                case 5:
                    System.out.println("Which student would you like to view the grades of?\n");
                    readStudentName = inputObj.nextLine();
                    viewStudent.assignments(readStudentName, gradebook);
                    break;
                case 6:
                    System.out.println("Which student would you like to calculate the overall grade for?\n");
                    viewStudent.names(gradebook);
                    readStudentName = inputObj.nextLine();
                    calculateGrade.main(readStudentName, gradebook);
                    break;
                case 7:
                    System.out.println("What is the name of your gradebook file?\n");
                    readGB = inputObj.nextLine();
                    saveGradebook.main(gradebook, readGB);
                    break;
                case 8:
                    System.out.println("Thank you for using the Gradebook App!\n");
                    break;

            }
        }
    }
}
