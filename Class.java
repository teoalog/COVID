package covid;

public class Class {
	
	protected Student students[] = new Student[100];
	protected Teacher teachers[] = new Teacher[100];
	private Grade grade;
	private int number;
	private int cases=0;
	
	public Class(Grade grade, int number) {
		super();
		this.grade = grade;
		this.number = number;
	}

	public void setCases(Student students[] ,Teacher teachers[]) {
		for(int i=0; i<students.length; i++) {
			if (students[i].getStatus().contentEquals("positive")) {
				cases++;
			}
		}
		for(int i=0; i<teachers.length; i++) {
			if( teachers[i].getStatus().contentEquals("positive")) {
				cases++;
			}
		}		
	}

	public int getCases() {
		return cases;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Class [grade=" + grade + ", number=" + number + ", cases=" + cases + "]";
	}
	
	

}
