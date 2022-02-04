package collecciones;

public class Main {

	 public static void main( String[] args )
	    {
	        CourseService courseService = new CourseService();

	        String courseId = "math_01";
	        String studentId = "120120";
	        courseService.displayCourseInformation( courseId );
	        courseService.displayStudentInformation( studentId);

	        courseService.enrollStudent( studentId, courseId );
	         courseId = "biol_01";
	        courseService.enrollStudent( studentId, courseId );
	        courseService.displayStudentInformation( studentId);

	        courseService.displayCourseInformation(courseId);
	        
	        courseService.unEnrollStudent( studentId, courseId );
	        courseService.displayStudentInformation( studentId);
	    }

}
