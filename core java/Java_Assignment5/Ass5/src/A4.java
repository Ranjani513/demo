import java.io.File;

// 4) Get list of all file objects from the given folder. First create File object by passing folder path. Call listFiles() method on file object to get list of file names
//in the given folder.
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Dell\\Desktop\\dem");
File files[]=f.listFiles();
for(File o:files)
{
	System.out.println(f.getName());
}
	}

}
