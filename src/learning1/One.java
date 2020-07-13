package learning1;

public class One {
	public static void main(String[] args) {
		
		int k; // number occurrences 
		int[] arr = {1,2,3,3,3,1,8};
		
		
		for (int j = 0; j < arr.length; j++) {
			k = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i])
				k += 1;	
				System.out.println("The element " + arr[j] + " appears " + k + " time/s.");
			}
			System.out.println("The element " + arr[j] + " appears " + k + " time/s.");
		}
		
	}

	
	
}
