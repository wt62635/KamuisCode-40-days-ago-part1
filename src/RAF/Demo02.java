package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./test.dat","r");
		/*
		 * int read()方法
		 * 读取1个字节并以int形式返回。
		 * 若返回的整数为-1，则表示读到了文件末尾。
		 */
		int d = raf.read();
		System.out.println(d);//97
		d = raf.read();
		System.out.println(d);//98
		d = raf.read();
		System.out.println(d);//99
		d = raf.read();
		System.out.println(d);//55
		d = raf.read();
		System.out.println(d);//54
		d = raf.read();//文件末尾
		System.out.println(d);//53
		d = raf.read();
		System.out.println(d);//-1
	}
}
