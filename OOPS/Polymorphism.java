class Method {
	
	void display() {
		System.out.println("Method overriding - parent");
	}
	
	void args() {
		System.out.println("No argument");
	}
	void args(int a,int b) {
		System.out.println("integer argument");
	}
	void args(double a,double b) {
		System.out.println("Double argument");
	}
}

class Method1 extends Method {
	void display() {
		System.out.println("Method overriding - child");
	}
}


public class Overload {

	public static void main(String[] args) {
		
		Method1 m1 = new Method1();
		m1.args(5.5,8);
	
		m1.display();

	}

}
