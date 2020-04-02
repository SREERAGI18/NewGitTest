package deque;

import java.util.ArrayDeque;
import java.util.Stack;

public class Runner {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		stack.push(48);
		
		ad.add(12);
		ad.add(24);
		ad.add(36);
		ad.add(48);
		
		System.out.println(ad);
		System.out.println(stack);
		System.out.println(ad.pop()+" arraydeque");
		System.out.println(stack.pop()+" stack");
	}

}
