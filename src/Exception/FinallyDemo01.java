package Exception;
/**
 * finally块
 * finally块是异常处理机制的最后一块，可以直接在
 * try块之后或者最后一个catch之后。
 * 
 * finally可以保证只要代码执行到try当中，无论try语句块中的内容是否出现异常，
 * finally块的代码必定执行。
 * 
 * 诸如释放资源这类操作（比如IO操作完的关闭就可以放在这里确保执行）
 * @author Administrator
 *
 */
public class FinallyDemo01 {
	public static void main(String[] args) {
		System.out.println("程序启动！");
		String str = null;
		try {
			System.out.println(str.length());
			//try语句块中报错以下的代码都不会执行。
			return;
		}catch(Exception e){
			System.out.println("程序出现异常!");
		}finally {
			System.out.println("finally内容被执行！");
		}
		System.out.println("程序结束！");
	}
}
