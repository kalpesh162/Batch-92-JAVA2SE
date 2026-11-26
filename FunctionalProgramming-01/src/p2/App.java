package p2;

@FunctionalInterface
interface Sayable {
	String sayHello();
}

class Hello implements Sayable {
	@Override
	public String sayHello() {
		return "Its Cool";
	}

}

public class App {

	public static void main(String[] args) {

		Sayable s1 = new Hello();
		System.out.println(s1.sayHello());

		System.out.println("-------------------");

		Sayable s2 = new Sayable() {
			@Override
			public String sayHello() {
				return "Its anonymous";
			}
		};

		System.out.println(s1.sayHello());

		System.out.println("------------------------");

		Sayable s3 = () -> {
			return "Its a Nice";
		};

		System.out.println(s3.sayHello());

		Sayable s4 = () -> "Its a Brillant !!!";

		System.out.println(s4.sayHello());

	}

}
