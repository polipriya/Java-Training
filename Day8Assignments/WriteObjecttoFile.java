package Day8Assignments;

import java.io.*;

public class WriteObjecttoFile {

    public static void main(String[] args) {
        // Objects to write to file
        java.util.Date currentDate = new java.util.Date();
        Double doubleValue = 123.456;
        Long longValue = 9876543210L;

        // File path
        String filePath = "line.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Write objects to file
            oos.writeObject(currentDate);
            oos.writeObject(doubleValue);
            oos.writeObject(longValue);

            System.out.println("Objects have been written to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing objects to file: " + e.getMessage());
        }
    }
}

