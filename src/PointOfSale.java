import java.util.ArrayList;
import java.util.Scanner;


public class PointOfSale {
	private Item[] items; 
	private Reward[] rewards;
	private Order order = new Order();
	PointOfSale(String items, String rewards) {
		loadItems(items);
		loadRewards(rewards);
	}
	
	private void loadItems(String items) {
		Scanner scanner = new Scanner(new file(items));
		String line = scanner.next();
		
		ArrayList<Item> items = new ArrayList<Item>();
		
		while (scanner.hasNext()) {
			items.add(new Item(line));
			line = scanner.next();
		}
	}
	
	private void loadRewards(String rewards) {
		Scanner scanner = new Scanner(new file(rewards));
		String line = scanner.next();
		
		ArrayList<Reward> rewards = new ArrayList<Reward>();
		
		while (scanner.hasNext()) {
			rewards.add(new Reward(line));
			line = scanner.next();
		}
	}
	
	public void displayTotal(Customer customer) {
		int total = order.calculatePrice();
		System.out.println("Your total is: " + total);
	}
	
	private void clearOrder() {
		order.clear();
	}
	
	public Customer logIntoRewards(int rewardnum) {
		for (Reward[] reward : rewards) {
			if(reward.getNum(rewardnum) == customer.id) {
				return reward.getCustomer;
			}
		}
		return null;
	}
	
	public void addItem(Item item) {
		for(int i = 0; i < items.size(); i++) {
			if(items[i].equals(item)) {
				order.addItem(item);
			}
		}
	}
	
	public void removeItem(Item item) {
		order.removeItem(item);
	}
}
