# LessonOnee

package learning1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Onee {
	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			int choice;
			do {
				System.out.println("What would you like to do?"); 
				System.out.println("  1) Array");
				System.out.println("  2) Matrix");
				System.out.println("  3) Matrix random");
				System.out.println("  4) Still in progress");
				System.out.println("  5) Random array");
				System.out.println();
				System.out.print("Enter choice: ");
				
				choice = keyboard.nextInt();
				
				 if (choice < 1 || choice > 5) {
					 System.out.println("Your choice does not exist !!!!");
					 System.out.println();
				 }
				 
			} while(choice < 1 || choice > 5);
			
			switch (choice){
				case 1:
					array();
					break;
				case 2:
					matrix();
					break;
				case 3:
					matrixRandom();
					break;
				case 4:
					System.out.println("In lucru");
					break;
				case 5:
					arrayRandom();
					break;
			}
		}
	}
	
	
//Read an array from the keyboard.	
	public static void array() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("How many numbers contains array? ");
	
			int numbers = keyboard.nextInt();
	
			int[] myArray = new int[numbers];
			
			System.out.println("Enter the elements of the array: ");
			
			int i = 0;
			while (i < numbers) {
				System.out.print(String.format("array[%d]= ", i));
				myArray[i++] = keyboard.nextInt();
			}
			System.out.println("My array is: " + Arrays.toString(myArray));
		}
	}
	
//Read  a matrix from the keyboard.
	public static void matrix() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("How many rows are the matrix?");
			int rows = keyboard.nextInt();	
			
			System.out.println("How many column are the matrix?");
			int columns = keyboard.nextInt();	
			
			int[][] matrix = new int[rows][columns];
			
			System.out.println();
			System.out.println("Enter the elements of the matrix");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(String.format("array[%d][%d]= ", i,j));
					matrix[i][j] = keyboard.nextInt();
				}	
			}
			
			System.out.println();
			System.out.println("Your matrix is: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) 
				System.out.print(matrix[i][j] + " ");		
			System.out.println();
			}
		}	
	}
	
//	Use the Random class to generate elements for a matrix for which you read the length and height from the keyboard
	public static void matrixRandom() {		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("How many rows are the matrix?");
			int rows = keyboard.nextInt();	
			
			System.out.println("How many column are the matrix?");
			int columns = keyboard.nextInt();	
			
			int[][] matrix = new int[rows][columns];
			
			Random random = new Random();

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = random.nextInt();
				}	
			}
			
			System.out.println();
			System.out.println("Your matrix is: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) 
				System.out.print(matrix[i][j] + " ");		
			System.out.println();
			}	
		}	
	}
	
// For two given matrices implement: matrix addition, matrix scalar multiplication and matrix multiplication 	
	public static void matrixAddition() {
		
	}
	
// Generate a random array of numbers and search for a specific one. If you find it then use a named break to exit the loop	
	public static void arrayRandom() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("How many numbers contains array? ");
	
			int numbers = keyboard.nextInt();
	
			int[] myArray = new int[numbers];
			
	//		int random =(int)(Math.random()*100);
			Random random = new Random();
			
			for (int i=0; i < numbers; i++) {
				myArray[i] = random.nextInt();
			}
			System.out.println("My array is: " + Arrays.toString(myArray));
			System.out.println("What number are you looking for?");
			
			int number = keyboard.nextInt();
			
			for (int i= 0; i < numbers; i++) {
				if (myArray[i] == number) {
					System.out.println("Number " + number + " is in the array");
				} else{
					System.out.println("Number " + number + " is not in the array");
				}		
			}
		}    
	}
	
	
}
