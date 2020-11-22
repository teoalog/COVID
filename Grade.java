package covid;

public class Grade {
	
	private String name;
	private int cases=0;
	protected Class classes[] = new Class[100];
	
	
	public Grade(String name) {
		super();
		this.name = name;
	}

	public int getCases() {
		return cases;
	}
	
	public void setCases(Class classes[]) {
		for(int i=0; i<classes.length; i++) {
			cases = cases + classes[i].getCases();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", cases=" + cases + "]";
	}
	
	
	
    
	
	
	

}
