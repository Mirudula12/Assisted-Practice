class validAge {
	void Age(int age) throws InvalidException {
		if(age >=18) {
		   System.out.println("Can vote");
		}
		else {
			throw new InvalidException("Age is not matching");
		}
	}
}

class InvalidException extends Exception {

	public InvalidException(String str) {
		super(str);
	}

}

public class Exception2 {

	public static void main(String[] args) throws InvalidException {
		
		try {
			int b[]= {2,3,4,5,6};
			b[7]=15;
		}
		catch(Exception e) {
			System.out.println(e);	
		}
		
		finally {
			System.out.println("end of execution");
		}

		validAge v = new validAge();
		v.Age(12);


	}

}
