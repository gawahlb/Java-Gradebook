import java.util.ArrayList;

public class viewStudent {

    public static void main(String studentName) {

    }

    // Pulls just the student's name out of the given set of information.
    public static void names(ArrayList<String> gradebook) {
        ArrayList<String> nameList = new ArrayList<String>();

        for (String grade : gradebook) {

            // Split the given string into different segments to single out each piece of
            // information.
            String[] gradeArray = grade.split("\\|");
            if (nameList.contains(gradeArray[0])) {
            } else {

                // Display the names of each student.
                nameList.add(gradeArray[0]);
                System.out.println(gradeArray[0]);
            }
        }
    }

    // Prints the assignments for a given student.
    public static ArrayList<String> assignments(String studentName, ArrayList<String> gradebook) {
        int j = 1;
        ArrayList<String> studentGrades = new ArrayList<String>();
        for (String grade : gradebook) {

            // Split given string into different pieces of information.
            String[] grades = grade.split("\\|");
            if (grades[0].equalsIgnoreCase(studentName)) {

                // Add student name and assignment name to a file for later use.
                studentGrades.add(grades[0]);
                studentGrades.add(grades[1]);

                // Display each assignment from this student with the possible points and
                // student score.
                System.out.println(
                        j + "). Assignment Name: " + grades[1] + " Score: " + grades[3] + " Out of: "
                                + grades[2]);
            }
            j++;
        }
        return studentGrades;
    }
}
