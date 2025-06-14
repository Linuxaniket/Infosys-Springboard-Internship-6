package loops;

/* When the loop has to be executed at least once before the condition is checked, do-while loop is used. After the first execution, 
 * the loop then gets repeated as long as the condition is true. 
 * In case of do-while loop, the condition is tested after executing the code block. Hence, it is called an exit-controlled loop.  */
public class DoWhile {
		public static void main (String [] args) {
			int num = 5465;
			int temp = 0;
			int sum = 0;
			
			do {
				temp = num % 10; // we get 5 as remainder 
				sum += temp; // 5 store in sum 
				num /= 10; // number become 546 by divide 10
 				
			} while (num > 0);
			System.out.println(sum);
		}
}	
