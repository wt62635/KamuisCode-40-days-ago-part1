package Thread;
/**
 * 静态方法时效果相同。
 * 同一个类的多个静态方法若都被synchronized修饰
 * 那么这几个静态方法之间就是互斥的。
 * @author Administrator
 *
 */
public class SyncDemo05 {
	public static void main(String[] args) {
		Soo s1 = new Soo();
		Soo s2 = new Soo();
		Thread t1 = new Thread() {
			public void run() {
				s1.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				s2.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Soo{
	public synchronized static void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ":正在运行A方法……");
			Thread.sleep(3000);
			System.out.println(t.getName() + ":A方法运行完毕！");
		} catch (Exception e) {
		}
	}
	public static void methodB() {
		synchronized(Soo.class) {
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