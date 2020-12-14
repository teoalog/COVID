package src.main.java.com.myteam.covidproject;

import java.util.ArrayList;
public class Hospital {

	private String nameofhospital;
	private char area;
	protected static ArrayList<Hospital> allhospitals = new ArrayList<Hospital>(); /*all hospitals are saved in an array list*/
	private static int count; /*counts the number of hospitals*/
	
	public Hospital(String nameofhospital, char area) {
		this.nameofhospital = nameofhospital;
		this.area =  area;
		allhospitals.set(count, this);
		count++;
	}
	 
	public String getNameofhospital() {
		return nameofhospital;
	}
	
	public void setNameofhospital() {
		this.nameofhospital = nameofhospital;
	}
	
	public char getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = area;
	}
	
	public String toString() {
		return nameofhospital + " " + area;
	}
	
	/*finds the nearest hospital for the patient*/
	public static void findHospital(int schoolid) {
		boolean flag = false;
	for	(int i = 0; i < allhospitals.size(); i++) {
		if (allhospitals.get(i).area == School.allschools.get(schoolid).getArea()) {
			System.out.println("Το όνομα του νοσοκομείου αναφοράς στο δήμο σας είναι: " + allhospitals.get(i).nameofhospital);
			flag = true;
		}
	}	
	if (flag == true) {
		System.out.println("Δεν υπάρχει νοσοκομείο αναφοράς στο δήμο που βρίσκεται το σχολείο σας");
	}
	}
}
