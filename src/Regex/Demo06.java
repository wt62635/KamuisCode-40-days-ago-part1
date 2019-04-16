package Regex;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 匹配jar文件名规则
		 * 多个单词字符.jar
		 * jar文件：\w+\.jar
		 * 特殊字符：使用转义，如：\.用于匹配.
		 */
		String reg =  "\\w+\\.jar";	//. 表示任意字符
		String text = "abc.txt,def.docx,logo.png,rt_1235.jar,spring_.jar,mybatis.jar,test.txt,myjar.doc";
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		reg = "\\w+\\.\\w{3,4}";
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
		//抓取以“_数字”为结尾的文件
		//1.\\w+ 以一个以上的单词字符为开头
		//2. _用于匹配下滑线
		//3.\\d*数字可以没有或更多个数字
		//4.\\.jar 匹配.jar
		reg = "\\w+_\\d*\\.jar";
		System.out.println("正则" + reg);
		Utils.test(reg, text);
		
	}
}
