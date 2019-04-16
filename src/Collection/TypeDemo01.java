package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型 JDK5推出时推出的一个特性
 * 泛型又称为参数化类型，允许我们在使用一个类时
 * 指定其内部属性，方法的参数，方法的返回值等的类型。
 * 这使得我们在使用一个类时灵活性提高。
 * 
 * 泛型在集合中广泛应用，用于指定集合中元素的实际类型，
 * 若某个类支持泛型，我们使用时没有指定实际类型，则默认为原型Object。
 * @author Administrator
 *
 */
public class TypeDemo01 <E>{
	public static void main(String[] args) {
		//在创建实例对象时可以通过泛型指定数据类型（但不能指定基本类型，需要使用包装类）
		Collection<String> c =  new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
	//	c.add(1);//编译不通过
		/*
		 * foreach循环可以直接用泛型实际类型接收元素
		 */
		for (String str : c) {
			System.out.println(str);
		}
		/*
		 * 迭代器也支持泛型，与其遍历的集合泛型一致即可
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			String str =  it.next();
			System.out.println(str);
		}
	}
}
