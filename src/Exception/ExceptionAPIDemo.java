package Exception;
/**
 * 异常常用方法介绍
 * @author Administrator
 *
 */
public class ExceptionAPIDemo {
	public static void main(String[] args) {
		System.out.println("程序启动！");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e) {
			//获取错误信息
			String message = e.getMessage();//Message可以自行修改设置。
			System.out.println("message:" + message);
//			System.out.println("出错！");//out输出
			
			e.printStackTrace();//输出错误堆栈信息，便于debug
			
//			System.err.println("这是一个报错！");//erro输出
		}
		System.out.println("程序结束！");
	}
}
