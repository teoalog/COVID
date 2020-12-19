package src.main.java.com.myteam.covidproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Case {
	
	public static ArrayList<Case> totalcasesList = new ArrayList<Case>();
	int numofcases = 0;
	int girls = 0;
	int boys = 0;
	private int idofcase;
	private LocalDate date;
	private String gender;
	
	public Case(int idofcase, LocalDate date, String gender) {
		this.idofcase = idofcase;
		this.date = date;
		this.gender = gender;
		totalcasesList.add(this);
		numofcases ++;
	}
	
	public int getId() {
		return idofcase;
	}
	
	public void setId(int idofcase) {
		this.idofcase =idofcase;
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
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return idofcase + " " + date + " " + gender;
	}
	public static void readOption() {
		int cont = 1;
		int id = 0;
		LocalDate d;
		Scanner scanner = new Scanner(System.in);
		
		while (cont!=0){
		System.out.println("Πατηστε 1 για μαθητη και 2 για καθηγητη");
		cont = scanner.nextInt();
		
		switch(cont){
		case 0:
			break;
		case 1:
			System.out.println("Παρακαλω δωστε το id του μαθητη");
			id = scanner.nextInt();
			d =  LocalDate.now();
			Student s = Student.findStudent(id); //This is the Student Object which refers to our case
			s.setStatus("positive");//Changing student's status
			Class cl = Class.findClass(s);//This is the Class Object which refers to our student's class
		    cl.setCases(); //updates the total  amount of cases of this class
			int school = School.findSchool(s.getSchoolid()); //The position of school in the array list that includes all schools
			School.addCaseInSchool(school);
			Hospital.findHospital(s.getSchoolid()); //Looks for a near hospital
			String g = s.getGender();
			Case c = new Case(id, d, g); //Creates a Case object
			c.addNewCase(); //Add the new case in the array list
			
			break;
		case 2:
			System.out.println("Παρακαλω δωστε το id του καθηγητη");
			d = LocalDate.now();
			id = scanner.nextInt();
			Teacher t = Teacher.findTeacher(id);//This is the Teacher Object which refers to our case
			t.setStatus("positive");//Changing teacher's status
			cl = Class.findClass(t);//This is the Class Object which refers to our teacher's class
			cl.setCases();//updates the total  amount of cases of this class
			school = School.findSchool(t.getSchoolid());//The position of school in the array list that includes all schools
			School.addCaseInSchool(school);
			Hospital.findHospital(t.getSchoolid());//Looks for a near hospital
			g = t.getGender();
		    c = new Case(id, d, g);//Creates a Case object
		    c.addNewCase(); //Add the new case in the array list
			break;
		default:
			System.out.println("Λαθος καταχωρηση");
		}
	
	    }

	}
	
	//This method adds a case in the cases array list
	
	public void addNewCase() {
	    if (gender.equalsIgnoreCase("Boy")) {
			boys ++;
		} else {
			girls ++;
		}
	    numofcases ++;
	}
	
}