package file;

import java.io.File;
import java.io.FileFilter;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 或取一个目录中满足指定条件的子项
		 */
		File dir = new File(".");
		/*
		 * 文件过滤器，用于定义一个File的过滤规则
		 */
		FileFilter filter = new FileFilter() {//实现接口 + 匿名内部类
			/*
			 * 当参数file符合过滤要求时，当前accept方法
			 * 应当返回true
			 */
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("过滤中：" + name);
				return name.startsWith(".");
			}
		};
		/*
		 * 该方法会将目录中所有子项获取到，并顺序调用给定给的过滤器的accept方法，
		 * 然后将所有返回值为true的子项保留并最终返回
		 */
		File subs[] = dir.listFiles(filter);
		System.out.println(subs.length);
		for (int i = 0; i < subs.length; i++) {
			File sub = subs[i];
			System.out.println(sub.getName());
		}
	}
}
