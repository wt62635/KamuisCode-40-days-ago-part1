
public class Demo07 {
	public static void main(String[] args) {
		/*
		 * lastIndexOf方法
		 *	 返回指定字符在此字符串中最后一次出现处的索引。
		 */
		String url = "http://www.acfun.cn/member/#area=mail";
		int index = url.lastIndexOf("cn");
		System.out.println(index);
		index = url.lastIndexOf("z");
		System.out.println(index);
	}
}
