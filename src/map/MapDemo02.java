package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map的便利操作
 * Map支持三种遍历方式：
 * 1.遍历所有的key
 * 2.遍历每一组键组对
 * 3.便利所有的value（相对不常用）
 * 
 */
public class MapDemo02 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		/*
		 * 遍历所有的key
		 * Set keySet()
		 * 将当前Map中所有的key以一个Set集合形式返回。
		 */
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:" + key);
		}
		
		/*
		 * 遍历一组键值对
		 * Set<Entry> entrySet()
		 * 将Map集合中的键值
		 * 
		 * java.util.Map.Entry
		 * Entry每个实例用于表示Map中的一组键值对
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		/*
		 * Cokkection values()
		 * 将当前Map中所有的value以一个集合形式返回
		 */
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}
