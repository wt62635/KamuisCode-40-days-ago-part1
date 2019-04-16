import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的URL:");
		String url = sc.nextLine();
		System.out.println("主机名为：" + getHost(url));
	}
	public static String getHost(String url) {
		if(url.startsWith("http://")&&url.indexOf('/',7)!=-1) {
			int endIndex = url.indexOf('/', 7);
			String host = url.substring(7, endIndex);
			return host;
		}else if(url.startsWith("http://")) {
			String host = url.substring(7);
			return host;
		}else{
			return "错误：您输入的URL有误。 （URL地址格式应为：http://……）";
		}
	}
}
