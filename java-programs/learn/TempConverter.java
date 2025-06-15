package learn;

//Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula given below and display the converted value. 
//C = ((F-32)/9)*5 where, C represents temperature in Celsius and F represents temperature in Fahrenheit.

public class TempConverter {
	public static void main(String[] args) {
		int F = 50;
		
		double celcius = ((F-32)/9)*5;
		
		System.out.println(celcius);
	}
}
