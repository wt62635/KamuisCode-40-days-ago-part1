package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 排序练习
 * @author Administrator
 *
 */
public class SortListDemo03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*
		 * 向集合中存放10个随机数（1-100之间）
		 */
		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println(list);
		/*
		 * 按照数字从大到小排序
		 * 需要提供一个比较器
		 */
		Collections.sort(list , new Comparator<Integer>(){
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		});
		System.out.println(list);
	}
}
