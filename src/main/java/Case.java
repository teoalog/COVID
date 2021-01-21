import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Case {
	
	private int idOfCase;
	private LocalDate date;
	private String gender;

	public static ArrayList<Case> totalCasesList = new ArrayList<Case>();

	int numOfCases = 0;
	int women = 0;
	int men = 0;
	
	public Case(int idOfCase, LocalDate date, String gender) {
		this.idOfCase = idOfCase;
		this.date = date;
		this.gender = gender;
		totalCasesList.add(this);
		numOfCases++;
	}
	
	public int getId() {
		return idOfCase;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String toString() {
		String s = "Case";
		return "ID of Case: " + idOfCase + "\nGender: " + gender + "\nDate: " + date;
	}
	
	public static void getAllcases() {
		for (int i = 0; i < totalCasesList.size(); i++) {
			JOptionPane.showMessageDialog(null, totalCasesList.get(i).toString());
		}
	}
	
	public static void readOption(Object s) {
		int id = 0;
		LocalDate dd;
		String gender;
		int school;
		Class cl;
		Case c;
		if (s.equals("Student")) {
			/* NEEDS TO BE MADE: while statement to check if the correct credentials are entered */
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following fields: \nStudent ID: ",
					"New Case", JOptionPane.INFORMATION_MESSAGE));
			dd = LocalDate.now();
			Student st = Student.findStudent(id); //This is the Student Object which refers to our case
			st.setStatus("positive"); //Changing student's status
			cl = Class.findClass(st); //This is the Class Object which refers to our student's class
		    cl.setCases(); //updates the total  amount of cases in this class
			school = School.findSchool(st.getSchoolid()); //The position of school in the array list that includes all schools
			School.addCaseInSchool(school); //Adds the new case in the school of the student
			Hospital.findHospital(st.getSchoolid()); //Looks for a hospital nearby
			gender = st.getGender(); //Saves the gender for statistical purposes
			c = new Case(id, dd, gender); //Creates a Case object
			c.addNewCase(); //Adds the new case in the array list
		} else {
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following fields: \nTeacher ID: ",
					"New Case", JOptionPane.INFORMATION_MESSAGE));
			dd = LocalDate.now();
			Teacher t = Teacher.findTeacher(id); //This is the Teacher Object which refers to our case
			t.setStatus("positive"); //Changing teacher's status
			cl = Class.findClass(t); //This is the Class Object which refers to our teacher's class
			cl.setCases(); //Updates the total  amount of cases of this class
			school = School.findSchool(t.getSchoolid()); //The position of school in the array list that includes all schools
			School.addCaseInSchool(school); //Adds the new case in the school of the teacher
			Hospital.findHospital(t.getSchoolid()); //Looks for a hospital nearby
			gender = t.getGender(); //Saves the gender for statistical purposes
		    c = new Case(id, dd, gender); //Creates a Case object
		    c.addNewCase(); //Add the new case in the array list
		}
		JOptionPane.showMessageDialog(null, "Case succesfully added to database.");
	}
	
	/* This method adds a case in the array list of cases. */
	
	public void addNewCase() {
	    if (gender.equalsIgnoreCase("Man")) {
			men ++;
		} else if (gender.equalsIgnoreCase("Woman")){
			women ++;
		}
	    numOfCases ++;
	}
	
	/* This method finds a case in the array list of cases. */
	
	public static Case findPreviousCase(int idofcase) {
		int i = 0;
		boolean flag = false;
		int position = -1;
		while (i < totalCasesList.size() && flag == false ); {
	             if (totalCasesList.get(i).idOfCase == idofcase) {
				flag = true;
				position = i; 
			}
			i ++;
		}
		if (flag == true) {
			return totalCasesList.get(position);
		} else {
			return null;
		}
		
	}
}
