package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection 集合框架
 * Collection是所有集合的钉机接口，定义了所有集合都应到具备的操作。
 * 
 * 集合和数组一样，用来保存一组元素，其提供了便于操作集合的相关方法，使用更方便。
 * 
 * 常见的子接口：
 * java.util.List:可重复集合，并有序
 * java.util.Set:不可重复集合
 * 元素是否重复的标准是依靠元素自身equals比较的结果
 * 
 * @author Administrator
 *
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
	//	Collection c = new ArrayList();//List
		Collection c = new HashSet();//Set
		/*
		 * boolean add(E e)
		 * 向集合中添加给定元素，若成功添加则返回true
		 */
		System.out.println(c.add("666"));
		System.out.println(c.add("666"));
		c.add(true);
		c.add(123);
		c.add(123);
		c.add("Kamui");
		c.add("Kamui");
		c.add('X');
		c.add('X');
		c.add(15.25);
		c.add(15.25);
		c.add(1234567890);
		c.add(1234567890);
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 * 注：集合无长度之说，只有元素个数之说。（客观的来说集合的长度就是int型的最大值）
		 */
		int size = c.size();
		System.out.println("size:" + size);
		c.add("plus");
		System.out.println("size:" + c.size());
		/*
		 * boolean isEmoty()
		 * 判断当前集合是否为空集
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("是否为空集：" + isEmpty);
		/*
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		System.out.println(c);
		System.out.println("size:" + c.size());
		System.out.println("是否为空集：" + c.isEmpty());
	}
}
