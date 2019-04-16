package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，在流连接中负责对java中任何对象进行读写（可以将对象与一组字节间转换。）
 * 
 * 一个类如果希望杯对象流读写，那么这个类必须要实现接口：Serializable
 * @author Administrator
 *
 */
public class OOSDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 将一个Person实例写入文件person.obj中
		 */
		String name = "苍井空";
		String gender = "女";
		int age = 18;
		String []otherInfo = {"女优","已婚","促进中日文化交流","广大男性同胞的启蒙老师。"};
		
		Person01 p = new Person01(name , age , gender , otherInfo);
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("person01.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//对象输出流
		/*
		 * 对象输出流写对象的方法：
		 * void writeObject(Object obj)
		 * 将给定对象按照其结构转换为一组字节后写出
		 * 
		 * 涉及到的术语：
		 * 当对象经过OOS写出时，其将该对象按照结构转换为一组字节，这个过程称为“对象序列化”
		 * 
		 * 当序列化的这组字节再经过FOS写入到文件中（写入到磁盘做长久保存）这个过程称为“数据持久化”
		 */
		oos.writeObject(p);
		System.out.println("写出完毕！");
		oos.close();
	}
}
