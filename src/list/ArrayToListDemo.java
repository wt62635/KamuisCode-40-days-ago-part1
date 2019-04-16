package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合
 * 数组工具类：Arrays提供了一个静态方法asList
 * @author Administrator
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String array[] = {"one","two","three","four","five"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		/*
		 * ※对集合元素操作就是对原数组对应元素的操作
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		/*
		 * 由于数组是定长的，所以对于从数组转换过来的集合而言，
		 * 虽然可以修改元素，但是
		 * 增删元素的操作都是不支持的，调用会抛出异常。
		 */
		//报错：不支持此类操作↓
//		list.add("five");
//		list.remove(1);
//		list.removeAll(list);
		/*
		 * 所有集合都支持一个参数为Collection的构造方法，
		 * 作用是在创建当前集合的同时包含给定集合的所有元素。
		 */
		List<String> list2 = new ArrayList<>(list);//←传入集合作为参数
		System.out.println("list2:" + list2);
		list2.add("newadd");
		System.out.println("list2:" + list2);
	}
}
