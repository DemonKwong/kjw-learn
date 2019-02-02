package bean;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test1 {
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
		Test1 test1 = new Test1();
		Student object = test1.new Student();
		T t = test1.new T();
		t.setAge(50);
		t.setO(100);
		Class c = Student.class;
		Field[] field = c.getDeclaredFields();
		BeanUtils.setProperty(object,"name","kjw");
		BeanUtils.setProperty(object,"age",21);
		System.out.println(object.toString());
		BeanUtils.copyProperties(t,object);
		System.out.println(t.toString());
	}

	public class T{
		private int age;
		private String name;
		private int o;


		public int getO() {
			return o;
		}

		public void setO(int o) {
			this.o = o;
		}

		@Override
		public String toString() {
			return "T{" +
					"age=" + age +
					", name='" + name + '\'' +
					", o=" + o +
					'}';
		}

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
	}


	public class Student{
		private int age;
		private String name;

		@Override
		public String toString() {
			return "Student{" +
					"age=" + age +
					", name='" + name + '\'' +
					'}';
		}

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
	}
}


