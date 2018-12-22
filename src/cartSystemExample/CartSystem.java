package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import cartSystemExample.Item;
import cartSystemExample.AppSystem;

public class CartSystem extends TheSystem {
	
	private double subtotal = getItemPrice() * getQuantity();;
	private double tax = subtotal * 0.05;
	private double total = subtotal * tax;
	private String line;
	
	
	public CartSystem() throws FileNotFoundException, IOException {

    }
    
	
    public void display() {
//    Fill the code here
//    This method takes no parameter and displays every item in the Cart system, along with the subtotal(the sum of the [item's price * quantity] of the items in them cart), the tax which is the subtotal * 0.05, and the total which is the subtotal + tax
    	
    		URL url = getClass().getResource("sample.txt");
	    	File file = new File (url.getPath());
	    	Item item = new Item ();
		itemCollection = new HashMap<String, Item>();
		
//	    	FileReader fr = new FileReader(file);
//	    BufferedReader br = new BufferedReader(fr);
//	    	String line;
	    	
	    	this.subtotal = subtotal;
    		this.tax = tax;
    		this.total = total;
    		this.line = line;
	    	
	    	for (int i = 0; i < line.length(); i++) {
	    		line = itemCollection.get(item.getItemName());
	    
	    		System.out.println(line + subtotal + tax + total);
		    	}
		    	
		    	try {
		    	
		    	}
		    	catch (Exception e) {
		    		e.printStackTrace();
	    	}
    }
}








