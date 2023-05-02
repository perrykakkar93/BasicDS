import java.util.Scanner;

public class GetAllPerm {
	private static Scanner sc;
	public static void getPermutations(int[] array){  
		System.out.println(" ");
		System.out.println("************** RESULT **************");
		helper(array, 0);  
	}
	private static void helper(int[] array, int pos){ 
		if(pos >= array.length - 1){   
			System.out.print("[");  
			for(int i = 0; i < array.length - 1; i++){  
				System.out.print(array[i] + ", ");  
			}  
			if(array.length > 0)   
				System.out.print(array[array.length - 1]);  
			System.out.println("]");  
			return;  
		}  
		for(int i = pos; i < array.length; i++){   
			int t = array[pos];  
			array[pos] = array[i];  
			array[i] = t;  
			helper(array, pos+1);  
			t = array[pos];  
			array[pos] = array[i];  
			array[i] = t;  
		}  
	}  
	public static void main(String[] args) {
		int[] numbers = takeInput();
		getPermutations(numbers);
	}
	public static int[] takeInput() {
		sc = new Scanner(System.in);  
		System.out.println("Enter the elements of the array: ");
		String input= sc.nextLine();
		String[] stringArray= input.split(" ");
		int size= stringArray.length;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(stringArray[i]);		
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<size; i++) {  
			System.out.print(array[i] + " ");			
		}
		return array;
	} 

}
