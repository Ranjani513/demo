// 1) Define sample string content, convert to bytes and write byte content to a file in java
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s="How are you";
byte [] b=s.getBytes();
FileOutputStream f=new FileOutputStream("o1.txt");
f.write(b);
System.out.println("Written successfully");
	}

}
