package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 使用PrintWriter并自行使用流连接形式创建。
 * 
 * 首先输入一个文件名，然后对该文件操作，之后每输入的一行字符串都按行写入到该文件中，
 * 当输入“exit"时，程序退出。
 * 
 * @author Administrator
 *
 */
public class TestDemo02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		FileOutputStream fos = new FileOutputStream(sc.nextLine());
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		System.out.println("文件创建成功！");
		while(true) {
			System.out.println("请输入内容，或输入“exit”退出程序。");
			String str = sc.nextLine();
			if(!"exit".equals(str)){
				pw.println(str);
				pw.flush();
			}else {
				System.out.println("已接收退出指令");
				break;
			}
		}
		sc.close();
		pw.close();
		System.out.println("程序已退出！");
		System.exit(1);
	}
}
