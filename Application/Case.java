package covid;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Case {

    private int idOfCase;
    private LocalDate date;
    private String gender;

    private static int identification; //static variable to be used by Mail class

    public static ArrayList<Case> totalCasesList = new ArrayList<Case>();

    int numOfCases = 0;
    int women = 0;
    int men = 0;

    public Case (int idOfCase, LocalDate date, String gender) {
        this.idOfCase = idOfCase;
        this.date = date;
        this.gender = gender;
        totalCasesList.add(this);
        numOfCases++;
    }

    public static int getIdentification() {
        return identification;
    }

    public String toString() {
        return "ID of Case: " + idOfCase + "\nGender: " + gender + "\nDate: " + date;
    }

    public static void getAllcases() {
        for (Case aCase : totalCasesList) {
            JOptionPane.showMessageDialog(null, aCase.toString());
        }
    }

    /* Takes a Student or Teacher object as a parameter and after checking which has been given, adds a new Case properly. */
    public static void readOption(Object s) {
        int id;
        LocalDate dd;
        String gender;
        int school;
        Class cl;
        Case c;
        if (s.equals("Student")) {
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following field: \nStudent ID: ",
                    "New Case", JOptionPane.INFORMATION_MESSAGE));
            dd = LocalDate.now();
            Student st = Student.findStudent(id); //This is the Student Object which refers to our case
            st.setStatus("positive"); //Changing student's status
            cl = Class.findClass(st); //This is the Class Object which refers to our student's class
            cl.setCases(); //Updates the total amount of cases in this class
            school = School.findSchool(st.getSchoolid()); //The position of school in the array list that includes all schools
            School.addCaseInSchool(school); //Adds the new case in the school of the student
            Hospital.findHospital(st.getSchoolid()); //Looks for a hospital nearby
            gender = st.getGender(); //Saves the gender for possible statistical purposes
            c = new Case(id, dd, gender); //Creates a Case object
            c.addNewCase(); //Adds the new case in the array list
            identification = id;
            JOptionPane.showMessageDialog(null, "Case successfully added to database.");
        } else {
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Please fill in the following field: \nTeacher ID: ",
                    "New Case", JOptionPane.INFORMATION_MESSAGE));
            dd = LocalDate.now();
            Teacher t = Teacher.findTeacher(id); //This is the Teacher Object which refers to our case
            t.setStatus("positive"); //Changing teacher's status
            cl = Class.findClass(t); //This is the Class Object which refers to our teacher's class
            cl.setCases(); //Updates the total  amount of cases in this class
            school = School.findSchool(t.getSchoolid()); //The position of school in the array list that includes all schools
            School.addCaseInSchool(school); //Adds the new case in the school of the teacher
            Hospital.findHospital(t.getSchoolid()); //Looks for a hospital nearby
            gender = t.getGender(); //Saves the gender for possible statistical purposes
            c = new Case(id, dd, gender); //Creates a Case object
            c.addNewCase(); //Adds the new case in the array list
            JOptionPane.showMessageDialog(null, "Case successfully added to database.");
            identification = id;
        }
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
        while (i < totalCasesList.size() && !flag) {
            if (totalCasesList.get(i).idOfCase == idofcase) {
                flag = true;
                position = i;
            }
            i ++;
        }
        if (flag) {
            return totalCasesList.get(position);
        } else {
            return null;
        }
    }
}
