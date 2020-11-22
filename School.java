package covid;

public class School {
	
	private String name;
	private String region;
	protected Grade grades[] = new Grade[100];
	private int cases=0;
	
	
	
	public School(String name, String region) {
		super();
		this.name = name;
		this.region = region;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public int getCases() {
		return cases;
	}
	
	public void setCases(Grade grades[]) {
		for(int i=0; i<grades.length; i++) {
			cases = cases + grades[i].getCases();
		}		
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", region=" + region + ", cases=" + cases + "]";
	}
	
	

}
