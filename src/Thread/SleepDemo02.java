package Thread;

/**
 * sleep方法要求处理终端异常 当一个线程调用sleep方法处于阻塞状态的过程中，
 * 若此时该线程的中断方法被调用：interrupt(),那么此时该线程的睡眠阻塞会被立即打断， 并在sleep这个方法处抛出终端异常。
 * 
 * @author Administrator
 *
 */
public class SleepDemo02 {
	public static void main(String[] args) {
		/*
		 * JDK8之前有一个要求（JDK8不再强制要求） 当一个方法的局部内部类中引用了这个方法的其他局部变量时，这个变量必须声明为final。
		 * 这其实是由于JVM内存分配问题导致的。
		 */
		final Thread Subaru = new Thread() {//JDK8以前写法
			public void run() {
				System.out.println("Kamui:Who are you?");
				System.out.println("Subaru:貴様は誰だ！？");
				for (int i = 0; i < 2; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("!!!!!");
					}
				}
			}
		};
		 Thread Kamui = new Thread() {//JDK8以后的写法
			public void run() {
				System.out.println("Kamui:Today is a good day to die!!");
				System.out.println("Subaru:なに!?");
				for (int i = 0; i < 2; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Kamui:Flash Strike!!");
						System.out.println("Subaru:北斗百裂拳！！！！");
						Subaru.interrupt();//←--------------------注意
					} catch (InterruptedException e) {
						System.out.println("Kamui's HP -100");
					}
				}
				System.out.println("Kamui:Ahhh……What the……");
				System.out.println("Subaru：お前はもう死んでいる。");
			}
		};
		Subaru.start();
		Kamui.start();
	}
}
