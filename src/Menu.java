/*
Using a hash map to store all the menu items for the mobile app
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static HashMap<String, Integer> menuItems = new HashMap<String, Integer>();
    public static void main (String [] args){}
    public Menu(){
        menuItems.put("Banana Bread", 65);
        menuItems.put("Lemon Bread", 65);
        menuItems.put("Pumpkin Bread", 65);
        menuItems.put("Almond Bread", 65);
        menuItems.put("Plain Croissant", 80);
        menuItems.put("Almond Croissant", 80);
        menuItems.put("Chocolate Croissant", 80);
        menuItems.put("Plain Bagel", 100);
        menuItems.put("Everything Bagel", 100);
        menuItems.put("Sesame Bagel", 100);
        menuItems.put("Vanilla Scone", 50);
        menuItems.put("Blueberry Scone", 50);
        menuItems.put("Grilled Cheese",70);
        menuItems.put("Ham and Swiss Wrap",70);
        menuItems.put("Spinach Wrap",70);
        menuItems.put("Coffee Cake", 45);
        menuItems.put("Vanilla Cake Pop", 30);
        menuItems.put("Oatmeal",15);
    }
    //adds a new item to the inventory
    public void setItem(int numOfItem, String itemName) {
        menuItems.put(itemName, numOfItem);
    }

    //returns the number of items in stock
    public int getItemCount(String item) {
        return menuItems.get(item);
    }

    //updates the inventory of the item
    public void updateItemCount(String item, int num){
        int temp = menuItems.get(item);
        menuItems.put(item, (temp - num));
    }

    //remove item from inventory
    public void removeItem(String item){
        menuItems.remove(item);
    }

    // Prints Items
    public void printItems(){
        System.out.println(menuItems);
    }
    
    public Boolean checkItem(String item) {
    	if (menuItems.containsKey(item)) {
    		return true;
    	} else {
    		return false;
    	}
    }

}