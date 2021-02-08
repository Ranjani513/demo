package com.nisum.SpringbootHibernateOneToManyAnnotation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name ="posts")
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "title")
private String title;
@Column(name = "description")
private String description;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name ="pc_fid",referencedColumnName = "id")
List<Comment> comments = new ArrayList<>();
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDesc() {
	return description;
}
public void setDesc(String description) {
	this.description = description;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public Post() {
	
	// TODO Auto-generated constructor stub
}
public Post( String title, String description) {
	
	
	this.title = title;
	this.description = description;
}

}
