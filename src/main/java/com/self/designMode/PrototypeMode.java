package com.self.designMode;
import java.io.IOException;



import com.self.bean.Emp;


public class PrototypeMode implements Cloneable{


	public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
		
		System.out.println(Integer.hashCode(101));

		Emp emp =new Emp(5,"zhangsan",6);
		System.out.println(emp.hashCode());
		
		Emp emp1=(Emp)emp.clone();
		
		Emp emp2=(Emp)emp.deepClone();

		
		System.out.println(emp1.getI());
		System.out.println(emp2.getI());
		System.out.println(emp1.getI()==emp2.getI());
		System.out.println("===="+emp1.getI().equals(emp2.getI()));
		System.out.println(emp1.getI()==emp.getI());
		
		System.out.println(":"+emp1.getI().hashCode());
		System.out.println(":"+emp.getI().hashCode());
		System.out.println(emp1==emp);
		System.out.println(emp.getI()==emp2.getI());
		
		
		/**
		101
		366712642
		6
		6
		false
		====true
		true
		:6
		:6
		false
		false

		 */

		
		/**
		 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。

		深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
		 */
		
	}
	
	
	
	
//
//	public Object clone(){
//		
//		return this.clone();
//		
//	}
//	
//	
//	public Object deepClone() throws IOException, ClassNotFoundException{
//		
//		//读取对象到二进制流
//		ByteArrayOutputStream baos=new ByteArrayOutputStream();
//		ObjectOutputStream oos=new ObjectOutputStream(baos);
//		oos.writeObject(this);
//		
//		//由二进制流获取对象
//		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
//		ObjectInputStream ois=new ObjectInputStream(bais);
//		return  ois.readObject();
//	}
	
	

}
