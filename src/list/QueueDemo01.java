package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue队列
 * Queue接口继承自Collection
 * 队列可以保存一组元素，但是存取元素必须遵循先进先出
 * @author Administrator
 *
 */
public class QueueDemo01 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		//offer方法为入队操作
		queue.offer("T1");//.offer()其返回值就是.add()方法。
		queue.offer("T2");//这么写是为了特意区分，方便理解。
		queue.offer("T3");
		queue.offer("T4");
		queue.offer("T5");
		System.out.println(queue);
		/*
		 * 出队操作，获取队首元素并将该元素从队列中移除。
		 */
		String str = queue.poll();
		System.out.println(str);//T1
		System.out.println(queue);//[T2, T3, T4, T5]
		/*
		 * 引用队首元素，获取队首元素后该元素不会被移除
		 */
		str = queue.peek();
		System.out.println(str);//T2
		System.out.println(queue);//[T2, T3, T4, T5]
		
		//遍历队列,使用迭代器遍历后元素还在队列中
		System.out.println(queue.size());
		for (String s : queue) {
			System.out.println(s);
		}
		System.out.println(queue);
		
		/*
		 * 使用poll方法遍历队列元素
		 */
		
		while(queue.size()!=0) {
			String s = queue.poll();
			System.out.println(s);
		}
		System.out.println("使用poll方法遍历队列元素后："+queue);
	}
}
