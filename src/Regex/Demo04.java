package Regex;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 测试数字字符集2
		 */
		String reg =  "Hello.";	//. 表示任意字符
		String text = "Let\'s try Hello1 Hello8" + "Hello9 Hello Kitty ";
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		reg =  "Hello\\d";	//\d 表示任意一个数字字符，相当于[0-9] 表示单词字符，相当于[a-zA-Z0-9_]
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		reg =  "Hello\\s";	//\s 表示空白字符，相当于[\t\n\x0B\f\r]
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		reg =  "Hello\\w";	//\w 表示单词字符，相当于[a-zA-Z0-9_]
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		reg =  "\\w{5}";	//\w{n}相当于n个\w
		System.out.println("正则" + reg);
		Utils.test(reg, text);
	}
}
