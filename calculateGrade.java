import java.util.ArrayList;

public class calculateGrade {
    public static void main(String studentName, ArrayList<String> gradebook) {

        float pointTotal = 0;
        float studentScore = 0;
        float studentGrade = 0;

        for (String grade : gradebook) {

            // Split the grade into parts that the program can extract data from.
            String[] grades = grade.split("\\|");
            if (grades[0].equalsIgnoreCase(studentName)) {

                // Convert the current points from strings into integers.
                int intPoints = Integer.parseInt(grades[2]);
                int intScore = Integer.parseInt(grades[3]);

                // Calculate grade percentage.
                pointTotal = pointTotal + intPoints;
                studentScore = studentScore + intScore;
            }
        }
        studentGrade = studentScore / pointTotal;
        studentGrade = studentGrade * 100;

        System.out.println(studentName + "'s percent grade is " + studentGrade + "%.\n");
    }
}
