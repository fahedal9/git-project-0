/*------------------------------------------------------------- 
// AUTHOR: <Fahed Alkhiami>
// FILENAME: Lab2.java
// SPECIFICATION: You will have to write a Java program that asks the user to enter two strings,
 *  firstName and lastName, and concatenates the strings to make a full name. 
 *  The program will use methods of the class String like length() and toUpperCase() on the full name 
 *  and compare strings by equals() method and if-else statements.
 */
// FOR: CS 1400 - Lab #2
// TIME SPENT: < It took me about 15 minutes.
//-----------------------------------------------------------*/

import java.util.Scanner;

// class name should match the file name
public class Lab_2 {
    // we must have a main method to run the program
    public static void main(String[] args) {
        // Declare variables of different types:
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);

        // Use Scanner to ask the user for first name
        System.out.println("Please enter first name: ");
        firstName = scan.nextLine();

        // Use Scanner to ask the user for last name
        System.out.println("Please enter last name: ");
        lastName = scan.nextLine();

        // Part #1: Concatenation
        // Combine firstName and lastName with a space in between and store it in fullName
        fullName = firstName + " " + lastName;

        // Part #2: Convert to upper case
        // Convert fullName content to capitals
        fullName = fullName.toUpperCase();

        // Part #3: Find length of a String
        // Find the length of fullName (including the space) and store it in nameLength
        nameLength = fullName.length();

        // Part #4: Display results
        // Print fullName in capitals
        System.out.println("Full name (in capitals): " + fullName);

        // Print nameLength (number of characters in fullName, including space)
        System.out.println("Length of full name: " + nameLength);

        // Define two String variables, title1 and title2 using String constructor to initialize them
        String title1 = new String("CS1400");
        String title2 = "CS1400";

        // Compare the two strings using == and equals methods and print the results
        if (title1 == title2) {
            System.out.println("String comparison using \"==\" sign works");
        } else {
            System.out.println("String comparison using \"==\" sign does NOT work");
        }

        if (title1.equals(title2)) {
            System.out.println("String comparison using equals method works");
        } else {
            System.out.println("String comparison using \"equals\" method does NOT work");
        }

        scan.close();
    } // end main method
} // end Lab2 class
