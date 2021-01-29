package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Read data from files (for students, schools, passwords etc.) */
public class Read {
    protected static void readText(String filename, String choice) {
        Path pathToFile = Paths.get(filename); // Creates a Path object from the file's URI to trace it.
        try {
            /* Create a BufferedReader object so that the file lines will be read one by one. */
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);
            String line = br.readLine(); // reads the first line
            while (line != null) { // as long as the file has more lines the action is repeated
                if (choice.equals("Student")){   // if it is the students file
                    /* split the elements of each line based on the commas and put each element in an array */
                    String[] ar = line.split(",", 7);
                    new Student(Integer.parseInt(ar[0]), ar[1], ar[2], ar[3], ar[4], ar[5], Integer.parseInt(ar[6]));
                } else if (choice.contentEquals("Teacher")){ // the teachers file.
                    String[] ar = line.split(",", 7);
                    new Teacher(Integer.parseInt(ar[0]), ar[1], ar[2], ar[3], ar[4], ar[5], Integer.parseInt(ar[6]));
                } else if (choice.contentEquals("Class")) { // the classes file
                    String[] ar = line.split(",", 2);
                    new Class(Integer.parseInt(ar[0]), ar[1]);
                } else if (choice.contentEquals("School")) { // the schools file
                    String[] ar = line.split(",", 5);
                    new School(Integer.parseInt(ar[0]), ar[1], ar[2], Integer.parseInt(ar[3]), ar[4]);
                } else if(choice.contentEquals("Municipality")) { // the municipalities file
                    String[] ar = line.split(",",5);
                    new Municipality(ar[0], ar[1], Integer.parseInt(ar[2]), Integer.parseInt(ar[3]), Integer.parseInt(ar[4]));
                } else if (choice.contentEquals("Hospital")) { // the hospitals file
                    String[] ar = line.split(",", 2);
                    new Hospital(ar[0], ar[1]);
                }
                line = br.readLine(); // read the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
