package covid;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teacher {

    private final String surname;
    private final String name;
    private int id;
    private final int schoolid;
    private String phonenumber;
    private String email;
    private final String gender;
    private String status = "negative"; //to check if a teacher is infected with COVID-19
    protected static ArrayList <Teacher> allteachers = new ArrayList<Teacher>();

    public Teacher (int id,String surname, String name, String gender, String phonenumber, String email, int schoolid) {
        super();
        this.surname = surname;
        this.name = name;
        this.id = id;
        this.schoolid = schoolid;
        this.phonenumber = phonenumber;
        this.email = email;
        this.gender = gender;
        allteachers.add(this);
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
        return schoolid;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + "\nName: " + name + "\nID: " + id + "\nCOVID-19 Status: " + status;
    }

    public static void getAllteachers() {
        for (Teacher allteacher : allteachers) {
            JOptionPane.showMessageDialog(null, allteacher.toString());
        }
    }

    /* Finds a Teacher by using the Teacher ID it gets as a parameter. */
    public static Teacher findTeacher(int code) {
        boolean flag = false;
        int i = 0;
        int position = -1;
        while (i < allteachers.size() && !flag) {
            if (allteachers.get(i).getId() == code) {
                flag = true;
                position = i;
            }
            i++;
        }
        if (flag) {
            return allteachers.get(position);
        } else {
            return null;
        }

    }
}
