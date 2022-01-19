package test.question1;

public class merchandise implements Comparable<merchandise> {
	private String itemId;
	private int qty;
	private double price;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public merchandise(String itemId, int qty, double price) {
		super();
		this.itemId = itemId;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public int compareTo(merchandise arg0) {
		// TODO Auto-generated method stub
		return this.itemId.compareTo(arg0.itemId);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ItemId: " + itemId + "qty: " + qty + "price: " + price;
	}
}
