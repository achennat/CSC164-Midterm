/**
 * executes the classes
 * @author achennat
 *
 */
public class RunProgram {
	
	public static void main(String[] args) {
		Student student0 = Student.make();
		Employee employee = new Employee();
		Student student1 = Student.make();
		Student.studentCount();
		student0 = Student.destroy();
		Student.studentCount();
	}
}
