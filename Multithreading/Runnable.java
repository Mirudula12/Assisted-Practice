class Runs implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Run {

	public static void main(String[] args) {
		Runs r = new Runs();
		Thread t = new Thread(r);
		
		t.start();

	}

}
