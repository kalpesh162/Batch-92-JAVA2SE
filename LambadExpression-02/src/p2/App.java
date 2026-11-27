package p2;

import java.util.function.Consumer;

class Triangle {
	int angleA;
	int angleB;
	int angleC;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int angleA, int angleB, int angleC) {
		super();
		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = angleC;
	}

	boolean isValid() {
		return (angleA + angleB + angleC == 180);
	}

}

public class App {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(80, 45, 55);

		Consumer<Triangle> isValid = (t) -> {
			if (t.angleA + t.angleB + t.angleC == 180)
				System.out.println("Valid ");
			else
				System.out.println("Invalid");
		};

		isValid.accept(triangle);

		Integer arr[] = { 80, 45, 55 };

		Consumer<Integer[]> validTri = (Integer b[]) -> {
			int sum = 0;
			for (Integer ele : b)
				sum += ele;

			System.out.println(sum);
			System.out.println(sum == 180);

		};

		validTri.accept(arr);

		Triangle triangle2 = new Triangle(45, 70, 80);

		Consumer<Triangle> byValid = (tt) -> System.out.println(tt.isValid());

		byValid.accept(triangle2);

	}

}
