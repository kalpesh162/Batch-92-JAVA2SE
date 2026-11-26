package p4;

@FunctionalInterface
interface Sayable {
	int sayHello(String s);
}

class Hello implements Sayable {
	@Override
	public int sayHello(String s) {
		return s.length();
	}

}

public class App {

	public static void main(String[] args) {

		Sayable s1 = new Hello();

		System.out.println(s1.sayHello("Raveena"));

		System.out.println("--------------------------");
		Sayable s2 = new Sayable() {
			@Override
			public int sayHello(String s) {
				return s.codePointAt(0);
			}
		};

		System.out.println(s2.sayHello("ABCD"));

		System.out.println("--------------------------");

		Sayable s3 = (String n) -> {
			return n.hashCode();
		};

		System.out.println(s3.sayHello("Ravi"));

		System.out.println("--------------------------");

		Sayable s4 = (n) -> {
			return n.hashCode();
		};

		System.out.println("+++++++++++++++++++++++++");
		Sayable s5 = (n) ->  n.hashCode();
		
		// {} return nahi likhana hai to { } nahi dene ka
		
		System.out.println("+++++++++++++++++++++++++");
		Sayable s6 = n ->  n.hashCode();
		
	}

}
