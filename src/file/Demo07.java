package file;
import java.io.File;
public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 如果file表示的是文件则可以直接删除
		 * 如果是一个目录，则需要现货区其所有子项
		 * 并将所有子项全部删除才可以删除这个目录。
		 * 
		 * 完成方法，实现将给定的File表示的文件或目录删除
		 */
		File dir = new File("./MkdirsTest");
		delete(dir);
	}
	public static void delete(File file) {//删除文件/文件夹方法
		if(file.isDirectory()) {//如果是一个目录
			File subs[] = file.listFiles();//获取一个目录下的所有子项
			for (int i = 0; i < subs.length; i++) {//遍历目录
				File sub = subs[i];
				delete(sub);//通过递归清空目录中所有内容。
			}
			file.delete();//删除传入的参数（文件或文件夹）
			System.out.println("==========" + file.getName() +"已删除==========");
		}
	}
}
