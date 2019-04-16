package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map查找表
 * Map体现的是样子是一个多行两列的表格，其中左列称为key，右列称为value.
 * Map总是根据key来获取对应的value，所以可以将查询条件作为key，将查找内容作为value保存，以便后期获取。
 * 
 * 常用实现类：java.util.HashMap散列表（哈希表）
 * 			java.util.TreeMap二叉树实现的Map
 * 
 * 散列表是当今查询速度最快的数据结构。
 * 其不受数据量的大小而影响速度。
 * @author Administrator
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		/*
		 * V put(K  k ,V v)
		 * 将给定的key-value对保存到Map中
		 * 
		 * Map有一个要求：key不允许重复（equals比较）
		 * 若使用Map中已经存在的Key存放一个Value,
		 * 则是替换Value操作，那么put方法的返回值就是被替换的Value.
		 * 若给定的Key当前Map中不存在，则返回值为null.
		 */
		Integer num = map.put("语文", 99);
		
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("化学", 96);
		map.put("物理", 95);
		map.put("历史", 94);
		Integer num2 = map.put("历史", 123);//替换上一个Value
		System.out.println(map);//{物理=95, 历史=123, 数学=98, 化学=96, 语文=99, 英语=97}
		System.out.println(num);//null	←Value没被替换时返回值为空
		System.out.println(num2);//94 ←当Value值被替换时会返回值
		
		Integer num3 = map.get("英语");//可以取得"英语"key的Value值。
		System.out.println(num3);//94
		
		Integer num4 = map.get("体育");//尝试取出不存在的key
		System.out.println(num4);//null
		
		int size = map.size();//取得长度
		System.out.println(size);
		
		boolean isEmpty = map.isEmpty();//map判断是否为空
		System.out.println(isEmpty);//false
				
		Integer num5 = map.remove("英语");//移除一个key的Value,并返回其值
		System.out.println(num5);//97
		
		boolean ck =  map.containsKey("化学");
		System.out.println("包含key:" + ck);
		
		boolean cv =  map.containsValue(123);
		System.out.println("包含Value:" + cv);
		
		map.clear();//清空map集合中的所有内容。
	}
}
