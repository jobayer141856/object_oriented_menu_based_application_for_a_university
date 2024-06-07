package object_oriented_menu_based_application_for_a_university;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
	private static ArrayList <Student> students = new ArrayList<>();
    private static ArrayList <Course> courses = new ArrayList<>();
    private static ArrayList <Faculty> faculties = new ArrayList<>();
    private static ArrayList <AdvisingList> studentlist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in); 
    
  
    public ArrayList<AdvisingList> getAdvisingList() {
        return studentlist;
    }
    
//Add Student, Course, Faculty
    private static void addStudent()
    {
    	boolean studentExists = false;
    	System.out.print("Enter student ID: ");
    	int studentId = Integer.parseInt(scanner.nextLine());
    	
    	
    	for (Student student : students) {
    	    if (student.getStudentId() == studentId) {
    	        System.out.print("Student Already added. Please try another ID to add.");
    	        studentExists = true;
    	        break;
    	    }
    	}
    	if (!studentExists) {
    	    System.out.print("Enter student name: ");
    	    String studentName = scanner.nextLine();
    	    System.out.print("Enter student CGPA: ");
    	    double studentCGPA = Double.parseDouble(scanner.nextLine());
    	    Student student1 = new Student(studentId, studentName, studentCGPA);
    	    students.add(student1);
    	    System.out.println("Student added successfully.");
    	}
    	else {
    		System.out.println("Student ID already Exist.");
    		return;
    	}
    	
    	
    }
    
    private static void addCourse()
    {
    	boolean courseExists = false;
    	 System.out.print("Enter course ID: ");
    	 String courseId = scanner.nextLine();
    	 
    	 for (Course course : courses) {
    		    if (course.getCourseId().equals(courseId)) {
    		        System.out.print("Course already added. Please try another course ID to add.");
    		        courseExists = true;
    		        break;
    		    }
    		}

    	if (!courseExists){
    		   System.out.print("Enter course title: ");
    		   String courseName = scanner.nextLine();
    		   System.out.print("Enter course credit: ");
    		   double courseCredit = Double.parseDouble(scanner.nextLine());
    		   Course course1 = new Course(courseId, courseName, courseCredit);
    		   courses.add(course1);
    		  System.out.println("Course added successfully.");
    		}
    	else {
    			
    		System.out.println("Course ID already Exist.");
        	return;
    		}
    	
    }
    	
    private static void addFaculty()
    {
    	
    	boolean facultyExists = false;
    	System.out.print("Enter faculty ID: ");
   	 	int facultyId = Integer.parseInt(scanner.nextLine());
	   	 for (Faculty faculty : faculties) {
	   	    if (faculty.getFacultyId() == facultyId) {
	   	        System.out.print("Faculty already added. Please try another ID to add.");
	   	        facultyExists = true;
	   	        break;
	   	    }
	   	}
	
	   	
	   	if (!facultyExists) {
	   	    System.out.print("Enter faculty name: ");
	   	    String facultyName = scanner.nextLine();
	   	    System.out.print("Enter faculty position: ");
	   	    String facultyPosition = scanner.nextLine();
	   	    Faculty faculty1 = new Faculty(facultyId, facultyName, facultyPosition);
	   	    faculties.add(faculty1);
	   	    System.out.println("Faculty added successfully.");
	   	}
    	
    }
    

    
    
    //Update Student, Course, Faculty By ID
    
    private static void updateStudent() {
    	
    	boolean studentExists = false;

    	System.out.print("Enter student ID: ");
    	int studentId = Integer.parseInt(scanner.nextLine());

    	for (Student student : students) {
    	    if (student.getStudentId() == studentId) {
    	        System.out.print("Enter new student name: ");
    	        String studentName = scanner.nextLine();
    	        System.out.print("Enter new student CGPA: ");
    	        double studentCGPA = Double.parseDouble(scanner.nextLine());
    	        
    	        student.setStudentName(studentName);
    	        student.setStudentCGPA(studentCGPA);
    	        System.out.println("Student updated successfully.");
    	        studentExists = true;
    	        break;
    	    }
    	}

    	if (!studentExists) {
    	    System.out.println("Student not found.");
    	}

       	 
 
    	
    }
    
    private static void updateCourse() {
    	
    	System.out.print("Enter course ID to update: ");
    	String courseId = scanner.nextLine();
    	boolean courseFound = false;

    	for (Course course : courses) {
    	    if (course.getCourseId().equals(courseId)) {
    	        System.out.print("Enter new course title: ");
    	        String courseTitle = scanner.nextLine();
    	        System.out.print("Enter new course credit: ");
    	        double credit = Double.parseDouble(scanner.nextLine());

    	        course.setCourseTitle(courseTitle);
    	        course.setCredit(credit);
    	        System.out.println("Course updated successfully.");
    	        courseFound = true;
    	        break; // No need to continue looping once the course is found and updated
    	    }
    	}

    	if (!courseFound) {
    	    System.out.println("Course not found.");
    	}
    }
    
    private static void updateFaculty() {
    	System.out.print("Enter faculty ID to update: ");
    	int facultyId = Integer.parseInt(scanner.nextLine());
    	boolean facultyFound = false;

    	for (Faculty faculty : faculties) {
    	    if (faculty.getFacultyId() == facultyId) {
    	        System.out.print("Enter new faculty name: ");
    	        String facultyName = scanner.nextLine();
    	        System.out.print("Enter new faculty position: ");
    	        String facultyPosition = scanner.nextLine();

    	        faculty.setFacultyName(facultyName);
    	        faculty.setFacultyPosition(facultyPosition);
    	        System.out.println("Faculty updated successfully.");
    	        facultyFound = true;
    	        break;
    	    }
    	}

    	if (!facultyFound) {
    	    System.out.println("Faculty not found.");
    	}

    }

    
    
    
    
    //Delete Student, Course, Faculty By ID
    	private static void deleteStudent() {
    	    System.out.print("Enter student ID to delete: ");
    	    int studentId = Integer.parseInt(scanner.nextLine());
    	    boolean removed = students.removeIf(student -> student.getStudentId() == studentId);
    	    if (removed) {
    	        System.out.println("Student deleted successfully.");
    	    } else {
    	        System.out.println("Student ID not found.");
    	    }
    	}

    	private static void deleteCourse() {
    	    System.out.print("Enter course ID to delete: ");
    	    String courseId = scanner.nextLine();
    	    boolean removed = courses.removeIf(course -> course.getCourseId().equals(courseId));
    	    if (removed) {
    	        System.out.println("Course deleted successfully.");
    	    } else {
    	        System.out.println("Course ID not found.");
    	    }
    	}

    	private static void deleteFaculty() {
    	    System.out.print("Enter faculty ID to delete: ");
    	    int facultyId = Integer.parseInt(scanner.nextLine());
    	    boolean removed = faculties.removeIf(faculty -> faculty.getFacultyId() == facultyId);
    	    if (removed) {
    	        System.out.println("Faculty deleted successfully.");
    	    } else {
    	        System.out.println("Faculty ID not found.");
    	    }
    	}

   //advising 
    	private static void advisingList()
    	{
    		
    		System.out.print("Enter student ID to advising: ");
    		int studentId = Integer.parseInt(scanner.nextLine());
    		System.out.print("Enter course ID: ");
    		String courseId = scanner.nextLine();
    		System.out.print("Enter faculty ID: ");
    		int facultyId = Integer.parseInt(scanner.nextLine());

    		boolean studentFound = false;
    		boolean courseFound = false;
    		boolean facultyFound = false;
    		
    		for (Student std : students) {
    		    if (std.getStudentId() == studentId) {
    		        studentFound = true;
//    		        student = std;
    		        break;
    		    }
    		}

    		for (Course crs : courses) {
    		    if (crs.getCourseId().equals(courseId)) {
    		        courseFound = true;
//    		        course = crs;
    		        break;
    		    }
    		}

    		for (Faculty fac : faculties) {
    		    if (fac.getFacultyId() == facultyId) {
    		        facultyFound = true;
//    		        faculty = fac;
    		        break;
    		    }
    		}

    		if (studentFound && courseFound && facultyFound){
    			int c = 0;
    			for(AdvisingList faclist : studentlist) {
    				if(faclist.getFacultyId() == facultyId) {
    					c++;
    				}
    			}
    			if(c<3) {
    				AdvisingList stdList = new AdvisingList(studentId, facultyId, courseId);
        		    studentlist.add(stdList);
        		    
        		    System.out.println("Added successfully");
    			}
    		    
    		 else {
    		    System.out.println("Faculty cant not teaches more than three courses");
    		 }
    		
    	}
    		else {
    			 System.out.println("Student or course or faculty not found");
    		}
    }
    	
    	private static void dropStudent()
    	{
    		Driver driverClass = new Driver();
            Course course = new Course(driverClass.getAdvisingList());
            System.out.print("Enter Student ID to drop: ");
    	    int studentId = Integer.parseInt(scanner.nextLine());
    	    course.dropStudent(studentId);
    	   
    		
    	}
    	private static void dropFaculty()
    	{
    		Driver driverClass = new Driver();
            Course course = new Course(driverClass.getAdvisingList());
            System.out.print("Enter Faculty ID to drop: ");
    	    int facultyId = Integer.parseInt(scanner.nextLine());
    	    course.dropFaculty(facultyId);
    	   
    		
    	}
    	private static void dropCourse()
    	{
    		Driver driverClass = new Driver();
            Course course = new Course(driverClass.getAdvisingList());
            System.out.print("Enter Course ID to drop: ");
    	    String courseId = scanner.nextLine();
    	    course.dropCourse(courseId);
    		
    	}
    	
    	private static void PrintStudentList() 
    	{
    		Driver driverClass = new Driver();
            Course course = new Course(driverClass.getAdvisingList());
            course.printStudentList();
    		
    	}
    	
    
