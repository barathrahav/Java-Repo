import java.io.*;

public class FilesAndIoOne{
	public static void main(String args[]) throws IOException{

	String c;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'end' to quit: ");
	do{
		c = br.readLine();
		System.out.println(c);
	}while(!c.equals("end"));
}
}

//hasNext() --> For checking next word