package list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循：先进后出。
 * 
 * 通常使用栈可以完成“后退”这样的功能。
 * @author Administrator
 *
 */
public class StackDemo01 {
	public static void main(String[] args) {
		/*
		 * 双端队列为栈结构提供了对应的方法
		 */
		Deque<String> stack = new LinkedList<>();
		stack.push("T1");
		stack.push("T2");
		stack.push("T3");
		stack.push("T4");
		stack.push("T5");
		System.out.println(stack);
		
		String str = stack.pop();//第一个出栈
		System.out.println(str);
		System.out.println(stack);
	}
}
