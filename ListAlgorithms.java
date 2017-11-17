public class ListAlgorithms {

	private static int[] numbers = {8,7,6,5,4,3,2,1};
	
	public static void main(String args[]) {
	
		//bubbleSort(numbers);
		insertionSort(numbers);
	}
	
	/**
		The bubbleSort method uses bubble sort to arrange a list of integers in ascending order
	*/
	
	public static void bubbleSort(int[] unsortedList) {
		
		boolean swapFlag = true;
		
		while(swapFlag) {
			
			swapFlag = false;
		
			for (int i = 0; i < unsortedList.length - 1; i++) {
			
				if (unsortedList[i+1] < unsortedList[i]) { 
			
					swapElements(unsortedList, i+1, i);	
					swapFlag = true;
					printArray(unsortedList);
				
				}
			}
		}
	}
	
	
	public static void insertionSort(int[] A) {
		
		printArray(A);
	
		for (int i = 1; i < A.length; i++) {
		
			int key = A[i];
			int j = i-1;
			
			while (j >= 0 && A[j] > key) {
			
				A[j+1] = A[j];
				j--;
				
				printArray(A);
			}
			
			A[j+1] = key;
			
			printArray(A);
		}
	}
	
	/**
		printArray prints an array to the output.
	*/
	
	public static void printArray(int[] A) {
	
		System.out.print("{");
		
		for (int i = 0; i < A.length; i++) {
			
			if (i != A.length - 1) {
				System.out.print(A[i] + ",");
			}
			else {
				System.out.print(A[i]);
			}
			
		}
		
		System.out.print("}");
		System.out.println(); // Newline to print next array below	
	}
	
	/**
		swapElements is a method used to switch the positions of two elements in an array
	*/ 
	
	public static void swapElements(int[] A, int i, int j) {
	
		int t = A[i];
		A[i] = A[j];
		A[j] = t;
	}
	
}
