public class Demo01 {
	public static void main(String[] args) {
		/*
		 * "String的对象"是不可变的
		 * String类型的引用值是可以改变的
		 */
		//str是String类型的引用
		//"ABC"是String类型的对象

		String str = "ABC";

//代码执行过程等同于：
//char value[] = {'A', 'B', 'C'};
    //String str = new String(value);

		String s = str ;//声明2个对象（str和s）指向同一个堆地址
		str += "def";
		System.out.println(str);	//输出：ABCdef
		System.out.println(s); //输出：ABC
	}
}
