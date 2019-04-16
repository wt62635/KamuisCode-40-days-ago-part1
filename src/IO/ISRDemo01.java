package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本数据
 * @author Administrator
 *
 */
public class ISRDemo01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		/*按每个字符循环输出。
		 * int d = -1 ;
		 * while((d = isr.read())!=-1){
		 * 		System.out.print((char)d);
		 * }
		 */
		//字符数组输出
		char data[] = new char[20];
		isr.read(data);
		String str = new String(data);
		System.out.println(data);		
		isr.close();
	}
}
