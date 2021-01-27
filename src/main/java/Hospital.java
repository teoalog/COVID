package covid;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Hospital {

	private String nameOfHospital;
	private String area;
	private static int count; /*counts the number of hospitals*/
	protected static ArrayList<Hospital> allHospitals = new ArrayList<Hospital>(); /*all hospitals are saved in an ArrayList*/
	
	public Hospital(String nameOfHospital, String area) {
		this.nameOfHospital = nameOfHospital;
		this.area =  area;
		allHospitals.add(this);
		count++;
	}
	 
	public String getNameOfHospital() {
		return nameOfHospital;
	}
	
	public String getArea() {
		return area;
	}
	
	public String toString() {
		return nameOfHospital + " " + area;
	}
	
	public static void getAllHospitals() {
		for (int i = 0; i < allHospitals.size(); i++) {
			JOptionPane.showMessageDialog(null, allHospitals.get(i).toString());
		}
	}
	
	/* Finds the nearest hospital for the patient getting the Schhol ID as a parameter. */
	public static Hospital findHospital(int schoolid) {
		boolean flag = false;
		int position = -1;
		for	(int i = 0; i < allHospitals.size(); i++) {
			if (allHospitals.get(i).area.equals(School.allschools.get(schoolid).getArea())) {
				flag = true;
				position = i;
			}
		}	
		if (flag == false) {
			return null;
		} else {
			return allHospitals.get(position);
		}
	}
}
