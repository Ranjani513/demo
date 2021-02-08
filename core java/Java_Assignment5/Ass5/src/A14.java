import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// Write a program to convert byte array object to reader object. Below example shows how to
//convert byte array to bufferedreader object
public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello"+
                 "\n how are you";
 byte[] content = str.getBytes();
 InputStream is = null;
 BufferedReader bfReader = null;
 try {
     is = new ByteArrayInputStream(content);
     bfReader = new BufferedReader(new InputStreamReader(is));
     String temp = null;
     while((temp = bfReader.readLine()) != null){
         System.out.println(temp);
     }
 } catch (IOException e) {
     e.printStackTrace();
 } finally {
     try{
         if(is != null) is.close();
     } catch (Exception ex){
          
     }
 }
	}

}
