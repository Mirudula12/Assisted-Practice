class Exceptione extends Exception{
			   String str;
			   Exceptione(String str) {
				this.str=str;
			   }
			  
			   public String toString(){ 
				return ("Exception Occurred: "+ str) ;
	        }
}
	

public class Exception1 {

	public static void main(String[] args) {
				try {
					throw new Exceptione("Error Message");
				}
				catch(Exceptione e) {
					System.out.println(e);
				}
			   }

}
