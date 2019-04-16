
public class Demo13 {
	public static void main(String[] args) {
		/*
		 * 大小写转换
		 */
		String str = "HelloWorld";
		String s  = str.toUpperCase();//转换大写
		System.out.println(s);
		String s1 = s.toLowerCase();//转换小写
		System.out.println(s1);
		
		//经典用途：比较验证码
		String code = "6d3F";
		String input = "6D3F";
		//转小写比较编发是否一致
		System.out.println(code.toLowerCase().equals(input.toLowerCase()));
		//判断文件是否一PNG为结尾
		String file ="logo.PNG";
		System.out.println(file.toLowerCase().endsWith(".png"));
	}
}
