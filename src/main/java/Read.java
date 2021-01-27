package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path; //interface 
import java.nio.file.Paths;

/* With this class we manage to read data from files (for students, schools, passwords etc) */

public class Read { 
	static int f = 1;
	static int position_s = 0;
	static int position_t = 0;
	protected static void readText(String filename, String choice) {
		Path pathToFile = Paths.get(filename); // we create a Path object from the file's URI to trace it.    
		try {
			BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8); /* we create a BufferedReader object so that 
			                                                                                    we'll be able to read one by one 
			                                                                                    the lines of our file.*/
			String line = br.readLine(); //reads the first line.
			while (line != null) { //as long as the file has more lines, we repeat. 
				if (choice.equals("Student")){   //if it's the students file. 
					String ar[] = line.split(",", 7);  /* we split the elements of each line 
					                                      based on the commas and we put each 
					                                      element in an array */
					Student s = new Student(Integer.parseInt(ar[0]),ar[1],ar[2],ar[3],ar[4],ar[5],Integer.parseInt(ar[6])); //��������� ��� ����������� Student.
					System.out.println(s);
				} else if (choice.contentEquals("Teacher")){ // the teachers file. 
					String ar[] = line.split(",", 7);
					Teacher t = new Teacher(Integer.parseInt(ar[0]),ar[1],ar[2],ar[3],ar[4],ar[5],Integer.parseInt(ar[6])); 
					System.out.println(t);
				} else if (choice.contentEquals("Class")) { // the classes file
					// for the classes.
					String ar[] = line.split(",", 2);
					Class c = new Class(Integer.parseInt(ar[0]),ar[1]);
					System.out.println(c);
					for(Student student : c.students) {
						System.out.println(student);
					}
					for(Teacher teacher : c.teachers) {
						System.out.println(teacher);
					}
				} else if (choice.contentEquals("School")) { //the schools file
					String ar[] = line.split(",", 5);
					fakeschool s = new fakeschool(Integer.parseInt(ar[0]),ar[1],ar[2],Integer.parseInt(ar[3]),ar[4]);
					System.out.println(s);
					for(Class c : s.classes) {
						System.out.println(c);
					}
				} else if(choice.contentEquals("Municipality")) { //the municipalities file
					String ar[] = line.split(",",5);
					Municipality m = new Municipality(ar[0],ar[1],Integer.parseInt(ar[2]),Integer.parseInt(ar[3]),Integer.parseInt(ar[4]));
					System.out.println(m);	
				} else if (choice.contentEquals("Hospital")) {
					String ar[] = line.split(",", 2);
					Hospital h = new Hospital(ar[0],ar[1]);
					System.out.println(h);				
				}
				line = br.readLine(); //read the next line
			}	    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
