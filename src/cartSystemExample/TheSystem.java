package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    protected HashMap<String, Item> itemCollection;
    
    protected TheSystem() throws IOException {
        itemCollection = new HashMap<String, Item>();

        if (getClass().getSimpleName().equals("AppSystem")) {
        	
	        	URL url = getClass().getResource("sample.txt");
		    	File file = new File (url.getPath());
		    	
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
            	String []lines = line.split(" ");
            	Item item = new Item ();
            	//Item item = new Item (lines[0], lines[1], lines[2], lines[3]);
            	
            	item.setItemName(lines[0]);	
            	item.setItemDesc(lines[1]);
            	item.setItemPrice(Double.parseDouble(lines[2]));
            	item.setAvailableQuantity(Integer.parseInt(lines[3]));	
            	itemCollection.put(item.getItemName(), item);
            }   
        }
    }
    
    
    public HashMap<String, Item> getItemCollection(){
		return itemCollection;
    }
    
    
    public void setItemCollection(HashMap<String, Item> copy ){
      //Fill the code here
    	itemCollection = copy;
    }
    
    
    public Boolean add(Item item) {
      //Fill the code here
    	int quantity;
    	// if the item is in the list
    	if (itemCollection.containsKey(item.getItemName())) {
    		
    		//access the item variable
    		Item tempItem = null;  //itemCollection - > get item
    		quantity = item.getQuantity();
    		//add one to quantity
    		if(checkAvailability(tempItem, 0)) {
    			itemCollection.get(item.getItemName()).setQuantity(quantity++);
    		}
    		return true;
    	} 
    	// if the item is not in the list
    	else {
    		//put the item in the collection
    		itemCollection.put(item.getItemName(), item);
    		}
    		return false;
    	}
    
    
    public Item remove(String itemName) {
        Item item = null;
      //Fill the code here
        
//        if item is in the collection, 
        if (itemCollection.containsKey(itemName)) {
//        then remove it
        		item = itemCollection.remove(itemName);
        }
//        else return the item
        return item;
    }

       
    public Boolean checkAvailability(Item item, Integer current) {
//		return null;
      //Fill the code here item
//		 if quantity+current is > available
//		output false
//		else vice versa
//		output true message
		if (item.getQuantity(current) > item.getAvailableQuantity()) {
			return true;
		}
		else {
			return false;
		
		}
    }
}
