package Thread;

/**
 * 守护线程 守护线程也称为“后台线程”，默认创建出来的线程都是普通线程， 守护线程是需要在普通线程上进行设置变换为守护线程的。
 * 使用上它们没有差别，但是有一个明显的区别在于： 结束时机上有一点不同，当进程结束时所有正在运行的守护线程会被强制终止，
 * 而进程结束是当这个进程中的所有普通线程都结束时进程就会结束。
 * 
 * @author Administrator
 *
 */

public class DaemonThreadDemo01 {
	public static void main(String[] args) {
		Thread dio = new Thread() {
			public void run() {
				System.out.println("DIO:The World!!!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 5; i++) {
					System.out.println("DIO:木大木大木大木大木大木大木大木大木大木大木大木大木大木大木大木大！！！");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("DIO:压路机哒！！！");
			}
		};

		Thread jojo = new Thread() {
			public void run() {
				System.out.println("JOJO:Star platinum!!!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 3; i++) {
					System.out.println("JOJO:欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉！！！");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("JOJO:时间停止吧！THE WORLD!!");
			}
		};
		/*
		 * 设置守护线程必须要在线程启动前进行。
		 */
		jojo.start();
		dio.setDaemon(true);// 将dio设为守护线程。
		dio.start();

		// while(true){}
	}
}
