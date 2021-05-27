
public class StackLink<E> implements Stack<E>{
	
	private Node<E> init;
	
	public StackLink() {
		this.init = null;
	}
	public boolean isEmpty() {
		return this.init == null;
	}
	public void pushBegin(E data) {
		Node<E> nw = new Node<E> (data, init);
		init = nw;
	}
	public void push(E data) {
		Node<E> nw = new Node<E> (data, null);
		if (this.isEmpty())
			init = nw;
		else {
			Node<E> aux = init;
			while (aux.getNext()!=null)
				aux = aux.getNext();
			aux.setNext(nw);
		}
	}
	public int getCount(){
		Node<E> temp = init;
		int count = 0;
		while (temp != null){
			count++;
			temp = temp.getNext();
		}
		return count;
    }
	public E pop() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Error... la pila esta vacia...");
		else {
			Node<E> temp = this.searchForNode(getCount()-1);
			this.searchForNode(this.getCount()-2).setNext(null);
			return temp.getData();
		}
	}
	public E top() throws ExceptionIsEmpty {
		if (this.isEmpty())
			throw new ExceptionIsEmpty("Error... la pila esta vacia...");
		Node<E> aux = this.searchForNode(this.getCount()-1);
		return aux.getData();
	}
	public Node<E> searchForNode (int pos) {
		Node<E> returned = null;
		Node<E> aux = this.init;
		int cont = 0;
		for(; aux!= null; aux = aux.getNext()) {
			if (cont == pos) {
				returned = aux;
				break;
			}
			cont++;
		}
		return returned;
	}
	public E searchForData (int pos) {
		Node<E> returned = null;
		Node<E> aux = this.init;
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
	public void permutation(int a) throws ExceptionIsEmpty {
		if (this.isEmpty())
			throw new ExceptionIsEmpty("Error... la pila esta vacia...");
		else
			for (int i=0; i<a; i++) {
				this.pushBegin(this.searchForData(this.getCount()-1));
				this.pop();
			}
		System.out.println(this.toString());
	}
	public String toString() {
		String str="";
		Node<E> aux = this.init;
		for(; aux!= null; aux = aux.getNext())
			str += aux.getData()+"\n";
		return str;
	}
}