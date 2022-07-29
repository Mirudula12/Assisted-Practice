public class Sleep {

	private static Object obj = new Object();
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " Thread woken after 2 second");
		

		synchronized(obj) {
			obj.wait(2000);
			System.out.println("Object " + obj + " is in waiting state and woken after 2 sec");
		}
	}

}
