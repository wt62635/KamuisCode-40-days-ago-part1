package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 	修改用户昵称
 * 
 * 程序启动后要求用户输入用户名以及新的昵称。
 * 然后将user.dat文件中该用户的昵称更改。
 * 若user.dat文件没有此用户则最终显示：查无此人
 * 
 */
public class UpdataDemo01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userNameIn = sc.nextLine();
		System.out.println("请输入新的昵称：");
		String newNickName = sc.nextLine();
		//开始处理数据
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		int i = 0 ;//声明移动文件指针的变量
		String userNameOut;//声明用于保存读取到的用户名数据对象
		raf.seek(0);//文件指针归0
		while(true) {
			byte data[] = new  byte[32];//固定获取数据组为32字节
			raf.read(data);//读取用户名数据
			userNameOut = new String(data,"utf-8").trim();//转换成字符串，并去除空格。
			if(raf.read()==-1) {//查至文件指针尽头
				System.out.println("查无此人");
				break ;
			}
			if(userNameOut.equals(userNameIn)) {
				System.out.println("已找到用户名：" + userNameIn + "，开始写入此用户的新昵称");
				raf.seek(i+64);//移动seek至昵称数据位置
				data = newNickName.getBytes("utf-8");
				raf.write(data);
				System.out.println("新的昵称已写入。");
				break;
			} 
			raf.seek(i+=100);//进入下一组用户数据
		}
		System.out.println("程序结束！");
		sc.close();
		raf.close();
	}
}
