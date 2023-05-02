# BasicDS
Java based project having basically project name PermutationNCombination consist of default package which have 4 java class files including main method in each class to work seperately.

Algo.java java code for related to Array manipulation, and data structure algo
 -> Sequential Search: returns index of searched number
    for (int i = 0; i < arrayLength; i++) {
			   if (array[i] == searchElement) {
				     return i;	
			    }
      }
 
 -> Binary Search: returns index of searched number
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
        
 
 -> Insertion: insert number at sepcific position of array
    for (int i = arrayLength - 1; i >= pos; i--) {
	   		array[i + 1] = array[i];
		  }
	    array[pos] = insertNumber;
 
 -> Deletion: delete specific number from array
    int pos = sequentialSearch(array, arrayLength, deleteNumber);
		  for (int i = pos; i < arrayLength - 1; i++) {
	            array[i] = array[i + 1];
		   }
     
 -> Random Selection: fetch random number from array irrespect of any condition
    int rnd = new Random().nextInt(arrayLength);
	    System.out.println("Random Access from Array: " + array[rnd]);
     
 -> Random Access: access the number in array through index of the number in array.
    array[specificIndex]
 
 
 GetAllPerm.java have java coe for getting all the possible permutation of user input array of numbers
 
 GetCombination.java hava java code for getting combination of the user input array 
 
 PermAndComb.java have java code of array datastructure which performs basic logic of Iteration, Sequencing, Selection and proper syntaxes of java has been taken care.
 
 -> Iteration: for (int i= 1; i<= num; i++) {
 -> Selection: if ((n < 0 || r < 0 ) && (n >= r)) {
 -> Sequence: System.out.println("******* RESULTS *******");
 