//    //Print 
    	private static void printAllStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }

        private static void printAllCourses() {
            for (Course course : courses) {
                System.out.println(course);
            }
        }

        private static void printAllFaculties() {
            for (Faculty faculty : faculties) {
                System.out.println(faculty);
            }
        }

        private static void printStudentInfo() {
            System.out.print("Enter student ID to print: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            for (Student student : students) {
                if (student.getStudentId() == studentId) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student not found.");
        }

        private static void printCourseInfo() {
            System.out.print("Enter course ID to print: ");
            String courseId = scanner.nextLine();
            for (Course course : courses) {
                if (course.getCourseId().equals(courseId)) {
                    System.out.println(course);
                    return;
                }
            }
            System.out.println("Course not found.");
        }

        private static void printFacultyInfo() {
            System.out.print("Enter faculty ID to print: ");
            int facultyId = Integer.parseInt(scanner.nextLine());
            for (Faculty faculty : faculties) {
                if (faculty.getFacultyId() == facultyId) {
                    System.out.println(faculty);
                    return;
                }
            }
            System.out.println("Faculty not found.");
        }

        private static void printCourseStudentListAndFaculty() {
            System.out.print("Enter course ID to print student list and faculty information: ");
            String courseId = scanner.nextLine();
            for (AdvisingList stdList : studentlist){
                if (stdList.getCourseId().equals(courseId)){
                    System.out.println("Student: " + stdList.getStudentId());
                    int studentId = stdList.getStudentId();
                    System.out.println("Student: " + stdList.getStudentId());
                    int facultyId = stdList.getFacultyId();
                    
                    for(Student student : students) {
                    	if(student.getStudentId() == studentId) {
                    		System.out.println(student);
                    	}
                    }
                    for(Faculty faculty : faculties)
                    {
                    	if(faculty.getFacultyId() == facultyId) {

                    		System.out.println(faculty);
                    		
                    	}
                    }
                    
         
                }
            }
            System.out.println("Course not found.");
        }
        
 
        private static void printCoursesTakenByStudent() {
            System.out.print("Enter student ID to print courses taken: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            for (AdvisingList stdList : studentlist){
                if (stdList.getStudentId() == studentId){
                	String courseId = stdList.getCourseId();	
            
                    for (Course course : courses) {
                        if (course.getCourseId().equals(courseId)){
                        	System.out.println(course);
                       
                        }
                        
                    }
 
                }
            }
            System.out.println("Student not found.");
        }
        
        
        //Search 
        
        private static void searchStudent() {
            System.out.print("Enter student ID or name to search: ");
            String input = scanner.nextLine();
            for (Student student : students) {
                if (String.valueOf(student.getStudentId()).equals(input) || student.getStudentName().equalsIgnoreCase(input)) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student not found.");
        }

        private static void searchCourse() {
            System.out.print("Enter course ID to search: ");
            String courseId = scanner.nextLine();
            for (Course course : courses) {
                if (course.getCourseId().equals(courseId)) {
                    System.out.println(course);
                    return;
                }
            }
            System.out.println("Course not found.");
        }

        private static void searchFaculty() {
            System.out.print("Enter faculty ID or name to search: ");
            String input = scanner.nextLine();
            for (Faculty faculty : faculties) {
                if (String.valueOf(faculty.getFacultyId()).equals(input) || faculty.getFacultyName().equalsIgnoreCase(input)) {
                    System.out.println(faculty);
                    return;
                }
            }
            System.out.println("Faculty not found.");
        }

        private static void searchStudentTakesCourse() {
            System.out.print("Enter student ID to search: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter course ID to search: ");
            String courseId = scanner.nextLine();
            for (AdvisingList courseList : studentlist) {
                if (courseList.getStudentId() == studentId && courseList.getCourseId().equals(courseId)){
                	 System.out.println("Student takes course");
                	 return;
                    
                    }
                }
                
            System.out.println("Student not found in the course.");
        }

        private static void searchFacultyTeachesCourse() {
            System.out.print("Enter faculty ID to search: ");
            int facultyId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter course ID to search: ");
            String courseId = scanner.nextLine();
            for (AdvisingList courseList : studentlist) {
                if (courseList.getFacultyId() == facultyId && courseList.getCourseId().equals(courseId)){
        
                	 System.out.println("Faculty teaches course");
                	 return;
                     }
                }
            System.out.println("Faculty not found for the course.");
        }

        private static void searchCoursesTakenByStudent() {
            System.out.print("Enter student ID to search courses taken: ");
            int studentId = Integer.parseInt(scanner.nextLine());
            
            for (AdvisingList stdList : studentlist){
                if (stdList.getStudentId() == studentId){
                	String courseId = stdList.getCourseId();	
            
                    for (Course course : courses) {
                        if (course.getCourseId().equals(courseId)){
                        	System.out.println(course);
                        }
                    }
 
                }
                return;
            }
            System.out.println("Student not found.");
        }

        private static void searchCoursesTaughtByFaculty() {
            System.out.print("Enter faculty ID to search courses taught: ");
            int facultyId = Integer.parseInt(scanner.nextLine());
            for (AdvisingList stdList : studentlist){
                if (stdList.getFacultyId() == facultyId){
                	String courseId = stdList.getCourseId();	
            
                    for (Course course : courses) {
                        if (course.getCourseId().equals(courseId)){
                        	System.out.println(course);
                        }
                    }
 
                }
                return;
            }
            System.out.println("Faculty not found.");
        }
    
        
        
	public static void main(String[] args) {
		
	    while(true){
	    		System.out.println("Menu:");
	            System.out.println("a. Add");
	            System.out.println("b. Delete");
	            System.out.println("c. Update");
	            System.out.println("d. AdvisingList");
	            System.out.println("e. Print");
	            System.out.println("f. Search");
	            System.out.println("g. Exit Program");
	            System.out.print("Choose an option: ");
	            String option = scanner.nextLine();
	            
	            switch (option){
	            	case "a":
	            		 	System.out.println("Add:");
	            	        System.out.println("a. Add a Student");
	            	        System.out.println("b. Add a Course");
	            	        System.out.println("c. Add a Faculty");
	            	        System.out.print("Choose an option: ");
	            	        String option1 = scanner.nextLine();
	            	        switch (option1){
			            	        case "a":
			            	        	addStudent();
			            	        	break;
			            	        case "b":
			            	        	addCourse();           	         
			            	        	break;    	
			            	        case "c":
			            	        	addFaculty();
			            	        	break;
			            	        default:
			            	        	System.out.println("Invalid Input...Please");
	            	        }
	            		break;
	            		
	            	case "b":
		            		System.out.println("Delete:");
	            	        System.out.println("a. Delete a Student by ID");
	            	        System.out.println("b. Delete a Course by ID");
	            	        System.out.println("c. Delete a Faculty ID");
	            	        System.out.print("Choose an option: ");
	            	        String delete = scanner.nextLine();
	            	        switch (delete){
	            	        case "a":
	            	        	deleteStudent();
	            	        	break;
	            	        case "b":
	            	        	deleteCourse();           	         
	            	        	 break;    	
	            	        case "c":
	            	        	deleteFaculty();
	            	        	break;
	            	        default:
	            	        	System.out.println("Invalid Input...Please");
	            	        }
	            		break;
		            		
	            	case "c":	
	            		System.out.println("Update:");
            	        System.out.println("a. Update a Student by ID");
            	        System.out.println("b. Update a Course by ID");
            	        System.out.println("c. Update a Faculty ID");
            	        System.out.print("Choose an option: ");
            	        String update = scanner.nextLine();
            	        switch (update){
            	        case "a":
            	        	updateStudent();
            	        	break;
            	        case "b":
            	        	updateCourse();           	         
            	        	break;    	
            	        case "c":
            	        	updateFaculty();
            	        	break;
            	        default:
            	        	System.out.println("Invalid Input...Please");
            	        }
            		break;
            		
	            	case "d":
	            		System.out.println("Advising:");
	            		System.out.println("a. Add advising");
	            	    System.out.println("b. drop");
	            	    System.out.println("c. PrintStudentList");
	            	    String add = scanner.nextLine();
	            	    switch (add){
            	        case "a":
            	        	advisingList();
            	        	break;
            	        case "b":
            	        	System.out.println("a. Drop faculty from advising list");
    	            	    System.out.println("b. Drop student from advising list");
    	            	    System.out.println("c. Drop course from advising list");
            	        	String drop = scanner.nextLine();
            	        	switch (drop){
            	        		case "a":
            	        			dropFaculty();
            	        			break;
            	        		case "b":
            	        			dropStudent();
            	        			break;
            	        		case "c":
            	        			dropCourse();
            	        			break;
            	        		 default:
                     	        	System.out.println("Invalid Input...Please");
            	        	}
            	        	
            	        case "c":
            	        	 PrintStudentList();
            	        	 break;
            	        	 
            	        default:
            	        	System.out.println("Invalid Input...Please");
	            	    }	
	            		break;
	            	case "e":
	            		System.out.println("Print:");
	                    System.out.println("a. Print all students");
	                    System.out.println("b. Print all courses");
	                    System.out.println("c. Print all faculties");
	                    System.out.println("d. Print information of a student");
	                    System.out.println("e. Print information of a course");
	                    System.out.println("f. Print information of a faculty");
	                    System.out.println("g. Print student list and faculty information of a course");
	                    System.out.println("h. Print courses taken by a student");
	                    System.out.print("Choose an option: ");
	                    String print = scanner.nextLine();

	                    switch (print) {
	                        case "a":
	                            printAllStudents();
	                            break;
	                        case "b":
	                            printAllCourses();
	                            break;
	                        case "c":
	                            printAllFaculties();
	                            break;
	                        case "d":
	                            printStudentInfo();
	                            break;
	                        case "e":
	                        	printCourseInfo();
	                            break;
	                        case "f":
	                            printFacultyInfo();
	                            break;
	                        case "g":
	                            printCourseStudentListAndFaculty();
	                            break;
	                        case "h":
	                           printCoursesTakenByStudent();
	                            break;
	                        default:
	                            System.out.println("Invalid option. Please try again.");
	                    }
	            		
	            		break;
	            	case "f":
	            		System.out.println("Search:");
	                    System.out.println("a. Search a Student by Id or Name");
	                    System.out.println("b. Search a Course by Id");
	                    System.out.println("c. Search a Faculty By Id or Name");
	                    System.out.println("d. Search whether a student takes a course");
	                    System.out.println("e. Search whether a faculty teaches a course");
	                    System.out.println("f. Search courses taken by a student");
	                    System.out.println("g. Search courses taught by a faculty");
	                    System.out.print("Choose an option: ");
	                    String search = scanner.nextLine();

	                    switch (search) {
	                        case "a":
	                            searchStudent();
	                            break;
	                        case "b":
	                        	searchCourse();
	                            break;
	                        case "c":
	                            searchFaculty();
	                            break;
	                        case "d":
	                            searchStudentTakesCourse();
	                            break;
	                        case "e":
	                            searchFacultyTeachesCourse();
	                            break;
	                        case "f":
	                            searchCoursesTakenByStudent();
	                            break;
	                        case "g":
	                            searchCoursesTaughtByFaculty();
	                            break;
	                        default:
	                            System.out.println("Invalid option. Please try again.");
	                    }
	            		break;
	            	case "g":
	            		System.out.println("Exiting program...");
	            		return;
	            	default:
	            		System.out.println("Invalid Input...Please");
	            }
	    }             
	    
	}
	
}
