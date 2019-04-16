
public class Demo11 {
	public static void main(String[] args) {
		/*
		 * StringBuilder类
		 * 	可变字符串，其方法可以修改StringBuilder中
		 * 	字符数组的内容。因为没有复制新字符数组，
		 * 	所以相对于String API 其操作性能好
		 */
		//创建StringBuilder对象时，会自动在内部创建一个16个元素的char数组
		StringBuilder buf = new StringBuilder();
		//最佳数据时，数据会自动填充到char数组中
		buf.append("Kamui");
		buf.append("Subaru");
		//当超过16个元素时会自动扩容(在原基础上乘以2再加2)。
		buf.insert(5," & ");//指定位置插入字符串
		//.delete()删除，.replace()替换等，详见API文档。
		System.out.println(buf);//输出结果：Kamui & Subaru
		/*
		 * StringBuilder  API  方法会返回
		 * StringBuilder  对象自身，这样方便连续使用 . 调用其方法，
		 * 	可以大大简化程序的书写
		 */
	}
}
