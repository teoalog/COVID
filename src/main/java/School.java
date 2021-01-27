package covid;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class School {
    private int casesinschool = 0;
    private String area;
    private String nameofschool;
    private static int count;
    private int schoolid;
    private static boolean schoolisclosed = false;
    private String password;
    private static int k = 0;
    protected static ArrayList <Student> allstudents = new ArrayList <Student>();
    protected static ArrayList <Teacher> faculty = new ArrayList <Teacher>();
    protected static ArrayList<Class> classes = new ArrayList<Class>();
    protected ArrayList<LocalDate> datesofcases = new ArrayList<LocalDate>();
    public static ArrayList<School> allschools = new ArrayList<School>();
    public static ArrayList<String> allpasswords = new ArrayList<String>();

    public School(int schoolid, String area, String nameofschool, int casesinaschool, String password) {
        this.schoolid = schoolid;
        this.area = area;
        this.nameofschool = nameofschool;
        this.casesinschool = casesinschool;
        this.password = password;
        allschools.add(this);
        allpasswords.add(password);
        count++;
        for (int i = k; i < k + 3; i++) {
            classes.add(Class.allclasses.get(i));
        }
        k += 3;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCasesinschool() {
        return casesinschool;
    }

    public void setCasesinschool(int casesinschool) {
        this.casesinschool = casesinschool;
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

    public void setSchoolisclosed(boolean schoolisclosed) {
        this.schoolisclosed = schoolisclosed;
    }

    public String toString() {
        String s = "School";
        return "Name: " + nameofschool + "\nArea: " + area + "\nSchool ID: " + schoolid + "Status of School: " + schoolisclosed;
    }

    public static void getAllschools() {
        for (int i = 0; i < allschools.size(); i++) {
            JOptionPane.showMessageDialog(null, allschools.get(i).toString());
        }
    }

    /*This method finds in which school the student/teacher who was diagnosed with COVID-19 goes/works */

    public static int findSchool(int sid) {
        int i = 0;
        boolean flag = false;
        while (i < allschools.size() && flag == false) {
            if (allschools.get(i).schoolid == sid) {
                flag = true;
                return i;
            }
            i++;
        }
        if (flag == false); {
            return -1;
        }
    }

    /*This method removes the inactive cases of a school from the array list. */
    public static void checkDates(int id) {
        boolean flag = false;
        int i = 0;
        LocalDate date = LocalDate.now();
        while (i < allschools.size() && flag == false) {
            if (allschools.get(i).schoolid == id) {
                for (int j = 0; j < allschools.get(i).datesofcases.size(); j++) {
                    if (date.compareTo(allschools.get(i).datesofcases.get(j)) > 14) {
                        allschools.get(i).datesofcases.remove(j);
                        allschools.get(i).casesinschool = allschools.get(i).casesinschool - 1;
                    }
                }
                flag = true;
            }
            i ++;
        }

    }

    /*This method increases the total amount of cases in a school. */
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
