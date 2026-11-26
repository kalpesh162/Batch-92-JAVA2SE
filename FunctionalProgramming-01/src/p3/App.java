package p3;

@FunctionalInterface
interface Sayable {
	void sayHello(String s);
}

class Hello implements Sayable {
	@Override
	public void sayHello(String s) {
		System.out.println("Welcome " + s.toUpperCase());
	}

}

public class App {

	public static void main(String[] args) {

		Sayable s1 = new Hello();
		s1.sayHello("Kareena");

		System.out.println("============================");

		Sayable s2 = new Sayable() {

			@Override
			public void sayHello(String s) {
				System.out.println("Welcome " + s.toLowerCase());

			}
		};

		s2.sayHello("Deepika");
		System.out.println("============================");

		Sayable s3 = (String name) -> {
			System.out.println("Welcome " + name.toUpperCase() + "  Welcome");
		};

		s3.sayHello("Raveena");

		System.out.println("-------------------------------------");

		Sayable s4 = (str) -> {
			System.out.println("****" + str + "****");
		};

		s4.sayHello("Madhuri");

		Sayable s5 = n -> System.out.println("--->" + n + "<----");

		s5.sayHello("Shraddha");

	}

}
