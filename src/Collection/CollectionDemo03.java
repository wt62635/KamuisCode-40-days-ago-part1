package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 * @author Administrator
 *
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		System.out.println(c);
		
		Point p = new Point(1,2);
		//remove方法也是通过equals判断实现移除效果，故而也需要重写equals支持
		c.remove(p);
		System.out.println(c);
	}
}
