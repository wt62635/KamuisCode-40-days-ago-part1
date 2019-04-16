package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Demo07x1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String  fileName = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
		System.out.println("请开始输入内容：");
		while(true) {
			String line = scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			byte[]data = line.getBytes("utf-8");
			raf.write(data);
		}
		System.out.println("再见！");
		raf.close();
	}
}
