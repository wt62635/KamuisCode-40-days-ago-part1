package file;

import java.io.File;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		/*
		 *	创建文件时,如果所在文件夹不存在,则会抛出异常:
		 *java.io.IOException: 系统找不到指定的路径。
		 *如果不创建文件夹,直接创建文件时,也会抛出此异常.
		 */
		File file = new File("D:/demo1/abc/t.txt");
		file.createNewFile();
	}
}
