package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add,remove方法
 * @author Administrator
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/*
		 * void add(int index,E e)
		 * 将给定元素插入到指定位置
		 */
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * 删除并返回指定位置对应的元素
		 */
		System.out.println(list.remove(2));
		System.out.println(list);
		//返回值可以通过声明一个变量来接收。
		String old = list.remove(4);
		System.out.println(list);
		System.out.println(old);
	}
}
