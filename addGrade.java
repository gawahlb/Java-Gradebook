import java.util.ArrayList;

public class addGrade {

    public static String main(String studentName, String assignmentName, String pointValue, String studentScore) {
        // Format each assignment in such a way that it can be recognized by the
        // program.
        return studentName + "|" + assignmentName + "|" + pointValue + "|" + studentScore;
    }

    public static void add(ArrayList<String> gradebook, String newGrade) {
        // Add the grade to the existing ArrayList.
        gradebook.add(newGrade);
    }
}
