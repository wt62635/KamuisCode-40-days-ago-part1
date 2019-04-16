package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5推出时推出了一个新的特性：增强for循环
 * 也称为新循环或for each
 * 
 * 新循环不取代传统for循环的工作，它是用来遍历集合或数组使用的。
 * @author Administrator
 *
 */
public class NewForDemo01 {
	public static void main(String[] args) {
		String array[] = {"one","two","three","four","five"};
		System.out.println("for循环：");
		for (int i = 0; i < array.length; i++) {//传统for循环
			String str = array[i];
			System.out.println(str);
		}
		System.out.println("---------------测试1-----------------");
		/*
		 * 新循环是编译器认可而不是虚拟机
		 * 编译器在编译后会将代码改为普通for循环
		 * 遍历数组。
		 */
		System.out.println("foreach循环：");
		for (String str : array) {				//foreach循环
			System.out.println(str);
		}
		System.out.println("---------------测试2-----------------");
		Collection c = new ArrayList();
		c.add("java");
		c.add("android");
		c.add("c++");
		c.add("php");
		c.add("ios");
		/*
		 * foreach循环遍历集合就是迭代器遍历集合。
		 * 所以不要在遍历的过程中使用集合的方法增删元素。
		 */
		for (Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}
}
