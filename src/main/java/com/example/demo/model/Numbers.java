package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "number")
public class Numbers {
	public static double getNum;
	@Id
	private long id;
	public int num;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Numbers(long id, int num) {
		super();
		this.num = num;
	}
	public Numbers() {
		super();
		// TODO Auto-generated constructor stub
	}
}
