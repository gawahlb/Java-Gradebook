import java.util.ArrayList;

public class deleteGrade {
    public static ArrayList<String> main(int gradeToDelete, ArrayList<String> gradebook,
            ArrayList<String> studentGrades) {

        // Pull student name and assignment name from ArrayList.
        String studentName = studentGrades.get((gradeToDelete + (gradeToDelete - 1)) - 1);
        String assignmentName = (studentGrades.get((gradeToDelete * 2) - 1));
        int i = 0;

        for (String grade : gradebook) {
            // Split individual entry into separate data (student name, assignment name,
            // points out of, and student score).
            String[] grades = grade.split("\\|");
            if (grades[0].equalsIgnoreCase(studentName) && grades[1].equalsIgnoreCase(assignmentName)) {
                // Remove the selected grade.
                gradebook.remove(i);
                break;
            }
            i++;
        }
        return gradebook;
    }
}
