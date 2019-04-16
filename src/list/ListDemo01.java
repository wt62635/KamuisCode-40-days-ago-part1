package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List线性表
 * List是Collection常用的子接口，是一个可重复集合并且有序。
 * 其单独提供了一套可以通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArratList:
 * 使用数组实现，查询效率好，增删元素慢
 * 
 * java.util.LinkedList:
 * 使用链表实现，增删元素效率好（收尾增删元素最快），查询效率慢
 * 
 * 在对性能没有特别苛刻的要求时通常用ArrayList
 * @author Administrator
 *
 */
public class ListDemo01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取指定下标对应的元素
		 */
		String str = list.get(1);
		System.out.println(str);
		//普通for循环可以遍历List集合
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
		}
		
		//[one,2,three,four,five]
//		list.set(1, "2");
//		System.out.println(list);
		
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置，返回值为原位置
		 * 对应元素
		 */
		//[one,2,three,four,five]
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
		
		/* 练习题：
		 * 在不创建新集合的前提下，
		 * 将list合集元素倒序
		 * 禁止使用：Collections.reverse(list);
		 */
		//[five,four,three,2,one]
		for (int i = 0; i < list.size()/2; i++) {
			String s = list.get(i);
			s = list.set(list.size()-1-i, s);
			list.set(i, s);
		}
		System.out.println(list);
	}
}
