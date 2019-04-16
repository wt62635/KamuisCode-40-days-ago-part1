package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 * @author Administrator
 *
 */

public class CollectionDemo05 {
	public static void main(String[] args) {
		Collection c1 = new HashSet();
		c1.add("java");
		c1.add("c++");
		c1.add("c");
		System.out.println("c1:" + c1);//c++,java,c
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println("c2:" + c2);//android,ios,java
		/*
		 * 将给定的集合中所有元素添加到当前集合中
		 * 由于set集合是不可重复集合，所以若遇到重复元素会被忽略。
		 */
		c1.addAll(c2);
		System.out.println("c1:" + c1);//c++,java,c,android,ios
		
		Collection c3 = new ArrayList();
		c3.add("c++");
		c3.add("ios");
		c3.add("php");
		System.out.println("c3:" + c3);//c++,ios
		/*
		 * 判断当前集合是否包含给定集合的所有元素
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("全包含：" + contains);
		/*
		 * 删除当前集合中与给定集合的共有元素
		 */
		c1.removeAll(c3);
		System.out.println("c1:" + c1);
		System.out.println("c3:" + c3);
	}
}
