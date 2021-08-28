package exception.test;

public class Test { 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=10;
		int j=20;
		add(i,j);

	}
	/**
	 * @param i
	 * @param j
	 */
	private static void add(int i,int j) { 
		addNumber(i, j);
		
	}
	/**
	 * @param i
	 * @param j
	 */
	private static void addNumber(int i, int j) {
		int c=i+j;
		System.out.println(c);
	}

}
