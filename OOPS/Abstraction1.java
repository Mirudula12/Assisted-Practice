abstract class Shape {
	abstract void shapes();
}

class Circle extends Shape {
	void shapes() {
		System.out.println("This is circle");
	}
}

class Square extends Shape {
	void shapes() {
		System.out.println("This is square");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		Shape s = new Square();
		s.shapes();
		
		Shape ss = new Circle();
		ss.shapes();

	}

}
