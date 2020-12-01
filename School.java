
public class School {
	public int casesinschool = 0;
	public char  area;
	public String nameofschool;
	public static School[] allschools = new School[100000];
	private static int count; /*Mετρέι τα σχολεία*/
	public int schoolid;
	public Student[] allstudents = new Student[10000];
	public Teacher[] faculty = new Teacher[70];
	public static boolean schoolisclosed = false;
	
        /*Κατασκευαστής αντικειμένων School* / 	
	
	public School(char area, String nameofschool, Class classes, Teacher faculty, int casesinaschool, Student[] allstudents, boolean schoolisclosed) {
		this.area = area;
		this.nameofschool = nameofschool;
		classes = new Class[30];
		this.faculty = faculty;
		this.allstudents = allstudents;
		this.schoolisclosed = schoolisclosed;
		allschools[count] = this;
		count ++;
	}

	/*Μέθοδος εύρεσης σχολείου στο οποίο φοιτά ή εργάζεται το κρούσμα*/
	
	public static int findSchool(int code) {
		int i = 0;
		boolean flag = false;
		while (i < allschools.length && flag == false ); {
			if (allschools[i].schoolid == code) {
				flag = true;
				return i;
			}
			i ++;
		}
		
			
	}
	
	/*Μέθοδος εύρεσης μαθητή-κρούσματος*/
	
	public static Student findStudent(int x, int amka) {
		int i = 0;
		boolean flag = false;
		while (i < allschools[x].allstudents.length && flag == false ); {
			if (allschools[x].allstudents[i].amka == amka) {
				flag = true;
				return allschools[x].allstudents[i];
			}
			i ++;
		}
		
			
	}
	
	/*Μέθοδος εύρεσης καθηγητή-κρούσματος*/
	
	public static Teacher findTeacher(int x, int amka) {
		int i = 0;
		boolean flag = false;
		while (i < allschools[x].faculty.length && flag == false ); {
			if (allschools[x].faculty[i].amka == amka) {
				flag = true;
				return allschools[x].faculty[i];
			}
			i ++;
		}
		
			
	}
	
	/*Μέθοδος που αυξάνει τα συνολικά κρούσματα στο σχολείο και*/ 
	
	public static void addCaseInSchool(int x) {
		allschools[x].casesinschool ++;
		if (allschools[x].casesinschool > 6) {  /*Συνθήκη που καθαρίζει αν θα κλείσει το σχολείο*/
			schoolisclosed = true;
			
		}
		
	} 
