package cards;

import main.Player;

public class Tarnumhang extends Card implements CardInterface{

	public Tarnumhang() {
		super(0, 1);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
	}

}
