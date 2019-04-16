
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * indexOf 方法
		 */
		String str = "HelloWorld";
		//下标		  0123456789
		//通过indexOf方法查找第一个匹配的字符下标
		int index1 = str.indexOf("o");
		System.out.println(index1);//输出结果为：4
		//给indexOf方法传入第二个参数，通过重载方法，把第二个参数作为起点下标开始查找。
		int index2 = str.indexOf("o",5);
		System.out.println(index2);//输出结果为：6
		//如果找不到符合条件的值，则会返回-1。
		int index3 = str.indexOf("a");
		System.out.println(index3);//输出结果为：-1
	}
}
