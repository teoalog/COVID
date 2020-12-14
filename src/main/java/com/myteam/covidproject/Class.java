package src.main.java.com.myteam.covidproject;

import java.util.ArrayList;

public class Class {
	
	protected ArrayList<Student> students = new ArrayList<Student>();  // ���� ������� ��� ����� �� ��� �����
	                                                 //������������� �� list.
	protected ArrayList<Teacher> teachers = new ArrayList<Teacher>();  // ���� �������� ��� �������� �� ��� �����	                                                 // ������������� �� ������.
	private int id ;
	private int cases=0; //�� ��������� ���� ��������.
	protected static ArrayList<Class> allclasses = new ArrayList<Class>();
	
	public Class( int id) {
		super();
		this.id = id;
		allclasses.add(this);
	}

	public void setCases(Student students[] ,Teacher teachers[]) { //������� �� �� status ��� ���� ������ 
		                                                           //� �������� ������� �� ��������� ��� ��������.
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

		
	public int getId() {
		return id;
	}

	public void setName(int id) {
		this.id = id;
	}
	
		@Override
	public String toString() {
		return "Class [id=" + id + "]";
	}
		
			
		

	
			
	

}
