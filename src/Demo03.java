
public class Demo03 {
	public static void main(String[] args) {
		String str = "您好Hello" ;
		//下标位置：	  0123456
		int len = str.length();//获取字符串中字符个数len=7。
		char c =str.charAt(1);//获取所属下标值c=好。
		System.out.println(c);
		System.out.println((int)c);//转换字符为int输出Unicode值：22909
		c = str.charAt(3);//获取所属下标值c=e。
		System.out.println(c);
		System.out.println((int)c);//转换字符为int输出Unicode值：101
		
		/**实例：统计字符串str中英文字符的个数。 */
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//通过下标获取每个字符
			if(('A' <= ch && ch <= 'Z')||//设定大写字母的编码范围条件
			('a' <= ch && ch <= 'z')) {//设定小写字母的编码范围条件
				count++ ;
			}
		}
		System.out.println("字符串str中的英文字符的个数为：" + count);
		//输出结果为：5
	}
}
