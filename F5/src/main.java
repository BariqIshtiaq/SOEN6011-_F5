
import java.util.*; 
public class main {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number (a): ");
    int base1= sc.nextInt();  
    
    System.out.print("Enter Second number (b): ");
    int base2= sc.nextInt();  
    
    System.out.print("Enter the exponent(x) ");  
    int exponent= sc.nextInt();  
    
    

    long product = base1 * base2;
    long result = 1;

    while (exponent != 0) {
      
      result = result * product;
      exponent--;
    }

    System.out.println("Answer = " + result);
  }
}
