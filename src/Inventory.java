import java.util.Scanner;

//Main class for our mobile app
public class Inventory {
    private static Menu menu = new Menu();
    public static void main (String [] args){
        boolean response = false;
		Scanner input = new Scanner(System.in);

		//wecolme message for user
		System.out.println();
		System.out.println("Welcome to the CSC109 Mobile Ordering App.");

		//app prompter
        while (!response) {
			//printing out current available items
        	System.out.println("Currently, the following items are available:");
        	menu.printAvailable();

			//user entering items
        	System.out.println("Please input your order exactly as shown on the menu.");
        	String userInput = input.nextLine();

        	// User Input + Update Items
			//if the item is valid prompts user for how many, if user asks for more than we have we notify them
			//otherwise if user puts in a negative value there are warned its not a valid entry
        	if (menu.checkItem(userInput) == true) {
        		System.out.println("How many of " + userInput + " would you like?");
				int itemNum = input.nextInt();
				if(itemNum == 1 && menu.getItemCount(userInput) >= 1){
					menu.updateItemCount(userInput,itemNum);
				}else if (itemNum > 0 && menu.getItemCount(userInput) - itemNum > 0){
					menu.updateItemCount(userInput,itemNum);
				}else if (itemNum > 0 && menu.getItemCount(userInput)-itemNum < 0){
					System.out.println("Sorry we only have " + menu.getItemCount(userInput) + " left of " + userInput);
				}else{
					System.out.println("That is not a valid entry.");
				}
				//calling random to stimulate in person orders
        		menu.inPersonUpdate();
        	} else {
        		System.out.println("That option is not on the menu. Please make another selection.");
        	}

			//asking user to make another purchase
        	System.out.println("Would you like to make another purchase? yes/no");
        	String finalInput = input.nextLine();

			//checking to see if they would like another option, otherwise program ends
        	if (finalInput.equalsIgnoreCase("yes")) {
        		System.out.println("Please make another selection.");
        	} else if (finalInput.equalsIgnoreCase("no")) {
        		System.out.println("Thank you for ordering. Have a good day.");
        		response = true;
			}
        }
    }
}
