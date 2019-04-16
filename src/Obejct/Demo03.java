package Obejct;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * Java API类的 toString equals
		 * 1.Java 的API大多重写了toString equals
		 * 2.String重写了toString equals
		 * 3.StringBuilder 也重写了
		 * 
		 * 比较两个字符串是否相等,应该使用equals方法!
		 */
		//==不能用于比较String属性是否相等
		String s1 = "ABC";
		String s2 = "ABC";
		System.out.println(s1==s2);//true
		String s3 = new String("ABC");
		System.out.println(s1==s3);//false
		
		//比较两个字符串是否相等,应该使用equals方法
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
	}
}
