package text200708;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.*;

public class EnumDemo {
	@Test
	public void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings("rawtypes")
		Class clazz = Employee.class;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Constructor con = clazz.getConstructor(int.class,String.class);
		con.setAccessible(true);
		Employee p = (Employee)con.newInstance(50,"fff");
		System.out.println(p);
	}
	
	@Test
	public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("text200708.Employee");
		Object obj = clazz.newInstance();
		
		System.out.println((Employee)obj);
	}
}
