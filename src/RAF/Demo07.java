package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 实现一个简易记事本工具
 * 程序启动后，要求用户输入一个文件名，然后创建一个RAF对该文件进行读写操作。
 * 之后用户在控制台输入的每一行字符串都写入到这个文件中（写入文件的内容不考虑换行问题）。
 * 当用户输入exit时，程序退出。
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名称：");
		String input = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile("./"+input,"rw");
		System.out.println("请写入字符串：");
		input = sc.nextLine();
		while(!input.equals("exit")) {
			byte data[] = input.getBytes("utf-8");
			raf.write(data);
			System.out.println("写入成功！您可以继续写入，或输入‘exit’结束程序。");
			input = sc.nextLine();
		}
		System.out.println("程序即将结束，感谢使用。");
		sc.close();
		raf.close();
		System.exit(0);
	}
}
