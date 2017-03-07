
public class Customer {
	
	private String name;
	public RewardsCards rewardsCard;
	
	public Customer(String str, RewardsCard card) {
		name = str;
		rewardsCard = card;
	}
	
	public Customer(String str) {
		name = str;
	}
	
	public void pay(PointOfSale pos, int cash) {
		pos.recievePay(cash);
	}
	
}
