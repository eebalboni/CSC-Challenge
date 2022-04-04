/*
Using a hash map to store all the menu items for the mobile app
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// CSC109 Challenge - Food Mobile Order App
// Menu 
// Authors: Emily, Garrett, and 

public class Menu {

	// Creates Menu Hash Map
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

    //updates the inventory of the item by removing items that were ordered
    public void updateItemCount(String item, int num){
        int temp = menuItems.get(item);

        //if menu item is in stock and the order doesn't put the inventory into the negatives
        if(menuItems.get(item) > 0 && temp-num >=0 ){
            menuItems.put(item, (temp - num));
        }
        //if there is nothing left of the inventory remove the item
        if(menuItems.get(item) == 0){
            removeItem(item);
        }
    }

    //remove item from inventory
    public void removeItem(String item){
        menuItems.remove(item);
    }

    // Prints Items in hashmap
    public void printItems(){
        System.out.println(menuItems);
    }

    // Prints available Items 
    public void printAvailable() {
    	String available = "";
    	for ( String key : menuItems.keySet() ) {
    	    if (this.getItemCount(key) > 0)
    	    {
    	    	available += (key + ", ");
    	    }
    	}
    	available = available.substring(0, available.length() - 3);
    	System.out.println(available);
    }
    
    // Checks if item is available
    public Boolean checkItem(String item) {
    	if (menuItems.containsKey(item)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
    // Updates the Menu using random ints
    public void inPersonUpdate() {
    	ArrayList<String> list = new ArrayList<String>();
    	for ( String key : menuItems.keySet() ) {
    		list.add(key);
    	}
    	
    	String random = list.get((int) (Math.random() * list.size()));
    	int randomInt = (int) (Math.random() * 10); 
    	updateItemCount(random, randomInt);
    }
}