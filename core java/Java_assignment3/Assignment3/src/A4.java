//Write a program to generate a 6 digit random number?
import java.util.*;
import java.lang.Math;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random r=new Random();
  System.out.println(r.nextInt(899999)+100000);
	}

}