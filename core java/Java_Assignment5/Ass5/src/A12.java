import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;



// 12) Read a zip file and access all files from it? Here, we will have
//a zip file, read files from it and print file names
public class A12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ZipFile zip=new ZipFile("C:\\Users\\Dell\\Desktop\\ documents.zip");
Enumeration<? extends ZipEntry> entries = zip.entries();

while(entries.hasMoreElements()){
    ZipEntry entry = entries.nextElement();
  
    System.out.println(entry);
	}

}
}