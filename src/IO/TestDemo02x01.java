package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestDemo02x01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(fileName),"uft-8"
								)
						),true
				);//加上这个true←启动autoFlush效果可以实现实时写入字符串。
		System.out.println("请开始输入内容：");
		while(true) {
			String line = sc.nextLine();
			if("exit".equals(line.toLowerCase())){
				break;
			}
			pw.println(line);
		}
		System.out.println("再见");
		pw.close();
	}
	/*
	 * 当创建PrintWriter时，构造方法第一个参数为一个流时，
	 * 就支持再传入一个boolean型的参数，当这个参数值为true时
	 * 就开启了自动刷新功能。
	 * 这是调用该PW的println方法时写出一行字符串后会自动flush。
	 */
}