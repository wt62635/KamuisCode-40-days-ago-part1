package Exception;

import java.io.FileOutputStream;

/**
 * JDK7出现后，有一个特性：自动关闭
 * 
 * @author Administrator
 *
 */
public class AutoCloseDemo {
	public static void main(String[] args) {
		try(
			/*
			* 只有实现了Autocloseable接口的类才可以定义在这里.流，RAF都实现了这个接口。
			* 编译器会将在这里定义的类最终在finally中关闭。
			*/
			FileOutputStream fos = new FileOutputStream("fos.dat")
			) {
			fos.write(1);
		}catch(Exception e) {
			System.out.println("出错！");
		}
	}
}
