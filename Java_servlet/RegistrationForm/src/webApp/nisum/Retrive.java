package webApp.nisum;

import java.util.ArrayList;
import java.util.List;

public class Retrive {
public static List<Student> getdetails()
{
	List<Student> s=new ArrayList<>();
	s.add(new Student("Ranjani","101"));
	s.add(new Student("Nikhila","102"));
	s.add(new Student("Divya","103"));
	s.add(new Student("Ramya","104"));
	return s;
}
}
