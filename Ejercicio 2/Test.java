
public class Test {
	
	public static void main (String [] args) {
		
		try {
			Stack<Integer> s1 = new StackLink<Integer>();
			s1.push(3);
			s1.push(21);
			s1.push(10);
			s1.push(5);
			s1.push(4);
			System.out.println(s1);
			s1.permutation(9);
			System.err.println(s1);
		}catch (Exception x) {
			System.err.println(x.getMessage());
		}
		
	}
	
}