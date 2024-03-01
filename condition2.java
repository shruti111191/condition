/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.scanner;
public class main
{
	public static void main(String[] args); {
		Scanner scn = new scanner(System.in);
		int marks =scn.nextInt();
		  System.out.println("Enter the marks");
		 if(marks > 90)
		     
		   {  
		       System.out.println("Excellent");
		       
		   }
		    
		    else if(marks > 80)
		    
		   {
		       System.out.println("good");
		       
		   }
		     
		     else if(marks > 70)
		     
		     {  
		         System.out.println("fair");
		         
		     }
		      else if(marks > 60)
		      
		      {
		          System.out.println("satisfactory");
		          
		      }
		       else
		       
		        System.out.println("Below average");
		        
		
		 }
		 
}
