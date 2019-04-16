package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位划分为字节流与字符流
 * 所有字节流都继承：InputStream和OutputStream
 * 但是所有字符流都集成:Reader和Writer
 * 
 * 字符流是以字符（char）为最小单位读写数据的，因此字符流仅适合读写文本类数据。
 * 字符流底层实际还是读写字节，只是字节与字符的转换由字符流自行完成。
 * 
 * 转换流：
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 常用的字符流实现类，在以字符流作为操作的流连接中
 * 起到非常重要的环节，但是通常不直接操作这套流。
 * @author Administrator
 *
 */
public class OSWDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 向文件中写入文本数据
		 */
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//如果不注明要使用的字符编码，则会默认使用当前设置的字符编码
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		
		osw.write("这是一个字符串，");
		osw.write("这真的是一个字符串。");
		osw.write("这真的只是一个字符串啊！");
		
		System.out.println("写入成功");
		osw.close();
	}
}
