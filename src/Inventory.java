import java.util.Scanner;

//Main class for our mobile app
public class Inventory {
    private static Menu menu = new Menu();
    public static void main (String [] args){
        //user input
        boolean response = false;
        while (!response) {
        	Scanner input = new Scanner(System.in);
        	System.out.println();
        	System.out.println("Welcome to the CSC109 Mobile Ordering App.");
        	System.out.println("Currently, the following items are available:");
        	menu.printAvailable();
        	System.out.println("Please input your order.");
        	String userInput = input.nextLine();
        	// User Input + Update Items
        	if (menu.checkItem(userInput) == true) {
        		// Update Item	
        	} else {
        		System.out.println("That option is not on the menu. Please make another selection.");
        	}
        	
        	System.out.println("Would you like to make another purchase?");
        	String finalInput = input.nextLine();
        	if (finalInput.equalsIgnoreCase("yes")) {
        		System.out.println("Please make another selection.");
        	} else if (finalInput.equalsIgnoreCase("no")) {
        		System.out.println("Thank you for ordering. Have a good day.");
        		response = true;
			}
        }
    }
}
