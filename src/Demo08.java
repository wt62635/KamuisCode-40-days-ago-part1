public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 解析URL，将查询的文件名截取出来
		 */
		System.out.println("http://www.acfun.cn/a/ac1111.html的文件名为：" + "\n"
							+fileName("http://www.acfun.cn/a/ac1111.html"));
		System.out.println("http://acfun.cn/a/ac2222.jpg的文件名为：" + "\n"
							+fileName("http://acfun.cn/a/ac2222.jpg"));
		System.out.println("www.acfun.cn/a/ac3333.css的文件名为：" + "\n"
							+fileName("www.acfun.cn/a/ac3333.css"));
	}
	public static String fileName(String url) {
		int indexStart = url.lastIndexOf('/') + 1;
		String str = url.substring(indexStart);
		return str;
	}
}
