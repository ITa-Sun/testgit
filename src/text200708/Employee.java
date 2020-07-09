package text200708;

public class Employee {
	private int ID;
	private String name;

	public Employee(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee'ID is " + ID + ", name is " + name;
	}

}
