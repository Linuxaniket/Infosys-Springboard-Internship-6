package learn;

//Implement a program to find the area of a circle by using the formula given below and display the calculated area. 
//
//Area = pi*radius*radius 
//
//The value of pi is 3.14.
public class AreaOfCircle {
	public static void main (String[] args) {
		int radius = 4;
		double pi = 3.14;
		
		double area = pi * radius * radius;
		System.out.println("Area of the circle is " + area);
		
		System.out.println();
		
	
		//Use Math.PI instead of 3.14 for accurate result 
		double area2 = Math.PI * radius * radius;
		System.out.println("Area of the circle is " + area2);
		
	
		System.out.println();

	
		int radius2 = 10;
		double area3 = Math.PI * radius2 * radius2;
		System.out.println("Area of cicle is " + area3);
		
	}
}
