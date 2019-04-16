public class Demo05 {
	public static void main(String[] args) {
		/*
		 * substring方法
		 * 	截取字符串
		 */
		String url = "http://www.Acfun.cn/a/b.html";
		//用法1
		//截取主机地址：从11开始截取到19（不包含）
		String host = url.substring(11,19);
		System.out.println(host);//输出结果：Acfun.cn
		//用法2
		//按照长度截取：从11开始连续截取8个字符
		String str = url.substring(11,11+8);
		System.out.println(str);//输出结果：Acfun.cn
		//测试1
		String str1 = url.substring(7, 19);
		System.out.println(str1);//输出结果：www.Acfun.cn
		//测试2
		String str2 = url.substring(7, 19);
		System.out.println(str2);//输出结果：www.Acfun.cn
		//用法3
		//从指定索引处的字符开始，直到此字符串末尾。
		String str3 = url.substring(7);
		System.out.println(str3);//输出结果：www.Acfun.cn/a/b.html
	}
}
