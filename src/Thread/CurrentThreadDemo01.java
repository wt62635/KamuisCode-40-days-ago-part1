package Thread;
/**
 * 线程提供了一个静态方法：
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程。
 * @author Administrator
 *
 */
public class CurrentThreadDemo01 {
	public static void main(String[] args) {
		/*
		 * java中所有的代码都是线程运行的
		 * main方法也是由一个线程运行的，我们称它为：主线程
		 */
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是：" + main);
		secondary();
		
		Thread t1 = new Thread() {
			public void run() {
				Thread t1 = Thread.currentThread();
				System.out.println("运行自定义线程：" + t1);
				secondary();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Thread t2 = Thread.currentThread();
				System.out.println("运行自定义线程：" + t2);
				secondary();
			}
		};
		t1.start();
		t2.start();
	}
	public static void secondary() {
		Thread another = Thread.currentThread();
		System.out.println("运行another方法的线程是：" + another);
	}
}
