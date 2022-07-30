import java.io.FileInputStream;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("input");
		if(fi!=null) {
			System.out.println("File exists ");
		}
		
		int i=0;
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
		}
		fi.close();

	}

}
