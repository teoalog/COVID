/*
 * Case
 *
 * Copyright 2020 Informaniacs/Athens University of Economics and Business (AUEB)
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void setId(int idOfCase) {
		this.idOfCase =idOfCase;
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
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following fields: \nStudent ID: ",
					"New Case", JOptionPane.INFORMATION_MESSAGE));
			dd = LocalDate.now();
			Student st = Student.findStudent(id); //This is the Student Object which refers to our case
			st.setStatus("positive");//Changing student's status
			cl = Class.findClass(st);//This is the Class Object which refers to our student's class
		    cl.setCases(); //updates the total  amount of cases of this class
			school = School.findSchool(st.getSchoolid()); //The position of school in the array list that includes all schools
			School.addCaseInSchool(school);
			Hospital.findHospital(st.getSchoolid()); //Looks for a near hospital
			gender = st.getGender();
			c = new Case(id, dd, gender); //Creates a Case object
			c.addNewCase(); //Add the new case in the array list
		} else {
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following fields: \nTeacher ID: ",
					"New Case", JOptionPane.INFORMATION_MESSAGE));
			dd = LocalDate.now();
			Teacher t = Teacher.findTeacher(id);//This is the Teacher Object which refers to our case
			t.setStatus("positive");//Changing teacher's status
			cl = Class.findClass(t);//This is the Class Object which refers to our teacher's class
			cl.setCases();//updates the total  amount of cases of this class
			school = School.findSchool(t.getSchoolid());//The position of school in the array list that includes all schools
			School.addCaseInSchool(school);
			Hospital.findHospital(t.getSchoolid());//Looks for a near hospital
			gender = t.getGender();
		    c = new Case(id, dd, gender);//Creates a Case object
		    c.addNewCase(); //Add the new case in the array list
		}
		JOptionPane.showMessageDialog(null, "Case succesfully added to database.");
	}
	
	//This method adds a case in the cases array list
	
	public void addNewCase() {
	    if (gender.equalsIgnoreCase("Man")) {
			men ++;
		} else if (gender.equalsIgnoreCase("Woman")){
			women ++;
		}
	    numOfCases ++;
	}
	
}