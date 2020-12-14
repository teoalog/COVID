package src.main.java.com.myteam.covidproject;

public class School {
	public int casesinschool = 0;
	public char area;
	public String nameofschool;
	public static School[] allschools = new School[100000]; /*all schools are saved in an array*/
	private static int count; /*It shows the number of schools*/
	public int schoolid;
	public Student[] allstudents = new Student[10000]; /*all students of a school are saved in an array*/
	public Teacher[] faculty = new Teacher[70];/*all teachers of a school are saved in ana array*/
	public static boolean schoolisclosed = false; /*shows whether a school is closed or not*/


	public School(char area, String nameofschool, java.lang.Class classes, Teacher faculty, int casesinaschool, Student[] allstudents, boolean schoolisclosed) {
		this.area = area;
		this.nameofschool = nameofschool;
		classes = new java.lang.Class[30];
		this.faculty = faculty;
		this.allstudents = allstudents;
		this.schoolisclosed = schoolisclosed;
		allschools[count] = this;
		count++;
	}

	/*returns the school in which the case exists*/

	public static int findSchool(int code) {
		int i = 0;
		boolean flag = false;
		while (i < allschools.length && flag == false) ;
		{
			if (allschools[i].schoolid == code) {
				flag = true;
				return i;
			}
			i++;
		}


	}

	/*returns the student-case*/

	public static Student findStudent(int x, int amka) {
		int i = 0;
		boolean flag = false;
		while (i < allschools[x].allstudents.length && flag == false) ;
		{
			if (allschools[x].allstudents[i].amka == amka) {
				flag = true;
				return allschools[x].allstudents[i];
			}
			i++;
		}


	}

	/*returns the teacher-case*/

	public static Teacher findTeacher(int x, int amka) {
		int i = 0;
		boolean flag = false;
		while (i < allschools[x].faculty.length && flag == false) ;
		{
			if (allschools[x].faculty[i].amka == amka) {
				flag = true;
				return allschools[x].faculty[i];
			}
			i++;
		}


	}

	/*increases the total number of cases in a school*/

	public static void addCaseInSchool(int x) {
		allschools[x].casesinschool++;
		if (allschools[x].casesinschool > 6) {
			schoolisclosed = true;

		}

	}
}
