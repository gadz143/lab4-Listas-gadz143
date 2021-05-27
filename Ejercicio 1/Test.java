public class Test {
	
	public static void main (String [] args) {
		
		LinkList<Integer> list = new LinkList<Integer>();
		list.add(18);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(15);
		list.add(17);
		list.addStart(5);
		list.addIn(60, 3);
		list.print();
		System.err.println(list.searchFor(3));
		
	}
}