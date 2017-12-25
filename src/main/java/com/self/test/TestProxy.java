package com.self.test;

import java.applet.AudioClip;
import java.lang.reflect.Proxy;

public class TestProxy implements AudioClip{
	
	/**
	 * 
	 */


	public static void main(String[] args) {
		
		AudioClip ps=(AudioClip) Proxy.newProxyInstance(AudioClip.class.getClassLoader(), new Class[]{AudioClip.class},new MyInvocation(new TestProxy()));
		ps.play();
	}
	

	@Override
	public void play() {
		System.out.println("show------------");
	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
