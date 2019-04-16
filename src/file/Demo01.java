package file;

import java.io.File;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {//抛出异常,注意编写位置 
		/*
		 * File API
		 * 
		 * 1.在java.io包中
		 * 2.是java提供的用于操作文件的API
		 * 3.利用这些API方法,可以实现:
		 * 创建文件
		 * 创建文件夹
		 * 查看文件的属性
		 * 删除文件/文件夹
		 * 文件/文件夹改名等
		 */
		
		/*
		 * 使用File API创建文件夹
		 */
		
		//Linux
		//File file = new File("/home/soft01/demo");
		//Window
		File folder = new File("D:/demo02");
		//如果创建成功,返回true.反则返回false,或是已经存在其文件夹的时候
		boolean b = folder.mkdir();
		System.out.println(b);
		
		/*
		 * 使用File API创建文件
		 * 方法1:给出全路径名称
		 * 方法2:使用相对路径
		 */
		//方法1
		
		//Linux
		//new File("/home/soft01/test.txt")
		File file2 = new File("D:/demo01/test.txt");
		//调用方法createNewFile创建文件,此方法需要抛出异常
		//如果返回true表示穿件成功,false失败.
		b = file2.createNewFile();
		System.out.println(b);
		
		File file3 = new File("D:/demo01/test.doc");//传入完整路径(含文件名)
		b = file3.createNewFile();
		System.out.println(b);
		
		File file4 = new File("D:/demo01/test.java");
		b = file4.createNewFile();
		System.out.println(b);
		
		File file5 = new File("D:/demo01/test.exe");
		b = file5.createNewFile();
		System.out.println(b);
		
		//方法2
		File dir = new File("D:/demo02");//指定路径
		File file6 = new File(dir,"Hello1.txt");//传入路径和文件名参数
		file6.createNewFile();//创建
		
		File file7 = new File(dir,"Hello2.txt");
		file7.createNewFile();
		
		/*
		 * 如何区别创建的是文件还是文件夹?
		 * File API
		 * 既可以代表文件也可以代表文件夹
		 * 提供一个方法,用来区别当前代表的是文件还是文件夹
		 */
		//当file6代表的是文件夹的时候,返回true,反则false
		b = file6.isDirectory();
		System.out.println(b);//false
		//当file6代表的是文件的时候,返回true,反则false
		b = file6.isFile();
		System.out.println(b);//true
		//当dir代表的是文件夹的时候,返回true,反则false
		b = dir.isDirectory();
		System.out.println(b);//true
		//当dir代表的是文件的时候,返回true,反则false
		b = dir.isFile();
		System.out.println(b);//false
	}
}
