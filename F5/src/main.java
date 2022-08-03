
import java.util.*;

/**
 * @course SOEN 6011 SOFTWARE ENGINEERING PROCESSES
 * @Professor Pankaj Kamthan
 * @StudentID 40208194
 *
 *      This project is the implementation of  function ab^x without using any
 *      java in-build modules for calculation.
 * Entry point of the program.
 *      <ul>
 *      <li>It takes inputs from the user</li>
 *      <li>Handles error(If any)</li>
 *      <li>Calls other functions to process the user-inputs</li>
 *      <li>Displays the result in appropriate format</li>
 *      </ul>
 *
 * @author Bariq
 */
public class main {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
        /**
         * Enter the value of variable  a
         */
    System.out.print("Enter first number (a): ");
    int base1= sc.nextInt();

        /**
         * Enter the value of variable b
         */
    System.out.print("Enter Second number (b): ");
    int base2= sc.nextInt();
        /**
         * Enter the value of exponent x
         */
    System.out.print("Enter the exponent(x) ");  
    int exponent= sc.nextInt();  
    
    

    
    long result = 1;

    while (exponent != 0) {
      
      result = result * base2;
      exponent--;
    }
    long product = result * base1;
    try{
        /**
         * @return answer
         */
    System.out.println("Answer = " + product);
    }
     catch (Exception e) {
         /**
          * @return error
          */
      System.out.println("Something went wrong.");
    }
  }
}
