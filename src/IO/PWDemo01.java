package IO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流 →（加速用）
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 块写文本数据，加快写出效率
 * 
 * 具有自动行刷新的缓冲字符输出流
 * java.io.PrintWriter
 * 
 * @author Administrator
 */
public class PWDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 向pw.txt文件中写出数据
		 * PW提供了直接对文件写操作的构造方法：
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * 也可以再传入一个String类型参数，指定字符集。
		 */
		PrintWriter pw = new PrintWriter("pw.txt","uft-8");// PrintWriter ← 高级流
		pw.println("This is the String.");
		pw.println("This is the String,too.");
		
		System.out.println("写出完毕");
		pw.close();//若不关闭，则无法写入。
	}
}
