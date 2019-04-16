package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 专门用来读写文件的API，RAF基于指针对文件随机读写。
 * 
 * @author Kamui
 * 
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 对当前目录下的test.dat文件进行读写操作
		 * RAF构造方法第一个参数可以直接给路径，
		 * 或者指定File对象，第二个参数为操作模式，常用大的有：
		 * "r":只读模式，对该文件仅做读取操作
		 * "rw":对文件进行读写操作
		 * 
		 * void write(int d)方法
		 * 向文件写入1个字节（byte），写入的是给定的int值
		 * 对应2进制的“低8位”
		 */
		RandomAccessFile raf = new RandomAccessFile("./test.dat","rw");//("路径/文件名"，"只读r/读写rw")
		raf.write(97);//a
		raf.write(98);//b
		raf.write(99);//c
		raf.write(55);//7
		raf.write(54);//6
		raf.write(53);//5
		System.out.println("写入完成！");
		raf.close();
	}
}
