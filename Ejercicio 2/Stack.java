
public interface Stack <E>{
	
	void push (E x);
	void pushBegin (E x);
	E pop() throws ExceptionIsEmpty;
	E top() throws ExceptionIsEmpty;
	boolean isEmpty();
	void permutation (int a) throws ExceptionIsEmpty;
	
}