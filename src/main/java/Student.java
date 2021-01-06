import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Student {
	private String surname;
	private String name;
	private int id;
	private int schoolid;
	private String parentphone;
	private String gender;
	private String status = "negative"; // to check if a student is infected with covid-19
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

	public void setSurnmae(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setParentphone(String parentphone) {
		this.parentphone = parentphone;
	} 
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String s = "Student";
		return "Surname: " + surname + "Name: " + name + "ID: " + id + "COVID-19 Status: " + status;
	}
	
	public static void getAllstudents() {
		for (int i = 0; i < allstudents.size(); i++) {
			JOptionPane.showMessageDialog(null, allstudents.get(i).toString());
		}
	}

	public static Student findStudent(int code) {
		boolean flag = false;
		int i = 0;
		int position = -1;
		while (i < allstudents.size() && flag == false) {
			if ( allstudents.get(i).getId() == code) {
				flag = true;
				position = i;
			}
			i++;
		}
		if (flag == true) {
		 return allstudents.get(position);
		} else {
			return null;
		}
	}
		
	
	
	
	
	
	
	

}
