package Obejct;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * Object是所有java类的最终父类型
		 * 
		 * 包装类
		 * 用于将基本类型包装为对象
		 * 以及提供了java中最基本的方法
		 * 
		 * Object
		 * 1.任何类型如果没有父类型，则默认继承于Object。
		 * 任何类最终都继承与Object
		 * 2.Java将全部类型都有的属性和方法定义到了Object类型上
		 * 3.Object定义的方法，任何对象都有
		 * 	equals方法
		 * toString方法
		 */
		
		/*
		 * toString()方法
		 * 1.返回对象的文本描述
		 * 2.因为默认实现返回了“没有意义的”类全名@散列码
		 * 3.所以java建议重写toString()，修改toString返回值，
		 * 一般修改为返回对象当前的属性，用于Debug。
		 * 4.Java的很多API会自动调用toString简化编程
		 * 5.Eclipse提供了快捷工具，用于方便重写toString()返回对象的属性。
		 */
		Foo foo =new Foo();
		Point p = new Point();
		//println会自动调用toString()方法
		System.out.println(p);
	}
}
class Foo{
}
class Point{
	int x ;
	int y ;
	String s ;
	boolean b ;
	float f ;
	char c ;
	long l ;
	double d ;
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", s=" + s + ", b=" + b + ", f=" + f + ", c=" + c + ", l=" + l + ", d="
				+ d + "]";
	}
}
