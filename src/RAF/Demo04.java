package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo04 {
	/**
	 *提高每次读写的数据量，减少实际读写次数，可以提高读写的效率。
	 *单字节读写通常称为：随机读写
	 *一组一组字节读写通常称为：块读写 
	 * @author Kamui
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 *RAF提供了块读写数据的方法
		 *int read(byte[] data)
		 * 一次性读取给定字节数组总长度的字节量，
		 * 返回值为实际读取到的字节量。若返回值为-1则表示文件末尾（本次没有读取到任何数据）
		 * 
		 * void write()
		 * 一次性将给定的字节数组中所有字节写入到文件中。
		 * 
		 * void write(byte[] data,int offset,int len)
		 * 将给定字节数组从下标offset处的连续len个字节一次性写入文件
		 */
		RandomAccessFile raf = new RandomAccessFile("./lia - 鸟之诗.mp3","rw");
		RandomAccessFile copy = new RandomAccessFile("./lia - 鸟之诗Copy2.mp3","rw");
		//记录每次实际读取到的字节量
		
		int len = -1 ;
		//当前硬件及业务情况下，综合考虑10kb是最理想、性价比最高的。
		byte data[] = new byte[1024*10];
		long start = System.currentTimeMillis();
		while((len = raf.read(data))!=-1) {
			copy.write(data, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完成！耗时："+ (end - start) + "ms");
		raf.close();
		copy.close();
	}
}
