package loops;

public class ForLoop {
	public static void main(String[] args) {
		int totalNoOfCustomers = 12;
		String customerId = "";
		for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
			if (counter <= 9)
					customerId = "C0" + counter;
			else
					customerId = "C" + counter;
			System.out.println("Customer Id for customer " + counter + " is "+ customerId);
			
		}
	}
}
