package com.self.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		System.out.println("test!");
		Object o1 = null;
		System.out.println((BigDecimal)o1);
		System.out.println((Object)"12.33");
//		System.out.println(new BigDecimal(12.2f));
		
		
		
		System.out.println("本地冲突");
		
		DecimalFormat decFormat = new DecimalFormat("#.0000");
		
		System.out.println( decFormat.format(new BigDecimal("10.00000")));
		
		System.out.println("冲突模拟");
		
	}
	
	
	 
}
