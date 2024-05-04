import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class viewGradebook {
    public static ArrayList<String> main(String filename) {
        ArrayList<String> loadGradebook = new ArrayList<String>();
        try {

            // Open file and scanner
            File myFile = new File(filename);
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {

                // Iterate through given file and add each line to a new ArrayList.
                String data = myReader.nextLine();
                loadGradebook.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
        return loadGradebook;
    }
}
