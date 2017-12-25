package com.self.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInvocation  implements InvocationHandler {
	private Logger log=LoggerFactory.getLogger(MyInvocation.class);
	
    private Object target;
    public MyInvocation(Object target){
        this.target = target;
    }
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		logBefore(target, method);
		Object obj=method.invoke(target, args);
		
		logAfter(target, method,obj);
		
		return obj;
	}
	
	
	public void logBefore(Object target, Method method){
		log.info("调用开始："+target.getClass()+method);
	}
	
	public void logAfter(Object target, Method method,Object obj){
		log.info("调用结束："+target.getClass()+"方法名称："+method+",结果:"+obj);
	}

}
