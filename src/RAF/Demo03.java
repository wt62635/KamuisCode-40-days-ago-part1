package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./lia - 鸟之诗.mp3","rw");
		RandomAccessFile copy = new RandomAccessFile("./lia - 鸟之诗cp.mp3","rw");
		//记录每次从源文件读取到的字节
		int d = -1 ;
		while((d = raf.read())!=-1) {
			copy.write(d);
		}
		System.out.println("复制完成！");
		raf.close();
		copy.close();
	}
}
