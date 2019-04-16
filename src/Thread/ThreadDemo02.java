package Thread;
/**
 * 第二种创建线程的方式：
 * 实现Runnable接口单独定义线程任务
 * @author Administrator
 *
 */
public class ThreadDemo02 {
	public static void main(String[] args) {
		//单独定义线程任务
		Runnable r1 = new MyRunnable01();
		Runnable r2 = new MyRunnable02();
		//创建线程指派任务
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//启动线程
		t1.start();
		t2.start();
	}
}
class MyRunnable01 implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("··线程1进度:" + i + "%");
		}
	}
}
class MyRunnable02 implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("-----线程2进度:" + i + "%");
		}
	}
}