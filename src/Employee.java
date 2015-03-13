
public class Employee extends Person {
	protected String office;
	protected String salary;
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	private MyDate dateHired;
	
	public Employee() {
	}

	@Override
	public String toString(){
		return null;
	}

}
