package Exception;
/**
 * java异常处理机制
 * try-catch块
 * 语法定义：
 * try{
 * 代码片段
 * }catch(XXXException e){
 * 	当try块中代码抛出XXXException后的处理代码
 * }
 * @author Administrator
 *
 */
public class Try_CatchDemo01 {
	public static void main(String[] args) {
		System.out.println("程序启动！");
		try {
			String str = "a";
			System.out.println(str.charAt(0));
			System.out.println(str.length());//空指针异常
			System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e) {
			System.out.println("出现空指针异常！");
			/*
			 * 可以定义多个catch,当不同的异常我们有不同的处理手段时。
			 * 可以分别捕获这些异常并处理。
			 */
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界异常");
			/*
			 * 在最后一个catch处处理Exception,可以避免
			 * 因为一个未捕获的异常导致程序中断。
			 */
		}catch(Exception e) {
			System.out.println("出现其他异常。");
		}
		System.out.println("程序结束！");
	}
}
