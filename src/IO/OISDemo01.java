package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * @author Administrator
 *
 */
public class OISDemo01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//从person.obj文件中反序列化java对象——即还原成对象
		FileInputStream fis = new FileInputStream("person01.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//从 ObjectInputStream 读取对象。对象的类、类的签名和类及所有其超类型的非瞬态和非静态字段的值都将被读取。
		Person01 p = (Person01)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
