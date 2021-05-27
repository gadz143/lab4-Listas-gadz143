
public class Node <E>{
	
	private Node<E> next;
	private E data;
	
	public Node (E data) {
		this (data, null);
	}
	public Node (E data, Node<E> next) {
		this.next = next;
		this.data = data;
	}
	public E getData() {
		return this.data;
	}
	public Node<E> getNext(){
		return this.next;
	}
	public void setData(E data) {
		this.data = data;
	}
	public void setNext(Node <E> next) {
		this.next = next;
	}
	public String toString() {
		return this.data.toString();
	}
	
}