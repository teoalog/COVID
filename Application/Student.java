package covid;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Student {
    private final String surname;
    private final String name;
    private final int id;
    private int schoolid;
    private String parentphone;
    private String email;
    private final String gender;
    /* This variable checks if a student is infected with COVID-19.
     * Initially every student registered is negative, but if found positive for COVID-19 the status changes.
     */
    private String status = "negative";
    protected static ArrayList<Student> allstudents = new ArrayList<Student> ();


    public Student (int id, String surname, String name, String gender, String parentphone, String email, int schoolid) {
        super();
        this.surname = surname;
        this.name = name;
        this.id = id;
        this.schoolid = schoolid;
        this.parentphone = parentphone;
        this.email = email;
        this.gender = gender;
        allstudents.add(this);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getSchoolid() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + "\n" + "Name: " + name + "\n" + "ID: " + id + "\n" + "COVID-19 Status: " + status;
    }

    /* Returns all Students' information in a JPane window */
    public static void getAllstudents() {
        for (Student allstudent : allstudents) {
            JOptionPane.showMessageDialog(null, allstudent.toString());
        }
    }

    /* Finds a Student, using the Student ID it gets as a parameter. */
    public static Student findStudent(int code) {
        boolean flag = false;
        int i = 0;
        int position = -1;
        while (i < allstudents.size() && !flag) {
            if (allstudents.get(i).getId() == code) {
                flag = true;
                position = i;
            }
            i++;
        }
        if (flag) {
            return allstudents.get(position);
        } else {
            return null;
        }
    }
}
