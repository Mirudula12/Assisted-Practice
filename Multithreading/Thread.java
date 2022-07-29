public class Threads extends Thread {

	public void run() {
		System.out.println("Thread started running");
	}
	
	public static void main(String[] args) {
		Threads t1 = new Threads();
		t1.start();

	}

}
