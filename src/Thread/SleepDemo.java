package Thread;

import java.util.Scanner;

/**
 * sleep阻塞
 * 
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒
 * 
 * @author Administrator
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序启动！");
		/*
		 * 启动后在控制台输入一个数字，然后从这个数字开始递减，当到0时停止。
		 * 每秒递减一次并输出对应的数字。
		 */
		Scanner sc = new Scanner(System.in);
		//for循环方法
		for (int i = sc.nextInt(); i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//while循环方法
/*		int a = sc.nextInt();
		while(a>0) {
			System.out.println(a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a--;
		}*/
		sc.close();
		System.out.println("程序结束！");
	}
}
