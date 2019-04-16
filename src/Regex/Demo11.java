package Regex;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * split方法
		 * String arr[] = str.split(分隔符规则)
		 * 如使用分隔符： ,\s
		 * 结果为{“1”,“Kamui”,“12345678910”,“kamui_h@outlook.cn”
		 */
		String str = "1, Kamui, 12345678910, kamui_h@outlook.cn";
		//按照分隔符“,”拆分字符串，获取全部信息
		//拆分后，输出结果中将没有分隔符
		String arr[] = str.split(",\\s");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
