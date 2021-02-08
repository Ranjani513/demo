import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 8) Write a program to store and read objects from a file?
public class A8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s=new Student("ranjani",89);
		FileOutputStream fout=new FileOutputStream("out.txt");
ObjectOutputStream o=new ObjectOutputStream(fout);
o.writeObject(s);
o.flush();
FileInputStream fin=new FileInputStream("out.txt");
ObjectInputStream o1=new ObjectInputStream(fin);
Student d=(Student)o1.readObject();
System.out.println(d.name+" "+d.id);

	}

}
class Student implements Serializable{
	static String name;
	static int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}
