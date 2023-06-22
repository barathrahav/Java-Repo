import java.io.*;

public class LearnFiles {

	public static void main(String args[]) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Dev\\Java-Repo\\Learn\\learn.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Dev\\Java-Repo\\Learn\\copylearn.txt"));
		String count;
		while ((count = dis.readLine()) != null) {
			String data = count.toUpperCase();
			System.out.println(data);
			dos.writeBytes(data + ",");
		}
		dis.close();
		dos.close();
	}
}