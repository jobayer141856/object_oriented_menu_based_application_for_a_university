package object_oriented_menu_based_application_for_a_university;

public class AdvisingList {

	private int studentId;
    private int facultyId;
    private String courseId;

    public AdvisingList(int studentId, int facultyId, String courseId) {
        this.studentId = studentId;
        this.facultyId = facultyId;
        this.courseId = courseId;
    }
    
    
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public String toString() {
        return "Course ID : " + courseId + " Student ID : " + studentId + " Faculty ID : " + facultyId;
    }
	
	
}
