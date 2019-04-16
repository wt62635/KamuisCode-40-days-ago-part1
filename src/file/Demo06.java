package file;

import java.io.File;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录下的所有内容
		 */
		File dir = new File("./MkdirsTest");
		if(dir.isDirectory()) {//判断其是否为一个目录
			File subs[] = dir.listFiles();//获取一个目录下的所有子项
			System.out.println(subs.length);
			for (int i = 0; i < subs.length; i++) {
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
	}
}
