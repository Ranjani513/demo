package com.servlet;

import java.util.ArrayList;
import java.util.List;


public class RetriveStudentdetails {
	public List<StudentDetails> getdetails(){
List<StudentDetails> studetails=new ArrayList<>();
studetails.add(new StudentDetails("Ranjani",101));
studetails.add(new StudentDetails("Nikhila",102));
studetails.add(new StudentDetails("Divya",103));
studetails.add(new StudentDetails("Ramya",104));
return studetails;

}
	
}