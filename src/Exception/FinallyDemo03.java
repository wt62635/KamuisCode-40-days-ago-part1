package Exception;
/**
 * 常见面试问题
 * 1：分别说明final,finally,finalize
 * @author Administrator
 *
 */
public class FinallyDemo03 {
	public static void main(String[] args) {
		System.out.println(
				test("0")+","+test(null)+","+test(""));
		//?,?,?
	}
	public static int test(String str) {
		try {
			System.out.println("test执行了！" + str);
			return str.charAt(0)-'0';
		}catch(NullPointerException e) {
			System.out.println("空指针异常！");
			return 1 ;
		}catch(Exception e) {
			System.out.println("出现异常！");
			return 2 ;
		}finally {
			System.out.println("finally被执行！");
			return 3 ;
		}
	}
}
