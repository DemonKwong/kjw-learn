package bean;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class Test1 {
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
		Student student = new Student();
		BeanUtils.setProperty(student,"age",21);
		System.out.println(student.toString());
	}

}

class Student implements Serializable{
	private int age;
	private String name;

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}


