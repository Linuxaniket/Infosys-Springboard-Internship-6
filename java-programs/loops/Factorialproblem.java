package loops;

public class Factorialproblem {
	public static void main (String[] args) {
		int num =7;
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
