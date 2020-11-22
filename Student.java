package covid;

public class Student {
	private String surnmae;
	private String name;
	private int id;
	private int parentphone;
	private String gender;
	private String status = "negative";
	static int count=0;
	
	public Student(String surnmae, String name, int parentphone , String gender) {
		super();
		count++;
		this.id = count;
		this.surnmae = surnmae;
		this.name = name;
		this.parentphone = parentphone;
		this.gender = gender;
		
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public String getSurnmae() {
		return surnmae;
	}

	public void setSurnmae(String surnmae) {
		this.surnmae = surnmae;
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

	public int getParentphone() {
		return parentphone;
	}

	public void setParentphone(int parentphone) {
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
		return "Student [surnmae=" + surnmae + ", name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	

}
