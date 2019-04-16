package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 从文件中读取字节
 * @author Administrator
 *
 */
public class FISDemo01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos");
		byte data[] = new byte[100];
		int len = fis.read(data);
		fis.read(data);
		String str = new String(data,0,len,"utf-8");
		System.out.println(str);
		
		fis.close();
	}
}
