package learning1;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		
		int[] arr;
		
		try (Scanner keyboard = new Scanner(System.in)){
			System.out.println("How many numbers contains array?");
			int numbers = keyboard.nextInt();
			
			arr =new int[numbers];
			
			for (int i= 0; i < numbers; i++) {			
			System.out.println("The element " + i + " is= ");
			arr[i] = keyboard.nextInt();
			}
		}
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("enter an integer");
			int position = keyboard.nextInt();

			if (arr.length < position) {
				System.out.println("No data at provided position " + position);
			} else {
				int k = 0;
				for (int i = 0; i < arr.length; i++) {

					if (arr[position] == arr[i])
						k += 1;
				}
				System.out.println("The element " + arr[position] + " appears " + k + " time/s.");
			}
		}	
	}
	
}
