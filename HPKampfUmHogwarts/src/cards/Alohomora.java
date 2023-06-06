package cards;

import main.Player;

public class Alohomora extends Card implements CardInterface{

	public Alohomora() {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
	}
	
}
