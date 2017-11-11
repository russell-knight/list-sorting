public class ListAlgorithms {

	private static int[] numbers = {8,7,6,5,4,3,2,1};
	
	public static void main(String args[]) {
	
		bubbleSort(numbers);
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
					printList(unsortedList);
				
				}
			}
		}
	}
	
	public static void printList(int[] list) {
	
		System.out.print("{");
		
		for (int i = 0; i < list.length; i++) {
			
			if (i != list.length - 1) {
				System.out.print(list[i] + ",");
			}
			else {
				System.out.print(list[i]);
			}
			
		}
		
		System.out.print("}");
		System.out.println(); // Newline to separate lists
	}
	
	/**
		swapElements is a method used to switch the index location of two adjacent elements.
	*/
	
	public static void swapElements(int[] array, int i, int j) {
	
		array[i] += array[j];
		array[j] = array[i] - array[j];
		array[i] -= array[j];
	}
}