import java.util.ArrayList;

public class Teacher {
	 
	private String surname;
	private String name;
	private int id;
	private int schoolid;
	private String phonenumber;
	private String gender;
	private String status = "negative"; //to check if a teacher is infected with covid-19
	protected static ArrayList <Teacher> allteachers = new ArrayList<Teacher>();
	
	public Teacher(String surname, String name, int id, String phonenumber, String gender , int schoolid) {
		super();
		this.surname = surname;
		this.name = name;
		this.id = id;
		this.schoolid = schoolid;
		this.phonenumber = phonenumber;
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

	public void setSurname(String surname) {
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
		return schoolid;
	}
	
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		String s = "Teacher";
		return "Surname: " + surname + "\n Name: " + name + "\n ID: " + id + "\n COVID-19 Status: " + status;
	}
	
	public static Teacher findTeacher(int code) {
		boolean flag = false;
		int i = 0;
		int position = -1;
		while (i < allteachers.size() && flag == false) {
			if ( allteachers.get(i).getId() == code) {
				flag = true;
				position = i;
			}
			i++;
		}
		if (flag == true) {
			return allteachers.get(position);
		} else {
			return null;
		}
		
	}
	
	
	

}
