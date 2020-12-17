import java.util.ArrayList;

public class Class {
	
	protected ArrayList<Student> students = new ArrayList<Student>();  
	protected ArrayList<Teacher> teachers = new ArrayList<Teacher>();                                                  
	private int id ;
	private int cases = 0;
	private String name;
	protected static ArrayList<Class> allclasses = new ArrayList<Class>();
	
	public Class( int id, ArrayList students, ArrayList teachers, String name) {
		super();
		this.students = students;
		this.teachers = teachers;
		this.id = id;
		this.name = name;
		allclasses.add(this);
	}

	public void setCases() { 
		                                                           
		for(int i = 0; i < students.size(); i++) {
			if (students.get(i).getStatus().contentEquals("positive")) {
				cases++;
			}
		}
		for(int i = 0; i < teachers.size(); i++) {
			if( teachers.get(i).getStatus().contentEquals("positive")) {
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

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
		@Override
	public String toString() {
		return "Class [id=" + id + "]";
	}
	/*This method returns a Class object.
	 * The student who was diagnosed with covid
	 * belongs to this class.
	 */
			
	public static Class findClass(Student s)	{
		boolean flag = false;
		int i = 0;
		while (i < allclasses.size() && flag == false) {
			int j = 0;
			while(j < allclasses.get(i).students.size() && flag == false) {
				if (allclasses.get(i).students.get(j).equals(s)) {
					flag = true;
					return allclasses.get(i);
				}
				j ++;
			}
			i ++;
		}
		return null;
		
	}
	
	/*This method returns a Class object
	 * The teacher who was diagnosed with covid
	 * teaches in this class.
	 */
	
	public static Class findClass(Teacher t)	{
		boolean flag = false;
		int i = 0;
		while (i < allclasses.size() && flag == false) {
			int j = 0;
			while(j < allclasses.get(i).teachers.size() && flag == false) {
				if (allclasses.get(i).teachers.get(j).equals(t)) {
					flag = true;
					return allclasses.get(i);
				}
				j ++;
			}
			i ++;
		}
		return null;
		
	}

	
			
	

}

