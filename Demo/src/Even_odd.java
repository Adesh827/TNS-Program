import java.util.Scanner;

public class Even_odd {
     public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
            
         System.out.print("Enter Number: ");
         int num = scanner.nextInt();
         
         if(num%2==0) {
        	 System.out.print("Given number is even");
         }
         else {
        	 System.out.print("Given number is odd");

         }
         scanner.close();
         

     }
}
