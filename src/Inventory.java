import java.util.Scanner;

//Main class for our mobile app
public class Inventory {
    private static Menu menu = new Menu();
    public static void main (String [] args){
        menu.printItems();
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the CSC109 Mobile Ordering App. Please input your order.");
        String userInput = input.nextLine();

    }
}
