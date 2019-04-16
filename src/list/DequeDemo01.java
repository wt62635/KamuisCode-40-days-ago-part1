package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque双端队列
 * Deque接口继承自Queue接口，双端队列是队列两端都可以做进出操作的队列。
 * 常用实现列:java.util.LinkedList
 * @author Administrator
 *
 */
public class DequeDemo01 {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.offer("T1");
		deque.offer("T2");
		deque.offer("T3");
		System.out.println(deque);
		
		deque.offerFirst("T4");//从头入队
		System.out.println(deque);
		
		deque.offerLast("T5");//从尾入队
		System.out.println(deque);
		
		String str = deque.poll();//出队
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();//第一个出队
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();//最后一个出队
		System.out.println(str);
		System.out.println(deque);
		
		//遍历队列
		for(String s : deque) {
			System.out.println(s);
		}
		System.out.println(deque);
	}
}
