import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("input");
		if(fo!=null) {
			System.out.println("File created and opened in write mode ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input to the file:");
		String fileinput = sc.nextLine();
		
		byte b[] = fileinput.getBytes();
		fo.write(b);
		System.out.println("Write completed");
		fo.close();

	}

}
