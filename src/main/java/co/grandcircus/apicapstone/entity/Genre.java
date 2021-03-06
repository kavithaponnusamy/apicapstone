package co.grandcircus.apicapstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Genre {

	//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Genre() {
		
	}
	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}
	
	
}
