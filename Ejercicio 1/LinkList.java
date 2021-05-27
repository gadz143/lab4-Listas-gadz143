
public class LinkList<E> {
	
	private Node<E> head;
	
	public void add(E data) {
		Node<E> nw = new Node<E> (data, null);
		if (this.isEmpty())
			head = nw;
		else {
			Node<E> aux = head;
			while (aux.getNext()!=null)
				aux = aux.getNext();
			aux.setNext(nw);
		}
	}
	public void addStart(E x) {
		Node<E> nw = new Node<E> (x, head);
		head = nw;
	}
	public void addIn (E x, int pos) {
		Node<E> nw = new Node<E> (x, null);
		Node<E> aux = head;
		for (int i=0; i<(pos-1); i++) {
			aux = aux.getNext();
		}
		nw.setNext(aux.getNext());
		aux.setNext(nw);
	}
	public E searchFor (int pos) {
		Node<E> returned = null;
		Node<E> aux = this.head;
		int cont = 0;
		for(; aux!= null; aux = aux.getNext()) {
			if (cont == pos) {
				returned = aux;
				break;
			}
			cont++;
		}
		return returned.getData();
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void print() {
		Node<E> temp = head;
		while (temp.getNext()!=null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
}