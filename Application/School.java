package covid;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class School {
    private int casesinschool = 0;
    private String area;
    private final String nameofschool;
    private final int schoolid;
    private static boolean schoolisclosed = false;
    private String password;
    private static int k = 0;
    protected static ArrayList <Student> allstudents = new ArrayList <Student>();
    protected static ArrayList <Teacher> faculty = new ArrayList <Teacher>();
    protected static ArrayList<Class> classes = new ArrayList<Class>();
    protected ArrayList<LocalDate> datesofcases = new ArrayList<LocalDate>();
    public static ArrayList<School> allschools = new ArrayList<School>();
    public static ArrayList<String> allpasswords = new ArrayList<String>();
    public static final int QUARANTINE_PERIOD = 14;

    public School (int schoolid, String area, String nameofschool, int casesinaschool, String password) {
        this.schoolid = schoolid;
        this.area = area;
        this.nameofschool = nameofschool;
        this.casesinschool = casesinaschool;
        this.password = password;
        allschools.add(this);
        allpasswords.add(password);
        for (int i = k; i < k + 3; i++) { //Adds classes to schools in groups of 3 (first 3 classes in 1st school, second 3 in 2nd school etc.)
            classes.add(Class.allClasses.get(i));
        }
        k += 3;
    }

    public String getArea() {
        return area;
    }

    public String getNameofschool() {
        return nameofschool;
    }

    public int getSchoolid() {
        return schoolid;
    }

    public boolean getSchoolisclosed() {
        return schoolisclosed;
    }

    public String toString() {
        return "Name: " + nameofschool + "\nArea: " + area + "\nSchool ID: " + schoolid + "\nStatus of School: " + schoolisclosed;
    }

    public static void getAllschools() {
        for (School allschool : allschools) {
            JOptionPane.showMessageDialog(null, allschool.toString());
        }
    }

    /* Finds in which school the student/teacher who was diagnosed with COVID-19 is */
    public static int findSchool(int sid) {
        int i = 0;
        while (i < allschools.size()) {
            if (allschools.get(i).schoolid == sid) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* Removes the inactive cases of a school from the array list. */
    public static void checkDates(int id) {
        boolean flag = false;
        int i = 0;
        LocalDate date = LocalDate.now();
        while (i < allschools.size() && !flag) {
            if (allschools.get(i).schoolid == id) {
                for (int j = 0; j < allschools.get(i).datesofcases.size(); j++) {
                    if (date.compareTo(allschools.get(i).datesofcases.get(j)) > QUARANTINE_PERIOD) { // if 14 days (quarantine period) have passed
                        allschools.get(i).datesofcases.remove(j);
                        allschools.get(i).casesinschool = allschools.get(i).casesinschool - 1;
                    }
                }
                flag = true;
            }
            i ++;
        }

    }

    /* Increases the total amount of cases in a school. */
    public static void addCaseInSchool(int x) {
        if (x != -1) {
            checkDates(allschools.get(x).schoolid);
            allschools.get(x).casesinschool++;
            allschools.get(x).datesofcases.add(LocalDate.now());
            if (allschools.get(x).casesinschool > 5) {
                schoolisclosed = true;
            }
        }
    }
}
