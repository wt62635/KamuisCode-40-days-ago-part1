package file;
import java.io.File;
public class Demo05 {
	public static void main(String[] args) {
		/*
		 *如何删除一个文件
		 *删除当前目录下的demo.txt文件
		 *注意：通过delete()方法删除的文件将无法恢复！
		 *注意2：用delete()删除一个目录时，其目录内必须是空的才可删除。
		 */
		//删除文件
		File file = new File("./demo.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("文件删除成功！");
		}else {
			System.out.println("文件不存在！");
		}
		//删除目录
		File dir = new File("./MkdirsTest/test");
		if(dir.exists()) {
			dir.delete();
			System.out.println("文件夹已删除！");
		}else {
			System.out.println("文件夹不存在！");
		}
	}
}
