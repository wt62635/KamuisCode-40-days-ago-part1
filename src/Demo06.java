import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的URL:");
		String url = sc.nextLine();
		System.out.println("主机名为：" + getHost(url));
		//输入值：http://www.Acfun.cn	
		//测试结果：www.Acfun.cn
		
		//输入值：http://www.acfun.cn/member/#area=mail	
		//测试结果：www.Acfun.cn
		
		//输入值：www.acfun.cn/member/#area=mail	
		//测试结果：www.Acfun.cn
	}
	/*
	 * 实现一个方法，输入任意URL地址，返回其中的主机名
	 */
	public static String getHost(String url) {
		int count = 0 ;
		for (int i = 0; i < url.length(); i++) {
			char ch = url.charAt(i);
			if(ch=='/') {
				count++;
			}
		}
		if(count>2) {
			int indexStart = url.indexOf("/")+2;//以第二个url的斜杠为起点
			int indexEnd = url.indexOf("/",7);//如果输入的url中包含2个以上更多"/"时
			String str2 = url.substring(indexStart,indexEnd);
			return str2;
		}
		else if(count==2&&url.indexOf('/')==5) {
			int indexStart = url.indexOf('/')+2;//以第二个url的斜杠为起点
			String str1 = url.substring(indexStart);
			return str1;
		}
		String str3 = url.substring(0, url.indexOf('/'));
		return str3;
	}
}
