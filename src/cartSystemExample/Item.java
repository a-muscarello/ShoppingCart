package cartSystemExample;

public class Item {
    private String itemName;
    private String itemDesc;
    private double itemPrice;
    private Integer quantity;
    private int availableQuantity;
    /**
     * @return the itemName
     */
  //Fill the code here
    
    public Item () {
    	this.quantity = (Integer) 1;
    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double d) {
		this.itemPrice = d;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int i) {
		this.availableQuantity = i;
	}
}
