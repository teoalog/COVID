package covid;

import java.util.ArrayList;

public class Class {
    static int k1 = 0;
    static int k2 = 0;
    protected ArrayList<Student> students = new ArrayList<Student>();
    protected ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private int id;
    private int cases = 0;
    private String name;
    protected static ArrayList<Class> allClasses = new ArrayList<Class>();

    public Class (int id, String name) {
        super();
        this.id = id;
        this.name = name;
        allClasses.add(this);
        for (int i = k1; i < k1 + 5; i++) { //Assign groups of 5 students to each class (first 5 in the 1st class, second 5 in the 2nd etc.)
            students.add(Student.allstudents.get(i));
        }
        k1 +=5;
        for (int j = k2; j < k2 + 2; j++) { //Assign groups of 2 teachers to each class (first 2 in the 1st class, second 2 in the 2nd etc.)
            teachers.add(Teacher.allteachers.get(j));
        }
        k2 += 2;
    }

    public void setCases() {
        for (Student student : students) {
            if (student.getStatus().contentEquals("positive")) {
                cases++;
            }
        }
        for (Teacher teacher : teachers) {
            if (teacher.getStatus().contentEquals("positive")) {
                cases++;
            }
        }
    }

    public int getCases() {
        return cases;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Class: " + id;
    }

    /* This method returns a Class object.
     * The student who was diagnosed with COVID-19
     * belongs to this class. */
    public static Class findClass(Student s)	{
        int i = 0;
        while (i < allClasses.size()) {
            int j = 0;
            while (j < allClasses.get(i).students.size()) {
                if (allClasses.get(i).students.get(j).equals(s)) {
                    return allClasses.get(i);
                }
                j ++;
            }
            i ++;
        }
        return null;
    }

    /* This method returns a Class object
     * The teacher who was diagnosed with COVID-19
     * teaches in this class.
     */
    public static Class findClass(Teacher t) {
        int i = 0;
        while (i < allClasses.size()) {
            int j = 0;
            while (j < allClasses.get(i).teachers.size()) {
                if (allClasses.get(i).teachers.get(j).equals(t)) {
                    return allClasses.get(i);
                }
                j ++;
            }
            i ++;
        }
        return null;
    }
}
