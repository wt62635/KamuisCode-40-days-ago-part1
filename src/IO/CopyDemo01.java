package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * 缓冲流是一对高级流，在流连接中起到加速读写效率的作用。
 * 
 * @author Administrator
 *
 */

public class CopyDemo01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("lia - 鸟之诗.mp3");
		BufferedInputStream bis = new BufferedInputStream(fis);//需要传入一个输入流
		
		FileOutputStream fos = new FileOutputStream("lia - 鸟之诗IOcopy4.mp3");
		BufferedOutputStream bos = new BufferedOutputStream(fos);//需要传入一个输出流
		//将缓冲流的IO接入字节流的IO后，复制效率显著提升。
		int d = -1 ;
		long start = System.currentTimeMillis();
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完成！共用时：" +(end - start) + "ms");
		bis.close();
		bos.close();
	}
}
