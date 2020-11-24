

/*
 *Intro to Java Assignment 1
 * Brett Gagnon
 * 9/14/2018
 * Source Code
 */

import java.util.Scanner;

public class Class1 {
   
    public static void main(String[] args)
    {
        // Create a scanner to read from keyboard
    Scanner sc = new Scanner (System.in);
        
    //Prompt User
    System.out.println("Enter a line of text containing the word 'java' "
            + "somewhere within it:");
    
    //Assign variable line1 with the string entered from user
    String line1 = sc.nextLine();  
    //Print the contents of variable line1
    System.out.println("The String you entered is: " + line1);
    
    //Apply string class methods to string line1 (length, upper/lowercase)
    System.out.println("The Length of the string in chars is:" + line1.length());
    
    
    System.out.println("The string in all lower-case is:");
    System.out.println( line1.toLowerCase() );
    
    System.out.println("The string in all upper-case is:");
    System.out.println( line1.toUpperCase() );
    
    //Locate the index number of the substring "java"
    System.out.println("The substring java is found at index#:");
    System.out.println( line1.indexOf("java") );
    
    //Create a variable to store the index number
    int index;
    index = line1.indexOf("java");
    
    //Change java to Java
    System.out.println("Changing to 'Java':");
    
    //Assign the beginning and ending substrings to seperate string variables
    String line2 = ( line1.substring(0, index));
 
    String line3 = ( line1.substring(index+4));
    
    // Print the result of concatenating before-text + 'Java' + after-text
    System.out.println(line2 + "Java" + line3);
    
    //Print the result of concatenating before-text + 'JAVA' + after-text
    System.out.println("Changing to 'JAVA':");
    System.out.println(line2 + "JAVA" + line3);
    
    }
}
