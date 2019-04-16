package RAF;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 使用RAF读写基本类型数据以及基于指针的操作
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		long pos = raf.getFilePointer();//获取当前RAF指针位置，默认在文件最开始
		System.out.println(raf.getFilePointer());
		//向文件中写入一个int最大值
		int imax = Integer.MAX_VALUE;
		raf.write(imax>>>24);
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		raf.write(imax);
		System.out.println(raf.getFilePointer());
		/*
		 * RAF提供了方便写出基本类型的方法
		 */
		//连续写4个字节，将int值对应2进制写入文件
		
		raf.writeInt(imax);//等于上面4行代码
		System.out.println(raf.getFilePointer());
		
		//连续写8个字节，将long值对应2进制写入文件
		raf.writeLong(123L);
		
		raf.writeDouble(123.132);
		System.out.println(raf.getFilePointer());
		System.out.println("写入成功！");
		
		//=============================================================
		
		raf.seek(0);//移动指针
		int i = raf.readInt();//读取写入的int长度数据
		System.out.println(i);
		System.out.println("pos:" + pos);//当前输出指针位置
		
		raf.seek(8);//移动指针
		raf.writeLong(258);//写入long数据覆盖原指针地址数据
		
		raf.seek(8);
		long l =raf.readLong();
		System.out.println(l);
		System.out.println("pos:" + pos);
		
		raf.seek(16);
		double d = raf.readDouble();
		System.out.println(d);
		System.out.println("pos:" + pos);
		
		raf.close();
	}
}
