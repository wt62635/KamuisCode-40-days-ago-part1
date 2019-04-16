
public class Demo10 {
	public static void main(String[] args) {
		/*
		 * 检查字符串是否已制指定后缀为结尾
		 */
		String str = "Movie.mp4";
		boolean b = str.endsWith(".mp4");
		System.out.println(b);
		b = str.endsWith(".mp3");
		System.out.println(b);
	}
}
