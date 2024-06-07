package object_oriented_menu_based_application_for_a_university;

public class Student {
	 private int studentId;
	    private String studentName;
	    private double studentCGPA;
	    
	    public Student() {
//	    	  this.studentId = -1;
//		       this.studentName = null;
//		        this.studentCGPA = -1;
	    }
	    
	    public Student(int studentId, String studentName, double studentCGPA) {
	        this.studentId = studentId;
	        this.studentName = studentName;
	        this.studentCGPA = studentCGPA;
	    }
	    
	    public int getStudentId() {
	    	
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }

	    public double getStudentCGPA() {
	        return studentCGPA;
	    }

	    public void setStudentCGPA(double studentCGPA) {
	        this.studentCGPA = studentCGPA;
	    }
	    
	    
	    public String toString() {
	        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
	    }
}

