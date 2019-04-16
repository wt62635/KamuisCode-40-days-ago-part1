package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 	修改用户昵称
 * 
 * 程序启动后要求用户输入用户名以及新的昵称。
 * 然后将user.dat文件中该用户的昵称更改。
 * 若user.dat文件没有此用户则最终显示：查无此人
 * 
 */
public class UpdataDemo2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userNameIn = sc.nextLine();
		System.out.println("请输入新的昵称：");
		String newNickName = sc.nextLine();
		//开始处理数据
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw"); 
		//标识是否有记录修改过
		boolean update = false;
		for (int i = 0; i < raf.length()/100; i++) {
			//现将指针移动到每条记录开始位置
			raf.seek(i*100);
			//读取用户名
			byte data[] = new byte[32];
			raf.read(data);
			String name = new String(data,"utf-8").trim();
			if(name.equals(userNameIn)) {
				//是该用户名
				raf.seek(i*100+64);
				data = newNickName.getBytes("utf-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改完毕！");
				update = true;
			}
		}
		if(!update) {
			System.out.println("查无此人");
		}
		raf.close();
	}
}
