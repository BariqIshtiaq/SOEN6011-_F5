/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bariq
 */
public class mainTest {
    
    public mainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.out.print("Test SetUp started ");
    }
    
    @AfterEach
   
   
    public void testmain(String[] args) {
       
        
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number (a): ");
    int base1= sc.nextInt();  
    
    System.out.print("Enter Second number (b): ");
    int base2= sc.nextInt();  
    
    System.out.print("Enter the exponent(x) ");  
    int exponent= sc.nextInt();  
    
    

    
    long result = 1;

    while (exponent != 0) {
      
      result = result * base2;
      exponent--;
    }
    long product = result * base1;

    System.out.println("Answer = " + product);
  }   
}
