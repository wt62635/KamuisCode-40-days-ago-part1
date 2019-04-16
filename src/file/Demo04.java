package file;

import java.io.File;
import java.io.IOException;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		/*
		 * 实际开发中我们在指定路径时通常使用
		 * 相对路径
		 * 相对路径有更好的跨平台性。
		 * "."：表示当前目录，当前目录具体指哪里，
		 * 要看当前程序大的运行环境而定，比如在eclipse
		 * 中运行当前程序时，当前目录指的就是当前程序所在的项目目录
		 * 
		 * File API 可以创建“系列文件夹”
		 * 将目标路径上的系列文件夹都创建
		 * file.mkfirs()
		 */
		File file = new File("./demo.txt");
		if(!file.exists()) {//exits()判断当前File表示的文件或目录是否真实存在，如果不存在
			file.createNewFile();
			System.out.println("文件已创建！");
		}else {//否则
			System.out.println("文件已存在！");
		}
		File dir = new File("./MkdirsTest/test/01/011/0112");
		if(dir.mkdirs()) {
			System.out.println("文件夹已创建！");
		}else {
			System.out.println("文件夹已存在！");
		}
	}
}
