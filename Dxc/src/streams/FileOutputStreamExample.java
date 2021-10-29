package streams;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample {
	public static void main (String [] args)
	{
		try {
			FileOutputStream fourpipe = new FileOutputStream("C:\\Users\\HP\\Desktop\\testout\\testout.txt");
			fourpipe.write(68);
			fourpipe.close();
			System.out.println("success");
		}
		catch(IOException e) {
			
	
		}
	}

}
