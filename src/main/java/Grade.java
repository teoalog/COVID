import java.util.ArrayList;

public class Grade {
	
	private int id;
	private int cases=0; // the active cases of covid in this grade
	protected ArrayList<Class> classes = new ArrayList<Class>(); // a list with the classes each grade has.
	protected static ArrayList<Grade> allgrades = new ArrayList<Grade>();
	
	
	public Grade(int id) {
		super();
		this.id = id;
		allgrades.add(this);
	}

	public int getCases() {
		return cases;
	}
	
	public void setCases() {
		for(int i = 0; i < classes.size(); i++) {
			cases += classes.get(i).getCases();
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
