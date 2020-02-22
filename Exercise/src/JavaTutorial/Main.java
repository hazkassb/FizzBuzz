package JavaTutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		User enters an integer
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		
//		if user input is divisible by 5 and by 3, return FizzBuzz
		if ((number % 5) == 0 && (number % 3 ) == 0) {
			System.out.print("FizzBuzz");	
		} else if((number % 3) == 0) {	//if input is only divisible by 3, return Buzz
			System.out.print("Buzz");
		} else if ((number % 5) == 0) {	//if input is only divisible by 5, return Fizz
			System.out.print("Fizz");
		} else							//Else, return the user input
			System.out.println(number);
		
		scanner.close();

	}

}
