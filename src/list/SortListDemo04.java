package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 * @author Administrator
 *
 */
public class SortListDemo04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		/*
		 * String已经实现了Comparable接口，
		 * 定义的比较规则是按照字符的unicode编码大小比较
		 * 对于排序中文时，没有什么效果。
		 */
		//英文
		list.add("Kamui");
		list.add("Subaru");
		list.add("Takashi");
		list.add("Tsubasa");
		list.add("Kagami");
		list.add("Yamato");
		list.add("Sakura");
		list.add("Saya");
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
		
		list.clear();
		//中文
		list.add("卡穆依");
		list.add("昂");
		list.add("隆史");
		list.add("羽翼");
		list.add("镜");
		list.add("大和");
		list.add("樱");
		list.add("沙耶");
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
		
		//定义一个比较器，按照字符多少排序
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		});
		System.out.println("排序后："+list);
	}
}
