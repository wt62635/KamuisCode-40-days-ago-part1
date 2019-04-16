package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * 判断当前集合是否包含给定元素。
 * @author Administrator
 *
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();//注：此处可以加入泛型<Point>
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		/*
		 * 集合重写了toString方法，而每个元素输出时
		 * 是利用元素自身toString返回的字符串进行输出的。
		 */
		System.out.println(c);
		/*
		 * contains方法用于判断集合中是否包含此对象
		 * 是否包含是根据元素equals比较的结果而定
		 * 注：故而会经常根据实际情况而重写equals方法
		 */
		Point p = new Point(1,2);
		boolean contains = c.contains(p);
		System.out.println(contains);
	}
}
