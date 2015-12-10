package javaLab.ch10.TenPoint11to15;

public class Invoice implements Payable {
	
	// instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String part, String description, int count,
			double price){
		this.partDescription = part;
		this.partNumber		= description;
		setQuantity(count);
		setPricePerItem(price);
		
	}
	
	public void setPartNumber(String part){
		this.partNumber = part;
	}
	
	public String  getPartNumber(){
		return this.partNumber;
	}
	
	public void setPartDescription(String description){
		this.partDescription = description;
	}
	
	public String getPartDescription(){
		return this.partDescription;
	}
	
	public void setQuantity(int count){
		if(count >= 0){
			this.quantity = count;
		}
		else{
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setPricePerItem(double price){
		if(price >= 0.0){
			this.pricePerItem = price;
		}
		else{
			throw new IllegalArgumentException("Price must be >= 0");
		}
	}
	
	public double getPricePerItem(){
		return this.pricePerItem;
		
	}
	@Override
	public String toString(){
		return String.format("%s : /n %s : %s (%s)/n %s : %d /n %s: $%.2f",
				"Invoice", "partNumber", this.getPartNumber(),
				this.getPartDescription(), "quantity", this.getQuantity(),
				"price per item", this.getPricePerItem());
	}

	@Override
	public double getPaymentAmount(){
		return getQuantity() * getPricePerItem();
	}
	
}
