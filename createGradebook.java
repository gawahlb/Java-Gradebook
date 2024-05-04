import java.io.File;
import java.io.IOException;

public class createGradebook {
    public static void main(String filename) {
        try {

            // Create a new file to be saved in the same folder the java files come from.
            File newGradebook = new File(filename);
            if (newGradebook.createNewFile()) {
                System.out.println("New gradebook " + filename + "created successfully!");
            } else {
                System.out.println("Gradebook, " + filename + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
