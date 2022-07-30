import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) throws IOException {
		FileWriter fo = new FileWriter("input",true);
		if(fo!=null) {
			System.out.println("File created and opened in write mode ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input to the file:");
		String fileinput = sc.nextLine();
		
		//byte b[] = fileinput.getBytes();
		fo.write(fileinput);
		System.out.println("Write completed");
		fo.close();

	}

}
