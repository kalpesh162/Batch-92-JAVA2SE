package p2;

public class Patient {
	private String name;
	private int priority;

	public Patient() {

	}

	public Patient(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + "]";
	}

}
