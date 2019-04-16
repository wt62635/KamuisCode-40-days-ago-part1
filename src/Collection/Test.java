package Collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 面试题：回答注释处的输出结果。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		int a = 1 ;
		String s = "Hello";
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		c.add(p);
		test(a,s,p,c);
		System.out.println("a:" + a);//???? 
		System.out.println("s:" + s);//???? 
		System.out.println("p:" + p);//???? 
		System.out.println("c:" + c);//???? 
	}
	public static void test(int a , String s, Point p,Collection c) {
		a++;
		s = s + "World";
		p.setX(2);
		p = new Point(3,4);
		c.clear();
		c.add(p);
		p.setX(5);
		c = new ArrayList();
		p = new Point(7,8);
		c.add(p);
	}
}
