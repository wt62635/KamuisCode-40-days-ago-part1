package Thread;
/**
 * 在保证并发安全的前提下有效的缩小同步范围是可以提高并发效率的。
 * 
 * 同步块：
 * synchronized（同步监视器对象）{
 * 		需要同步运行的代码片段
 * }
 * 
 * @author Administrator
 *
 */
public class SyncDemo02 {
	public static void main(String[] args) {
		Weapon M214 = new Weapon();
		Weapon AK47 = new Weapon();
		Thread t1 = new Thread() {
			public void run() {
				M214.reload();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				M214.reload();
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				AK47.reload();
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}

class Weapon{
	/*
	 * 在方法上使用synchronized,那么同步监视对象就是该方法所属对象，
	 * 即：方法中看到的this。
	 */
	//public synchronized void reload(){//测试用
	public void reload() {
		try {
			long start = System.currentTimeMillis();
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "正在卸弹……");
			Thread.sleep(2000);
			/*
			 * synchronized同步块可以更准确的锁定需要同步运行的代码片段。
			 * 这里需要注意，在指定同步监视器对象，即：上锁的对象
			 * 该对象可以使java中任何类型的实例，只要保证多个需要排队执行其中代码的线程
			 * 看到的这个对象是同一个即可。
			 */
			synchronized(this) {//可通过传入“this”或“t”来检验效果，此处的this是指的此方法的所属对象，即weapon对象。
				System.out.println(t.getName() + "正在换弹……");
				Thread.sleep(2000);
			}
			System.out.println(t.getName() + "装弹完成！");
			long end = System.currentTimeMillis();
			System.out.println(t.getName() + "全过程共用时" + (end-start)/1000 + "秒");
		} catch (Exception e) {
		}
	}
}
