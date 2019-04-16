package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PW
 * @author Administrator
 *
 */
public class PWDemo02 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw2.txt");//文件输出流	←低级流
		//↓
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");//字节输出流 ←低级流(字符集应在转换流指定)
		//↓
		BufferedWriter bw = new BufferedWriter(osw);//缓冲字符流	←高级流
		//↓
		PrintWriter pw = new PrintWriter(bw);//缓冲字符输出流	←高级流
		
		pw.println("");
		
		pw.close();
	}
}
