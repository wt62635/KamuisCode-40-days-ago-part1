package Thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源时，由于线程切换时机不确定，
 * 导致操作代码的执行顺序未按照程序设计顺序执行，出现操作混乱。严重时可能导致系统瘫痪。
 * 
 * 被多个线程“同时”访问的数据，称为临界资源。
 * @author Administrator
 *
 */
public class SyncDemo01 {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+ ":" + bean);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table{
	//有20个豆子
	private int beans = 20;
	/**
	 * 当一个方法使用了关键字：synchronized后，那么这个方法称为“同步方法”
	 * 多个线程不能同时执行同步方法，必须派对执行。
	 * 这样做就可以解决并发安全问题了。
	 * @return
	 */
	public synchronized int getBean() {//通过synchronized强制线程阻塞，便不会发生
		if(beans==0) {
			throw new RuntimeException("没有豆子");
		}
		//主动让当前线程放弃本次CPU时间，模拟CPU没时间发
		Thread.yield();
		return beans--;
	}
}