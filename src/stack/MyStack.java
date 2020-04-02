package stack;

import linkedList.MyLinkedList;

public class MyStack <E> {
	
	private MyLinkedList <E> ll = new MyLinkedList<>();
	
	void add(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping empty list is not allowed");
		}
		
		return ll.removeLast();
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("peeking empty list is not allowed");
		}
		
		return ll.getLast();
	}
	
	
	
}
