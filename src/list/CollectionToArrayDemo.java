package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 将一个集合转换为数组
 * Collection提供了将当前集合转换为数组的方法：toArray
 * @author Administrator
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
//已淘汰：	Object array[] = c.toArray();
		String array[] = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	}
}
