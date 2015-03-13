/**
 * The Student class
 * @author achennat
 *
 */
public class Student extends Person {
	/**
	 * The count of students currently created
	 */
	private static int counter = 0;

	/**
	 * enumerates the possible class statuses
	 */
	public enum classStatus {
		FRESHMAN(0), SOPHOMORE(1), JUNIOR(2), SENIOR(3);
		private int value;
		private classStatus(int value){
			this.value = value;
		}
	
	}
	
	/**
	 * class status for this student
	 */
	classStatus Class;
	
	/**
	 * constructor with no parameters for this student randomly generates a class status
	 */
	public Student(){
		int value = (int)(classStatus.values().length * Math.random());
		this.Class = classStatus.values()[value];
		this.toString();
	}
	
	/**
	 * constructor for this student takes a class status as a parameter
	 * @param Class
	 */
	public Student(classStatus Class){
		this.Class = Class;
	}
	
	/**
	 * creates and returns a student and increments the student counter
	 * @return returns an instance of the Student class
	 */
	public static Student make(){
		Student student = new Student();
		counter++;
		return student;
	}
	
	/**
	 * returns null and decrements the student counter
	 * @return null
	 */
	public static Student destroy() {
		counter--;
		return null;
	}

	/**
	 * displays the class status and the person's name from the superclass
	 * returns null
	 */
	@Override
	public String toString(){
		String Class = this.Class.toString();
		String name = this.name;
		String out = null;
		System.out.println("Class Status: " + Class);
		System.out.println("Person's Name: " + name);
		return out;
	}
	
	/**
	 * displays the current number of students
	 */
	public static void studentCount(){
		System.out.println("Current number of students: " + counter);
	}
	
	
}
