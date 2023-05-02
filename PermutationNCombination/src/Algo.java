import java.util.Arrays;
import java.util.Random;

public class Algo {

	private static int sequentialSearch(int array[], int arrayLength, int searchElement)  {
		
		for (int i = 0; i < arrayLength; i++) {

			if (array[i] == searchElement) {
				return i;	
			}
		}
		
		return -1;
	}
	
	private int binarySearch(int array[], int arrayLength, int r, int searchElement) {
       
		if (r >= arrayLength) {
            int mid = arrayLength + (r - arrayLength) / 2;
            
            if (array[mid] == searchElement) {
            	return mid;
            }
 
            if (array[mid] > searchElement) {
            	
                return binarySearch(array, arrayLength, mid - 1, searchElement);
            }
     
            return binarySearch(array, mid + 1, r, searchElement);
        }
        
        return -1;
    }
	
	private static void insertionAlgo(int array[], int arrayLength, int insertNumber, int pos) {
		
		System.out.println("Array Before Insertion:" + Arrays.toString(array));
		System.out.println("Inserting Elements.....");
		for (int i = arrayLength - 1; i >= pos; i--) {
			array[i + 1] = array[i];
		}
	    array[pos] = insertNumber;
	    System.out.println("Array After Insertion:" + Arrays.toString(array));    
	}
	
    
	private static void deletionAlgo(int array[], int arrayLength, int deleteNumber) {
		
		System.out.println("Array Before Deletion:" + Arrays.toString(array));
		System.out.println("Deleting Elements.....");
		int pos = sequentialSearch(array, arrayLength, deleteNumber);
		for (int i = pos; i < arrayLength - 1; i++) {
	            array[i] = array[i + 1];
		}
	    System.out.println("Array After Deletion:" + Arrays.toString(array));  
		
	}
	
	private static void getRandom(int array[], int arrayLength) 
	{
	    int rnd = new Random().nextInt(arrayLength);
	    System.out.println("Random Access from Array: " + array[rnd]);
	}

	public static void main(String args[]) {
		
		Algo binaryOb = new Algo();
		int array[] = { 2, 3, 10, 5, 90, 20, 5, 50, 70, 10 };
		int searchElement = 1000;
		int arrayLength = array.length;
		int insertNumber = 9000;
		int deleteNumber = 20;
		int pos = 9;
		int specificIndex = 5;
		
		System.out.println("Array as initialized: " + Arrays.toString(array));
		System.out.println("***********************Sequential Search***********************"); 
		int seqResult = sequentialSearch(array, arrayLength, searchElement);
		if (seqResult != -1) {
			System.out.println("Element is present at index through Sequential Search: " + seqResult);
		} else {
			System.out.println("Element not present in the array");
		}
		
		System.out.println("**********************************************************************");
		System.out.println("***********************Binary Search***********************");
		int binaryResult = binaryOb.binarySearch(array, 0, arrayLength - 1, searchElement);
		if (binaryResult != -1) {
			System.out.println("Element is present at index through Binary Search: " + binaryResult);
		} else {
			System.out.println("Element not present in the array");
		}
		
		System.out.println("**********************************************************************");
		System.out.println("Insertion Algo");
		insertionAlgo(array, arrayLength - 1 , insertNumber, pos);
		System.out.println("**********************************************************************");
		System.out.println("Deletion Algo");
		deletionAlgo(array, arrayLength - 1 , deleteNumber);
		System.out.println("**********************************************************************");
		System.out.println("Random Access Algo");
		getRandom(array, arrayLength);
		
		System.out.println("**********************************************************************");
		System.out.println("Random Access Array at specific index number: " + specificIndex +" is: " + array[specificIndex]);
			
	}
}

