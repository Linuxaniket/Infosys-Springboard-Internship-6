package learn;

public class SimpleIntrest {
	public static void main(String[] args) {
			/* Implement your code here 
			int principal = 5000;
			int rate = 10;
			int time = 5;
			
			int simple_int = (principal*rate*time)/100;
			System.out.println("The simple interest is " + simple_int); */
		
				// Implement your code here 
				int principal = 5000;
				int rate = 10;
				int time = 5;
				
				int simple_int = (principal*rate*time)/100;
				System.out.println("The simple interest is " + simple_int);
				
				System.out.println();
				
				double principal2 = 3250;
				double rate2 = 7; 
				double time2 = 3;
				
				double simple_int2 = (principal2*rate2*time2)/100;
//				System.out.println("The simple interest is %.2f\n" + simple_int2);
				System.out.printf("The simple interest is %.2f\n", simple_int2);
	}
}

