import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public static void getAllhospitals() {
		for (int i = 0; i < allhospitals.size(); i++) {
			JOptionPane.showMessageDialog(null, allhospitals.get(i).toString());
		}
	}
	
	/* Finds the nearest hospital for the patient getting the Schhol ID as a parameter. */
	public static Hospital findHospital(int schoolid) {
		boolean flag = false;
		int position = -1;
		for	(int i = 0; i < allhospitals.size(); i++) {
			if (allhospitals.get(i).area == School.allschools.get(schoolid).getArea()) {
				flag = true;
				position = i;
			}
		}	
		if (flag == false) {
			return null;
		} else {
			return allhospitals.get(position);
		}
	}
}