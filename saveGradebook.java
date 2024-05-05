import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class saveGradebook {
    public static void main(ArrayList<String> gradebook, String filename) {
        try {
            FileWriter Writer = new FileWriter(filename);
            for (String grade : gradebook) {

                // Save each line in the current ArrayList to a file.
                Writer.write(grade + "\n");
            }
            Writer.close();
            System.out.println("Grades successfully added to your gradebook!\n");
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }

    }
}
