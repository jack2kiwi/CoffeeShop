import java.util.ArrayList;

public class Order {

	ArrayList<Item> itemList;
	int freeCoffee;
	
	public Order() {
		int freeCoffee = 0;
		this.itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void removeItem(Item item) {
		itemList.remove(item);
	}
	
	private void freeDrink(int n) {
		freeCoffee = n;
	}
	
	public double calculatePrice() {
		double total = 0;
		for (int i = freeCoffee; i <= itemList.size(); i++) {
			Item item = itemList.get(i);
			total += item.getPrice();
		}
		return total;
	}
}
