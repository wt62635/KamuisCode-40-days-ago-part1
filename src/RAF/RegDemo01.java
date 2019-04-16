package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后要求用户输入：用户名，密码，昵称，年龄
 * 其中年龄是int值，其他为字符串
 * 然后将该客户信息写入到user.dat文件保存。
 * 
 * 每条记录占用100字节，其中用户名，密码，昵称为字符串各占32字节。年龄为in值是固定的4字节。
 * 
 * 字符串实际占用的字节取决于字符数，通常写文件可以故意“留白”使得字符串占用的字节量固定，
 * 这样利于读取也利于修改，缺点是留白会浪费硬盘空间。
 * @author Administrator
 *
 */
public class RegDemo01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎注册！");
		
		System.out.println("请输入用户名！");
		String userName = sc.nextLine();
		
		System.out.println("请输入密码！");
		String passWord = sc.nextLine();
		
		System.out.println("请输入昵称！");
		String nickName = sc.nextLine();
		
		System.out.println("请输入年龄！");
		int age = Integer.parseInt(sc.nextLine());
		
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		
		raf.seek(raf.length());//将指针移动到最后，再次启动程序写入数据时，即可避免数据覆盖问题
		
		//写入用户名
		byte data[] = userName.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);//将用户名所占内存固定扩充至32字节
		raf.write(data);
		
		//写入密码
		data = passWord.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);//将密码所占内存固定扩充至32字节
		raf.write(data);
		
		//写入昵称
		data = nickName.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);//将昵称所占内存固定扩充至32字节
		raf.write(data);
		
		//写入年龄
		raf.writeInt(age);//int值占用4个字节  
		
		System.out.println("pos:" + raf.getFilePointer());//输出当前指针位置 初次输出：100
		System.out.println("数据写入成功！");
		raf.close();
	}
}
