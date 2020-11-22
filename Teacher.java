package covid;

public class Teacher {
	 
	private String surname;
	private String name;
	private int id;
	protected Class classes[] = new Class [100];
	private int phonenumber;
	private String gender;
	private String status = "negative";
	
	public Teacher(String surname, String name, int id, int phonenumber, String gender) {
		super();
		this.surname = surname;
		this.name = name;
		this.id = id;
		this.phonenumber = phonenumber;
		this.gender = gender;
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

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
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
		return "Teacher [surname=" + surname + ", name=" + name + ", id=" + id + "]";
	}
	
	
	

}
