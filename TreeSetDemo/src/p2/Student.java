package p2;
// How we can make Student type is Comparable

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	/*
	@Override
	public int compareTo(Student o) {

		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		return 0;
	}
	*/
/*
	@Override
	public int compareTo(Student o) {

		if (this.id > o.id)
			return -1;
		else if (this.id < o.id)
			return 1;
		return 0;
	}
*/
	@Override
	public int compareTo(Student o) {
       Integer i1=Integer.valueOf(this.id);
       Integer i2=Integer.valueOf(o.id);
       
       return i1.compareTo(i2);
       
       //return - (i1.compareTo(i2));
		
	}

}
