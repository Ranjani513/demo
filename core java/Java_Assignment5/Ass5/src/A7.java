import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

// 7) Write a program to store property file as xml file?


public class A7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
OutputStream o=null;
Properties p=new Properties();
p.setProperty("name", "ranjani");
p.setProperty("id", "4");
p.setProperty("email", "ranjani@nisum.com");
try {
    o = new FileOutputStream("prop.xml");
    p.storeToXML(o,"Comments");
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
	}

}
