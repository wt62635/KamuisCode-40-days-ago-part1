package Obejct;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * "懒人"角度理解API
		 * 
		 * 1.从java 5(java 1.5)开始提供了自动包装(Auto Boxing)功能
		 * 可以简化编码.
		 * 2.简单理解,就是包装类型和基本类型之间可以自动转换类型赋值.
		 * 3.自动包装功能是利用编译器实现的,java编译器将代码进行"擦除"(替换) ← 简称:编译擦除
		 * 原理如下:
		 * 		Integer i = 5;
		 * 		替换为
		 * 		Integer i = Integer.valueOf(5);
		 * 
		 * 		int n = i ;
		 * 		替换为
		 * 		int n = i.intValue();
		 * 4.赋值,计算,参数传递,返回值等等,都会自动发生包装.
		 */
		//自动包装(装箱):将基本类型自动包装为 包装类型
		Integer i1 = new Integer(5);//1.5以前的写法
		Integer i2 = 8;//Integer.valueOf(5);	←自动包装  1.5以后的写法
		//自动拆包(拆箱):将包装类型自动转化为基本类型
		int n = i2 ;//i2.intValue();			←自动拆包
		//测试
		System.out.println(i1);//输出:5
		System.out.println(i2);//输出:8
		System.out.println(n);//输出:8
		
		Double d = 4.5;//Double.valueOf(4.5);
		double x = d ;//d.doubleValue();
		System.out.println(d);//输出:4.5
		System.out.println(x);//输出:4.5
		
		Object obj = 5;// ← 这也是自动包装
		double y = test(5.6,7);
		System.out.println(y);//输出:12.6
		
	}
	public static double test(Double d , Integer i) {
		Double x = d + i;// ← 这是数值计算
		return x;//返回值会自动拆包
	}
}
