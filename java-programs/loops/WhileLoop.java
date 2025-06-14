package loops;
/* Similarly, in programming, when you want to repeatedly execute the statements as long as a condition is met, 
 * you can use the iteration control structure called while loop. When the condition becomes false, the while loop terminates and control goes to the statement written after the while loop. 
 * The while loop is used when the number of iterations are not known. In case of while loop, the condition is tested before entering the while loop block and hence it is known as an entry-controlled loop.  */

public class WhileLoop {
		public static void main(String[] args) {
			// sum of input number
			
			int number = 7425;
			int sum = 0;
			int temp = 0;
			while (number > 0) {
				temp = number % 10;
				sum += temp;
				number /= 10;
			}
			System.out.println(sum);
		}
}
