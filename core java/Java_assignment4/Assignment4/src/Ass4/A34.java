//34. Write a Program to get the No Such method exception.
package Ass4;
import java.lang.reflect.Method;
public class A34 {
 
	/*public void hi()
	{
		System.out.println("hi");
	}*/
	public static void main(String[] args)throws NoSuchMethodException {
		// TODO Auto-generated method stub
    Method s=String.class.getDeclaredMethod("hello");
    System.out.println(s);
	}

}