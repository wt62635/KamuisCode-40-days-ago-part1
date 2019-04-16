package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		String str = "我们是冠军！！";
		/*
		 * String提供了将字符串转换为字节的方法：
		 * 
		 * byte[] getBytes(String csn)
		 * 按照系统默认字符集将当前字符串转换为一组字节
		 * 常用字符集：
		 * GBK:我国的国标编码，其中英文1字节，中文2字节
		 * UTF-8：unicode的一个字符集，英文1字节，中文3字节，
		 * 支持所有国家文字，互联网最常用字符集
		 * ISO8859-1.欧洲的编码集，注意：不支持中文。
		 */
		byte data[] = str.getBytes("utf-8");//通过getBytes()方法将字符串转成字节
		raf.write(data);
		
		str = "China No.01!!";
		data = str.getBytes("utf-8");
		raf.write(data);
		
		String sword = "貴社の記者が汽車で帰社致しました" ;
		data = sword.getBytes("GBk");//乱码
		raf.write(data);
		
		System.out.println("写出完毕");
		raf.close();
	}
}
