package file;

import java.io.File;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * File API 可以创建"系列文件夹"
		 * 
		 * file.mkdirs() ← 加上s即可,如果没有s则是指只创建一个文件夹
		 */
		File file = new File("D:/demo/a/b/c/d");
		boolean b = file.mkdirs();
		file.mkdirs();
		//如果指定的路径中缺少路径中的文件夹,则会默认继续创建下去.
	}
}
