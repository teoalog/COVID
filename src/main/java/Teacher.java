import java.util.ArrayList;

public class Teacher {
	 
	private String surname;
	private String name;
	private int id;
	private String phonenumber;
	private String gender;
	private String status = "negative"; //����������� �� �� ���� ��������� ���� ������.
	protected static ArrayList <Teacher> allteachers = new ArrayList<Teacher>();
	
	public Teacher(String surname, String name, int id, String phonenumber, String gender) {
		super();
		this.surname = surname;
		this.name = name;
		this.id = id;
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
		return "Teacher [surname=" + surname + ", name=" + name + ", id=" + id + ", status=" + status +"]";
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
