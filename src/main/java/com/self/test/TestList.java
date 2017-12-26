
import java.beans.EventHandler;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;






public class TestList implements Serializable,Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		
		System.out.println("hello");
	}
	
	
	@Test
	public void test(){
		Runnable t=new TestList();
		Class<?> obj=Proxy.getProxyClass(t.getClass().getClassLoader(),new Class[]{Serializable.class,Runnable.class});
		System.out.println(Proxy.isProxyClass(obj.getClass()));

	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
