package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 显示user.dat文件中的所有用户信息
 * @author Administrator
 *
 */
public class ShowAllUserDemo01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for (int i = 0; i < raf.length()/100; i++) {//以100个字节码的长度作为数据块区分
			//读取用户名
			byte data[] = new byte[32];//取32个字节
			raf.read(data);//读取数据
			String userName = new String(data,"utf-8").trim();
			
			raf.read(data);
			String passWord = new String(data,"utf-8").trim();
			
			raf.read(data);
			String nickName = new String(data,"utf-8").trim();
			
			int age = raf.readInt();
			
			System.out.println("用户名：" + userName 
							 +"\t密码：" + passWord
							 +"\t昵称：" + nickName
							 +"\t年龄：" + age);
			System.out.println("post:" + raf.getFilePointer());
		}
		raf.close();
	}
}
