package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流来完成对文件的复制操作
 * 思路：
 * 使用文件输入流来读取源文件，使用文件输入流向复制文件中写出。
 * 循环顺序从源文件读取字节写入到赋值文件中完成复制
 * 
 * 这里使用块读写形式复制。由于读写方法一样，可参考使用RAF复制操作的案例
 * @author Administrator
 *
 */

public class TestDemo01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("lia - 鸟之诗.mp3");
		
		FileOutputStream fos = new FileOutputStream("lia - 鸟之诗IOcopy.mp3");
		
		int len = -1;
		byte data[] = new byte[1024*10];
		
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("复制完毕！");
		fis.close();
		fos.close();
	}
}
