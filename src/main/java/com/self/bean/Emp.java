package com.self.bean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp implements Cloneable,Serializable{
	
	/**
	 * 
	 */
	private int age;
	private String name;
	private Integer i;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Emp(int age, String name, Integer i) {
		this.age = age;
		this.name = name;
		this.i=i;
	}
	
	
	
	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException{
		Emp emp=(Emp)super.clone();
		return emp;
		
	}
	
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		//读取对象到二进制流
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(this);
		
		//由二进制流获取对象
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bais);
		return  ois.readObject();
	}

}
