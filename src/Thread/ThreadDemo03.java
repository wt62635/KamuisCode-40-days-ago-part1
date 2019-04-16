package Thread;
/**
 * 使用匿名内部类的方式完成两种线程的创建
 * @author Administrator
 *
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//方式一
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("天下漫友是一家！");
				}
			}
		};
		//方式二
		Runnable r2 = new Thread();
		Thread t2 = new Thread(r2) {
			public void run() {
				for (int i = 100; i < 200; i++) {
					System.out.println("AC在，爱一直在！");
				}
			}
		};
		t1.start();
		t2.start();
	}
}