public class Exception1 {

	public static void main(String[] args) {
		System.out.println("hi users");

			try {
				int a=50/0;                          //exception obj is invoked
			}
			catch(Exception e) {
				System.out.println(e);	
			}
		System.out.println("welcome to phase 1");

	}

}
