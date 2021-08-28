package exception.test;

public class ExceptionTest {

	public static void main(String[] args) {

		foo(5);

	}

	private static void foo(int i) {

		try {
			throw new Exception();
		}
		catch (MyException e) {

			System.out.println("In MyException");
		} catch (Exception e) {
			System.out.println("In Exception");
		}

	}

}
