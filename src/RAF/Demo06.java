package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 读取文本数据
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","r");
		//注：此处涉及到硬盘文件系统问题，关键词：NTFS 和 FAT32
		byte data[] = new byte[(int)raf.length()];//length()方法会返回一个long值
		System.out.println(Arrays.toString(data));
		raf.read(data);//将文件中所有字节一次性读取出来
		System.out.println(Arrays.toString(data));
		
		String str = new String(data,"utf-8");//将读取到的二进制数据转换为字符串并指定编码
		System.out.println(str);
		raf.close();
	}
}