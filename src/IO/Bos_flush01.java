package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流读写效率之所以高是因为数据在经过它时，一定会被转化为块读写。
 * 
 * 缓冲输出流写出数据要注意缓冲区。
 * @author Administrator
 *
 */
public class Bos_flush01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String line = "IG牛逼！";
		byte [] data = line.getBytes("utf-8");
		bos.write(data);
		bos.flush();//如果数据不够数据块的容量时，就需要通过flush方法将数据直接发送过去。
		/*
		 * void flush()
		 * 强制将缓冲流中缓冲区里已缓存的数据一次性写出。
		 * 频繁的调用flush会提高实际写出数据的次数，从而降低写出效率。但是可以保证数据写出的及时性。
		 */
		System.out.println("写出完毕！");
		bos.close();//即便close方法中也有调用flush方法，
		//但此方法终究只是保底功能。在需要的地方手动调用fulsh方法可以达到提升处理效率的效果。
	}
}
