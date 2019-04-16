package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集
 * @author Administrator
 */
public class ListDemo03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		/*
		 * List subList(int start,int end)
		 * 获取当前集合指定范围内的子集
		 */
		List<Integer> subList = list.subList(3, 8);//通过数组下标获取一段子集。
		System.out.println(subList);
		
		//练习题：将子集元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		//[30,40,50,60,70]
		System.out.println(subList);
		
		/*
		 * 对子集的操作就是对原集合对应元素的操作。
		 */
		System.out.println(list);
		
		/*
		 * 删除list集合中的2-8
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
