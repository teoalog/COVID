package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {
	static boolean flag = false;
	protected static void readText(String filename,String choise) {
		Path pathtoFile = Paths.get(filename);// create a Path object ��� �� URI ��� ������� ��� ��� �� ������ �� ���������� �� ������.    
		try {
			BufferedReader br = Files.newBufferedReader(pathtoFile, StandardCharsets.UTF_8);// ������������ ����������� BufferedReader ��� �� ���������� ��� ��� �� ������ ��� �������.
			String line = br.readLine();//���������� ��� ����� ������.
			while(line != null) {//��� ������ �������. 
				if(choise.equals("Student")){   //�� ����� �� ������ �� �������. 
					String ar[] = line.split(",", 5);  //������� �� �������� ���� ������� ��� ����� ��������� �� ����� �� ��� ������ ��� 5 ��������.
					Student s = new Student(ar[1],ar[2],Integer.parseInt(ar[0]),ar[3],ar[4]); //��������� ��� ����������� Student.
					System.out.println(s);
				}else if(choise.contentEquals("Teacher")){//��� ���������. 
					String ar[] = line.split(",", 5);
					Teacher t = new Teacher(ar[1],ar[2],Integer.parseInt(ar[0]),ar[3],ar[4]);
					System.out.println(t);
				}
				line = br.readLine(); //�������� ������� ������.
			    
		}
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
	}
}


	


