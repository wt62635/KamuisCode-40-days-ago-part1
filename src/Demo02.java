
public class Demo02 {
	public static final String S = "ABC";
	public static void main(String[] args) {
		/*
		 * String常量池
		 * 1.JAVA将静态字符串
		 * 	字面量"ABC"
		 * 	常量 static final String S;
		 * 	字面量 常量的运算结果：	'A'+"BC"
		 * 2.Java 会将静态字符串的引用缓存到
		 * 	Java 常量池，在“一样”时，重用相同字符串对象
		 * 3.动态字符串，不会被重用。
		 * 	new创建的字符串
		 * 	字符串变量连接的结果
		 */
		String s1 = "ABC" ;
		String s2 = "ABC" ;
		String s3 = new String("ABC") ;
		String s4 = 'A'+"BC";//字面量连接
		String s5 = S;
		String ss1 = "A";
		String ss2 = "BC";
		String s6 = ss1 + ss2 ; //字量连接
		System.out.println(s1==s2);//输出true
		System.out.println(s1==s3);//输出false
	}
}
