package object_oriented_menu_based_application_for_a_university;
import java.util.ArrayList;


public class Course implements IEnrollable {
		private String courseId;
	    private String courseTitle;
	    private double credit;
	    private int facultyId;
	    private ArrayList <AdvisingList> studentList;
	    private Driver driverClass;
	
		public Course(Driver driverClass) {
			this.driverClass = driverClass;
		}
		 
		public Course(ArrayList<AdvisingList> studentList){
	        this.studentList = studentList;
	    }
		 public Course(String courseId, String courseTitle, double credit) {
			this.courseId = courseId;
	        this.courseTitle = courseTitle;
	        this.credit = credit;
		}
		
		 public String getCourseId() {
		        return courseId;
		    }

		    public void setCourseId(String courseId) {
		        this.courseId = courseId;
		    }

		    public String getCourseTitle() {
		        return courseTitle;
		    }

		    public void setCourseTitle(String courseTitle) {
		        this.courseTitle = courseTitle;
		    }

		    public double getCredit() {
		        return credit;
		    }

		    public void setCredit(double credit) {
		        this.credit = credit;
		    }

		  
		    
		    public int getFaculty(int facultyId) {
		        return facultyId;
		    }

		    public void setFaculty(int facultyId) {
		        this.facultyId = facultyId;
		    }
		    
		    public String toString() {
		        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit;
		    }

		     
	
			public void dropStudent(int studentId){
//				System.out.println(studentId);
//				System.out.println(studentList.toString());
				boolean removed = studentList.removeIf(student -> student.getStudentId() == studentId);
	    	    if (removed) {
	    	        System.out.println("Student deleted successfully.");
	    	    } else {
	    	        System.out.println("Student ID not found.");
	    	    }
		    }
		    
		    public void dropFaculty(int facultyId) {
		       
		    	boolean removed = studentList.removeIf(faculty -> faculty.getFacultyId() == facultyId);
	    	    if (removed){
	    	        System.out.println("Fculty dropped successfully.");
	    	    } else {
	    	        System.out.println("Faculty ID not found.");
	    	    }
		    }
		    public void dropCourse(String courseId){
		    	boolean removed = studentList.removeIf(course -> course.getCourseId() == courseId);
	    	    if (removed){
	    	        System.out.println("Course dropped successfully.");
	    	    } else {
	    	        System.out.println("Course ID not found.");
	    	    }
		    }

		    public void printStudentList(){
		    	System.out.println(studentList.toString());
		    }
		        
}
		 

