package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String imageurl;
	private String Createdby;
	private String Level;
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(int id, String name, String createdby, String level) {
		super();
		this.id = id;
		this.name = name;
		Createdby = createdby;
		Level = level;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedby() {
		return Createdby;
	}
	public void setCreatedby(String createdby) {
		Createdby = createdby;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	

}
