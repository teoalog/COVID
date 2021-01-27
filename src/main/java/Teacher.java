package covid;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teacher {

    private String surname;
    private String name;
    private int id;
    private int schoolid;
    private String phonenumber;
    private String email;
    private String gender;
    private String status = "negative"; //to check if a teacher is infected with covid-19
    protected static ArrayList <Teacher> allteachers = new ArrayList<Teacher>();

    public Teacher(int id,String surname, String name, String gender, String phonenumber, String email, int schoolid) {
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

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String s = "Teacher";
        return "Surname: " + surname + "\nName: " + name + "\nID: " + id + "\nCOVID-19 Status: " + status + "\n";
    }

    public static void getAllteachers() {
        for (int i = 0; i < allteachers.size(); i++) {
            JOptionPane.showMessageDialog(null, allteachers.get(i).toString());
        }
    }

    /* This method finds a Teacher by searching using the Teacher ID that it gets as a parameter. */
    public static Teacher findTeacher(int code) {
        boolean flag = false;
        int i = 0;
        int position = -1;
        while (i < allteachers.size() && flag == false) {
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
