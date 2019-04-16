package Obejct;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 包装类 warp class
		 * 
		 * 1.将基本类型数据包装为对象
		 * 2.因为基本类型不是对象,所以利用包装类将
		 * 基本类型转换为对象,可以将基本类型作为对象管理.
		 * 3.java为了性能,设计了基本类型.
		 * 为了将基本类型转换为对象设计了包装类.
		 * 
		 */
		/*
		 *int n = 5;
		*Integer i = new Integer(1);
		*System.out.println(n);
		*System.out.println(i);
		*
		*8种包装类:
		*1. Byte byte
		*2. Short short
		*3. Integer int
		*4. Long long
		*5. Float float
		*6. Double double 
		*7. Boolean boolean
		*8. Character char
		 */
		
		/*
		 * 数值属性Byte , Short , Integer , Long, Float, Double的父类型是Number
		 * 
		 * 1. Java数值类型的公共方法定义在Number类型上:
		 * 在Number类型上.
		 * 2.Number类型上定义了数值类型互换的方法.
		 * 3.与基本类型相似,不过转换类型的时候会发生精度损失,或者溢出现象.
		 * 4.也可以利用Number方法获取当前包装类型对象中的值.
		 */
	}
}
