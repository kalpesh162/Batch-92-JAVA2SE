package p3;

// type must be comparble
public class Patient implements Comparable<Patient> {
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

	@Override
	public int compareTo(Patient o) {
		Integer i1 = Integer.valueOf(priority);
		Integer i2 = Integer.valueOf(o.priority);
		return -(i1.compareTo(i2));
	}

}
