
import java.util.ArrayList;
import java.time.LocalDate;

public class School {
	public static ArrayList<School> allschools = new ArrayList<School>();
	private int casesinschool = 0;
	private char  area;
	private String nameofschool;
	protected static ArrayList <Student> allstudents = new ArrayList <Student>();
	protected static ArrayList <Teacher> faculty = new ArrayList <Teacher>();
	private static int count;
	private int schoolid;
	private static boolean schoolisclosed = false;
	protected ArrayList<LocalDate> datesofcases = new ArrayList<LocalDate>();
	
	//Constructor of School objects
	
	public School(char area, String nameofschool, ArrayList<Student> allstudents,  
			ArrayList<Teacher> faculty, int casesinaschool, boolean schoolisclosed, ArrayList datesofcases) {
		this.area = area;
		this.nameofschool = nameofschool;
		this.allstudents = allstudents;
		this.faculty = faculty;
		this.schoolisclosed = schoolisclosed;
		this.casesinschool = casesinschool;
		this.datesofcases = datesofcases;
		allschools.set(count, this);
		count ++;
	}
	
	public int getCasesinschool() {
		return casesinschool;
	}
	
	public void setCasesinschool(int casesinschool) {
		this.casesinschool = casesinschool;
	}

	public char getArea() {
		return area;
	}
	
	public void setArea(char area) {
		this.area = area;
	}
	
	public String getNameofschool() {
		return nameofschool;
	}
	
	public void setNameofschool(String nameofschool) {
		this.nameofschool = nameofschool;
	}
	
	public int getSchoolid() {
		return schoolid;
	}
	
	public void setSchoolid(int schoolid) {
		this.schoolid =schoolid;
	}
	
	public boolean getSchoolisclosed() {
		return schoolisclosed;
	}
	
	public void setSchoolisclosed(boolean schoolisclosed) {
		this.schoolisclosed = schoolisclosed;
	}
	
	public String toString() {
		return area + " " + nameofschool + " " + schoolid + " " + schoolisclosed;
	}
	
	/*This method finds in which school the student/teacher
	 * who was diagnosed with covid studies/works
	 */
	
	public static int findSchool(int sid) {
		int i = 0;
		boolean flag = false;
		while (i < allschools.size() && flag == false ); {
	             if (allschools.get(i).schoolid == sid) {
				flag = true;
				return i;
			}
			i ++;
		}
		if (flag == false); {
			return -1;
		}
	}
	
	/*This method removes the inactive cases of a school
	 * from the array list
	 */
	public static void checkDates(int id) {
		boolean flag = false;
		int i = 0;
		LocalDate date = LocalDate.now();
		while (i < allschools.size() && flag == false) {
			if (allschools.get(i).schoolid == id) {
				for (int j = 0; j < allschools.get(i).datesofcases.size(); j++) {
					if (date.compareTo(allschools.get(i).datesofcases.get(j)) > 14 ) {
						allschools.get(i).datesofcases.remove(j);
						allschools.get(i).casesinschool = allschools.get(i).casesinschool - 1;
					}
				}
				flag = true;
			}
			i ++;
		}
		
	}
	
	/*This method increases the total amount of
	 * cases in a school
	 */
	public static void addCaseInSchool(int x) {
		if (x != -1) {
		checkDates(allschools.get(x).schoolid);	
		allschools.get(x).casesinschool ++;
		allschools.get(x).datesofcases.add(LocalDate.now());
		if (allschools.get(x).casesinschool > 5) {
			schoolisclosed = true;
			}
		} 
	}	
}
