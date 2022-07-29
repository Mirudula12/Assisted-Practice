interface Calculator1 {
	public void sum(int a ,int b);
	public void sub(int a, int b);
}

interface Calculator2 extends Calculator1 {
	public void div(int a , int b);
}

class Operation implements Calculator2 {
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void div(int a,int b) {
		System.out.println(a/b);
	}
}

public class Interface {

	public static void main(String[] args) {
		Operation o = new Operation();
        o.sum(3, 5);
	}

}
