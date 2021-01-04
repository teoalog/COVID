import java.util.ArrayList;

public class Grade {
	
	private int id;
	private int cases=0; // �� ��������� ���� �����.
	protected ArrayList<java.lang.Class> classes = new ArrayList<java.lang.Class>(); // �� ������� ��� ���� ��� ���� ������������� �� list
	protected static ArrayList<Grade> allgrades = new ArrayList<Grade>();
	
	
	public Grade(int id) {
		super();
		this.id = id;
		allgrades.add(this);
	}

	public int getCases() {
		return cases;
	}
	
	public void setCases(java.lang.Class classes[]) { //������� �� �� ��������� ���� �������� �������
		                                   //�� �������� ��������� ��� �����.
		for(int i=0; i<classes.length; i++) {
			cases = cases + classes[i].getCases();
		}
	}

	public int getId() {
		return id;
	}

	public void setName(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String s = "Grade";
		return "ID: " + id + "/n Cases: " + cases;
	}
	
	
	
    
	
	
	

}
