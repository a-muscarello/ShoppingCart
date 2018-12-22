package cartSystemExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;


public class AppSystem extends TheSystem {
	
    public AppSystem() throws FileNotFoundException, IOException {
    	
    }
    
//    display() – This method takes no parameter and it should display every item in the App system.
    
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
      //Fill the code here
        current = new HashMap<String, Item>();
        System.out.println(current);
    }
    
    
//    add() – This method takes an Item Object as a parameter. It checks if the item is already in the system. If it is, then display a message“[Item’s name] is already in the [name of the class calling this method]” and return false. If is not then add it and return true
    
    public Boolean add(Item item) {
    	 //Fill the code here
     
		if (item.equals(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the cart" + add(item));
            return false;
		}
		else {
			itemCollection.put(item.getItemName(), item);
		}
    return true;
    }
}

