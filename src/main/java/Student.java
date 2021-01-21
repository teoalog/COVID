import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Student {
	private String surname;
	private String name;
	private int id;
	private int schoolid;
	private String parentphone;
	private String gender;
	/* This variable checks if a student is infected with COVID-19. 
	 * Initially every student registered is negative, but if found positive for COVID-19 the status changes. */
	private String status = "negative"; 
	protected static ArrayList<Student> allstudents = new ArrayList<Student> ();
	
	
	public Student(int id ,String surname, String name, String parentphone , String gender ,int schoolid) {
		super();
		this.surname = surname;
		this.name = name;
		this.id = id;
		this.schoolid = schoolid;
		this.parentphone = parentphone;
		this.gender = gender;
		allstudents.add(this);	
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
		return id;
	}
	
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

	public String getParentphone() {
		return parentphone;
	}
	
	public String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		String s = "Student";
		return "Surname: " + surname + "\n" + "Name: " + name + "\n" + "ID: " + id + "\n" + "COVID-19 Status: " + status + "\n";
	}

	/* Returns all Students' information in JPane window */
	public static void getAllstudents() {
		for (int i = 0; i < allstudents.size(); i++) {
			JOptionPane.showMessageDialog(null, allstudents.get(i).toString());
		}
	}

	/* This method finds a Student by searching using the Student ID that it gets as a parameter. */
	public static Student findStudent(int code) {
		boolean flag = false;
		int i = 0;
		int position = -1;
		while (i < allstudents.size() && flag == false) {
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
