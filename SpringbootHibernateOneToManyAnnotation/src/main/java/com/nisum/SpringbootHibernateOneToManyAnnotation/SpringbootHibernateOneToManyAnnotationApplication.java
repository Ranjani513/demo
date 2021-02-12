package com.nisum.SpringbootHibernateOneToManyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nisum.SpringbootHibernateOneToManyAnnotation.entity.Comment;
import com.nisum.SpringbootHibernateOneToManyAnnotation.entity.Post;
import com.nisum.SpringbootHibernateOneToManyAnnotation.reository.PostRepository;

@SpringBootApplication

public class SpringbootHibernateOneToManyAnnotationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyAnnotationApplication.class, args);
	}
@Autowired
private PostRepository postRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Post p=new Post("Nisum"," About Nisum");
		Post p1=new Post("Employee"," About Employee");
		Comment c=new Comment("Very good");
		Comment c1=new Comment("Excellent");
	//	p.getComments().add(c);
	//	p.getComments().add(c1);
		p1.getComments().add(c);
	//	this.postRepository.save(p);
		this.postRepository.save(p1);
		
	}

}