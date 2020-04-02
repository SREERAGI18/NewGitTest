package queue;

public class Node <E> {
	
	E data;
	Node<E> next;
	
	public Node(E e) {
		this.data = e;
		this.next = null;
		}
	
}
