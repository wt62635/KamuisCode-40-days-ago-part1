package Regex;

public class Demo01 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		/*	
		 * （注：编写依据为Unicode）
		 * 正则规则 字符集：
		 * 1.约定字符范围
		 * 	[0123456789]一个字符其范围0~9
		 * 	案例：	Hello[0-9]
		 * 			匪兵[甲乙丙丁]
		 * 2.如果连续的字符可以使用-
		 * Hello[0-9]
		 * P[a-z]
		 * P[A-Z]
		 * P[]
		 * P[A-Za-z]
		 * 3.缩写的字符集，用特定符号代表一个字符范围，
		 * 	可以简化正则的书写
		 * 	[0-9]可以缩写为\d ←（digit即数字）
		 * 	[~[0-9]]代表不是数字\D ←（通常不用，表示非数字）
		 */
	}
	public void testRegex() {
		String regex1 = "[a-z]";
		String regex2 = "[A-Z]";
		String regex3 = "[^a-z]";
		String regex4 = "[a-z&&[^bc]]";
		String regex5 = "\\d";		//[0-9]
		String regex6 = "\\D";		//[^0-9]
		String regex7 = "\\s";
		String regex8 = "\\S";
		String regex9 = "\\w";
		String regex10 = "\\W";
		
	}
}
