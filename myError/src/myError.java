//Exercises: 

//Create a small program that defines some fields. 
//Try creating some illegal field names and see what kind of error the compiler produces. 
//Use the naming rules and conventions as a guide. 
//In the program you created, try leaving the fields uninitialized and print out their values. 
//Try the same with a local variable and see what kind of compiler errors you can produce. 
//Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 
//Submit your work to your GitHub, and for this assignment submit a link to the repository.

// Author: Emmanuel Asirifi
// Java Assignment 




// Import Scanner from the JDK library
import java.util.Scanner;


// Public Class Error
public class myError {

	public static void main(String[] args) {
		
	int myNum;
	int var1=2;
	String firstName="Emmanuel";
	String lastName="Asirifi";
	
	int friendName="Figo";
		// TODO Auto-generated method stub
	
	
	// Compiler error 
     System.out.println(friendName);
	
	
	// Local varibale not initialised error 
     System.out.println(myNum/var1);
     
     // runtime error 
     int ans= var1/0;

	}

}
