package Thread;

/**
 * void join()
 * 该方法允许调用这个方法的线程在该方法所属线程上等待（阻塞），
 * 直到该方法所属线程技术后方可解除阻塞继续运行。
 * 所以join方法可以协调线程同步运行
 * 同步运行：执行有顺序
 * 异步运行：各执行各的，多线程实际就是异步运行。
 * @author Administrator
 *
 */
public class JoinDemo01 {
	//表示图片是否下载完毕
	private static boolean isFinish = false;//未完成
	
	public static void main(String[] args) {
		//创建下载线程
		Thread download = new Thread() {
			public void run() {
				System.out.println("开始下载图片！");
				for (int i = 0; i <= 100; i++) {
					System.out.println("已下载：" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("已下载：图片下载完毕！");
				isFinish = true ;//已完成
			}
		};
		
		Thread load = new Thread() {
			public void run(){
				System.out.println("正在打开：开始显示文字");
				try {
					Thread.sleep(2000);
				System.out.println("正在打开：显示文字完毕");
				System.out.println("正在打开：开始显示图片");
				/*
				 * 先等待下载线程将图片下载完毕
				 * 
				 * show调用join方法后进入阻塞状态，直到download线程结束
				 * 才会解除阻塞继续向下执行。
				 */
					download.join();//加入下载线程，等待下载线程完成后再继续执行。
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish) {
					throw new RuntimeException("图片打开失败！");
				}
				System.out.println("正在打开：显示图片完毕");
			}
		};
		
		download.start();
		load.start();
	}
}
