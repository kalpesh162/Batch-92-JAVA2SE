package p1;

@FunctionalInterface
interface Sayable {
	void sayHello();
}

class Hello implements Sayable {

	@Override
	public void sayHello() {
		System.out.println("Hello Hello Hello...");
	}

}

public class App {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.sayHello();

		System.out.println(" --------------------------------");

		Sayable say = new Hello();
		say.sayHello();

		Sayable s2 = new Sayable() {
			@Override
			public void sayHello() {
				System.out.println("NAMSET !!!");

			}
		};

		s2.sayHello();
		
		// ()  -->  {     }
		
		Sayable ss=() -> {
			  System.out.println("BYE  BYE  BYE !!!");
		};

		
		ss.sayHello();
		
		
		Sayable st=()-> {System.out.println("Cool");};
		
		
		
		
		
		
		
		
		
		
		
	}

}
