package src.main.java;

import java.util.ArrayList;

public class Student {
	private String surname;
	private String name;
	private int id;
	private String parentphone;
	private String gender;
	private String status = "negative"; //������������ ��� ��� �� ���� ���� ������� covid-19.
	protected static ArrayList<Student> allstudents = new ArrayList<Student> ();
	
	
	public Student(String surname, String name ,int id, String parentphone , String gender ) {
		super();
		this.surname = surname;
		this.name = name;
		this.id = id;
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
		return "Student [surname=" + surname + ", name=" + name + ", id=" + id + ", status=" + status + "]";
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
