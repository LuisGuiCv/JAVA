

public class Student {
	 private String firstName;
     private String lastName;
     private int registration;
     private int grade;
     private int year;
     public Student(String firstName, String lastName, int registration, int grade, int year) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.registration = registration;
			this.grade = grade;
			this.year = year;}

	public static void main(String[] args) {
		Student student1= new Student("Luis","Guillermo",2017,80,3);
		System.out.println(student1.isApproved());
		student1.printFullName();
		student1.changeYearIfApproved();

	}
	public void printFullName(){
	      System.out.println(firstName+" "+lastName);
	   }

	   public boolean isApproved(){
		   if(grade>=60) {
			   return true;
		   }else {
			   return false;
		   }
	       //TODO implement: should return true if grade >= 60
	   }

	   public int changeYearIfApproved(){
		   if(grade>=60) {
			   System.out.println("Congratulations");
			    return year=year+1;
		   }else {
			   System.out.println("failed");
			   return year;
		   }
	       //TODO implement: should return true if grade >= 60
	   }
	       
	   }

