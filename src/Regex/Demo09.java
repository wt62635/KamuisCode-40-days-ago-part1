package Regex;

public class Demo09 {
	public static void main(String[] args) {
		/*
		 * String中的正则API
		 * 1.matches()方法，底层就是  正则API
		 * 	 matches()方法。
		 * 2.功能一样，都是对字符串整体进行规则匹配
		 * 3.相对于正则matches()方法，
		 * String中的matches()方法使用更加简便
		 * 
		 * 案例：检查用户名是否是8~10个单词字符
		 */
		String name = "Tom123456";
		String reg = "^\\w{8,10}$";
		//检查name的整体是否符合reg规定的规则
		boolean b =  name.matches(reg);
		System.out.println(b);
		/*String 的matches()方法只做规则检查
		*不返回匹配结果，如果需要匹配结果
		*则需要使用Java正则API
		*/
	}
}
