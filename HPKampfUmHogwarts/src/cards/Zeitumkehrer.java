package cards;

import main.Player;

public class Zeitumkehrer extends Card implements CardInterface {

	public Zeitumkehrer() {
		super(0, 1, 9);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
		// add round conditions
	}

}
