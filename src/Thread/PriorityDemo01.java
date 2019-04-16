package Thread;
/**
 * 线程的优先级
 * 线程的优先级有10个等级，分别用整数1-10表示。
 * 其中1为最低，10为最高，5为默认值。
 * 
 * 理论上优先级越高的线程获取CPU时间片的次数越多。
 * @author Administrator
 *
 */
public class PriorityDemo01 {
	public static void main(String[] args) {
		Thread max = new Thread() {
			public void run() {
				for(int i = 0 ; i < 100000 ; i++) {
					System.out.println("max");
				}	
			}
		};
		
		Thread min = new Thread() {
			public void run() {
				for(int i = 0 ; i < 100000 ; i++) {
					System.out.println("min");
				}	
			}
		};
		
		Thread nor = new Thread() {
			public void run() {
				for(int i = 0 ; i < 100000 ; i++) {
					System.out.println("nor");
				}	
			}
		};
		//优先级设定范围1-10
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		nor.setPriority(Thread.NORM_PRIORITY);
		max.start();
		min.start();
		nor.start();
	}
}
