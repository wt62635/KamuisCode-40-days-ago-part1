package Regex;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 检查用户名规则
		 * ^ 匹配开头
		 * $ 匹配结尾
		 * 
		 * 提示：^ $ + find()方法相当于matches()方法
		 */
		String name = "Tom1234567891231313215";
		String reg = "\\w{8,18}";
		System.out.println("正则：" + reg + "\t name:" + name);
		Utils.test(reg, name);
		
		reg = "^\\\\w{8,18}$";
		System.out.println("正则：" + reg + "\t name:" + name);
		Utils.test(reg, name);
		
		name = "Tom123456";
		System.out.println("正则：" + reg + "\t name:" + name);
		Utils.test(reg, name);
	}
}
