package Thread;
/**
 * 获取线程信息的相关方法
 * @author Administrator
 *
 */
public class ThreadInfoDemo {
	public static void main(String[] args) {
		//获取主线程
		Thread main = Thread.currentThread();
		//获取线程名字
		String name = main.getName();
		System.out.println("name:" + name);
		//获取唯一标示
		long id = main.getId();
		System.out.println("id:" + id);
		//获取优先级
		int priority = main.getPriority();
		System.out.println("优先级：" + priority);
		//线程是否处于活动状态
		boolean isAlive = main.isAlive();
		System.out.println("线程活动状态：" + isAlive);
		//是否为守护线程
		boolean isDaemon = main.isDaemon();
		System.out.println("线程守护状态：" + isDaemon);
		//线程是否被中断
		boolean isInterrupted = main.isInterrupted();
		System.out.println("线程是否中断：" + isInterrupted);
	}
}
