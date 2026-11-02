package p2;

import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Shah Rukh Khan", 95.5);
		Student s2 = new Student(7, "Salman Khan", 88.0);
		Student s3 = new Student(8, "Aamir Khan", 92.5);
		Student s4 = new Student(4, "Deepika Padukone", 89.5);
		Student s5 = new Student(5, "Ranbir Kapoor", 91.0);
		Student s6 = new Student(2, "Aamir Khan", 92.5);
		Student s7 = new Student(4, "Deepika Padukone", 89.5);

		TreeSet<Student> jpa92 = new TreeSet<Student>();
		jpa92.add(s1);
		jpa92.add(s2);
		jpa92.add(s3);
		jpa92.add(s4);
		jpa92.add(s5);
		jpa92.add(s6);
		jpa92.add(s7);

		for (Student student : jpa92)
			System.out.println(student);

	}

}
