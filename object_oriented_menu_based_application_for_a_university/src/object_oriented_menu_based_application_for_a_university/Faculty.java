package object_oriented_menu_based_application_for_a_university;

public class Faculty {
	private int facultyId;
	private String facultyName;
	private String facultyPosition;

	
	public Faculty(int facultyId, String facultyName, String facultyPositiopn) {
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyPosition = facultyPositiopn;
	}


	 public int getFacultyId() {
	        return facultyId;
	    }

	    public void setFacultyId(int facultyId) {
	        this.facultyId = facultyId;
	    }

	    public String getFacultyName() {
	        return facultyName;
	    }

	    public void setFacultyName(String facultyName) {
	        this.facultyName = facultyName;
	    }

	    public String getFacultyPosition() {
	        return facultyPosition;
	    }

	    public void setFacultyPosition(String facultyPosition) {
	        this.facultyPosition = facultyPosition;
	    }

	    public String toString() {
	        return "Faculty ID : " + facultyId + " Faculty Name : " + facultyName + " Faculty Position : " + facultyPosition;
	    }

}
