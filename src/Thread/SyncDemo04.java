package Thread;
/**
 * 互斥锁
 * 当使用synchronized锁定多个代码片段，
 * 并且这些同步监视器对象指定的是同一个时，
 * 那么这些代码片段就是互斥的。
 * 多个线程不能同时执行互斥的代码片段。
 * @author Administrator
 *
 */
public class SyncDemo04 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread() {
			public void run() {
				foo.methodA();//同一对象↓
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				foo.methodB();//同一对象↑
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ":正在运行A方法……");
			Thread.sleep(3000);
			System.out.println(t.getName() + ":A方法运行完毕！");
		} catch (Exception e) {
		}
	}
	public void methodB() {
		synchronized(this) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName() + ":正在运行B方法……");
				Thread.sleep(3000);
				System.out.println(t.getName() + ":B方法运行完毕！");
			} catch (Exception e) {
			}
		}
	}
}