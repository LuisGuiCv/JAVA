-0
-+
public class Courses {
	 private String CourseName;
     private String professorName;
     private int year;
     private String students[];
    
	public Courses(String courseName, String professorName, int year, String[] students) {
		super();
		CourseName = courseName;
		this.professorName = professorName;
		this.year = year;
		this.students = students;
	}

	public static void main(String[] args) {
		Courses curso1 = new Courses("java","Felipe Maqueda",2022,[]);
		
	}

}
