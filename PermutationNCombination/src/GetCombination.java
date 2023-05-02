   
public class GetCombination {  
   static int fact(int number) {  
      int f = 1;  
      int j = 1;  
      while(j <= number) {  
         f = f * j;  
         j++;  
      }  
      return f;  
   }  
   public static void main(String args[]) {  
         
      int[] numbers = {1, 9, 4, 3};
      
      int n = numbers.length;
      int r = 2;  
      int result;  
        
      result = fact(n) / (fact(r) * fact(n-r));  
      System.out.println("The combination value for the numbers list is: " + result);  
   }  
}  