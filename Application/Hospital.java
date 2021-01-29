package covid;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Hospital {

    private String nameOfHospital;
    private final String area;
    protected static ArrayList<Hospital> allHospitals = new ArrayList<Hospital>(); /* all hospitals are saved in an ArrayList */

    public Hospital (String nameOfHospital, String area) {
        this.nameOfHospital = nameOfHospital;
        this.area =  area;
        allHospitals.add(this);
    }

    public void setNameOfHospital(String name) {
        nameOfHospital = name;
    }

    public String toString() {
        return "Hospital name: " + nameOfHospital + "/nArea: " + area;
    }

    public static void getAllHospitals() {
        for (Hospital allHospital : allHospitals) {
            JOptionPane.showMessageDialog(null, allHospital.toString());
        }
    }

    /* Finds the nearest hospital for the patient, getting the School ID as a parameter. */
    public static Hospital findHospital(int schoolid) {
        boolean flag = false;
        int position = -1;
        for	(int i = 0; i < allHospitals.size(); i++) {
            if (allHospitals.get(i).area.equals(School.allschools.get(schoolid).getArea())) {
                flag = true;
                position = i;
            }
        }
        if (flag) {
            return allHospitals.get(position);
        } else {
            return null;
        }
    }
}
