package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;//interface 
import java.nio.file.Paths;

public class Read {
	static boolean flag = false;
	protected static void readText(String filename,String choise) {
		Path pathtoFile = Paths.get(filename);// create a Path object απο το URI του αρχειου μας για να μπορει να εντοπιστει το αρχειο.    
		try {
			BufferedReader br = Files.newBufferedReader(pathtoFile, StandardCharsets.UTF_8);// δημιουργουμε αντικειμενο BufferedReader για να διαβαζουμε μια μια τη γραμμη του αρχειου.
			String line = br.readLine();//διαβαζουμε την πρωτη γραμμη.
			while(line != null) {//οσο εχουμε γραμμες. 
				if(choise.equals("Student")){   //αν ειναι το αρχειο με μαθητες. 
					String ar[] = line.split(",", 5);  //βαζουμε τα στοιχεια καθε γραμμης που ειναι χωρισμενα με κομμα σε ενα πινακα για 5 στοιχεια.
					Student s = new Student(ar[1],ar[2],Integer.parseInt(ar[0]),ar[3],ar[4]); //δημιουργω νεο αντικειμενο Student.
					System.out.println(s);
				}else if(choise.contentEquals("Teacher")){//για καθηγητες. 
					String ar[] = line.split(",", 5);
					Teacher t = new Teacher(ar[1],ar[2],Integer.parseInt(ar[0]),ar[3],ar[4]); 
					System.out.println(t);
				}
				line = br.readLine(); //διαβαζει επομενη γραμμη.
			    
		}
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
	}
}


	


